import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ContadorDePalabras {

    public String[] obtenerLineas(String archivos) {
        FileReader fr = null;
        ArrayList<String> lista = new ArrayList<>();
        int lineasLeidas = 0;
        try {
            fr = new FileReader(archivos);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                lista.add(lineaActual);
                lineaActual = br.readLine();
                lineasLeidas++;
            }
            return lista.toArray(new String[lista.size()]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
