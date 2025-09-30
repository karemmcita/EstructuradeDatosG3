package mx.edu.uttt.arreglos;

public class TestOperacionesArreglos {
    public static void main(String[] args) {

        // Constructor por defecto (vector de tamaño 5)
        OperacionesArreglos op1 = new OperacionesArreglos();


        //Constructor con tamaño definido por parámetro
        OperacionesArreglos op2 = new OperacionesArreglos(6);


        //  Constructor con arreglo inicial
        double[] vector = {1.2, 4.5, 7.8};
        OperacionesArreglos op3 = new OperacionesArreglos(vector);
        op3.imprimir();

        OperacionesArreglos op4 = new OperacionesArreglos();
        op4.llenarArreglo();
        System.out.println("Suma = " + op4.sumarValores());
        System.out.println("Máximo = " + op4.obtenerValorMaximo());
        System.out.println("Mínimo = " + op4.obtenerValorMinimo());
        op1.imprimir();


    }
}
