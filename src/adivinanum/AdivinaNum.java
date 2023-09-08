
package adivinanum;

import java.util.Scanner;
import java.util.Random;
public class AdivinaNum {

    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();
    int num,numAleatorio;
        System.out.println("Adivina el numero");
        
        //generar numero random 
        numAleatorio = random.nextInt (100)+ 1;
         System.out.println("seleciona un numero de el 1-100");
        for (int i=1; i<=3;i++){
            num = teclado.nextInt();
        if (num==numAleatorio){
            System.out.println("Felicidades has adivinado el numero");
            break;
        }
        else if (num<numAleatorio){
            System.out.println("el numero esta mas arriba");
            System.out.println("intentalo de nuevo");
        }
        else if (num>numAleatorio){
        System.out.println("el numero esta mas abajo");
        System.out.println("intentalo de nuevo");
        }
        
       }
    System.out.println("el numero era: "+numAleatorio);
    }

}
