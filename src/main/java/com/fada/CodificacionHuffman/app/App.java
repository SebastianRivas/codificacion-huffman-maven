package com.fada.CodificacionHuffman.app;

import com.fada.CodificacionHuffman.app.gui.*;

public class App {
    private static Principal objGUIPrincipal;

    public static void main(String[] args) {
        objGUIPrincipal = new Principal();
        objGUIPrincipal.runGUI();

        System.out.println("Run App!");
    }
}
