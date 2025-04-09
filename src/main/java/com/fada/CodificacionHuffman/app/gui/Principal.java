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

package com.fada.CodificacionHuffman.app.gui;

import com.fada.CodificacionHuffman.app.logica.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class Principal extends javax.swing.JFrame 
{
    Eventos objEventos;
    String rutaArchivo;
    
    public Principal() 
    {
        initComponents();
    }
    
    private void initComponents() {

        jPPanelPrincipal = new javax.swing.JPanel();
        jLArchivoSeleccionado = new javax.swing.JLabel();
        jTFRutaArchivo = new javax.swing.JTextField();
        jBSeleccionarArchivo = new javax.swing.JButton();
        jBCodificarTexto = new javax.swing.JButton();
        jBAcercade = new javax.swing.JButton();
        objEventos = new Eventos();
        rutaArchivo = null;

        jBSeleccionarArchivo.addMouseListener(objEventos);
        jBCodificarTexto.addMouseListener(objEventos);
        jBAcercade.addMouseListener(objEventos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIFICACION HUFFMAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Purisa", 1, 14))); // NOI18N

        jLArchivoSeleccionado.setText("Archivo Seleccionado");

        jBSeleccionarArchivo.setText("Seleccionar Archivo");

        jBCodificarTexto.setText("Codificar Texto");

        javax.swing.GroupLayout jPPanelPrincipalLayout = new javax.swing.GroupLayout(jPPanelPrincipal);
        jPPanelPrincipal.setLayout(jPPanelPrincipalLayout);
        jPPanelPrincipalLayout.setHorizontalGroup(
            jPPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLArchivoSeleccionado)
                    .addGroup(jPPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jTFRutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSeleccionarArchivo))
                    .addComponent(jBCodificarTexto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPanelPrincipalLayout.setVerticalGroup(
            jPPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLArchivoSeleccionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSeleccionarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCodificarTexto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAcercade.setText("Acerca de...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAcercade)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAcercade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    public void runGUI() 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Principal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jBAcercade;
    private javax.swing.JButton jBCodificarTexto;
    private javax.swing.JButton jBSeleccionarArchivo;
    private javax.swing.JLabel jLArchivoSeleccionado;
    private javax.swing.JPanel jPPanelPrincipal;
    private javax.swing.JTextField jTFRutaArchivo;

    private class Eventos implements MouseListener, ActionListener
    {
        int seleccion;
        JFileChooser jFCSelector;
        FileNameExtensionFilter filtro;
        CodificacionHuffman objCodificacionHuffman;
        
        public void iniciarCodificacion()
        {
            objCodificacionHuffman.cifrarHuffman();
            objCodificacionHuffman.generarCodigoHuffman();
            
            objCodificacionHuffman.getObjArchivo().escribirInforme(objCodificacionHuffman.getObjArbol(), objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
            objCodificacionHuffman.getObjArchivo().escribirArchivoHuffman(objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
            objCodificacionHuffman.getObjArchivo().escribirArchivoAscii();
        }
        
        public void mouseClicked(MouseEvent e) 
        {
            if (e.getSource() == jBSeleccionarArchivo) 
            {
                filtro = new FileNameExtensionFilter(".txt", "txt");
                
                jFCSelector = new JFileChooser(new File(System.getProperty("user.home")));
                jFCSelector.setFileFilter(filtro);
                
                seleccion = jFCSelector.showOpenDialog(null);
                
                switch (seleccion)
                {
                    case JFileChooser.APPROVE_OPTION: 
                    {
                        rutaArchivo = jFCSelector.getSelectedFile().getAbsolutePath();
                        jTFRutaArchivo.setText(rutaArchivo);
                        
                        JOptionPane.showMessageDialog(null, "El archivo " + jFCSelector.getSelectedFile().getName() + " fue cargado con exito");
                    }; break;
                        
                    case JFileChooser.CANCEL_OPTION: 
                    {
                        JOptionPane.showMessageDialog(null, "No se cargo ningun Archivo");
                    }; break;
                        
                    case JFileChooser.ERROR_OPTION: 
                    {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error intentado cargar el archivo " + jFCSelector.getSelectedFile().getName());
                    }; break;
                }
            }
            
            if (e.getSource() == jBCodificarTexto) 
            {
                if (rutaArchivo == null)
                {
                    JOptionPane.showMessageDialog(null, "!!!ERROR¡¡¡\nNo se ha cargado ningun archivo");
                }
                
                else 
                {
                    try 
                    {
                        objCodificacionHuffman = new CodificacionHuffman(rutaArchivo);
                        iniciarCodificacion();
                        
                        JOptionPane.showMessageDialog(null, "Codificacion Terninada con exito");
                    }
                    
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error\n" + ex.getMessage());
                    }
                }
            }
            
            if (e.getSource() == jBAcercade) 
            {
                JOptionPane.showMessageDialog(null, "Codificacion Huffman");
            }
        }
        
        public void mousePressed(MouseEvent e) {}
        
        public void mouseReleased(MouseEvent e) {}
        
        public void mouseEntered(MouseEvent e) {}
        
        public void mouseExited(MouseEvent e) {}
        
        public void actionPerformed(ActionEvent e) {}
    }
}