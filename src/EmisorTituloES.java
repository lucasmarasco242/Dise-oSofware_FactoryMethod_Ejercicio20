public class EmisorTituloES extends EmisorTituloPropiedad {
    protected boolean validarJurisdiccion(String identificadorTitular, String matricula, double valuacion) {
        return identificadorTitular.length() >= 8 && matricula.startsWith("RP-") && valuacion > 0;
    }

    protected TituloPropiedad construirTitulo(String identificadorTitular, String matricula, double valuacion) {
        String codigo = "NOT-ES-" + matricula + "-" + identificadorTitular;
        String firma = generarFirma("ES", identificadorTitular, matricula, valuacion);
        return new TituloPropiedadES(identificadorTitular, matricula, valuacion, codigo, firma);
    }
}
