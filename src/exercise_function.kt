fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"
    displayAlertMessage(operatingSystem, emailId)
    displayAlertMessage(os = "Apple OS", email = "user1@gmail.com")
    displayAlertMessage(os = "Mac OS", email = "user2@gmail.com")
    displayAlertMessage(os = "Linux OS", email = "user3@gmail.com")
    displayAlertMessage(os = "Unknown OS ", email= "user4@gmail.com")
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(os : String , email : String)
{
    println("There\'s a new sign-in request on $os for your Google Account $email.");
}