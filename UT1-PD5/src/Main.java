//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio (1) 1)
        for (int i = 0; i < Dias.values().length; i++) {
            System.out.println(Dias.values()[i].name());
        }

        //Ejercicio (1) 2)
        ContadorDePalabras c = new ContadorDePalabras();
        int[] list = c.cuentaPalabras("Hola Mundo");
        String vocales = list[0] + "";
        String consonantes = list[1] +"";
        String palabras = list[2] +"";
        System.out.println("Vocales: " + vocales + ", Consonantes: " + consonantes +  ", Palabras: " + palabras);

        // Ejercicio (3)
        StringDemo demo = new StringDemo();
        String palindrome = "Dot saw I was Tod";
        String palindrome1 = "Dot, saw, I, was, Tod,";
        String palindrome2 = "Sé verlaS al revéS.";
        System.out.println(demo.palindromeConverter(palindrome));
        System.out.println(demo.palindromeConverter(palindrome1));
        System.out.println(demo.palindromeConverter(palindrome2));

        // Ejercicio (4)
        String[] valores = {"13.4","66.1"};
        ValueOfDemo.main(valores);
        // a + b = 79.5
        // a - b = -52.699997
        // a * b = 885.7399
        // a / b = 0.20272315
        // a % b = 13.4

    }
}