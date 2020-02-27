/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ico.tareas;

/**
 *
 * @author phokyn
 */
public class Cuarto {
   private int numeroCamas;
   private int numeroFocos;
   private boolean limpio;

    public Cuarto() {
    }

    public Cuarto(int numeroCamas, int numeroFocos, boolean limpio) {
        this.numeroCamas = numeroCamas;
        this.numeroFocos = numeroFocos;
        this.limpio = limpio;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroFocos() {
        return numeroFocos;
    }

    public void setNumeroFocos(int numeroFocos) {
        this.numeroFocos = numeroFocos;
    }
   
   public void abrirCuarto(){
       System.out.println("Abriendo cuarto...");
   }
   public void cerrarCuarto(){
       System.out.println("Cerrando cuarto...");
   }
}
