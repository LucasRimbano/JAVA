interface FormadePago{

    void pagar(double monto);

    boolean requiereValidacion();

    double obtenerDescuento();
    
}


class PagoporMercadoPago implements FormadePago{
    @Override
    public void pagar(double monto){
        System.out.println("Pagando $ :" + monto + " Con mercadopago...");
    }

    @Override
    public boolean requiereValidacion(){
        return false; 

    }

    @Override
    public double obtenerDescuento(){
        return 0.0;
    }

}
class PagoenEfectivo implements FormadePago{

    @Override
    public void pagar(double monto){
        System.out.println("Pagando $ :" + monto + " Con efectivo...");

    }

    @Override
    public boolean requiereValidacion(){
        return true;
    }

    @Override
    public double obtenerDescuento(){

        return 0.10 ;
    }

    
}

class PagoporTransferencia implements FormadePago{

    @Override
    public void pagar(double monto){
        System.out.println("Pagando $ :" + monto + " Con transferencia bancaria...");
    }

    @Override
    public boolean requiereValidacion(){
        return false;
    }

    @Override
    public double obtenerDescuento(){
        return 0.05;
    }
}

class ClientePago{
    String nombre;
    FormadePago formadePago;


    ClientePago(String nombre, FormadePago formadePago){
        this.nombre = nombre;
        this.formadePago = formadePago;
    }

    void pagarCompra(double monto){
        double descuento = formadePago.obtenerDescuento();
        double montoDescuento = monto * descuento;
        double montoFinal = monto - montoDescuento;

        System.out.println("Cliente:" + nombre);
        formadePago.pagar(monto);
        System.out.println("Monto original: $"+ monto);
        System.out.println("Descuento aplicado: $"+ montoDescuento);
        System.out.println("Monto final $ :" + montoFinal);
      

        if(formadePago.requiereValidacion()){

            System.out.println("El pago requiere validacion antes de confirman la compra.");
        } else {
            System.out.println("El pago se confirma automaticamente.");
        }


        System.out.println("-----------------------");
    }

}
public class Clientess {
    public static void main(String[] args) {

        ClientePago cliente1 = new ClientePago("Lucas",new PagoenEfectivo());
        ClientePago cliente2 = new ClientePago("Juan", new PagoporMercadoPago());
        ClientePago cliente3 = new ClientePago("Maria", new PagoporTransferencia() );

        cliente1.pagarCompra(10000);
        cliente2.pagarCompra(50000);
        cliente3.pagarCompra(50000);
        
        
    }
}
