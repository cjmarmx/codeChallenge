package contadortickets;

public class Ticket {
    private static int contador = 1000;
    private int numero;
    private String fechaCompra;
    private String CURPPersona;

    public Ticket(String fechaCompra, String CURPPersona) {
        contador++;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.CURPPersona = CURPPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", CURPPersona='" + CURPPersona + '\'' + '}';
    }
}
