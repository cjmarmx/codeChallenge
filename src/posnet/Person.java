package posnet;

public class Person {
    private String CURP;
    private String name;
    private String surname;
    private String phoneNunber;
    private String mail;

    public Person(String CURP, String name, String surname, String phoneNunber, String mail) {
        this.CURP = CURP;
        this.name = name;
        this.surname = surname;
        this.phoneNunber = phoneNunber;
        this.mail = mail;
    }
}
