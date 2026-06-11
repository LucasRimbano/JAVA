import java.util.ArrayList;

public class Matriz {
    private ArrayList<Columna> columnas;
    private ArrayList<ArrayList<Object>> filas;

    public Matriz() {
        columnas = new ArrayList<>();
        filas = new ArrayList<>();
    }
    
    public void agregarColumna(String nombre, Class<?> tipo) {
        columnas.add(new Columna(nombre, tipo));
    }

    public void mostrarColumnas() {
        for (Columna columna : columnas) {
            System.out.println("Columna: " + columna.getNombre());
            System.out.println("Tipo: " + columna.getTipo().getSimpleName());
        }
    }

    public void agregarFila(ArrayList<Object> valores) {
        if (valores.size() != columnas.size()) {
            System.out.println("Error: la cantidad de valores no coincide con la cantidad de columnas.");
            return;
        }

        for (int i = 0; i < valores.size(); i++) {
            Columna columna = columnas.get(i);
            Object valor = valores.get(i);

            if (!columna.validarValor(valor)) {
                System.out.println("Error: el valor " + valor + " no coincide con el tipo de la columna " + columna.getNombre());
                return;
            }
        }

        filas.add(valores);
        System.out.println("Fila agregada correctamente.");
    }

    public void mostrarMatriz() {
        for (Columna columna : columnas) {
            System.out.print(columna.getNombre() + "\t");
        }

        System.out.println();

        for (ArrayList<Object> fila : filas) {
            for (Object valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}