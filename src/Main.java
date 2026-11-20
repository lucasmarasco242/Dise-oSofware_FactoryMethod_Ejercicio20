public class Main {
    public static void main(String[] args) {
        EmisorTituloPropiedad creadorAR = new EmisorTituloAR();
        TituloPropiedad tituloAR = creadorAR.emitirTitulo("20345678901", "MAT-MZA-4821", 45000.0);
        if (tituloAR != null) {
            System.out.println(tituloAR.obtenerDetalle());
        }

        EmisorTituloPropiedad creadorCL = new EmisorTituloCL();
        TituloPropiedad tituloCL = creadorCL.emitirTitulo("76123456-K", "CBR-STGO-904", 62000.0);
        if (tituloCL != null) {
            System.out.println(tituloCL.obtenerDetalle());
        }

        EmisorTituloPropiedad creadorES = new EmisorTituloES();
        TituloPropiedad tituloES = creadorES.emitirTitulo("B12345678", "RP-MAD-1120", 180000.0);
        if (tituloES != null) {
            System.out.println(tituloES.obtenerDetalle());
        }

        TituloPropiedad tituloInvalido = creadorAR.emitirTitulo("123", "", -1000.0);
        if (tituloInvalido == null) {
            System.out.println("Emisión notarial rechazada por datos registrales inválidos.");
        }
    }
}