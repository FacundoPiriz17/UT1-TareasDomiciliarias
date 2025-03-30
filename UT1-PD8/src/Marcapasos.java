// a)
public class Marcapasos {
    private short presionSanguinea;
    private short frecuenciaCardiaca;
    private short nivelAzucar;

    private long maximaFuerza;
    private float minimoTiempoLatidos;
    private double bateriaRestante;
    private String codigoFabricante;

    public Marcapasos(short presionSanguinea, short frecuenciaCardiaca, short nivelAzucar, long maximaFuerza, float minimoTiempoLatidos, double bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucar = nivelAzucar;
        this.maximaFuerza = maximaFuerza;
        this.minimoTiempoLatidos = minimoTiempoLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }
    // b)
    /*
    presionSanguinea 2 bytes
    frecuenciaCardiaca 2 bytes
    nivelAzucar 2 bytes
    maximaFuerza 8 bytes
    minimoTiempoLatidos 4 bytes
    bateriaRestante 8 bytes
    codigoFabricante 2 bytes por letra, máximo 16 bytes

    Consumo total de memoria:
    28 en el caso más favorable (El string tiene un único carácter)
    42 en el caso menos favorable (El string tiene 8 carácteres)
     */
}
