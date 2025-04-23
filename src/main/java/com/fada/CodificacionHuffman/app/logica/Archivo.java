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

import java.io.*;
import java.util.*;

public class Archivo {
    private File archivo;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private ArrayList<Character> listaCaracteres;
    private ArrayList<Integer> conteoCaracter;
    private String diccionario = "abcdefghijklmnopqrstuvwxyz0123456789. ,";
    private ProcesarStrings objProcesarStrings;

    Archivo(String path) {
        archivo = new File(path);
        initArray();
    }

    // Metodos Set's y Get's
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public ArrayList<Character> getListaCaracteres() {
        return listaCaracteres;
    }

    public void setListaCaracteres(ArrayList<Character> listaCaracteres) {
        this.listaCaracteres = listaCaracteres;
    }

    public ArrayList<Integer> getConteoCaracter() {
        return conteoCaracter;
    }

    public void setConteoCaracter(ArrayList<Integer> conteo) {
        this.conteoCaracter = conteo;
    }

    public void setDiccionario(String diccionario) {
        this.diccionario = diccionario;
    }

    public String getDiccionario() {
        return diccionario;
    }

    public void setObjProcesarStrings(ProcesarStrings objProcesarStrings) {
        this.objProcesarStrings = objProcesarStrings;
    }

    public ProcesarStrings getObjProcesarStrings() {
        return objProcesarStrings;
    }

    public void initArray() {
        Character caracter;

        listaCaracteres = new ArrayList<Character>();
        conteoCaracter = new ArrayList<Integer>();

        for (int i = 0; i < getDiccionario().length(); i++) {
            caracter = getDiccionario().charAt(i);

            getListaCaracteres().add(caracter);
            getConteoCaracter().add(0);
        }
    }

