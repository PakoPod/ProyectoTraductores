grammar Proyecto;

programa:sentencia*;

bloque: ABRIR_LLAVES sentencia* CERRAR_LLAVES;

sentencia:asignacion
         |sentencia_while
         |sentencia_if
         |print
         |expr;

expr: ABRIR_PAR expr CERRAR_PAR  #aInicio   
    | expr MULTI expr   #a                  
    | expr SUMA expr    #b             
    | expr MODULO expr  #c             
    | expr AND expr     #d               
    | expr IGUAL_IGUAL expr #e           
    | expr MAYOR_IGUAL_QUE expr #f       
    | expr MENOR_IGUAL_QUE expr #g     
    | primitivo                 #h     
    | ID #idExpr;

asignacion:ID IGUAL expr PUNTO_Y_COMA;

primitivo: BOOL #bool     
         | NUMERO #numero      
         | CADENA #cadena;

sentencia_while: WHILE ABRIR_PAR expr CERRAR_PAR bloque;

sentencia_if: bloque_if bloque_elseif* bloque_else*;

bloque_if:IF ABRIR_PAR expr CERRAR_PAR bloque;

bloque_elseif: ELSEIF ABRIR_PAR expr CERRAR_PAR bloque;

bloque_else: ELSE bloque;

print: PRINT ABRIR_PAR expr CERRAR_PAR PUNTO_Y_COMA;

BOOL: 'true' | 'false';
PRINT:'print';
WHILE:'while';
ELSEIF:'elseif';
ELSE:'else';
IF:'if';
IGUAL_IGUAL:'==';
MAYOR_IGUAL_QUE:'>=';
MENOR_IGUAL_QUE:'<=';
IGUAL:'=';
MULTI:'*';
SUMA:'+';
MODULO:'%';
PUNTO_Y_COMA:';';
ABRIR_PAR:'(';
CERRAR_PAR:')';
ABRIR_LLAVES:'{';
CERRAR_LLAVES:'}';
AND:'and';
NUMERO:[0-9]+;
COMENTARIOS:'/*'[a-zA-Z0-9 \t\r\n]*'*/' -> skip;
CADENA:'"'[=:_a-zA-Z0-9 \t\r\n]*'"';
ID:[_a-zA-Z][a-zA-Z0-9]*;
ESPACIO:[ \t\r\n]+ -> skip;