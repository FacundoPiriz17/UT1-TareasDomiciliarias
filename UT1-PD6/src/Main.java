import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main.imprimirTablero(7,7);
        System.out.println(" ");
        System.out.println(" ");
        Main.leerEntradaArchivo("entrada.txt");
//        Main.leerEntradaStdin();
        Main.transformarTextoT9("entradaEJ3.txt");
        Main.transformarT9Texto("entradaEJ3PB.txt");

    }

    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        ContadorDePalabras contador = new ContadorDePalabras();
        String[] contenido = contador.obtenerLineas(rutaArchivo);
        System.out.println("El entero leído es: " + contenido[0] + "");
        System.out.println("El número de punto flotante leído es: " + contenido[1] + "");
        System.out.println("La cadena leída es ´´" + contenido[2] + "´´");
        Float c1 = Float.parseFloat(contenido[0]);
        Float c2 = Float.parseFloat(contenido[1]);
        System.out.println("¡Hola " + contenido[2] + "! La suma de " + contenido[0] + " y " + contenido[1] + " es " + (c1 + c2));
        System.out.println("La división entera de " + contenido[0] + " y " + contenido[1] + " es " + (int)(c2 / c1) + " y su resto es " + (c2 % c1));
    }

    public static void leerEntradaStdin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
        scanner.close();
    }

    // Páginas que use como referencia para usar el diccionario: https://codegym.cc/es/groups/posts/es.653.como-crear-un-diccionario-en-java https://es.stackoverflow.com/questions/286092/diccionarios-en-java
    // Preferí usar Map debido al método containsKey.
    public static void transformarTextoT9(String rutaArchivo) {
        LectorDeArchivos lector = new LectorDeArchivos();
        Map<Character, String> mapaT9 = new HashMap<>();

        String[] mapeo = {
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ"
        };

        for (int i = 0; i < mapeo.length; i++) {
            String letras = mapeo[i];
            char numero = (char) ('2' + i);

            for (int j = 0; j < letras.length(); j++) {
                char letra = letras.charAt(j);
                String repeticion = String.valueOf(numero).repeat(j + 1);

                mapaT9.put(Character.toLowerCase(letra), repeticion);
                mapaT9.put(Character.toUpperCase(letra), repeticion);
            }
        }

        mapaT9.put(' ', "0");
        mapaT9.put('.', "1");

        lector.leerYEscribirArchivoT9(rutaArchivo, mapaT9);
    }

    public static void transformarT9Texto(String rutaArchivo) {
        LectorDeArchivos lector = new LectorDeArchivos();
        Map<String, Character> mapaTexto = new HashMap<>();
        String[] mapeo = {
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ"
        };

        for (int i = 0; i < mapeo.length; i++) {
            String letras = mapeo[i];
            char numero = (char) ('2' + i);

            for (int j = 0; j < letras.length(); j++) {
                char letra = letras.charAt(j);
                String repeticion = String.valueOf(numero).repeat(j + 1);

                mapaTexto.put(repeticion, Character.toLowerCase(letra));
            }
        }

        mapaTexto.put("0",' ');
        mapaTexto.put("1",'.');
        lector.leerYEscribirArchivoT9aTexto(rutaArchivo, mapaTexto);
    }
}