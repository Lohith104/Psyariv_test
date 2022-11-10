$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Lohith/eclipse-workspace/IPT_Psyariv/src/test/java/Psyariv_feature/Psyariv.feature");
formatter.feature({
  "line": 1,
  "name": "Psyarxiv Website",
  "description": "",
  "id": "psyarxiv-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Print the Abstract",
  "description": "",
  "id": "psyarxiv-website;print-the-abstract",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter \"Psychlogy\" in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Sort the results by Newest to oldest",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Check the equality of results and count displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click the first hyperlink",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Print the text under abstract heading",
  "keyword": "Then "
});
formatter.match({
  "location": "Psyariv_stepdef.launch_the_URL()"
});
formatter.result({
  "duration": 207210400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Psychlogy",
      "offset": 7
    }
  ],
  "location": "Psyariv_stepdef.enter_in_search_bar(String)"
});
formatter.result({
  "duration": 4608900,
  "status": "passed"
});
formatter.match({
  "location": "Psyariv_stepdef.click_the_search_button()"
});
formatter.result({
  "duration": 69300,
  "status": "passed"
});
formatter.match({
  "location": "Psyariv_stepdef.sort_the_results_by_Newest_to_oldest()"
});
formatter.result({
  "duration": 39300,
  "status": "passed"
});
formatter.match({
  "location": "Psyariv_stepdef.check_the_equality_of_results_and_count_displayed()"
});
formatter.result({
  "duration": 40400,
  "status": "passed"
});
formatter.match({
  "location": "Psyariv_stepdef.click_the_first_hyperlink()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "Psyariv_stepdef.print_the_text_under_abstract_heading()"
});
formatter.result({
  "duration": 41000,
  "status": "passed"
});
});