    public void leerArchivo() {
        Character caracter;
        int asciiCaracter, contadorCaracter;
        String linea;

        try {
            setFileReader(new FileReader(getArchivo()));
            setBufferedReader(new BufferedReader(getFileReader()));

            while ((linea = getBufferedReader().readLine()) != null) {
                for (int j = 0; j < linea.length(); j++) {
                    caracter = linea.charAt(j);

                    asciiCaracter = (int) caracter;
                    contadorCaracter = 0;

                    switch (asciiCaracter) {
                        case 65:
                        case 97: {
                            contadorCaracter = getConteoCaracter().get(0);
                            contadorCaracter++;

                            getConteoCaracter().set(0, contadorCaracter);
                        }
                            ;
                            break; // 0 ~ A

                        case 66:
                        case 98: {
                            contadorCaracter = getConteoCaracter().get(1);
                            contadorCaracter++;

                            getConteoCaracter().set(1, contadorCaracter);
                        }
                            ;
                            break; // 1 ~ B

                        case 67:
                        case 99: {
                            contadorCaracter = getConteoCaracter().get(2);
                            contadorCaracter++;

                            getConteoCaracter().set(2, contadorCaracter);
                        }
                            ;
                            break; // 2 ~ C

                        case 68:
                        case 100: {
                            contadorCaracter = getConteoCaracter().get(3);
                            contadorCaracter++;

                            getConteoCaracter().set(3, contadorCaracter);
                        }
                            ;
                            break; // 3 ~ D

                        case 69:
                        case 101: {
                            contadorCaracter = getConteoCaracter().get(4);
                            contadorCaracter++;

                            getConteoCaracter().set(4, contadorCaracter);
                        }
                            ;
                            break; // 4 ~ E

                        case 70:
                        case 102: {
                            contadorCaracter = getConteoCaracter().get(5);
                            contadorCaracter++;

                            getConteoCaracter().set(5, contadorCaracter);
                        }
                            ;
                            break; // 5 ~ F

                        case 71:
                        case 103: {
                            contadorCaracter = getConteoCaracter().get(6);
                            contadorCaracter++;

                            getConteoCaracter().set(6, contadorCaracter);
                        }
                            ;
                            break; // 6 ~ G

                        case 72:
                        case 104: {
                            contadorCaracter = getConteoCaracter().get(7);
                            contadorCaracter++;

                            getConteoCaracter().set(7, contadorCaracter);
                        }
                            ;
                            break; // 7 ~ H

                        case 73:
                        case 105: {
                            contadorCaracter = getConteoCaracter().get(8);
                            contadorCaracter++;

                            getConteoCaracter().set(8, contadorCaracter);
                        }
                            ;
                            break; // 8 ~ I

                        case 74:
                        case 106: {
                            contadorCaracter = getConteoCaracter().get(9);
                            contadorCaracter++;

                            getConteoCaracter().set(9, contadorCaracter);
                        }
                            ;
                            break; // 9 ~ J

                        case 75:
                        case 107: {
                            contadorCaracter = getConteoCaracter().get(10);
                            contadorCaracter++;

                            getConteoCaracter().set(10, contadorCaracter);
                        }
                            ;
                            break; // 10 ~ K

                        case 76:
                        case 108: {
                            contadorCaracter = getConteoCaracter().get(11);
                            contadorCaracter++;

                            getConteoCaracter().set(11, contadorCaracter);
                        }
                            ;
                            break; // 11 ~ L

                        case 77:
                        case 109: {
                            contadorCaracter = getConteoCaracter().get(12);
                            contadorCaracter++;

                            getConteoCaracter().set(12, contadorCaracter);
                        }
                            ;
                            break; // 12 ~ M

                        case 78:
                        case 110: {
                            contadorCaracter = getConteoCaracter().get(13);
                            contadorCaracter++;

                            getConteoCaracter().set(13, contadorCaracter);
                        }
                            ;
                            break; // 13 ~ N

                        case 79:
                        case 111: {
                            contadorCaracter = getConteoCaracter().get(14);
                            contadorCaracter++;

                            getConteoCaracter().set(14, contadorCaracter);
                        }
                            ;
                            break; // 14 ~ O

                        case 80:
                        case 112: {
                            contadorCaracter = getConteoCaracter().get(15);
                            contadorCaracter++;

                            getConteoCaracter().set(15, contadorCaracter);
                        }
                            ;
                            break; // 15 ~ P

                        case 81:
                        case 113: {
                            contadorCaracter = getConteoCaracter().get(16);
                            contadorCaracter++;

                            getConteoCaracter().set(16, contadorCaracter);
                        }
                            ;
                            break; // 16 ~ Q

                        case 82:
                        case 114: {
                            contadorCaracter = getConteoCaracter().get(17);
                            contadorCaracter++;

                            getConteoCaracter().set(17, contadorCaracter);
                        }
                            ;
                            break; // 17 ~ R

                        case 83:
                        case 115: {
                            contadorCaracter = getConteoCaracter().get(18);
                            contadorCaracter++;

                            getConteoCaracter().set(18, contadorCaracter);
                        }
                            ;
                            break; // 18 ~ S

                        case 84:
                        case 116: {
                            contadorCaracter = getConteoCaracter().get(19);
                            contadorCaracter++;

                            getConteoCaracter().set(19, contadorCaracter);
                        }
                            ;
                            break; // 19 ~ T

                        case 85:
                        case 117: {
                            contadorCaracter = getConteoCaracter().get(20);
                            contadorCaracter++;

                            getConteoCaracter().set(20, contadorCaracter);
                        }
                            ;
                            break; // 20 ~ U

                        case 86:
                        case 118: {
                            contadorCaracter = getConteoCaracter().get(21);
                            contadorCaracter++;

                            getConteoCaracter().set(21, contadorCaracter);
                        }
                            ;
                            break; // 21 ~ V

                        case 87:
                        case 119: {
                            contadorCaracter = getConteoCaracter().get(22);
                            contadorCaracter++;

                            getConteoCaracter().set(22, contadorCaracter);
                        }
                            ;
                            break; // 22 ~ W

                        case 88:
                        case 120: {
                            contadorCaracter = getConteoCaracter().get(23);
                            contadorCaracter++;

                            getConteoCaracter().set(23, contadorCaracter);
                        }
                            ;
                            break; // 23 ~ X

                        case 89:
                        case 121: {
                            contadorCaracter = getConteoCaracter().get(24);
                            contadorCaracter++;

                            getConteoCaracter().set(24, contadorCaracter);
                        }
                            ;
                            break; // 24 ~ Y

                        case 90:
                        case 122: {
                            contadorCaracter = getConteoCaracter().get(25);
                            contadorCaracter++;

                            getConteoCaracter().set(25, contadorCaracter);
                        }
                            ;
                            break; // 25 ~ Z

                        case 48: {
                            contadorCaracter = getConteoCaracter().get(26);
                            contadorCaracter++;

                            getConteoCaracter().set(26, contadorCaracter);
                        }
                            ;
                            break; // 26 ~ 0

                        case 49: {
                            contadorCaracter = getConteoCaracter().get(27);
                            contadorCaracter++;

                            getConteoCaracter().set(27, contadorCaracter);
                        }
                            ;
                            break; // 27 ~ 1

                        case 50: {
                            contadorCaracter = getConteoCaracter().get(28);
                            contadorCaracter++;

                            getConteoCaracter().set(28, contadorCaracter);
                        }
                            ;
                            break; // 28 ~ 2

                        case 51: {
                            contadorCaracter = getConteoCaracter().get(29);
                            contadorCaracter++;

                            getConteoCaracter().set(29, contadorCaracter);
                        }
                            ;
                            break; // 29 ~ 3

                        case 52: {
                            contadorCaracter = getConteoCaracter().get(30);
                            contadorCaracter++;

                            getConteoCaracter().set(30, contadorCaracter);
                        }
                            ;
                            break; // 30 ~ 4

                        case 53: {
                            contadorCaracter = getConteoCaracter().get(31);
                            contadorCaracter++;

                            getConteoCaracter().set(31, contadorCaracter);
                        }
                            ;
                            break; // 31 ~ 5

                        case 54: {
                            contadorCaracter = getConteoCaracter().get(32);
                            contadorCaracter++;

                            getConteoCaracter().set(32, contadorCaracter);
                        }
                            ;
                            break; // 32 ~ 6

                        case 55: {
                            contadorCaracter = getConteoCaracter().get(33);
                            contadorCaracter++;

                            getConteoCaracter().set(33, contadorCaracter);
                        }
                            ;
                            break; // 33 ~ 7

                        case 56: {
                            contadorCaracter = getConteoCaracter().get(34);
                            contadorCaracter++;

                            getConteoCaracter().set(34, contadorCaracter);
                        }
                            ;
                            break; // 34 ~ 8

                        case 57: {
                            contadorCaracter = getConteoCaracter().get(35);
                            contadorCaracter++;

                            getConteoCaracter().set(35, contadorCaracter);
                        }
                            ;
                            break; // 35 ~ 9

                        case 46: {
                            contadorCaracter = getConteoCaracter().get(36);
                            contadorCaracter++;

                            getConteoCaracter().set(36, contadorCaracter);
                        }
                            ;
                            break; // 36 ~ .

                        case 32: {
                            contadorCaracter = getConteoCaracter().get(37);
                            contadorCaracter++;

                            getConteoCaracter().set(37, contadorCaracter);
                        }
                            ;
                            break; // 37 ~ ' '

                        case 44: {
                            contadorCaracter = getConteoCaracter().get(38);
                            contadorCaracter++;

                            getConteoCaracter().set(38, contadorCaracter);
                        }
                            ;
                            break; // 38 ~ ,
                    }
                }
            }
        }

        catch (FileNotFoundException fnfe) {
            System.err.printf("leerArchivo -> FileNotFoundException: \t %s \n", fnfe.getMessage());
            fnfe.printStackTrace();
        }

        catch (IOException ioe) {
            System.err.printf("leerArchivo -> IOException: \t %s \n", ioe.getMessage());
            ioe.printStackTrace();
        }

        catch (Exception e) {
            System.err.printf("leerArchivo -> Exception: \t %s \n", e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                if (getFileReader() != null) {
                    getFileReader().close();
                }
            }

            catch (Exception e) {
                System.err.printf("leerArchivo -> finally -> Exception: \t %s \n", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void escribirArchivoHuffman(ArrayList<Character> caracteres, ArrayList<String> codigoHuffman) {
        Character caracter;
        int indexCaracter;
        String lineaArchivo, nuevaLinea, rutaArchivoHuffman;

        try {
            rutaArchivoHuffman = "src/main/java/com/fada/CodificacionHuffman/output/text/CodificacionHuffman_"
                    + archivo.getName();

            setFileWriter(new FileWriter(rutaArchivoHuffman));
            setPrintWriter(new PrintWriter(getFileWriter()));

            setFileReader(new FileReader(getArchivo()));
            setBufferedReader(new BufferedReader(getFileReader()));

            while ((lineaArchivo = getBufferedReader().readLine()) != null) {
                nuevaLinea = "";

                for (int i = 0; i < lineaArchivo.length(); i++) {
                    caracter = lineaArchivo.toLowerCase().charAt(i);

                    indexCaracter = caracteres.indexOf(caracter);
                    nuevaLinea += codigoHuffman.get(indexCaracter);
                }

                getPrintWriter().println(nuevaLinea);
            }
        }

        catch (FileNotFoundException fnfe) {
            System.err.printf("escribirArchivoHuffman -> FileNotFoundException: \t %s \n", fnfe.getMessage());
            fnfe.printStackTrace();
        }

        catch (IOException ioe) {
            System.err.printf("escribirArchivoHuffman -> IOException: \t %s \n", ioe.getMessage());
            ioe.printStackTrace();
        }

        catch (Exception e) {
            System.err.printf("escribirArchivoHuffman -> Exception: \t %s \n", e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                if (getFileWriter() != null) {
                    getFileWriter().close();
                }
            }

            catch (Exception e) {
                System.err.printf("escribirArchivoHuffman -> finally -> Exception: \t %s \n", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void escribirArchivoAscii() {
        int indexInicial, indexFinal;
        String lineaArchivo, lineaArchivo8Bits, nuevaLinea, rutaArchivoHuffman, rutaArchivoAscii;

        try {
            rutaArchivoHuffman = "src/main/java/com/fada/CodificacionHuffman/output/text/CodificacionHuffman_"
                    + archivo.getName();
            rutaArchivoAscii = "src/main/java/com/fada/CodificacionHuffman/output/text/ASCII_" + archivo.getName();

            setFileWriter(new FileWriter(rutaArchivoAscii));
            setPrintWriter(new PrintWriter(getFileWriter()));

            setArchivo(new File(rutaArchivoHuffman));
            setFileReader(new FileReader(getArchivo()));
            setBufferedReader(new BufferedReader(getFileReader()));

            objProcesarStrings = new ProcesarStrings();

            while ((lineaArchivo = getBufferedReader().readLine()) != null) {
                indexInicial = 0;
                indexFinal = 0;

                nuevaLinea = "";
                lineaArchivo8Bits = objProcesarStrings.completar8Bits(lineaArchivo);

                while (indexInicial < lineaArchivo.length()) {
                    indexFinal = indexInicial + 8;
                    nuevaLinea = lineaArchivo8Bits.substring(indexInicial, indexFinal);
                    getPrintWriter().append((char) objProcesarStrings.generarAscii(nuevaLinea));
                    indexInicial = indexFinal;
                }
            }
        }

        catch (FileNotFoundException fnfe) {
            System.err.printf("escribirArchivoAscii -> FileNotFoundException: \t  %s \n", fnfe.getMessage());
            fnfe.printStackTrace();
        }

        catch (IOException ioe) {
            System.err.printf("escribirArchivoAscii -> Exception: \t %s \n", ioe.getMessage());
            ioe.printStackTrace();
        }

        catch (Exception e) {
            System.err.printf("escribirArchivoAscii -> Exception: \t %s \n", e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                if (getFileWriter() != null) {
                    getFileWriter().close();
                }
            }

            catch (Exception e) {
                System.err.printf("escribirArchivoAscii -> finally -> Exception: \t %s \n", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void escribirInforme(Arbol root, ArrayList<Character> caracteres, ArrayList<String> codigoHuffman) {
        String rutaInforme;

        root.altura(root.getRoot(), 1);
        root.conteoNodos(root.getRoot());

        try {
            rutaInforme = "src/main/java/com/fada/CodificacionHuffman/output/text/Informe_" + archivo.getName();

            setFileWriter(new FileWriter(rutaInforme));
            setPrintWriter(new PrintWriter(getFileWriter()));

            getPrintWriter().println("Nodos Creados: " + root.getNumeroNodos());
            getPrintWriter().println("Profundidad Maxima del Arbol Generado: " + root.getAltura());
            getPrintWriter().println("Tabla de Codificacion Generada:");
            getPrintWriter().println("\t Simbolo ---------- Codigo");

            for (int i = 0; i < caracteres.size(); i++) {
                getPrintWriter().format("\t %s ---------- %s\n", caracteres.get(i), codigoHuffman.get(i));
            }
        }

        catch (FileNotFoundException fnfe) {
            System.err.printf("escribirInforme -> FileNotFoundException: \t  %s \n", fnfe.getMessage());
            fnfe.printStackTrace();
        }

        catch (IOException ioe) {
            System.err.printf("escribirInforme -> IOException: \t %s \n", ioe.getMessage());
            ioe.printStackTrace();
        }

        catch (Exception e) {
            System.err.printf("escribirInforme -> Exception: \t %s \n", e.getMessage());
            e.printStackTrace();
        }

        finally {
            try {
                if (getFileWriter() != null) {
                    getFileWriter().close();
                }
            }

            catch (Exception e) {
                System.err.printf("escribirInforme -> finally -> Exception: \t %s \n", e.getMessage());
                e.printStackTrace();
            }
        }
    }
}