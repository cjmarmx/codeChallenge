package comportamientoobjetos;
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria("Miguel Herdez","Pesos","Ahorro");
        cb1.mostrarDatos();
        CuentaBancaria cb2 = new CuentaBancaria("Yenes", "Inversión");
        cb2.mostrarDatos();
        CuentaBancaria cb3 = new CuentaBancaria();
        cb3.mostrarDatos();
        cb2.setAlias("Pedro Copeel");
        cb2.setMoneda("Dólares");
        cb2.setTipo("Ahorro");
        cb2.mostrarDatos();
        cb3.setAlias("Andrés Costco");
        cb3.setMoneda("Euros");
        cb3.setTipo("Inversión");
        cb3.mostrarDatos();
        System.out.println("cb1 saldo " + cb1.getSaldo());
        cb1.depositar(200);
        cb1.mostrarDatos();
        System.out.println("cb1 saldo " + cb1.getSaldo());
        cb1.depositar(-50);
        System.out.println("cb2 saldo " + cb2.getSaldo());
        cb2.extraer(180);
        System.out.println("cb3 saldo" + cb3.getSaldo());
        cb3.extraer(100);
    }
}