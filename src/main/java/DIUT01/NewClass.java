/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIUT01;

import java.text.DateFormat;
import java.util.Locale;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author juanj
 */
public class NewClass {
    public static void main(String[] args) throws ParseException {
        //Sirve para meter datos por consola
        args = new String[]{"-y"};
        // create Options object
        Options options = new Options();
    
        options.addOption("w", false, "Hola");          options.addOption("c", false, "Buenas tardes");
        options.addOption("n", false, "Buenos dias");   options.addOption("h", false, "Hola mundo");
        options.addOption("y", false, "Adios mundo");
        
        
        
        CommandLineParser parser = (CommandLineParser) new org.apache.commons.cli.DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("w"))      System.out.println("Hola mundo");
        else if (cmd.hasOption("c")) System.out.println("Hola mundo cruel");
        else if (cmd.hasOption("n")) System.out.println("Hola mundo bonito");
        else if (cmd.hasOption("h")) System.out.println("Pulsa w, n o c para ejecutar una accion de este programa");
        else if (cmd.hasOption("y")) {
           DateFormat myFormat = DateFormat.getDateInstance( DateFormat.LONG, Locale.ENGLISH );
           System.out.println(DateFormat.DATE_FIELD);
        } else System.err.getClass();
        
    
}
}
