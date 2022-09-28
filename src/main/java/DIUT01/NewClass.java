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
        args = new String[]{"-n"};
        Options options = new Options();
    
        options.addOption("w", false, "Hola Mundo");          options.addOption("c", false, "Hola mundo cruel");
        options.addOption("n", false, "Hola mundo bonito");   options.addOption("h", false, "Help");
        options.addOption("y", false, "Años");
        
        
        
        CommandLineParser parser = (CommandLineParser) new org.apache.commons.cli.DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if      (cmd.hasOption("w"))    System.out.println("Hola Mundo");
        else if (cmd.hasOption("c"))    System.out.println("Buenas tardes");
        else if (cmd.hasOption("n"))    System.out.println("Hola mundo bonito");
        else if (cmd.hasOption("h"))    System.out.println("Has seleccionado ayuda, esto es muy facil de usar, pulsa -w, -n, -c & -y para diferentes opciones ");
        else if (cmd.hasOption("y"))    System.out.println("Tras "+ args +" años de vida");
        
    
}
}
