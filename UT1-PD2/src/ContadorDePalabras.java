import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContadorDePalabras extends JFrame {
    private JLabel label;

    public String contadorDePalabras(String arg) {
        boolean isPalabra = false;
        int contador = 0;
        for (int i = 0; i < arg.length(); i++) {
            if (Character.isLetter(arg.charAt(i))){
                isPalabra = true;
            }
            if (arg.charAt(i) == ' ' || i == arg.length()-1)
            {
                if (isPalabra){
                    contador++;
                }
                isPalabra = false;
            }
        }
        return "Cantidad de palabras : " + contador;
    }

    public String contadorDeVocales(String arg) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < arg.length(); i++) {
            if (Character.isLetter(arg.charAt(i))) {
                if (vocales.contains(arg.charAt(i) + "")) {
                    contador++;
                }
            }
        }
        return "Cantidad de Vocales : " + contador;
    }

    public String contadorDeConsonantes (String arg){
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < arg.length(); i++) {
            if (Character.isLetter(arg.charAt(i))) {
                if (!(vocales.contains(arg.charAt(i) + ""))) {
                    contador++;
                }
            }
        }
        return "Cantidad de Consonantes : " + contador;
    }

    public ContadorDePalabras(){

        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        int width = 400;
        JTextField campo = new JTextField();
        campo.setBounds((width - 300) / 2, 100, 200, 30);
        add(campo);

        JButton boton = new JButton("OK");
        boton.setBounds((width + 100) / 2, 100, 100, 30);
        add(boton);

        label = new JLabel("", SwingConstants.CENTER);
        label.setBounds((width - 300) / 2, 200, 300, 50);

        JCheckBox checkBox = new JCheckBox("Opcion 1");
        checkBox.setBounds((width - 300) / 2, 300, 300, 50);
        add(checkBox);
        checkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opcion 1");
            }
        });
        JCheckBox checkBox2 = new JCheckBox("Opcion 2");
        checkBox2.setBounds((width - 300) / 2, 400, 300, 50);
        add(checkBox2);
        checkBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opcion 2");
            }
        });
        JCheckBox checkBox3 = new JCheckBox("Opcion 3");
        checkBox3.setBounds((width - 300) / 2, 500, 300, 50);
        add(checkBox3);
        checkBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opcion 3");
            }
        });

        boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String palabras = campo.getText();
                String resultado = "";
                if (checkBox.isSelected()) {
                    resultado += contadorDePalabras(palabras) +" ";
                }

                if (checkBox2.isSelected()) {
                    resultado += contadorDeVocales(palabras) +" ";

                } if (checkBox3.isSelected()) {
                    resultado += contadorDeConsonantes(palabras) +" ";
                }
                label.setText(resultado);
                add(label);
                revalidate();
                repaint();
            }
        });

    }
    public static void main(String[] args) {
        ContadorDePalabras ventana = new ContadorDePalabras();
        ventana.setVisible(true);
    }
}