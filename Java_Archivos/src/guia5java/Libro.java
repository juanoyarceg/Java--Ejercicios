/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java;

/**
 *
 * @author cetecom
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestado;
    private int disponible;

    //constructor por defecto
    public Libro() {
    }

    //constructor parametrico
    public Libro(String titulo, String autor, int ejem) {
        this.autor = autor;
        this.titulo = titulo;
        this.ejemplares = ejem;
        this.prestado = 0;
        this.disponible = ejem;

    }

    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrestado(int pres) {
        this.prestado = pres;
    }

    public void setEjemplares(int ejem) {
        this.ejemplares = ejem;
    }

    //getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public int getPrestado() {
        return this.prestado;
    }

    //metodo de prestamo
    public boolean prestar() {
        if (this.disponible > 0) {
            this.prestado++;
            this.disponible--;
            return true;
        } else {
            System.out.println("Lo sentimos, el libro " + this.titulo + " no esta disponible para el arriendo");
            return false;
        }

    }

    public boolean devolucion() {
        if (this.prestado > 0) {
            this.prestado--;
            this.disponible++;
            return true;
        } else {
            System.out.println("Lo sentimos, el libro " + this.titulo + " no tiene ejemplares prestados");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", \nautor=" + autor + ", \nejemplares=" + ejemplares + ", \nprestado=" + prestado + ", \ndisponible=" + disponible + '}';
    }

}
