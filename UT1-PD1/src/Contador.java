public class Contador {
    private int max_cont = 50;
    public int contador = 1;
    public int incremento = 1;

    public void mostrarContadorWhile() {
        while (contador <= max_cont) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void mostrarContadorDoWhile() {
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= max_cont);
    }

    public void mostrarContadorFor() {
        for (contador = 1; contador <= max_cont; contador += incremento) {
            System.out.println(contador);
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.mostrarContadorWhile();
        System.out.println(" ");
        contador.mostrarContadorDoWhile();
        System.out.println(" ");
        contador.mostrarContadorFor();
    }
}
