
package analizadorlexico;

public class Pruebas {

 public enum TALLAS{
     T11,
     T12,
     T13,
     T14,
     T15,
     T16,
     T17,
     T18,
     T19,
     T20,
     T21,
     T22,
 }//cierra enum
    public static void main(String[] args) {
        TALLAS tallaact = TALLAS.T21;
        
        if ( tallaact == TALLAS.T11 || tallaact == TALLAS.T12 ||tallaact == TALLAS.T13|| tallaact == TALLAS.T14 || tallaact == TALLAS.T15)
        {System.out.println("TALLA DE ROPA PARA NIÑO");
          }else{
            System.out.println("TALLAS PARA JOVENES");}//cierra else
        
        System.out.println("--------------------------------");
        for(TALLAS color: TALLAS.values()){
            System.out.println(color);
        }//cierra for
        
    }
    
}
 