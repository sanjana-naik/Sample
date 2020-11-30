$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login1.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user searches for the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ft"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps1.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for the product",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps1.user_searches_for_the_product(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "shoes page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps1.shoes_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});