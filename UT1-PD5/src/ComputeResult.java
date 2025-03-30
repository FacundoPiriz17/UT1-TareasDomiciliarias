public class ComputeResult {
    public static void main(String[] args) {
        String original = "este es el curso de Programación 2";
        StringBuilder result = new StringBuilder("hola");
        int index = original.indexOf('a');
        /*1*/ result.setCharAt(0, original.charAt(0)); // Reemplaza el carácter en la posición 0 del StringBuilder result por el carácter en la posición 0 del String original que corresponde con el carácter e.
        // El valor de result se convertiría en eola
        /*2*/ result.setCharAt(1, original.charAt(original.length()-1)); // Reemplaza el carácter en la posición 1 del StringBuilder result por el carácter en la última posición del String original que corresponde con el carácter 2.
        // El valor de result se convertiría en e2la
        /*3*/ result.insert(1, original.charAt(4)); // Inserta el carácter en la posición 4 del String original en la posición 1 del StringBuilder result. El carácter corresponde a un espacio.
        // El valor de result se convertiría en e 2la
        /*4*/ result.append(original.substring(1,4)); // Añade al final del StringBuilder result el String que se forma a partir de la posición 2 hasta la 4 del String ordinal. El String corresponde a "ste"
        // El valor de result se convertiría en e 2laste
        /*5*/ result.insert(3, (original.substring(index, index+2) + " ")); // Inserta el String creado a partir de la posición 25 a 27 del String ordinal. El String corresponde a "am"
        // El valor de result se convertiría en e 2am laste
    }

}
