Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 15 mtrs from the shop
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range
    Given Lucy is located 1 mtr from the shop
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range
    Given Lucy is standing 10 mtrs from the shop
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message