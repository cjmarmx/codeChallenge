package comportamientoobjetos;

public class CuentaBancaria {
    private String CLABE;
    private String alias;
    private String moneda;
    private String tipo;
    private double saldo;
    /** Constructor */
    public CuentaBancaria() {
    }
    /** Constructor */
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CLABE = generarCLABE();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
        System.out.println("Se creó el objeto " + this);
    }
    /**Constructor */
    public CuentaBancaria(String moneda, String tipo) {
        this("ALIAS.POR.DEFECTO", moneda, tipo);
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias; // falta validar String alias
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public String getCLABE() {
        return CLABE;
    }
    public void mostrarDatos() {
        System.out.println(CLABE + " " + alias + " " + saldo + " " + moneda + " " + tipo);
    }
    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }

    }
    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }

    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("error: el monto debe ser positivo");
        }
    }
    private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }
    public void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente...");
        }
    }
    private String generarCLABE() {
        String CLABE = "";
        for (int i = 0; i < 18; i++) {
            CLABE += String.valueOf((int) (Math.random() * 10));
        }
        return CLABE;
    }
}