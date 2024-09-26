Feature: Promotor
  # CA01 Iniciar sesion en la aplicacion
  Scenario: Iniciar sesion con credenciales validas
    Given Abrimos la apk
    When Hacemos login con credenciales validas
    Then Muestra el Home

  # CA02 Visitar la opcion Nueva Solicitud
  Scenario: Visitando Nueva Solicitud
    Given Abrimos la apk
    When Hacemos login con credenciales validas
    Then Muestra el Home
    When Vamos a Nueva Solicitud
    Then Muestra el Cotizador

  # CA03 Selecciona los select del Cotizador
  Scenario: Seleccionar campos del Cotizador
    Given Abrimos la apk
    When Hacemos login con credenciales validas
    Then Vamos a Nueva Solicitud
    When Seleccionamos datos de cotizacion
    Then Muestra texto renovacion sobre capacidad de pago

  # CA04 Hacar el flujo completo de cotizacion
  Scenario: Hacar el flujo completo de cotizacion
    Given Abrimos la apk
    When Hacemos login con credenciales validas
    Then Muestra el Home
    When Vamos a Nueva Solicitud
    Then Muestra el Cotizador
    When Seleccionamos datos de cotizacion
    When Completar datos de cotizacion
    Then Muestra Resultados de Cotizacion