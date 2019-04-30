/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculomatricula;
import java.util.Scanner;
import descuentos.Porcentajes;
/**
 *
 * @author davidpillco
 */
public class CalculoMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
    // Declaracion de variables
      double precmatricula;
      String localizacion;
      int edad;
      int estado_civil;
      int cargas_familiares;
      double valor_total= 0;
      double valor_matricula;
      double valor_final;
      
    // Pedimos los datos del estudiante
    
    // Pedimos la localizacion del estudiante
    
    System.out.println ("Ingrese su localizacion : ");
    localizacion = entrada.nextLine();
    
    //Pedimos la edad del estudiante
    
    System.out.println ("Ingrese su edad : ");
    edad = entrada.nextInt();
    
    //Pedimos el estado civil del estudiante
    
    System.out.println ("Ingrese su estado civil : ");
    System.out.println ("1.- Casado");
    System.out.println ("2.- Otros ");
    estado_civil = entrada.nextInt();
    
    // Pedimos si tiene o no cargas familiares
    
    System.out.println ("Ustes tiene cargas familiares ");
    System.out.println ("1.- Si ");
    System.out.println ("2.- No ");
    cargas_familiares = entrada.nextInt();
    
    // Calculo del valor de la matricula 
    
   valor_total = 1330;
   
    // Localizacion del estudiante 
    
    if((localizacion).equals("Zamora") || (localizacion).equals("Loja")){
        
        valor_total = valor_total - Porcentajes.localizacion_desc;
    }
    
    // Edad del estudiante
    
    if(edad >= 17 && edad < 20){
        
        valor_total = valor_total - Porcentajes.edad_desc;
        
    }    
    
    // Estado civil del estudiante
    
    if (estado_civil == 1){
        
        valor_total = valor_total - Porcentajes.estadocivil_desc;
    }
    
    // Cargas familiares del estudiante
    
    if (cargas_familiares == 1){
        
        valor_total = valor_total - Porcentajes.cargas_desc;
    }
    
    // Calculo del total a pagar con el costo del tramite 

    valor_matricula = valor_total * Porcentajes.tramite;
    valor_final = valor_total + valor_matricula;
    
    // Presentar el resultado 
    
    System.out.printf("El pago total por su matricula es de: %.3f",valor_final);
    } 
}
