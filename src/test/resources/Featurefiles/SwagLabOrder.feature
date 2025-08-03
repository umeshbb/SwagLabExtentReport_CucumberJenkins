Feature: SwagLab Order Back Pack

Background:
Given user is on Login Page 
When User enter the UN as "standard_user"
And User enter the PWD as "secret_sauce"
And User Click on Login Button


Scenario: S6 : Purchase the Back-pack
When User Click on Add to cart button
When User click on Open Cart menu
And User click on check out button
And User enter the FN as "Umesh"
And User Enter the LN as "Birajdar"
And User enter the Postal Code as "413516"
And User click on continue button
And User Click on finish button on checkoutoverview page
Then User should reach on Order Complete Page With Message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"