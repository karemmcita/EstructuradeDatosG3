package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos {

    private double [] vector;
    private final int TAMANIO = 5;//es una constante, su valor no se va a cambiar

    public OperacionesArreglos (){
        this.vector= new double[TAMANIO];
    }

    public OperacionesArreglos (int tamanio){
        this.vector=new double[tamanio];
    }

    public OperacionesArreglos (double [] vector){
        this.vector= new double[vector.length];
        this.llenarArreglo();
        imprimir();
    }

    public void llenarArreglo(double [] vector){

        int i=0;
        while(i<this.vector.length){

            this.vector[i] = vector [i];
            i++;
        }
    }

    public void llenarArreglo (){
        int i=0;
        do{
            this.vector[i]=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posición ["+ i +"]"));
        i++; }
        while(i<this.vector.length);
    }

   /*public void llenarArreglo( ){
        for (int i = 0; i < this.vector.length; i++) {

            this.vector[i]=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posición ["+ i +"]"));
        }
    }*/

    public double sumarValores(){

        double total=0.0;
        for (int i = 0; i < this.vector.length ; i++) {

           total+= this.vector[i];
        }
        return total;
    }

    public double obtenerValorMaximo() {

        double numMaximo = 0.0;

        int i=0;

        while(i<this.vector.length){

            if (numMaximo< this.vector[i]) {
                numMaximo=this.vector[i];
            }
            i++;
        }

        /*for (int i = 0; i < this.vector.length; i++) {

            if (this.vector[i] > numMaximo) {

                numMaximo = this.vector[i];

            }
        }*/
        return numMaximo;
    }

    public double obtenerValorMinimo(){

            double minimo = this.vector[0];
            for(double valor : this.vector){
                if (valor < minimo) {
                    minimo=valor;
                }
            }

            /*int i=0;
            double numeroMinimo=this.vector[0];

            while(i<this.vector.length){
                if (this.vector[i]>numeroMinimo) {

                    numeroMinimo=this.vector[i];

                }
                i++;
            }*/
        return minimo;
    }

    public boolean compararArreglos(double [] vector){

        boolean isEquals = true;

        if (vector.length != this.vector.length) {
            isEquals = false;
        }else {
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if(this.vector[i] != vector[i])
                    isEquals = false;

            }
        }
      return isEquals;
    }

    public void cambiarTamanio (int tamanio){

        double temp [] = new double[tamanio];

        for (int i = 0; i < this.vector.length; i++) {

            temp[i]=this.vector[i];

        }
        this.vector=temp;
        temp=null;

    }

    public String buscarValor (double valor) {

        String salida= "";
        boolean sentinel=false;
        for (int i = 0; i < this.vector.length; i++) {

            if (valor == this.vector[i]) {
                sentinel=true;
                salida="El valor " + valor + " esta en la posición " + i;
                break;
            }
        }
            if(!sentinel)
                salida="El valor no se encontro en el arreglo";

            return salida;
    }


    public void imprimir (){
        String salida= "";
        for(double valor : vector){

            salida += "| " + valor + " |";

        }

            JOptionPane.showMessageDialog(null,salida);

        }

    }

