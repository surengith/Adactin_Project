Feature: Checking the hotel booking functionality in adactin application

Scenario: Login Page
Given user Must Launch The Url
When user Enter The "surencrazy" In The Username Field
And user Enter The "Suren@123$" In The Password Field
Then user Click The "getLogin" And It Will Navigates To Search Hotel Page

Scenario: Booking Page
When user Select The "7" In The Location Field
And user Select The "Hotel Cornice" In The Hotels Field
And user Select The "Super Deluxe" In The Room Type Field
And user Select The "6" In The Room Nos Field
And user Select The "25/08/2022" In The Date Pickin Field
And user Select The "28/08/2022" In The Date Pickout Field
And user Select The "3 - Three" In The Adult Room Field
And user Select The "2" In The Child Room Field
Then user Click The Search "getSubmit" And It Will Navigates To Select Hotel Page

Scenario: Select Hotel Page
When user Click The Radio "getRadiobtn" To Select The Hotel
Then user Click The Continue "getContine" It Will Navigates To Booking Confirmation Page

Scenario: Booking Confirmation Page
When user Enter The "Surendhar" In The Firstname Field
And user Enter The "P" In The Lastname Field
And user Enter The "6601 S SAN PEDRO LOS ANGELES CA 90003-1937. USA" In The Address Field
And user Enter The "1234-5425-2525-6666" In The CC Number Field
And user Select The "MAST" In The CC Type Field
And user Select The "September" In The Expire Date Field
And user Select The "12" In The Expire Year Field
And user Enter The "678" In The CVV Number Field
Then user Click The "book_now" Button It Will Navigates To Logout Page

Scenario: Logout Page
When user Click "getCheckbox" To Select The Checkbox
And user Click "getSubmit" To Select The Submit
Then user Click "logout" To Select The Logout
