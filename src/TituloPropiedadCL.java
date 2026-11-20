public final class TituloPropiedadCL implements TituloPropiedad {
    private final String identificadorTitular;
    private final String inscripcionRegistral;
    private final double valuacionFiscal;
    private final String codigoNotarial;
    private final String firmaDigital;

    public TituloPropiedadCL(String identificadorTitular, String inscripcionRegistral, double valuacionFiscal, String codigoNotarial, String firmaDigital) {
        this.identificadorTitular = identificadorTitular;
        this.inscripcionRegistral = inscripcionRegistral;
        this.valuacionFiscal = valuacionFiscal;
        this.codigoNotarial = codigoNotarial;
        this.firmaDigital = firmaDigital;
    }

    public String obtenerCodigoValidacion() {
        return codigoNotarial;
    }

    public String obtenerFirmaDigital() {
        return firmaDigital;
    }

    public String obtenerDetalle() {
        return "Título CL [RUT: " + identificadorTitular + " | Fojas: " + inscripcionRegistral + "] Valuación: $" + valuacionFiscal + " | Código: " + codigoNotarial + " | Firma: " + firmaDigital;
    }
}