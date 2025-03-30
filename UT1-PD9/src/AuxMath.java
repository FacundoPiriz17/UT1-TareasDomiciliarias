public class AuxMath {
    public static int Factorial(int n) {
        int resultado = 1;
        if(n == 0)
            return resultado;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static boolean IsPrime(int n) {
        boolean prime = true;
        long i = 3;
        while(i <= Math.sqrt(n)) {
            if(n % i == 0) {
                prime = false;
                break;
            }
            i +=2;
        }
        if((n%2 != 0 && prime && n>2) || n== 2)
            return true;
        else return false;
    }
}
