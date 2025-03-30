public class ContadorDePalabras {

    public int[] cuentaPalabras(String arg) {
        int cuentaVocales = 0;
        int cuentaConsonantes = 0;
        int contador = 0;
        boolean isPalabra = false;
        for (int i = 0; i < arg.length(); i++)
        {   char letra = arg.charAt(i);
            if (Character.isLetter(letra)){
                isPalabra = true;
                if (Vocales.IsVocal(letra)){
                    cuentaVocales++;
                }
                else{
                    cuentaConsonantes++;
                }
            }
            if (arg.charAt(i) == ' ' || i == arg.length()-1)
            {
                if (isPalabra){
                    contador++;
                }
                isPalabra = false;
            }

        }
        return new int[]{cuentaVocales, cuentaConsonantes, contador};
    }

}
