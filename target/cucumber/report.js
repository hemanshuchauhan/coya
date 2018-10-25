$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 1,
  "name": "coya HomePage Feature",
  "description": "",
  "id": "coya-homepage-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 342063,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "customer is on coya.com",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageStepDefn.customer_is_on_coya_com()"
});
formatter.result({
  "duration": 12121263982,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "verify Title of the Homepage should be in German Langauge",
  "description": "",
  "id": "coya-homepage-feature;verify-title-of-the-homepage-should-be-in-german-langauge",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@s1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "verify title of the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefn.verify_title_of_the_homepage()"
});
formatter.result({
  "duration": 55403507,
  "status": "passed"
});
formatter.before({
  "duration": 372695,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "customer is on coya.com",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageStepDefn.customer_is_on_coya_com()"
});
formatter.result({
  "duration": 14217454583,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User changes the Language to English and verify the tabs in English",
  "description": "",
  "id": "coya-homepage-feature;user-changes-the-language-to-english-and-verify-the-tabs-in-english",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@R1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user selects EN as language",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Tabs should be displayed in english",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefn.user_selects_EN_as_language()"
});
formatter.result({
  "duration": 512432941,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefn.tabs_should_be_displayed_in_english()"
});
formatter.result({
  "duration": 304590380,
  "status": "passed"
});
});