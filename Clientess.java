interface FormadePago{

    void pagar(double monto);

    boolean requiereValidacion();

    double obtenerDescuento();

    boolean pagoAprobado(double monto);
    
}


class PagoporMercadoPago implements FormadePago{

    double saldoDisponible;
    
    PagoporMercadoPago(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

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

    @Override 
    public boolean pagoAprobado(double monto){
        return saldoDisponible >= monto ;
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

    @Override
    public boolean pagoAprobado(double monto) {
        return true;
    }

    
}

class PagoporTransferencia implements FormadePago{
    double saldoDisponible;
    PagoporTransferencia(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

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

    @Override
    public boolean pagoAprobado(double monto) {
        return  saldoDisponible >= monto ;
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

        if (formadePago.pagoAprobado(montoFinal)){
            System.out.println("Pago aprobado."); 
            if(formadePago.requiereValidacion()){

                System.out.println("El pago queda pendiente de validacion.");
            } else {
                System.out.println("El pago se confirma automaticamente.");
            }

        } else {
            System.out.println("Pago rechazado.");
        }
    

        System.out.println("-----------------------");
    }

}
public class Clientess {
    public static void main(String[] args) {

        ClientePago cliente1 = new ClientePago("Lucas",new PagoenEfectivo());
        ClientePago cliente2 = new ClientePago("Juan", new PagoporMercadoPago(30000));
        ClientePago cliente3 = new ClientePago("Maria", new PagoporTransferencia(60000) );

        cliente1.pagarCompra(10000);
        cliente2.pagarCompra(50000); //juan como tiene en mercadopago30000 y tiene q pagar 50 no llega 
        cliente3.pagarCompra(50000);
        
        
    }
}
