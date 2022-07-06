package contadortickets;

public class Contador {
    public static void main(String[] args) {
        Ticket t1 = new Ticket ("10/21/2022", "MIMJ791002HGRRRN17");
        Ticket t2 = new Ticket ("11/15/2022","MIUR451222KDPM12");
        Ticket t3 = new Ticket ("10/15/2022","SBYD601115HGFJ15");
        Ticket t4 = new Ticket ("10/24/2022","HFYS800603JFUFFN86");

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
    }
}
