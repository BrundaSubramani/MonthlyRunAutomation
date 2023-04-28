Feature: AF Simo New Journey
  Scenario Outline: To verify Sales rep is able to perform an E2E
    Given Sales rep is on salesforce login page
    Then Sales rep navigtes to search box and search for DMU profile and login
    Then Sales rep creates a new lead
    Then Sales rep converts the lead into account
    Then Sales rep clicks on place an order
    Then Sales rep is navigated to Business shop and selects Simo
    Then Sales rep navigated to Tariffs page and selects the tariff "<SimoTariff>"
    Then Sales rep clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then Sales rep is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" "<SIMOSpendCapValue>" and clicks on next button
    Then Sales rep is navigated to business apps page and select the business app and clicks on next button
    Then Sales rep lands on review basket page and clicks on proceed button
    Then Sales rep enters the business details on transactional checkout page
    Then Sales rep provides the personal details
    Then Sales rep provides the delivery details
    Then Sales rep provides the monthly payment details
    Then Sales rep provides the upfront details

    Examples:
      |SimoTariff | FourG_FiveGSIMO | SIMOSpendCapSelect | SIMOSpendCapValue |
      |50GB       | 4G tariff       | YES                | £50               |