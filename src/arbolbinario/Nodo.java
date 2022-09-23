/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author omarl
 */
public class Nodo {

    private int dato;
    private String valor;
    private Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }
    
    public Nodo(String valor) {
        this.valor = valor;
        this.izquierda = this.derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public String getValor() {
        return valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
    
    public void imprimirValor() {
        System.out.println(this.getValor());
    }
}
