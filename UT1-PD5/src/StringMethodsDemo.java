public class StringMethodsDemo {
    public static void main(String[] args) {
    String t1 = "Hola Mundo";
    System.out.println(t1.substring(5));
    System.out.println(t1.substring(0, 4));

        String t2 = "uno,dos,tres,cuatro";
        String[] t2Split = t2.split(",");
        for(String p : t2Split) System.out.println(p);

        System.out.println(" ");

        String[] t2Split2 = t2.split(",", 2);
        for(String p : t2Split2) System.out.println(p);

        String t3 = "Hola";
        CharSequence t3subSequence = t3.subSequence(0, 1);
        System.out.println(t3subSequence);

        String t4 = "   Buenas    ";
        System.out.println(t4.trim());

        String t5 = "HoLA";
        System.out.println(t5.toLowerCase());
        System.out.println(t5.toUpperCase());

        String t6 = "Hola Mundo";
        System.out.println(t6.indexOf(0));
        System.out.println(t6.indexOf("M"));
        System.out.println(t6.indexOf("o"));
        System.out.println(t6.indexOf("o", 2));

        System.out.println(" ");

        String t7 = "programacion";
        System.out.println(t7.lastIndexOf(0));
        System.out.println(t7.lastIndexOf("o"));
        System.out.println(t7.lastIndexOf("r", 5));

        System.out.println(" ");

        String t8 = "Hola, me llamo Facundo";
        System.out.println(t8.contains("Facu"));
        System.out.println(t8.contains("Juan"));

        String t9 = "Tres Tristes Tigres";
        System.out.println(t9.replaceAll("T", "P"));
        System.out.println(t9.replaceAll("Tr", "H"));

        String t10 = "Tres Tristes Tigres";
        System.out.println(t10.replace("T", "P"));
        System.out.println(t10.replace("Tr", "G"));
    }
}
