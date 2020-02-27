/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ico.tareas;

import Ico.tareas.Cocina;
import Ico.tareas.Cuarto;
import Ico.tareas.Sala;

/**
 *
 * @author phokyn
 */
public class Casa {
    private int cuartos;
    private int banos;
    private String color;
    private Cocina cocina;
    private Cuarto cuarto; 
    private Sala sala;

    public Casa() {
    }

    public Casa(int cuartos, int banos, String color, Cocina cocina, Cuarto cuarto, Sala sala) {
        this.cuartos = cuartos;
        this.banos = banos;
        this.color = color;
        this.cocina = cocina;
        this.cuarto = cuarto;
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Cuarto getCuarto() {
        return cuarto;
    }

    public void setCuarto(Cuarto cuarto) {
        this.cuarto = cuarto;
    }
    
    public void abrirPuerta(){
        System.out.println("Bienvenido a casa!!!");
    }
    
    public void cerrarPuerta(){
        System.out.println("Adios buen dia!!!");
    }
    
}
