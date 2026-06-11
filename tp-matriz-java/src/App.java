import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Matriz miMatriz = new Matriz();

        System.out.println("Ingrese el nombre de la columna:");
        String nombreColumna = scanner.nextLine();

        Class<?> tipoElegido = null;

        while (tipoElegido == null) {
            System.out.println("Ingrese el tipo de dato de la columna");
            System.out.println("1. Texto");
            System.out.println("2. Numero entero");
            System.out.println("3. Numero decimal");
            System.out.println("4. Booleano");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        tipoElegido = String.class;
                        break;

                    case 2:
                        tipoElegido = Integer.class;
                        break;

                    case 3:
                        tipoElegido = Double.class;
                        break;

                    case 4:
                        tipoElegido = Boolean.class;
                        break;

                    default:
                        System.out.println("Opcion invalida. Ingrese un numero del 1 al 4.");
                        break;
                }
            } else {
                System.out.println("Error: debe ingresar un numero.");
                scanner.next();
            }
        }

        miMatriz.agregarColumna(nombreColumna, tipoElegido);
        scanner.nextLine();

        ArrayList<Object> fila = new ArrayList<>();

        
        Object valorConvertido = null;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.println("Ingrese el valor para la columna " + nombreColumna + ":");
            String valorIngresado = scanner.nextLine();

            try {
                if (tipoElegido == String.class) {
                    valorConvertido = valorIngresado;
                    valorValido = true;
                } else if (tipoElegido == Integer.class) {
                    valorConvertido = Integer.parseInt(valorIngresado);
                    valorValido = true;
                } else if (tipoElegido == Double.class) {
                    valorConvertido = Double.parseDouble(valorIngresado);
                    valorValido = true;
                } else if (tipoElegido == Boolean.class) {
                    if (valorIngresado.equalsIgnoreCase("true") || valorIngresado.equalsIgnoreCase("false")) {
                        valorConvertido = Boolean.parseBoolean(valorIngresado);
                        valorValido = true;
                    } else {
                        System.out.println("Error: para Boolean debe ingresar true o false.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: el valor ingresado no coincide con el tipo de la columna.");
            }
        }


        fila.add(valorConvertido);

        miMatriz.agregarFila(fila);
        miMatriz.mostrarMatriz();

        scanner.close();
    }
}