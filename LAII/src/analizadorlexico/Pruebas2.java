package analizadorlexico;

import analizadorlexico.Token.Tipos;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pruebas2 {

    
    public static void main(String[] args) {
        


        
        String entrada = "";
        
        ArrayList<Token> tokens = lex(entrada);
        
        Token enumerador = new Token();
        
        //define los tokens 
        int numero = 0;
        int operador = 0;
        int constante = 0;
        int variable = 0;
        int desconocido = 0;
 
        
        for (Token token : tokens) {
            System.out.println(token.getTipo()+ "  " + token.getValorString());
           
            
            if (token.getTipo() == enumerador.tipo.NUMERO) {
                numero++;
            }else if (token.getTipo() == enumerador.tipo.OPERADOR) {
                operador++;
            }else if (token.getTipo() == enumerador.tipo.CONSTANTE) {
                constante++;
            }else if (token.getTipo() == enumerador.tipo.VARIABLE) {
                variable++;
            }else if (token.getTipo() == enumerador.tipo.DESCONOCIDO) {
                desconocido++;
            }
            
           
           
        }
        
        System.out.println("Se encuentra: \n"
                + numero + " NUMERO\n" 
                + operador +" OPERADOR\n"
                + constante + " CONSTANTE\n" 
                + variable +" VARIABLE\n"
                + desconocido +" DESCONOCIDOS\n");
        
    }
    
    public static ArrayList<Token> lex(String entrada){
    
        final ArrayList<Token> tokens = new ArrayList<>();
        final StringTokenizer st = new StringTokenizer(entrada );
        
        while (st.hasMoreTokens()) {  
            String palabra = st.nextToken();
            boolean bandera = false;
            
            for (Tipos tokenTipo : Tipos.values()) {// llama la clase enum para compara los token
                Pattern patron = Pattern.compile(tokenTipo.patron);//asigna el patron a buscar 
                Matcher busqueda = patron.matcher(palabra);//busca el patron (de la clase enum) en la palabra
                
                if (busqueda.find()) {
                    Token token = new Token();
                    
                    token.setTipo(tokenTipo);
                    token.setValorString(palabra);
                    tokens.add(token);
                    bandera = true;
                    
                }//Cierra if
                
            }// Cierra for
            if (!bandera) {
                throw new RuntimeException("Token Invalido");
            }
        }// Cierra while
        
        return tokens;
    }//cierra ArrayList
            
    
}//Cierra llave principal 