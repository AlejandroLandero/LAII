package analizadorlexico;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroTelefonico {
        public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("INGRESA EL TELEFONO");
        String texto = read.nextLine();
        
                  
        String regex = "(\\(55\\)[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])|(\\(555\\)[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])";

        //PATRON BUSQUEDA
        Pattern pattern = Pattern.compile(regex);
        
        //TEXTO COMPLETO PATRON BUSQUEDA
        Matcher matcher = pattern.matcher(texto);
        
        if (matcher.matches()) {
                        
            String match = matcher.group();
            
            System.out.println("EL TELEFONO ES VALIDO EN FORMATO Mexico: " + match);

        } //CIERRA IF 
        else {
            System.out.println("EL TELEFONO ES INVALIDO EN FORMATO Mexico");
        }
        
    }
    
}

