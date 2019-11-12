package paneles;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PestaniaUno extends JPanel implements ChangeListener {
    private Container contenedor;

    JCheckBox cNormal;
    JRadioButton rNormal, rUno, rDos, rTres;
    ButtonGroup grupoRadios;
    JLabel titulo;

    public PestaniaUno() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        cNormal.addChangeListener(this);
        rUno.addChangeListener(this);
        rDos.addChangeListener(this);
        rTres.addChangeListener(this);
    }

    private void configurarPanel() {
        contenedor.add(titulo, BorderLayout.NORTH);
        contenedor.add(pCardLayout(), BorderLayout.CENTER);
    }

    private void instancias() {
        cNormal = new JCheckBox("Activado", false);
        rNormal = new JRadioButton("opcion1", false);
        rUno = new JRadioButton("opcion1", false);
        rDos = new JRadioButton("opcion2", false);
        rTres = new JRadioButton("opcion3", true);
        grupoRadios = new ButtonGroup();
        grupoRadios.add(rUno);
        grupoRadios.add(rDos);
        grupoRadios.add(rTres);
        titulo = new JLabel("POR FAVOR, RELLENA LOS DATOS DE TU CURRICULUM"); 

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        if (e.getSource() == rUno) {

        } else if (e.getSource() == cNormal) {
            if (cNormal.isSelected()) {
                cNormal.setText("Activado");
            } else {
                cNormal.setText("Desactivado");
            }
        }
    }
}