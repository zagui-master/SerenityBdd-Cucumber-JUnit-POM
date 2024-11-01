Feature: CP01 - Como usuario de la plateaforma web Sauces demo
  Quiero validar el inicio de sesion con las diferentes credenciales validas
  Y validar el comportaminiento del sistema con las credenciales invalidas

  Background: : Validar inicio de session con credencialoes validas e invalidas
    Given Que el usuario se encuentra en la platafomra web Sauces demo

  @Login
  Scenario: 01 - Validad inicio de sesion con credenciales validas
    When ingrese las credenciales validas
    Then el sistema nos redirige al modulo de productos


  Scenario: 02 - Validad inicio de sesion con credenciales invalidas
