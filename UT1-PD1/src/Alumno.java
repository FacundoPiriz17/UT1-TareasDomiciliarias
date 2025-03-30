public class Alumno {
    private String nombre;
    // El error se da por culpa de la variable nombre la cual se inicializa en null, por lo tanto getNombreAdmiracion no puede concatenar el "!". Causando así un NullPointerException.
    public Alumno () {
        nombre = "Unknown";
    }
    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }
    public static void main (String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(Main.getValor());
        System.out.println(Main.getPrimerCaracter("Hola"));
        System.out.println(Main.paraAString(2));
    }
}

