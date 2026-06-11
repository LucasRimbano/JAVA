public class Columna {
    private String nombre;
    private Class<?> tipo;

    public Columna(String nombre, Class<?> tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Class<?> getTipo() {
        return tipo;
    }

    public boolean validarValor(Object valor) {
        return tipo.isInstance(valor);
    }
}