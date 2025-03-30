import java.io.*;
import java.util.Map;

public class LectorDeArchivos {
    public void leerArchivo(String nombreCompletoArchivo) {
        FileReader fr;
        try {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                System.out.println(lineaActual);
                lineaActual = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }

    public void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter(nombreCompletoArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++) {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public void leerYEscribirArchivoT9(String nombreCompletoArchivo, Map<Character, String> mapaT9) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreCompletoArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter("SalidaEJ3.txt"))) {
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                StringBuilder result = new StringBuilder();
                for (char c : lineaActual.toCharArray()) {
                    if (mapaT9.containsKey(c)) {
                        result.append(mapaT9.get(c));
                    }
                }
                lineaActual = br.readLine();
                bw.write(result.toString());
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Archivo leído y transformado correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura con el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public void leerYEscribirArchivoT9aTexto(String nombreCompletoArchivo, Map<String, Character> mapaT9) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreCompletoArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter("SalidaEJ3PB.txt"))) {

            String lineaActual = br.readLine();
            String[] listaCaracteres = lineaActual.split(",");
            while (lineaActual != null) {
                StringBuilder result = new StringBuilder();
                for (String c : listaCaracteres) {
                    result.append(mapaT9.getOrDefault(c, '-'));
                }
                lineaActual = br.readLine();
                bw.write(result.reverse().toString());
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Archivo leído y transformado correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura con el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }
}

