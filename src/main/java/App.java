
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // Leer el archivo del programa usando CharStreams
        //String instrucciones = "1+2";
        //CharStream entrada = CharStreams.fromString(instrucciones);
        String ruta = "src//main//resources//pruebas.uam";
        CharStream entrada = CharStreams.fromFileName(ruta, StandardCharsets.UTF_8);
        // Construir un analizador lexico
        ProyectoLexer analizadorLexico = new ProyectoLexer(entrada);
        // Construir el flujo de tokens
        CommonTokenStream flujoTokens = new CommonTokenStream(analizadorLexico);
        // Construir el analizador sintactico
        ProyectoParser analizadorSintactico = new ProyectoParser(flujoTokens);
        // Invocamos al analizador sintáctico para construir el árbol
        ParseTree arbol = analizadorSintactico.programa();
        // Imprimimos el arbol
        System.out.println(arbol.toStringTree(analizadorSintactico));
        // Visitamos el arbol
        VisitadorProyecto proyectoVisitor = new VisitadorProyecto();
        proyectoVisitor.visit(arbol);        
    }
}
