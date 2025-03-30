//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        // Existe la referencia al vector students, y la referencia dentro del vector de studentName (Students[0]).
        // Ningún objeto es candidato a ser eliminado por el garbage collections ya que studentName sigue teniendo una referencia activa dentro del vector.

        // 2) Se puede llamar al garbage colector con la siguiente sentencia System.gc(); o cuando ya no existen referencias activas a un objeto.
        // Ejemplo: String nombre = "Facundo";
        //          nombre = null;
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 7;
        numberHolder.aFloat = 3.14f;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);

    }
}