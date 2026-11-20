public final class TituloPropiedadAR implements TituloPropiedad {
    private final String identificadorTitular;
    private final String matriculaCatastral;
    private final double valuacionFiscal;
    private final String codigoNotarial;
    private final String firmaDigital;

    public TituloPropiedadAR(String identificadorTitular, String matriculaCatastral, double valuacionFiscal, String codigoNotarial, String firmaDigital) {
        this.identificadorTitular = identificadorTitular;
        this.matriculaCatastral = matriculaCatastral;
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
        return "Título AR [CUIT: " + identificadorTitular + " | Matrícula: " + matriculaCatastral + "] Valuación: $" + valuacionFiscal + " | Código: " + codigoNotarial + " | Firma: " + firmaDigital;
    }
}