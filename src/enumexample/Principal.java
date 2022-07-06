package enumexample;

public class Principal {
    public static void main(String[] args) {
        Empresa e = new Empresa();
        e.agregarPersona(new Persona("Pepe", "Miranda", NivelEstudio.SIN_ESTUDIO));
        e.agregarPersona(new Persona("Juan", "Miranda", NivelEstudio.SECUNDARIA ));
        e.agregarPersona(new Persona("Kike", "Sánchez", NivelEstudio.UNIVERSIDAD ));
        e.agregarPersona(new Persona("Kato", "Perez", NivelEstudio.UNIVERSIDAD));
        e.agregarPersona(new Persona("Griss", "Perez", NivelEstudio.BACHILLERATO));

        e.mostrarPersonasPorNivel(NivelEstudio.SECUNDARIA);
        e.mostrarPersonasPorNivel(NivelEstudio.UNIVERSIDAD);
    }
}
