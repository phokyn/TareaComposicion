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
public class Cocina {
    private int numeroPlatos;
    private String marcaEstufa;
    private String marcaRefri;

    public Cocina() {
    }

    public Cocina(int numeroPlatos, String marcaEstufa, String marcaRefri) {
        this.numeroPlatos = numeroPlatos;
        this.marcaEstufa = marcaEstufa;
        this.marcaRefri = marcaRefri;
    }

    public String getMarcaRefri() {
        return marcaRefri;
    }

    public void setMarcaRefri(String marcaRefri) {
        this.marcaRefri = marcaRefri;
    }

    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    public String getMarcaEstufa() {
        return marcaEstufa;
    }

    public void setMarcaEstufa(String marcaEstufa) {
        this.marcaEstufa = marcaEstufa;
    }
    
    public void prenderEstufa(){
        System.out.println("Prendiendo estufa...");
    }
    public void abrirRefr(){
        System.out.println("Abriendo refri...");
    }
}
