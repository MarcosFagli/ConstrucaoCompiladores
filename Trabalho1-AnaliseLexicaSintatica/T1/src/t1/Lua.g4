grammar Lua;

//Membros do grupo: 
//Bruna Zamith        628093 (Turma A-Ter);
//Marcos Faglioni     628301 (Turma A-Ter);
//Pedro Vinicius      595160 (Turma B-Seg).
@members {
   public static String grupo="<628093,628301,595160>";
}


programa : trecho;


trecho : (comando (';')?)* (ultimocomando (';')?)?;


bloco : trecho;


//exp1 insere o nome de funcoes que fazem parte do pacote nativo na tabela, e portanto, nao possuem declaracoes no codigo analisado
//expprefixo foi incluido no lugar de chamadafuncao para remover uma recursividade encadeada, assim chamadadefuncoes foi removido para facilitar a remocao de recursividade em exprefixo
comando : listavar '=' listaexp 
        | (exp1=expprefixo args) { TabelaDeSimbolos.adicionarSimbolo($exp1.text, Tipo.FUNCAO); } | (expprefixo ':' Nome a2=args)
        | expprefixo ':' Nome args
        | 'do' bloco 'end' 
        | 'while' exp 'do' bloco 'end' 
        | 'repeat' bloco 'until' exp 
        | 'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' 
        | 'for' nome1=Nome { TabelaDeSimbolos.adicionarSimbolo($nome1.text, Tipo.VARIAVEL); } '=' exp ',' exp (',' exp)? 'do' bloco 'end'
        | 'for' listadenomes 'in' listaexp 'do' bloco 'end'
        | 'function' nomedafuncao corpodafuncao 
        | 'local' 'function' Nome corpodafuncao 
        | 'local' listadenomes ('=' list=listaexp { TabelaDeSimbolos.adicionarSimbolo($list.text, Tipo.VARIAVEL); })?
        ;


ultimocomando : 'return' (listaexp)? 
              | 'break'
              ;


//nome insere na tabela o nome de funcoes que são declaradas no programa analisado
nomedafuncao : nome=Nome {TabelaDeSimbolos.adicionarSimbolo($nome.text,Tipo.FUNCAO);} ('.' Nome)* (':' Nome)?;


Nome : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;


Numero : ('0'..'9')+ 
       | ('0'..'9')+ ('.' ('0'..'9')+)?
       ;


listavar : var (',' var)*;


//nome1 e nome2 insere o nome de variaveis declaradas em lista recursivamente (var1, var2, var3, ...) na tabela de simbolos
listadenomes : nome1=Nome {TabelaDeSimbolos.adicionarSimbolo($nome1.text,Tipo.VARIAVEL);} (',' nome2=Nome {TabelaDeSimbolos.adicionarSimbolo($nome2.text,Tipo.VARIAVEL);})*;


listaexp : (exp  ',')* exp ;


exp : 'nil' exp2 
    | 'false' exp2 
    | 'true' exp2 
    | Numero exp2 
    | Cadeia exp2 
    | '...' exp2 
    | funcao exp2 
    | expprefixo exp2 
    | construtortabela  exp2 
    | opunaria exp exp2
    ;


exp2 : (opbin exp)*;


Cadeia : ( '\'' (.*?) '\'')
       | ('"' (.*?) '"');


//nome1 insere o nome de funções que são instanciadas de outras bibliotecas na tabela
//Remover a recursividade a esquerda de chamadadefuncao e var, substituindo em exprefixo e seguindo as regras vistas em sala de aula. A criação de exprefixo 2 faz parte do conjunto de adptacao juntamente com a insercao do vazio na regra criada.
expprefixo : Nome expprefixo2
           | nome1=Nome ('.' nome2=Nome expprefixo2) {TabelaDeSimbolos.adicionarSimbolo($nome1.text + '.' + $nome2.text,Tipo.FUNCAO);}
           | '(' exp ')' expprefixo2
           ;

expprefixo2 : args expprefixo2
            | ':' Nome args expprefixo2
            | '[' exp ']' expprefixo2
            | 
            ;

//nome insere o nome de variavel declarada na tabela de simbolos
var : nome=Nome {TabelaDeSimbolos.adicionarSimbolo($nome.text,Tipo.VARIAVEL);}  
    | expprefixo '[' exp ']'
    | expprefixo '.' Nome
    ;


args : '(' (listaexp)? ')' 
     | construtortabela 
     | Cadeia
     ;


funcao : 'function' corpodafuncao;


corpodafuncao : '(' (listapar)? ')' bloco 'end';


listapar : listadenomes (',' '...')? 
         | '...'
         ;


construtortabela : '{' (listadecampos)? '}';


listadecampos : campo (separadordecampos campo)* (separadordecampos)?;


campo : '[' exp ']' '=' exp 
      | Nome '=' exp 
      | exp
      ;


separadordecampos : ',' | ';';


opbin : '+'  | '-'   | '*' 
      | '/'  | '^'   | '%'  
      | '..' | '<'   | '<=' 
      | '>'  | '>='  | '==' 
      | '~=' | 'and' | 'or'
      ;


opunaria : '-' 
         | 'not' 
         | '#'
         ;


//Comentario que existe em lua, mas nao esta descrita em 8, no manual de sintaxe lua
COMENTARIO : '--' (.*?) ('\n' | '\r') -> skip;


WS : (' ' | '\n' | '\r' | '\t') -> skip;