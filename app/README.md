# README FOR SIGNUPFORM

The MainActivity has been renamed to FormActivity through refactoring. This app has four EditTexts, one for a username, email address, password, and password confirmation.
It also has a save button, that has an OnClickListener attached to it. When the button is clicked,
four vals store the string input from all of the EditTexts. Then, a series of if statements are 
iterated through, checking to see if any of the EditTexts are empty and verifying that the password
and confirm password inputs are the same. If any are empty or the passwords do not match, the EditText
with the error will trigger its error attribute, set with setError(). Otherwise, there will be a Toast
message, displaying a welcome message that includes the username.

Attached are some screenshots of the application in the initial state, no error state, and one permutation
of errors.