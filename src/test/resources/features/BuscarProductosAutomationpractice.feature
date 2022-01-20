@tag
Feature: HU-001 El usuario desea buscar
  en la pagina de AutomationPractice una
  lista de 5 productos

  @tag2
  Scenario Outline: <Escenario>
    Given me ubico en la pagina <Url>
    When busco los productos <Producto> en la plataforma
    Then se valida que el producto <Producto> sea el correcto

    Examples: 
      | Escenario                                     | Producto                    | Url                            |
      | Buscar producto en la plataforma exitosamente | Blouse                      | http://automationpractice.com/ |
      | Buscar producto en la plataforma exitosamente | Faded Short Sleeve T-shirts | http://automationpractice.com/ |
      | Buscar producto en la plataforma exitosamente | Printed Dress               | http://automationpractice.com/ |
      | Buscar producto en la plataforma exitosamente | Printed Summer Dress        | http://automationpractice.com/ |
      | Buscar producto en la plataforma exitosamente | Printed Chiffon Dress       | http://automationpractice.com/ |
