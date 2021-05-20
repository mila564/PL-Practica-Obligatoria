import especificacion.*;
import especificacion.GramaticaLexer;
import especificacion.GramaticaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ClasePrincipal {
    public static void main(String[] args) {
        try{
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            GramaticaLexer analex = new GramaticaLexer(input);
            // Identificar al analizador léxico como fuente de tokens para el sintáctico
            CommonTokenStream tokens = new CommonTokenStream(analex);
            // Crear el objeto correspondiente al analizador sintáctico
            // GramaticaParser anasint = new GramaticaParser(tokens);
            String[] directorioSplit = args[0].split("\\\\");
            String nombrePrograma = directorioSplit[directorioSplit.length-1];
            Program programa = new Program(new ArrayList<Part>(), nombrePrograma);
            GramaticaParser anasint = new GramaticaParser(tokens, programa);
            /*
            Si se quiere pasar al analizador algún objeto externo con el que trabajar,
            éste deberá ser de una clase del mismo paquete
            Aquí se le llama "síntesis", pero puede ser cualquier nombre.
            NumbersParser anasint = new NumbersParser(tokens, new sintesis());
            */
            /*
            Comenzar el análisis llamando al axioma de la gramática
            Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
            gramática
            */
            anasint.removeErrorListeners(); // remove ConsoleErrorListener
            anasint.addErrorListener(new CustomizedErrorListener()); // add ours
            anasint.r();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}
