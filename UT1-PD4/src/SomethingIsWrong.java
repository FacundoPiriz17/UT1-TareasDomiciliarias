
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        // El error se da porque la variable myRect no está inicializada, por lo tanto no se pueden acceder a los atributos width y height, tampoco el méotdo area.
    }
}
