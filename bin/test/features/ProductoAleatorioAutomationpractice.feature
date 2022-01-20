@tag
Feature: HU-002 El usuario desea buscar
  en la pagina de AutomationPractice productos
  aleatorios

  @tag2
  Scenario Outline: <Escenario>
    Given me ubico en la pagina <Url>
    When busco un producto aleatorio en la plataforma
    Then se valida que el producto aleatorio es correcto

    Examples: 
      | Escenario                                               | Url                            |
      | Buscar producto aleatorio en la plataforma exitosamente | http://automationpractice.com/ |
