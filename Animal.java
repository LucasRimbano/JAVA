public class Animal {
    //metodos abstractos 
    void dormir() {
        System.out.println("El animal duerme:");
    }
    void hablar(){

        System.out.println("El animal hace un sonido");

    }
}
//heredan con extends 
class Perro extends Animal{
    @Override
    void hablar(){

        System.out.println("Guau");
    }
}

class Gato extends Animal{

    @Override
    void hablar (){
        System.out.println("Miau ");
    }
}

class Main {

    public static void  main(String[] args){
     Animal animal1 = new Perro();
     Animal animal2 = new Gato();
    //polimorficos entre gato y perrro
     animal1.dormir();
     animal2.dormir();

    }
}