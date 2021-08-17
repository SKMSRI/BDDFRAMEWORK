You can ignore Cucumber Tests using tags(defined in runner class). not word is used along with tags to ignore the test.

This works both for Scenario as well as Feature. You can skip a scenario, 
set of scenarios or all scenarios in a feature file. You can also use this with conjunction with AND or OR.

Feature: Registration, Login and MyAccount
 
  Background: Titllrgdgdgd sgdgdsfg
 	  Given I am on the home page
    And I follow "Sign in"	  
 	   
  @sanity
  Scenario: Verify Login Functionality
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"  
   
 @regression
  Scenario: Create New User
    When I fill "registration email textbox" with "goswami.tarun77+1@gmail.com"
    Then I click "create an account button"
    
  @sanity @regression
  Scenario: Verify Logout Functionality
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"    
    
   @smoke
  Scenario: Verify Login Functionality
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    
    
Example #1: To execute all scenarios except @smoke.
tags = {"not @smoke"}

Example #2: Execute Scenario which are tagged with @regression, not @sanity. This will execute scenario #2.
tags = {"@regression","not @sanity"}

Example #3: Below Code will execute scenario #2 and #3.
tags = {"@regression", "not @smoke"}

Example #4: Execute Scenario that are neither tagged with @regression and nor tagged with @sanity. 
This will only execute scenario #4.
tags = {"not @regression", "not @sanity"}