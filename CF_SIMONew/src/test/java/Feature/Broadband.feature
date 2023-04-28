Feature: Order a broadband through business shop
  Scenario Outline: Customer orders a broadband through businessshop
    Given Customer is able to launch the business shop
    When Customer hover on shop and click on Broadband
    Then customer enters the "<postcode>" "<fixedlinenumber>" "<o2mobilenumber>"
    Then Customer clicks the  check button
    Then Customer chooses the "<plan>" for broadband and clicks on buynow button
    Then Customer clicks on continue button
    Then Customer enters the "<firstname>" "<lastname>" "<O2ContactNumber>" and installation address
    Then Customer can see the basket page and click on proceed button.
    Then Customer continues as a new customer
    Then Customer provides the personal details
    Then Customer provides the business details
    Then Customer provides the payment details
    Then Customer confirms the order

    Examples:
      | postcode | fixedlinenumber | o2mobilenumber |plan                              | firstname           | lastname              | O2ContactNumber  |
      | LS146HP  | 01132642584     | 07710163471    |Business Broadband Connect        |  TTABAAAAAAAAAAA    |TTAAAAAAAAAAAAAAAAAA   | 07710163471      |