@tag
Feature: User should able to signup to dazn application
  I want get user signed up to dazn

  @ValidCredentials
  Scenario Outline: Signup with valid credentials
    Given User is on Dazn landing page
    When User click on signup now option
    When User enters username as <firstname> and Lastname as <Lastname> and Email as <Email> and Confirm Email as <Email> and Create a password as <password>
    And click on continue
    And enter card details as <card number> and Expiry date as <edate>  and Expiry year as <eyear> and Security code as <cvv>
    Then User should be able to login sucessfully and new page open

    Examples: 
      | firstname | Lastname | Email                | password | card number         | edate | eyear | cvv |
      | Mahesh    | Mahesh   | mahesh0309@gmail.com | Abc@1234 | 4111 1111 4555 1142 |    03 |    30 | 737 |
      | Mahesh    | Mahesh   | mahesh0309@gmail.com | Abc@1234 | 4111 1111 4555 1142 |    03 |    30 | 737 |
      | Mahesh    | Mahesh   | mahesh0309@gmail.com | Abc@1234 | 4111 1111 4555 1142 |    03 |    30 | 737 |
