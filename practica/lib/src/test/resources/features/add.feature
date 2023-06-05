Feature: Agregar un usuario

  Scenario: Agregar un usuario
    Given Un usuario que está en el apartado recruitment
    When El usuario ingresa crendenciales validas
    Then La pagina muestra el usuario en la lista de candidatos

    Scenario: hola