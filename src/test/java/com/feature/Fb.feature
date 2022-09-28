Feature: Creating New FaceBook Account

Scenario: Signing In FaceBook Account

Given user Launch The Url
When user Enter The MailOrPhoneNo
And user Enter The Password
And user Click The LogIn Button
And user get The Screenshot
And user NavigateBack
Then user Click On SignUp Button

Scenario: Signing Up In FaceBook

When user Enter The FirstName and LastName
And user Enter The Mail and Password
And user Select The Date Of Birth
And user Click The Gender and SubmitButton
Then user Take The ScreenShot