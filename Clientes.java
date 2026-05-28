abstract class Cliente{

    String nombre; 
    Cliente (String nombre){

        this.nombre = nombre;

    }

    void mostrarCliente(){
        System.out.println("Cliente:" + nombre);
    }
    

    abstract void pagar(double monto);
}


class Clientepagofacil extends Cliente{

    Clientepagofacil(String nombre){
        super(nombre);
    }

    @Override
    void pagar (double monto){
        System.out.println(nombre + "paga $:"+ monto+ " Por pago facil...");
    }
}


class ClienteEfectivo extends Cliente {
    ClienteEfectivo(String nombre){
        super(nombre);
    }
    @Override
    void pagar(double monto){
        System.out.println(nombre + "Paga $:" + monto + " En efectivo...");
    }    
    
    }

    
class ClienteCuentaBancaria extends Cliente{
    ClienteCuentaBancaria(String nombre){
        super(nombre);
    }
    @Override
    void pagar(double monto){
        System.out.println(nombre + "Paga $:" + monto + " Con cuenta bancaria");
    }    


   

}
public class Clientes {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Clientepagofacil("Lucas");
        Cliente cliente2 = new ClienteEfectivo("Mario");
        Cliente cliente3 = new ClienteCuentaBancaria("Isabel");

        cliente1.mostrarCliente();
        cliente1.pagar(15000);

        cliente2.mostrarCliente();
        cliente2.pagar(100000);

        cliente3.mostrarCliente();
        cliente3.pagar(205000);

        
    }
}
