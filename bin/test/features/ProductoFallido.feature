Feature: HU-004 El usuario desea buscar
  en la pagina de AutomationPractice una
  producto que no se encuentre en su
  portafolio y un producto que exista

  @tag1
  Scenario: Buscar producto fallido en la pagina de Automation Practice
    Given me ubico en la pagina http://automationpractice.com/
    When busco el producto en la url de automation
      | nombreProducto    |
      | pantalones cortos |
    Then se valida si el producto buscado en pantalla sea el correcto

  Scenario: Buscar producto exitoso en la pagina de Automation Practice
    Given me ubico en la pagina http://automationpractice.com/
    When busco el producto en la url de automation
      | nombreProducto |
      | Printed Dress  |
    Then se valida si el producto buscado en pantalla sea el correcto
