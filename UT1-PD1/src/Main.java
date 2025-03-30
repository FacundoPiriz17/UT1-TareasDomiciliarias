//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Multisuma.multsuma(1.0, 2.0, 3.0);
    }


    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 0; i <= cadena.length(); i++) { // La variable i tendría que ser inicializada en 1, para evitar un IndexOutOfBoundException
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 }; // La variable idx se inicializa con un valor de 8 y el vector tiene 8 elementos, por lo tanto, los índices van desde el 0 hasta el 7, por lo tanto, tendría que cambiar el valor de idx a 7 para poder evitar un ArrayIndexOutOfBoundsException.
        int idx = 7;
        return vector[idx];
    }
    public static char getPrimerCaracter(String palabra) { // No se inicializaba un string, sino un vector y la posición a la que intentaba acceder estaba vacía.
        return (palabra.charAt(1));
    }
    public static String paraAString(int a) {
        return String.valueOf(a); // Conversión erronea a int
    }
}