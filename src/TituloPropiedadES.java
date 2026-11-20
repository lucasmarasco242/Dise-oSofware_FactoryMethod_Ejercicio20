public final class TituloPropiedadES implements TituloPropiedad {
    private final String identificadorTitular;
    private final String referenciaRegistral;
    private final double valuacionFiscal;
    private final String codigoNotarial;
    private final String firmaDigital;

    public TituloPropiedadES(String identificadorTitular, String referenciaRegistral, double valuacionFiscal, String codigoNotarial, String firmaDigital) {
        this.identificadorTitular = identificadorTitular;
        this.referenciaRegistral = referenciaRegistral;
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
        return "Título ES [NIF: " + identificadorTitular + " | Registro: " + referenciaRegistral + "] Valuación: EUR " + valuacionFiscal + " | Código: " + codigoNotarial + " | Firma: " + firmaDigital;
    }
}
