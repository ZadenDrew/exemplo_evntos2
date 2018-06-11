package exemplo_eventos_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author abrandarizdominguez
 */
// Al querer usar eventos, se implementa ActionListener en la clase + imports.
public class ExemploClaseAnonima {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bAmarillo, bRojo;

    // Constructor:
    public ExemploClaseAnonima() {
        // Se instancian los objetos:
        marco = new JFrame("Ventana eventos");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bAmarillo = new JButton("Amarillo");
        bRojo = new JButton("Rojo");
        // Características de los objetos:
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bAmarillo);
        panel.add(bRojo);
        marco.add(panel);
        // Se añade a los botones el ActionListener:
        bAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.BLUE);
            }
        });
        bAmarillo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.YELLOW);
            }
        });
        bRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.RED);
            }
        });
        // Se hace visible la ventana:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}
