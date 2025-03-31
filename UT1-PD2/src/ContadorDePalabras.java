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

        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        int width = 400;
        JTextField ventana = new JTextField();
        ventana.setBounds((width - 300) / 2, 75, 200, 30);
        add(ventana);

        JButton boton = new JButton("OK");
        boton.setBounds((width + 100) / 2, 75, 100, 30);
        add(boton);

        label = new JLabel("", SwingConstants.CENTER);
        label.setBounds((width - 300) / 2, 100, 300, 50);

        JCheckBox checkBox1 = new JCheckBox("Opción 1");
        checkBox1.setBounds((width - 300) / 2, 150, 300, 50);
        add(checkBox1);
        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Elegiste la Opcion 1");
            }
        });
        JCheckBox checkBox2 = new JCheckBox("Opción 2");
        checkBox2.setBounds((width - 300) / 2, 200, 300, 50);
        add(checkBox2);
        checkBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Elegiste la Opcion 2");
            }
        });
        JCheckBox checkBox3 = new JCheckBox("Opción 3");
        checkBox3.setBounds((width - 300) / 2, 250, 300, 50);
        add(checkBox3);
        checkBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Elegiste la Opcion 3");
            }
        });

        boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String palabras = ventana.getText();
                String resultado = "";
                if (checkBox1.isSelected()) {
                    resultado += contadorDePalabras(palabras) +", ";
                }

                if (checkBox2.isSelected()) {
                    resultado += contadorDeVocales(palabras) +", ";

                } if (checkBox3.isSelected()) {
                    resultado += contadorDeConsonantes(palabras) +", ";
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
