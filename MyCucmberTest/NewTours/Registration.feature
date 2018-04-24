Feature: Register Mercury tours application testing
Scenario Outline: Register Mercury Tours Testing

Given Firefox browser is opened and new tours application is opened and click on register button to open register page    
When user enter valid "<FirstName>"and "<LastName>" and "<Phone>" and "<UserName>" and "<Address>" and "<City>" and "<State>" and "<PostalCode>" and "<Country>" and "<Email>" and "<Password>" and "<ConfirmPassword>" and click on rigister button
Then user is successfully registered and browser is closed

Examples:
| FirstName | LastName | Phone     |   UserName           | Address          | City | State | PostalCode | Country | Email | Password | ConfirmPassword |
| Preeti		|Gudidevuni| 0423248895| preeti2181@gmail.com |32 Canegrass      | Mel  | VIC   | 3030       | Aus     |Preeti |Preeti    | Preeti          |
| Pankaj		|Awula     | 0423727783| pankajroy8@gmail.com |32 Canegrass drive| Mel  | VIC   | 3031       | Aus     |Pankaj |Pankaj    | Pankaj          |

