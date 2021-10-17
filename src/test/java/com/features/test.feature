
Feature: About Testers
In order to get a high paid job
As a Tester
I want to learn Automation


Scenario Outline: I am a Manual Tester
Given I am a "<testerType>" Tester	
|Location	|Position|
|USA			|Contract|
|India		|Full time|

When I apply for a job
Then I get a "<salType>" paid job
And I am "<satType>" satisfied with my salary
But My parents are "<parentSat>" satisfied

Examples:
|testerType	|salType	|satType|parentSat|
|Manual			|Less			|Low		|Average	|
|Automation	|High			|Very		|Highly		|
|Database		|Better		|Good		|Very good|