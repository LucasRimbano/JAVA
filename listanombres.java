public class listanombres {
    public static void main (String[] args){
        String[] nombres = {"Lucas" , "Juan" ,"Maria" , "Estela", "Mario"};

        for(String nombre: nombres){   //creo una variable temporal llamada nombre y recorro el string [] nombres , nombre= lucas ,nombre = juan ....
            System.out.println(nombre);
        }

        System.out.println("ultimo de la lista:" + nombres[nombres.length - 1]);
        System.out.println("Primero de la lista:" + nombres[0]);

        boolean encontrado = false ;
        for(String nombre :nombres){
            if (nombre.startsWith("L")){
                 System.out.println("Nombres que empiezen con L:"+ nombre);
                 encontrado = true ;
            } 
           

        }

        if (!encontrado){
                System.out.println("Lo siento ningun nombre empieza con L.");
            } 

        boolean encontradoA = false ;
        int  cantidadA = 0;
         for (String nombre :nombres) {
            if (nombre.contains("a")){
                System.out.println("los nombres que contienen la a son:"+ nombre);
                cantidadA++;
                encontradoA = true;
            }
            
    }

    if (!encontradoA) {
                System.out.println("No encontro ningun nombre que contenga a");
                 
            } else{
                System.out.println("La cantidad que de nombres que contienen a es de:" + cantidadA );
            }
        }
}
