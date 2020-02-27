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
public class Sala {
    private int sillones;
    private boolean tv;
    private String decoraciones;

    public Sala() {
    }

    public Sala(int sillones, boolean tv, String decoraciones) {
        this.sillones = sillones;
        this.tv = tv;
        this.decoraciones = decoraciones;
    }

    public String getDecoraciones() {
        return decoraciones;
    }

    public void setDecoraciones(String decoraciones) {
        this.decoraciones = decoraciones;
    }

    public int getSillones() {
        return sillones;
    }

    public void setSillones(int sillones) {
        this.sillones = sillones;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
    
    public void encenderTv(){
        System.out.println("Encendiendo Tv...");
    }
    
    public void reclinarSillon(){
        System.out.println("El sillon ahora es mas comodo :)");
    }
}
