public class EmisorTituloCL extends EmisorTituloPropiedad {
    protected boolean validarJurisdiccion(String identificadorTitular, String matricula, double valuacion) {
        return identificadorTitular.contains("-") && identificadorTitular.length() >= 8 && matricula.startsWith("CBR-") && valuacion > 0;
    }

    protected TituloPropiedad construirTitulo(String identificadorTitular, String matricula, double valuacion) {
        String codigo = "NOT-CL-" + matricula + "-" + identificadorTitular.replace("-", "");
        String firma = generarFirma("CL", identificadorTitular, matricula, valuacion);
        return new TituloPropiedadCL(identificadorTitular, matricula, valuacion, codigo, firma);
    }
}