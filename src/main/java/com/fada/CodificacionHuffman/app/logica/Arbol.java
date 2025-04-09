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

public class Arbol 
{
    private Nodo root;
    private int altura, numeroNodos;
    private ArrayList <Nodo> hojas;
    
    Arbol () 
    {
        root = null;
        altura = 0;
        numeroNodos = 0;
        hojas = new ArrayList <Nodo> ();
    }
    
    Arbol (Nodo root) 
    {
        this.root = root;
        altura = 0;
        numeroNodos = 0;
        hojas = new ArrayList <Nodo> ();
    }
    
    public void setRoot (Nodo root) 
    {
        this.root = root;
    }
    
    public Nodo getRoot ()
    {
        return root;
    }
    
    public void setAltura (int altura) 
    {
        this.altura = altura;
    }
    
    public int getAltura () 
    {
        return altura;
    }
    
    public void setNumeroNodos (int numeroNodos) 
    {
        this.numeroNodos = numeroNodos;
    }
    
    public int getNumeroNodos () 
    {
        return numeroNodos;
    }
    
    public void setHojas (ArrayList <Nodo> hojas) 
    {
        this.hojas = hojas;
    }
    
    public ArrayList <Nodo> getHojas () 
    {
        return hojas;
    }
    
    public Nodo construirArbol (Nodo nodoIzquierdo, Nodo nodoDerecho) 
    {
        int newValor;
        Nodo newObjNodo = new Nodo();
        
        newValor = nodoIzquierdo.getValor() + nodoDerecho.getValor();
        newObjNodo = new Nodo(newValor, null, null, nodoIzquierdo, nodoDerecho);
        
        nodoIzquierdo.setPadre(newObjNodo);
        nodoIzquierdo.setValorCamino("1");
        
        nodoDerecho.setPadre(newObjNodo);
        nodoDerecho.setValorCamino("0");
        
        setRoot(newObjNodo);
        
        return newObjNodo;
    }
    
    public void conteoNodos(Nodo root) 
    {
        if (root != null) 
        {
            this.numeroNodos++;
            
            conteoNodos(root.getHijoIzquierdo());
            conteoNodos(root.getHijoDerecho());
        }
        
        setNumeroNodos(numeroNodos);
    }
    
    public void altura(Nodo root, int nivelActual) 
    {
        if (root != null)
        {
            if (nivelActual > this.altura)
            {
                this.altura = nivelActual;
            }
            
            altura(root.getHijoIzquierdo(), nivelActual + 1);
            altura(root.getHijoDerecho(), nivelActual + 1);
        }
    }
    
    public void generarListaHojas(Nodo root) 
    {
        if (root.isLeaf()) 
        {
            getHojas().add(root);
        } 
        
        else 
        {
            generarListaHojas(root.getHijoIzquierdo());
            generarListaHojas(root.getHijoDerecho());
        }
    }
}