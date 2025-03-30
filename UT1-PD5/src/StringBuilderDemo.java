public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder("Hola");
        StringBuilder s3 = new StringBuilder(100);
        System.out.println(s1); // Printea nada
        System.out.println(s2); // Printea "Hola"
        System.out.println(s3); // Printea nada, pero tiene una capacidad de 100
        StringBuilder s4 = new StringBuilder("Hola Mundo");
        s4.setLength(5);
        System.out.println(s4); // Tendría que imprimir "Hola "
        StringBuilder s5 = new StringBuilder();
        System.out.println(s5.capacity()); // Capacidad inicial (por defecto 16)
        s5.ensureCapacity(100);
        System.out.println(s5.capacity()); // Capacidad nueva (100)
        StringBuilder s6 = new StringBuilder("Todo todo correcto");
        s6.insert(5, "bien, ");
        System.out.println(s6);
        StringBuilder s7 = new StringBuilder("Todo bien, todo correcto");
        s7.delete(15,s7.length());
        System.out.println(s7);
        StringBuilder s8 =  new StringBuilder("Facu");
        s8.deleteCharAt(3);
        System.out.println(s8);
        StringBuilder s9 = new StringBuilder("Facu");
        s9.reverse();
        System.out.println(s9);
    }
}
