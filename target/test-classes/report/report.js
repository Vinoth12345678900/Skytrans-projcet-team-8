$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Flightsearchpage.feature");
formatter.feature({
  "name": "To validate the flight search page to the skytrans",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the flight seach page with invalid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in flight search page",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepage.the_user_should_be_in_flight_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be check the whether the data is present or not",
  "keyword": "When "
});
formatter.match({
  "location": "Homepage.the_user_should_be_check_the_whether_the_data_is_present_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in select flight page",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.the_user_should_be_in_select_flight_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/feature/Home.feature");
formatter.feature({
  "name": "To Validate the login functionality of Skytrans Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the Booking with valid and invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in Booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepage.the_user_should_be_in_Booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should enter the Arrival and Departure Details",
  "keyword": "When "
});
formatter.match({
  "location": "Homepage.the_user_should_enter_the_Arrival_and_Departure_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should select the from and to date",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage.the_user_should_select_the_from_and_to_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.the_user_should_be_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});