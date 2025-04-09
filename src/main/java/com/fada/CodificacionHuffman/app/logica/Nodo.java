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

public class Nodo 
{
    //Variables
    private Integer valor;
    private String valorArista;
    private Character caracter;
    private Nodo padre, hijoIzquierdo, hijoDerecho;
    
    //Constructores
    Nodo () 
    {
        this.valor = null;
        this.caracter = null;
        this.padre = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
    Nodo (Integer valor, Character caracter, Nodo padre, Nodo hijoIzquierdo, Nodo hijoDerecho) 
    {
        this.valor = valor;
        this.caracter = caracter;
        this.padre = padre;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }
    
    //Metodos Set's y Get's
    public void setValor(Integer valor)
    {
        this.valor = valor;
    }
    
    public Integer getValor()
    {
        return valor;
    }
    
    public void setValorCamino(String valorArista)
    {
        this.valorArista = valorArista;
    }
    
    public String getValorCamino()
    {
        return valorArista;
    }
    
    public void setCaracter(Character caracter)
    {
        this.caracter = caracter;
    }
    
    public Character getCaracter()
    {
        return caracter;
    }
    
    public void setPadre (Nodo padre) 
    {
        this.padre = padre;
    }
    
    public Nodo getPadre () 
    {
        return padre;
    }
    
    public void setHijoIzquierdo (Nodo hijoIzquierdo) 
    {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public Nodo getHijoIzquierdo () 
    {
        return hijoIzquierdo;
    }
    
    public void setHijoDerecho (Nodo hijoDerecho) 
    {
        this.hijoDerecho = hijoDerecho;
    }
    
    public Nodo getHijoDerecho () 
    {
        return hijoDerecho;
    }
    
    //Metodos
    public boolean hasLeft () 
    {
        return hijoIzquierdo != null;
    }
    
    public boolean hasRight () 
    {
        return hijoDerecho != null;
    }
    
    public boolean isLeaf () 
    {
        return ((hasLeft() == false) && (hasRight() == false));
    }
}
