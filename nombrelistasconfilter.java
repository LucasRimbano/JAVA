import java.util.ArrayList;

public class Nombrelistasconfilter {
    public static void main (String[] arg){

        ArrayList<String> nombres = new ArrayList<>();
            nombres.add("Lucas");
            nombres.add("Mario");
            nombres.add("Maria");
            nombres.add("Julieta");
            nombres.add("Juan");
            nombres.add("Santiago");
            nombres.add("Lorena");

            nombres.stream()
                .filter(nombre -> nombre.startsWith("J"))
                .forEach(nombre -> System.out.println(nombre));

            
            System.out.println("El tamaño de la lista es de:" + nombres.size());
            System.out.println("Primer elemento de la lista:" + nombres.get (0));
            System.out.println("Ultimo elemento de la lista:" + nombres.get(nombres.size()-1));

            
            System.out.println("Nombres ordenados alfabeticamente:");
            nombres.stream()
                .sorted()
                .forEach(nombre -> System.out.println(nombre));


            long cantidad_con_M = nombres.stream()
                .filter(nombre-> nombre.startsWith("M"))
                .count();

            if (cantidad_con_M == 0){
                System.out.println("No se encontro ningun nombre con M,lo siento :C");
            }   else{
                System.out.println("Cantidad de nombres que empiezan con M son:" + cantidad_con_M);
              
            }
                    
            nombres.stream()
                .filter(nombre -> nombre.startsWith("M"))
                .forEach(nombre -> System.out.println("Los nombres que empiezan con M son:" +nombre));
            
            
            

            nombres.stream()
                .map(nombre -> nombre.toLowerCase())
                .forEach(nombre->System.out.println("Nombres pasados a minuscula:"+ nombre));


            }     
            
            
    }