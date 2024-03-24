Feature:opening a bank acount
Scenario: opeing bank acount with nominee
Given user should be at acounts page
When user enters the following data
|steaven|smith|steavesmith18@gmail.com|7898976545|
|ricky|ponting|rickyponting04@gmail.com|9898976585|
|kane|willions|kanewilling12@gmail.com|6765432567|
And user click on submit button
Then user should see confirmation
