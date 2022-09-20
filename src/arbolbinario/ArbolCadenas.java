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
public class ArbolCadenas {

    private Nodo raiz;

    public ArbolCadenas() {

    }

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getValor().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getValor()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(String valor) {
        if (this.raiz == null) {
            this.raiz = new Nodo(valor);
        } else {
            this.insertar(this.raiz, valor);
        }
    }

    private void insertar(Nodo padre, String valor) {
        System.out.println("::: " + valor.compareTo(padre.getValor()));
        if (valor.compareTo(padre.getValor()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(valor));
            } else {
                this.insertar(padre.getDerecha(), valor);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(valor));
            } else {
                this.insertar(padre.getIzquierda(), valor);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirValor();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirValor();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirValor();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
