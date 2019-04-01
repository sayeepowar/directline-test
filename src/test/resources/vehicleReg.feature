Feature: Functionality on Home page to see if it Accepts the correct vehicle number


Scenario Outline:  tests for vehicle registration

Given the car registration Number <vehicleReg>

When  Find Vehicle button is clicked

Then Verify the <result> with <resultString>

Examples:
| vehicleReg | result                                                                    | resultString                            |
| "OV12UYY"  | "//*[@id='page-container']/div[4]/div[1]"                                 | "Result for : OV12UYY"                  |
| "OV12UYZ"  | "/html/body/app-root/div/div/div[2]/app-dealersearch/div/div[4]"          | "Sorry record not found"                |
| ""         | "/html/body/app-root/div/div/div[2]/app-dealersearch/div/div[3]/form/div" | "Please enter a valid car registration" |