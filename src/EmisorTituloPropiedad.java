public abstract class EmisorTituloPropiedad {
    protected abstract boolean validarJurisdiccion(String identificadorTitular, String matricula, double valuacion);
    protected abstract TituloPropiedad construirTitulo(String identificadorTitular, String matricula, double valuacion) throws Exception;

    public final synchronized TituloPropiedad emitirTitulo(String identificadorTitular, String matricula, double valuacion) {
        try {
            if (!validarParametrosBase(identificadorTitular, matricula, valuacion)) {
                throw new IllegalArgumentException("Parámetros legales base nulos, vacíos o fuera de rango.");
            }
            if (!validarJurisdiccion(identificadorTitular, matricula, valuacion)) {
                throw new IllegalArgumentException("Datos obligatorios de la jurisdicción inválidos o incompletos.");
            }
            return construirTitulo(identificadorTitular, matricula, valuacion);
        } catch (Exception e) {
            System.out.println("Fallo al emitir título de propiedad: " + e.getMessage());
            return null;
        }
    }

    private boolean validarParametrosBase(String identificador, String matricula, double valuacion) {
        return identificador != null && !identificador.trim().isEmpty()
                && matricula != null && !matricula.trim().isEmpty()
                && valuacion > 0;
    }

    protected String generarFirma(String jurisdiccion, String identificador, String matricula, double valuacion) {
        int hashBase = (jurisdiccion + "|" + identificador + "|" + matricula + "|" + valuacion).hashCode();
        int positivo = hashBase < 0 ? -hashBase : hashBase;
        return "FIRMA-" + jurisdiccion + "-" + positivo;
    }
}