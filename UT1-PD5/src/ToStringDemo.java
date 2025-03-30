public class ToStringDemo {


    // Ejercicio (5)
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }
    /*
   (1)
    3 digits before decimal point.
    2 digits after decimal point.

    (2)
    El método indexof se encarga de buscar el punto decimal y cuenta cuantos digitos había antes del punto decimal
     */
}
