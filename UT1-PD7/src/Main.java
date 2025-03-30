//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // (1)
        /*
        String s = "1";
        while (s != "1000") {
        s += "0";
        }

        La razón por la que esto representa un bucle infinito es que el comparador = revisa si es el objeto está en el mismo espacio de memoria.
        La forma correcta de hacerlo es usar el método equals de la clase String.
         */

        // (2)
        /*
        1.
        String s1 = "Hola";
        String s2 = "Hola";
        if ( s1 == s2 ) {
        System.out.println( "True" );
        } else {
        System.out.println( "False" );
        }

        2.
        String s1 = new String("Hola");
        String s2 = "Hola";
        if ( s1 == s2 ) {
        System.out.println( "True" );
        } else {
        System.out.println( "False" );
        }

        En ambos casos sería false
         */

        String s = "1";
        while (!s.equals("1000")) {
            s += "0";
        }
        System.out.println(s);

    }
}