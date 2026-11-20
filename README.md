Ejercicio 20 - Sistema Empresarial de Emisión de Títulos de Propiedad

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para emitir títulos de propiedad electrónicos según distintas jurisdicciones (AR, CL y ES), aplicando validación de datos obligatorios, inmutabilidad en los documentos, sincronización y generación de códigos de validación notarial y firmas digitales, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz TituloPropiedad con los métodos obtenerCodigoValidacion(), obtenerFirmaDigital() y obtenerDetalle().
- Tres clases inmutables (TituloPropiedadAR, TituloPropiedadCL y TituloPropiedadES) que representan cada título de propiedad.
- Una clase abstracta EmisorTituloPropiedad con emisión sincronizada y final que valida parámetros base y jurisdicción y delega la construcción del título.
- Tres emisores concretos (EmisorTituloAR, EmisorTituloCL y EmisorTituloES) que validan reglas registrales específicas y construyen el título correspondiente.

Luego, dentro del método main, se emiten títulos válidos por jurisdicción y se verifica el rechazo ante datos inválidos.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común TituloPropiedad para consultar código de validación, firma digital y detalle.
- Hacer inmutables las clases de títulos (final class y campos final) para proteger la integridad del documento.
- Centralizar en EmisorTituloPropiedad el flujo de validación, manejo de excepciones y emisión sincronizada.
- Delegar en cada subclase creadora la validación de su jurisdicción y la construcción del título.

Resultado de la ejecución

La ejecución del programa muestra en la consola los títulos emitidos para AR, CL y ES, y el rechazo de la emisión con datos inválidos.

Captura de pantalla

<img width="1359" height="331" alt="image" src="https://github.com/user-attachments/assets/a43f447e-70de-478e-a5bb-6d96f69a30b9" />
