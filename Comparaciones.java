public class Comparaciones {
    public static void main(String[] args) {

        
        int numero1 = 10;
        int numero2 = 20;

       
        String nombre1 = "Lucas";
        String nombre2 = "Mario";

        
        if (numero1 < numero2 && nombre1.equals("Lucas")) {
            System.out.println("numero1 es menor que numero2 Y nombre1 es Lucas");
        } else {
            System.out.println("No se cumplen las dos condiciones del AND");
        }

        
        if (numero1 > numero2 || nombre2.equals("Mario")) {
            System.out.println("numero1 es mayor que numero2 O nombre2 es Mario");
        } else {
            System.out.println("No se cumple ninguna condición del OR");
        }

       
        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }

        if (numero1 == numero2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son diferentes");
        }
    }
}