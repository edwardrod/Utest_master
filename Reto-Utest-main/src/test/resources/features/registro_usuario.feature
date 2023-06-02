#Autor: Eduar Rodriguez
  @stories

  Feature: Registro de usuario en la plataforma Utest

    @scenario1
    Scenario: Registro de Luis en Utest
      Given Eduar desea registrarse en la plataforma Utest
      When El usuario ingresa toda la informacion requerida por la pagina
        | strNombre | strApellido | strEmail                      | strMesNacimiento  | strDiaNacimiento  | strAnoNacimiento  | strCiudad     | strCodigoPostal | strPais   | strComputador | strVersionComputador  | strLenguajeComputador | strDispositivoMovil | strModeloDispositivoMovil | strSistemaOperativoMovil  | strContrasena     |
        | Eduar      | Rodriguez         | eduar9193rod@gmail.com  | August         | 7                 | 1998              | Villavicencio | 500005           | Colombia  | Windows       | 10                    | Spanish               | Samsung             | Galaxy M12                | Android 11                | Eduarod@1234      |
      Then El registro se completa cuando aparece el boton Complete Setup
        | strTextoFinal                                                           |
        | Welcome to the world's largest community of freelance software testers! |