package muestraStatic;
public class Motor {
    private String numero;
    private int cilindros;
    private double litros;
    private String tipo;
    private int rpm;

    public Motor(String numero, int cilindros, double litros, String tipo) {
        this.numero = numero;
        this.cilindros = cilindros;
        this.litros = litros;
        this.tipo = tipo;
        this.rpm = rpm;
    }
    public void setLitros(double litros) {
        if (litros > 0 ) {
            this.litros = litros;
        }
    }

    public void acelerar(){
        this.rpm += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindros=" + cilindros +
                ", litros=" + litros +
                ", tipo='" + tipo + '\'' +
                ", rpm=" + rpm +
                '}';
    }
}
