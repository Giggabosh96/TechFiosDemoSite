$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Billing Site Functionality Testing with data from MySQL",
  "description": "",
  "id": "techfios-billing-site-functionality-testing-with-data-from-mysql",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DBLogin"
    }
  ]
});
formatter.before({
  "duration": 2100041400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on TechFios Login Site",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TechFios_Login_Site()"
});
formatter.result({
  "duration": 1056426900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "",
  "description": "User should be able to log into the Techfios Billing site with valid credentials",
  "id": "techfios-billing-site-functionality-testing-with-data-from-mysql;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DBScenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user will land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinitions.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 492577200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinitions.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 138057000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1425427200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_will_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 404429600,
  "status": "passed"
});
formatter.after({
  "duration": 725586600,
  "status": "passed"
});
});