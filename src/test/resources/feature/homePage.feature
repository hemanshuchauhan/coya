Feature: coya HomePage Feature

Background: 
    Given customer is on coya.com
 
@scenario1
Scenario: verify Title of the Homepage should be in German Langauge
Then verify title of the homepage

@scenario2
Scenario: User changes the Language to English and verify the tabs in English
When user selects EN as language
Then Tabs should be displayed in english

