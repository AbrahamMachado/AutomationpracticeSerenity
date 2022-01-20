Feature: HU-003 El usuario desea buscar
  en la pagina de AutomationPractice
  dos productos exitosamente e igual un
  producto con error

  Background: 
    Given me ubico en la pagina http://automationpractice.com/

  Scenario: Buscar producto en la plataforma exitosamente
    When busco el producto en la url de automation
      | nombreProducto |
      | Blouse         |
    Then se valida si el producto buscado en pantalla sea el correcto

  #Scenario: Buscar producto en la plataforma exitosamente
    #When busco el producto en la url de automation
      #| nombreProducto        |
      #| Printed Chiffon Dress |
    #Then se valida si el producto buscado en pantalla sea el correcto
#
  #Scenario: Buscar producto en la plataforma exitosamente
    #When busco el producto en la url de automation
      #| nombreProducto              |
      #| Faded Short Sleeve T-shirts |
    #Then se valida si el producto buscado en pantalla sea el correcto
