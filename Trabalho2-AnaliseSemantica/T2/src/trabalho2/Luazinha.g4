grammar Luazinha;

//Membros do grupo: 
//Bruna Zamith        628093 (Turma A-Ter);
//Marcos Faglioni     628301 (Turma A-Ter);
//Pedro Vinicius      595160 (Turma B-Seg).

@members{
PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
}

programa : {pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global")); }
           trecho
           {pilhaDeTabelas.desempilhar(); }
         ;

trecho : (comando ';'?)* (ultimocomando ';'?)?
       ;

bloco : trecho
      ;

comando :  listavar '=' listaexp 
              {for(String nome : $listavar.nomes)
                if(!pilhaDeTabelas.existeSimbolo(nome))
                  pilhaDeTabelas.topo().adicionarSimbolo(nome, "variavel");
              }
          #comandoAtribuicao
        |  chamadadefuncao #comandoChamadaDeFuncao
        |  'do' bloco 'end' #comandoDo
        |  'while' exp 'do' bloco 'end' #comandoWhile
        |  'repeat' bloco 'until' exp #comandoRepeat
        |  'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' #comandoIf
        |  'for' NOME '=' exp ',' exp (',' exp)? 'do' bloco 'end' #comandoFor1
        |  'for' listadenomes 'in' listaexp 'do' bloco 'end' #comandoFor2
        |  'function' nomedafuncao
              {
               pilhaDeTabelas.empilhar(new TabelaDeSimbolos($nomedafuncao.nome));
               if ($nomedafuncao.metodo) {
                   pilhaDeTabelas.topo().adicionarSimbolo("self", "parametro");
               }
               }
               corpodafuncao {pilhaDeTabelas.desempilhar();} #comandoFunction
        |  'local' 'function' NOME corpodafuncao #comandoLocalFunction
        |  'local' listadenomes ('=' listaexp)? #comandoLocalAtribuicao
        ;

ultimocomando : 'return' (listaexp)? | 'break'
              ;

nomedafuncao returns [ String nome, boolean metodo ]
@init { $metodo = false; }
    : n1=NOME { $nome = $n1.getText(); }
      ('.' n2=NOME { $nome += "." + $n2.getText(); })*
      (':' n3=NOME { $metodo = true; $nome += "." + $n3.getText(); })?
    ;

listavar returns [ List<String> nomes ]
@init { $nomes = new ArrayList<String>(); }
    : v1=var { $nomes.add($v1.nome); }
      (',' v2=var { $nomes.add($v2.nome); }
      )*
    ;

var returns [ String nome, int linha, int coluna ]
    :  NOME { $nome = $NOME.getText(); $linha = $NOME.line; $coluna = $NOME.pos; } 
    |  expprefixo '[' exp ']'
    |  expprefixo '.' NOME
    ;

listadenomes returns [ List<String> nomes ]
@init{ $nomes = new ArrayList<String>(); }
    : n1=NOME { $nomes.add($n1.getText()); }
      (',' n2=NOME { $nomes.add($n2.getText()); } )*
    ;

listaexp : (exp ',')* exp
         ;

exp :  'nil' | 'false' | 'true' | NUMERO | CADEIA | '...' | funcao | 
       expprefixo2 | construtortabela | exp opbin exp | opunaria exp 
    ;


expprefixo : NOME ( '[' exp ']' | '.' NOME )*
           ;

expprefixo2 : var #expPrefixo2Var 
            | chamadadefuncao #expPrefixo2ChamadaDeFuncao
            | '(' exp ')' #expPrefixo2Exp
            ;

chamadadefuncao :  expprefixo args |
                   expprefixo ':' NOME args
                ;

args :  '(' (listaexp)? ')' | construtortabela | CADEIA 
     ;

funcao : 'function' corpodafuncao
       ;

corpodafuncao : '(' (listapar)? ')' bloco 'end'
              ;

listapar : listadenomes (',' '...')? 
            {for(String nome : $listadenomes.nomes)
              if(!pilhaDeTabelas.existeSimbolo(nome))
              pilhaDeTabelas.topo().adicionarSimbolo(nome, "parametro");
            }
          #listaParListaDeNomes
         | '...' #listaParVarargs
         ;

construtortabela : '{' (listadecampos)? '}'
                 ;

listadecampos : campo (separadordecampos campo)* (separadordecampos)?
              ;

campo : '[' exp ']' '=' exp | NOME '=' exp | exp
      ;

separadordecampos : ',' | ';'
                  ;

opbin : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | 
        '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or'
      ;

opunaria : '-' | 'not' | '#'
         ;


NOME	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CADEIA	:	'\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';
NUMERO	:	('0'..'9')+ EXPOENTE? | ('0'..'9')+ '.' ('0'..'9')* EXPOENTE?
		| '.' ('0'..'9')+ EXPOENTE?;
fragment
EXPOENTE	:	('e' | 'E') ( '+' | '-')? ('0'..'9')+;
COMENTARIO
	:	'--' ~('\n' | '\r')* '\r'? '\n' {skip();};
WS	:	(' ' | '\t' | '\r' | '\n') {skip();};
