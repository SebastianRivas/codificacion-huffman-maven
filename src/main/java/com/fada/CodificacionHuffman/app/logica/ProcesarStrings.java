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

public class ProcesarStrings
{
    public String completar8Bits(String cadena) 
    {
        int longitudCadena, bitsFaltantes;
        
        longitudCadena = cadena.length();
        
        if (longitudCadena % 8 != 0)
        {
            bitsFaltantes = 8 - longitudCadena % 8;
            
            for (int i = 0; i < bitsFaltantes; i++)
            {
                cadena += "0";
            }
        }
        
        return cadena;
    }
    
    public int generarAscii(String cadena)
    {
        int Ascii, potencia, valorBite;
        
        Ascii = 0;
        valorBite = 0;
        
        for (int i = 0; i < cadena.length(); i++) 
        {
            valorBite = Integer.parseInt(String.valueOf(cadena.charAt(i)));
            
            if (valorBite == 1) 
            {
                potencia = (int) Math.pow(2, i);
                Ascii += potencia;
            }
        }
        
        return Ascii;
    }
}
