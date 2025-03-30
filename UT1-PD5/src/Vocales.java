public enum Vocales {
    a,
    e,
    i,
    o,
    u,
    A,
    E,
    I,
    O,
    U;

    public static boolean IsVocal(char letra) {
        for (Vocales vocal : Vocales.values()) {
            if (vocal.name().charAt(0) == letra) {
                return true;
            }
        }
        return false;
    }
}
