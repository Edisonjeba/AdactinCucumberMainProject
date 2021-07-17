Feature: Testing the booking functionality of the Adactin Hotel Booking Application

Scenario Outline: User checking the login functionality using valid username and 

passwrd

 Given User must login the login page
 When User enter the valid user name in the username field
 And User enter the valid password in the password field
 Then User confirm it and   navigated to the search page
 

     Scenario: User checking the search function using valid crediential

    
     Given User select the hotel location in the location field
     When User select the hotel in the hotels field
     And User select the room type in the room type field
     And User select the number of room in the number of room
     And User select the number of children per room in the number of children per room
     And User confirm search it and navigate to Select Hotel
     And User select hotel in select hotel redio button
     Then User select the Hotel and navigate to Book Hotel

     Scenario: User Book the Hotel and Payment details 

     Given User enter the valid first name in the firstname field
     When User enter the valid last name in the lastname field
     And User enter the billing Address in the address field
     And User enter the credit card number in the credit card no field
     And User select the card type in the credit card type field
     And User select the expiry month in the month field
     And User select the expiry year in the expiry year field
     And User enter the cvv number in the cvv number field
    Then User confirm book now it and navigate to booking confirmation

     Scenario: User check the hotel booking confirmation and logout

     Given User click logout in the confirmation page logout