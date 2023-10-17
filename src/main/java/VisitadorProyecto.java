import java.util.HashMap;
import java.util.Map;

public class VisitadorProyecto extends ProyectoBaseVisitor<Object> {
    private Map<String,Object> variables = new HashMap<>();
    

    @Override
    public Object visitIdExpr(ProyectoParser.IdExprContext ctx) {
        // | ID #idExpr
        String nombreVariable = ctx.getText();
        Object valor = variables.get(nombreVariable);
        return valor;
        // return super.visitIdExpr(ctx);
    }


    @Override
    public Object visitBool(ProyectoParser.BoolContext ctx) {
        Boolean valor = Boolean.valueOf(ctx.getText());
        // return super.visitBool(ctx);
        return valor;
    }

    @Override
    public Object visitAsignacion(ProyectoParser.AsignacionContext ctx) {
        // asignacion tiene hijos:
        // 0    1      2    3
        // ID IGUAL expr PUNTO_Y_COMA;
        // getText te la el texto que representa el nodo
        String nombreVariable = ctx.getChild(0).getText();
        // visit recorre recursivamente 
        Object valor = visit(ctx.getChild(2));
        // n=10
        // n=13
        variables.put(nombreVariable, valor);   // se sobreescribe el valor por lo tanto seria en el mapa n=13

        return super.visitAsignacion(ctx);
    }

    @Override
    public Object visitCadena(ProyectoParser.CadenaContext ctx) {
        // Cadena que tiene "text"
        String cadenaOriginal = ctx.getText();
        // cadena original
        String cadena = cadenaOriginal.substring(1, cadenaOriginal.length() - 1);
        return cadena;
        // return super.visitCadena(ctx);
    }

    @Override
    public Object visitNumero(ProyectoParser.NumeroContext ctx) {
        Integer valor = Integer.valueOf(ctx.getText()); // "123"
        return valor;
        // return super.visitNumero(ctx);
    }

    @Override
        public Object visitBloque(ProyectoParser.BloqueContext ctx) {
            // Auto-generated method stub
        return super.visitBloque(ctx);
    }

    @Override
    public Object visitBloque_if(ProyectoParser.Bloque_ifContext ctx) {
        // Un nodo bloque_if tiene los soguientes hijos:
        // 0    1       2       3       4
        // IF ABIR_PAR expr CERRAR_PAR bloque
        Boolean condicion = (Boolean) visit(ctx.getChild(2));
        // traducimos al if de java
        if (condicion) {
            // Definir que hacer con el bloque
            visit(ctx.getChild(4));
        }
        return null;
        // return super.visitBloque_if(ctx);
    }

    @Override
    public Object visitBloque_else(ProyectoParser.Bloque_elseContext ctx) {
        // TODO Auto-generated method stub
        return super.visitBloque_else(ctx);
    }
    

    @Override
    public Object visitSentencia_while(ProyectoParser.Sentencia_whileContext ctx) {
        // TODO Auto-generated method stub
        // Un nodo sentencia_while tiene los soguientes hijos:
        // sentencia_while: WHILE ABRIR_PAR expr CERRAR_PAR bloque;

        return super.visitSentencia_while(ctx);
    }

    @Override
    public Object visitPrint(ProyectoParser.PrintContext ctx) {
        //                  nodo print tiene hijos: 
        //          0       1       2       3       4 
        // print: PRINT ABRIR_PAR expr CERRAR_PAR PUNTO_Y_COMA;
        // Obtener hijo expr recorrerlo recursivamente 
        // visitar recursivamente nodo expr
        Object resultado = visit(ctx.getChild(2));    //obteniendo nodo hijo hacer un visit ->
        System.out.println(resultado);
        return null;
        // return super.visitPrint(ctx);
    }


}
