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
        options.addOption("n", false, "Fecha");   options.addOption("h", false, "Hola mundo");
        options.addOption("y", false, "Buenos dias");
        
        
        
        CommandLineParser parser = (CommandLineParser) new org.apache.commons.cli.DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("w"))      System.out.println("Hola");
        else if (cmd.hasOption("c")) System.out.println("Buenas tardes");
        else if (cmd.hasOption("n")) {
            DateFormat myFormat = DateFormat.getDateInstance( DateFormat.LONG, Locale.ENGLISH );
           System.out.println(DateFormat.DATE_FIELD);
        } else if (cmd.hasOption("h")) System.out.println("Hola mundo");
        else if (cmd.hasOption("y")) System.out.println("Buenos dias");
        else System.err.getClass();
        
    
}
}
