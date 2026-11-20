public class EmisorTituloAR extends EmisorTituloPropiedad {
    protected boolean validarJurisdiccion(String identificadorTitular, String matricula, double valuacion) {
        return identificadorTitular.length() == 11 && matricula.startsWith("MAT-") && valuacion > 0;
    }

    protected TituloPropiedad construirTitulo(String identificadorTitular, String matricula, double valuacion) {
        String codigo = "NOT-AR-" + matricula + "-" + identificadorTitular.substring(0, 4);
        String firma = generarFirma("AR", identificadorTitular, matricula, valuacion);
        return new TituloPropiedadAR(identificadorTitular, matricula, valuacion, codigo, firma);
    }
}