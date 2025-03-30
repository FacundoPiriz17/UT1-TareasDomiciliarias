public class EJ4 {
    /*
    Condiciones necesarias:
    - Misma longitud.
    - Elementos de tipo int únicamente.
     */

    // Programa de ejemplo
    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        if (vectorA.length != vectorB.length) {
            System.out.println("Error los vectores no se pueden multiplicar");
        }

        for (int i = 0; i < 10; i++) {
            vectorA[i] = i;
        }

        int indice = 0;
        for (int i = 10; i < 20; i++) {
            vectorB[indice] = i;
            indice++;
        }

        int multiplicacion = 0;
        for (int i = 0; i < 10; i++) {
            multiplicacion += vectorA[i] * vectorB[i];
        }

        System.out.println(multiplicacion);
    }
}
