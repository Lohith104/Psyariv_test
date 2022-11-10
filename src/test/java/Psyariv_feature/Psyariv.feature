Feature: Psyarxiv Website
Scenario: Print the Abstract

Given Launch the URL
When Enter "Psychlogy" in search bar
And Click the search button 
And Sort the results by Newest to oldest
And Check the equality of results and count displayed
And Click the first hyperlink
Then Print the text under abstract heading