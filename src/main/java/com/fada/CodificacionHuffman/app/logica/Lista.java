/**
 *  Nombre del Archivo:
 *  Versión:
 *  Fecha de Creacion:
 *  Fecha de Ultima Modificacion:
 *  Autores:
 */

/**
 *  Clase:
 *  Responsabilidad:
 *  Colaboracion:
 */

package com.fada.CodificacionHuffman.app.logica;

import java.util.*;

public class Lista {
    private ArrayList<Nodo> listaNodos;

    Lista() {
        listaNodos = new ArrayList<Nodo>();
    }

    Lista(ArrayList<Nodo> listaNodos) {
        this.listaNodos = listaNodos;
    }

    public void setListaNodos(ArrayList<Nodo> listaNodos) {
        this.listaNodos = listaNodos;
    }

    public ArrayList<Nodo> getListaNodos() {
        return listaNodos;
    }

    public void generarLista(ArrayList<Character> listaCaracteres, ArrayList<Integer> conteo) {
        char caracter;
        int conteoCaracter;
        Nodo objNodo;

        for (int i = 0; i < listaCaracteres.size(); i++) {
            caracter = listaCaracteres.get(i);
            conteoCaracter = conteo.get(i);

            if (conteoCaracter > 0) {
                objNodo = new Nodo(conteoCaracter, caracter, null, null, null);
                getListaNodos().add(objNodo);
            }
        }
    }

    public void ordenarLista() {
        int posicion;
        Nodo objNodoContenedor;

        for (int j = 0; j < getListaNodos().size(); j++) {
            objNodoContenedor = getListaNodos().get(j);
            posicion = j - 1;

            while ((posicion >= 0) && (getListaNodos().get(posicion).getValor() >= objNodoContenedor.getValor())) {
                getListaNodos().set(posicion + 1, getListaNodos().get(posicion));
                posicion--;
            }

            getListaNodos().set(posicion + 1, objNodoContenedor);
        }
    }
}