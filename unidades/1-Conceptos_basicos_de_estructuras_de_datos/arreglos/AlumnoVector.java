package mx.edu.uttt.arreglos;
import mx.edu.uttt.poo.Alumno;
import javax.swing.*;

public class AlumnoVector {

    public static void main(String[] args) {

        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno alumnos [] = new Alumno[tamanio];
        boolean sentinel=true;


    }

    public static int obtenerTamanio (){
        return  Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de alumnos a registrar"));
    }
    public static String menu(){

        return "===== MENU PRINCIPAL ======\n"
                + "1) Llenar Arreglo \n"
                + "2) Imprimir arreglo \n"
                + "3) Salir \n"
                + "Elegir opción: ";
    }

    public static void operaciones( Alumno [] alumnos, boolean sentinel){
        String opcion = "";
        opcion=JOptionPane.showInputDialog(menu());

        do {
            switch (opcion) {
                case "1":
                    break;


                case "2":
                    break;


                case "3":
                    JOptionPane.showMessageDialog(null,"Bye");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida.");
                    break;
            }
        }while(sentinel);
    }
        public static void llenarArreglo ( Alumno [] alumnos){

            int i= 0;
            boolean activo = false;
            while (i<alumnos.length){
                Alumno alumno = new Alumno();
                alumno.setNombre(JOptionPane.showInputDialog("Intrudce el nombre del alumno [" + i +"]"));
                alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Intrudce la edad del alumno [" + i +"]")));
                alumno.setSexo(JOptionPane.showInputDialog("Intrudce la edad del alumno [" + i +"]").charAt(0));
                activo=JOptionPane.showInputDialog
                        ("Introduce el status del alumno [" + i +"] Activo / Inactivo")
                        .equalsIgnoreCase("Activo")?true:false;
                alumno.setActivo(activo);
                alumno.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el promedio del alumno [" + i +"]")));
               alumnos[i]=alumno;
                i++;
            }

    }
}
