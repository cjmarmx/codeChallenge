package muestraStatic;
public class Auto {
    private String patente; // variable de instancia
    private String marca; // variable de instancia
    private double precio; // variable de instancia
    private String color; // variable de instancia
    private Motor motor;
    private static double descuento; // con static se convierte un variale de clase
    public Auto(String patente, String marca, double precio, Motor motor, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
        this.color = color; // this solo accede a variables instancia
        Auto.descuento = 10.0; // se tiene que usar el nombre de la clase
    }
    public double precioPromocional() {
        return this.precio - this.precio * Auto.descuento / 100;
    }
    public static void anularDescuento(){
        Auto.descuento = 0;
        //this.precio = 0; desde un metodo estatico no de puede acceder a variables de instancia
    }
    public void acelerar(){
        //this.motor.setRpm(this.motor.getRpm() + 1000);
        this.motor.acelerar();
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", motor=" + motor +
                ", color='" + color + '\'' +
                '}';
    }
}
