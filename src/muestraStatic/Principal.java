package muestraStatic;

public class Principal {
    public static void main(String[] args) {
        Motor motor = new Motor("452584hd25", 4, 2.5, "HEMI");
        Auto auto = new Auto("xtus", "nissan", 245000.00, motor, "rojo");
        //auto.getMotor().setRpm(auto.getMotor().getRpm() + 1000);
        auto.acelerar();
        System.out.println("auto = " + auto);
        //auto.getMotor().setRpm(auto.getMotor().getRpm() + 1000);
        auto.acelerar();
        System.out.println("auto = " + auto);
    }
}
        /*Auto a2 = new Auto("gjiud", "dodge", 385000.00, "azul");
        Auto a3 = new Auto("xtus", "mazda", 455000.00, "gris");

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);

        System.out.println("a1 = " + a1.precioPromocional());
        System.out.println("a2 = " + a2.precioPromocional());
        System.out.println("a3 = " + a3.precioPromocional());

        //a1.anularDescuento(); si una instancia anula el descuento lo anula para todas
        Auto.anularDescuento(); // lo debe hacer la clase
        System.out.println("a1 = " + a1.precioPromocional());
        System.out.println("a2 = " + a2.precioPromocional());
        System.out.println("a3 = " + a3.precioPromocional());
        hacerAlgo();

    public static void hacerAlgo () { //debe ser estatico para accederlo desde main

    }*/
