Feature: Login Page Automation of SauceDemoApp
Scenario Outline: Check login is successful with valid credentials
Given User is on Login Page
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| locked_out_user| secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |