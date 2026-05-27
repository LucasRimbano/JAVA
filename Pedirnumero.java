import java.util.Scanner;

public class Pedirnumero {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
    
       
        System.out.println("Ingrese un numero:");

        while(!scanner.hasNextInt()){
            System.out.println("Por favor ingrese un numero , no otra cosa...");
            scanner.next();

        }

        int numero =  scanner.nextInt();

        System.out.println("El numero Ingresado es : " + numero);

        

        System.out.println("Ingrese un segundo numero:");
       
        while(!scanner.hasNextInt()){
            System.out.println("Ingrese un numero , no otra cosa...");
            scanner.next();

        }
  
        int numero2 = scanner.nextInt();

        System.out.println("El segundo numero es: " + numero2);
     
        
        int opcion = -1 ;
        while(opcion != 0 ){

        System.out.println("Ingrese un numero segun la opcion que elija:");
        System.out.println("Ingresa 1 para sumar los dos numeros:");
        System.out.println("Ingresa 2 para restar");
        System.out.println("Ingresa 3 para multiplicar");
        System.out.println("Ingrese 4 para dividir:");
        System.out.println("Ingrese 5 para ver si es par o impar la suma:");
        System.out.println("Ingrese 0 para salir del programa...");
        
        
        while(!scanner.hasNextInt()){
            System.out.println("Ingrese un numero no otra cosa...");
            scanner.next();
        }
        


        opcion = scanner.nextInt();

        switch(opcion){

            case 1 :
                   int suma = numero + numero2 ;

                    System.out.println("La suma de los dos numeros es:" + suma + " Numero1:"+ numero + " Numero2:" + numero2);

                     break;
            case 2: 
                    int restar = numero - numero2; 
                    System.out.println("La resta de los dos numeros es:" + restar + " Numero1:" + numero+ " Numero2:" + numero2);
            break;
            
            case 3:
                    int multiplicacion = numero * numero2;
                    System.out.println("La multiplicacion de los dos numeros es:" + multiplicacion + " Numero1:" + numero + " Numero2:" + numero2);
            break;

            case 4:
                    if(numero != 0){
                        double division = (double) numero / numero2;
                        System.out.println("La division de los numeros es: " + division + " Numero1:" + numero + " Numero2:" + numero2);

                    }
                    System.out.println("No se puede dividir por cero"+ numero2);
            break;

            case 5: 
                int sumaa = numero + numero2;
                if(sumaa  / 2 ==  0){

                    System.out.println("La suma es par... " + sumaa);
                } else {
                    System.out.println("La suma es impar... " + sumaa);
                }
            break;
            
            case 0:
                System.out.println("Saliendo del programa....");
            break;

            default:
                System.out.println("Opcion incorrecta... elija solo numeros q estan disponibles");
            break;
         

        }
        }

        scanner.close();
    }

}
