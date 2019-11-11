/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_cv_di;

import java.awt.*;
import javax.swing.*;
import paneles.PestaniaDos;
import paneles.PestaniaUno;

/**
 *
 * @author lopez
 */
public class Ventana extends JFrame{
    
    Container container;
    // panel personalizado
    PestaniaUno pestaniaUno;
    PestaniaDos pestaniaDos;
    JTabbedPane panelPestanias;
    
    
    public void initGUI(){

        instancias();
        configurarContainer();
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Agregar",pestaniaUno);
        panelPestanias.addTab("Buscar",pestaniaDos);
    }

    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();
        pestaniaDos = new PestaniaDos();
    }
    
    
    }
    
