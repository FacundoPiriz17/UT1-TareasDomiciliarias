
public class Principal {
    public static void main(String[] args) {
        ContadorDePalabras contadorPalabras = new ContadorDePalabras();

        String rutaArchivo = args[0];
        int[] prueba1 = contadorPalabras.cuentaPalabras("Hola mundo");
        int[] prueba2 = contadorPalabras.cuentaPalabras("Hola 1111");
        int[] prueba3 = contadorPalabras.cuentaPalabras("Hola 1ab1");
        int pruebaLargo = contadorPalabras.largoPalabra("prueba de largo", 3);
        String[] palabrasArchivo = contadorPalabras.obtenerLineas(rutaArchivo);
        int cantPalabrasArchivo = contadorPalabras.cantPalabras(palabrasArchivo);

        int largo = 3;
        System.out.println("Palabras con mas de " + largo + " caracteres: "  + pruebaLargo);

        System.out.println("V | C | + |");

        for (int j : prueba1) { //(int i = 0; i < prueba1.length; i++)
            System.out.print(j + " | ");
        }

        System.out.println();

        for (int j : prueba2) {
            System.out.print(j + " | ");
        }

        System.out.println();

        for (int j : prueba3) {
            System.out.print(j + " | ");
        }

        System.out.println();

        for (String palabra : palabrasArchivo) {
            System.out.println(palabra + " | ");
        }

        System.out.print("Cantidad de palabras en el archivo: " + cantPalabrasArchivo);
        String rutaArchivo1 = args[1];
        String rutaArchivo2 = args[2];
        String[] palabrasArchivo1 = contadorPalabras.obtenerLineas(rutaArchivo1);
        for (String palabra : palabrasArchivo1) {
            System.out.println(palabra + " | ");
        }
        String[] palabrasArchivo2 = contadorPalabras.obtenerLineas(rutaArchivo2);
        for (String palabra : palabrasArchivo2) {
            System.out.println(palabra + " | ");
        }
        String[] palabrasComunes = contadorPalabras.palabrasComunes(palabrasArchivo1, palabrasArchivo2);
        for (String palabra : palabrasComunes) {
            System.out.println(palabra);
        }
        System.out.println("La cantidad de palabras comunes entre los 2 textos es: " + palabrasComunes.length);


    }
}
