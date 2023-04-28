Feature: CF Simo New E2E
  Scenario Outline: To verify user is able to perform CF Simo E2E
    Given User is on the Online Business Shop home page
    Then User is navigated to the Sim only page
    Then User selects the tariff "<SimoTariff>" and clicks on continue button
    Then User clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then User is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" "<SIMOSpendCapValue>" and clicks on next button
    Then User is navigated to business apps page and select the business app and clicks on next button
    Then User lands on review basket page and clicks on proceed button
    Then User continues as a new customer
    Then User is navigated to the first step and clicks on Go To About your business
    Then User provides the business details
    Then User provides the personal details
    Then User provides the delivery details
    Then User provides the monthly payment details
    Then User provides the upfront details


    Examples:
      |SimoTariff  | FourG_FiveGSIMO | SIMOSpendCapSelect | SIMOSpendCapValue |
      |50GB       | 4G tariff        | YES                | £50                |