Feature: Order an app through business shop
  Scenario Outline: Customer orders McAfee Multi Access app through businessshop
    Given Customer is able to launch the online shop
    Then Customer selects the "<app>"
    Then Customer can choose the "<quantity>" and click on choose button
    Then Customer lands on review basket page and clicks on proceed to order button
    Then customer continues as a new customer
    Then customer provides the business details
    Then customer provides the personal details
    Then customer provides the monthly payment details and continue to credit check
    Then customer provides the upfront details

    Examples:
     | app                            |quantity|
     | McAfee Multi Access            |1       |
