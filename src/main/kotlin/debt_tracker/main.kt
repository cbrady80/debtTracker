package debt_tracker

/*******************************************************
 * MENU FUNCTION
 * To display menu and call other classes and
 * functions accordingly.
 ******************************************************/

fun menu() {

    // DISPLAY OF MENU OPTIONS
    println("Menu:")
    println(" L  See list of debts")
    println(" A  Add new line item")
    println(" D  Delete line item")
    println(" E  Edit line item")
    println(" C  Calculate number of payments to pay-off")
    println(" Q  to Quit\n")


    // MENU COMMANDS
    var done = false
    while (!done) {
        // MENU PROMPT
        println("Please enter a selection: ")
        var userInput = readln()
        var selection = userInput.uppercase()

        // To check for valid input
        if (selection != "L" && selection != "A" && selection != "D" &&
            selection != "E" && selection != "C" && selection != "Q") {
            println("ERROR: Invalid selection, please try again.")
        }
        else {
            // With a valid input selection
            when (selection) {
                "L" -> { println("will display all line items") }
                "A" -> println("will create a lineitems obj for a new line")
                "D" -> println("will create a lineitems obj to delete line")
                "E" -> println("will create a lineitems obj to edit line")
                "C" -> println("will create a calculations obj")
                "Q" -> println("Thank you for using Debt Tracker!")
            }
        done = true
        } // END OF ELSE

    } // END OF WHILE-done LOOP

} // END OF MENU FUNCTION


/*******************************************************
 * MAIN FUNCTION
 ******************************************************/
fun main(args: Array<String>) {

    // WELCOME MSG
    println("Welcome to the DEBT TRACKER!\n")

    // DISPLAY MENU
    menu()

    // GOODBYE MSG
    println("Good bye.")

}