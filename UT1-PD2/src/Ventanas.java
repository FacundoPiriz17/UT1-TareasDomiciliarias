import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventanas extends JFrame {
    private JTextField nombreIngresado;
    private JButton boton;

    public Ventanas() {
        setTitle("Ventana de prueba");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Ingrese su nombre");
        nombreIngresado = new JTextField(15);
        boton = new JButton("Saludar a");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreIngresado.getText();
                JOptionPane.showMessageDialog(null, "¡Hola " + nombre + "!");
            }
        });
        add(label);
        add(nombreIngresado);
        add(boton);
    }

    public static void main(String[] args) {
        Ventanas ventana = new Ventanas();
        ventana.setVisible(true);
    }

}
