package debt_tracker

import java.util.Scanner
import kotlin.math.roundToInt


/*******************************************************
 * MENU INTERACTIONS FUNCTION
 * To display menu options, and call other functions
 * accordingly.
 ******************************************************/
fun menuInteractions() {

    // Create a LineItems object.
    val lineItems = LineItems()

    // MENU COMMANDS
    var done = false
    while (!done) {

        // DISPLAY OF MENU OPTIONS
        println("Menu:")
        println(" A  Add new line item")
        println(" D  Delete line item")
        println(" E  Edit debt amount")
        println(" L  See list of debts")
        println(" C  Calculate number of payments to pay-off")
        println(" Q  to Quit\n")

        // MENU PROMPT
        println("Please enter a selection: ")
        var userInput = readln()
        var selection = userInput.uppercase()

        // To check for valid input
        if (selection != "A" && selection != "D" && selection != "E" &&
            selection != "L" && selection != "C" && selection != "Q"
        ) {
            println("ERROR: Invalid selection, please try again.")
        } else {
            // With a valid input selection
            when (selection) {
                "A" -> lineItems.newLine()
                "D" -> lineItems.deleteLine()
                "E" -> lineItems.editLine()
                "L" -> lineItems.display()
                "C" -> calculations()
                "Q" -> {
                    println("Thank you for using Debt Tracker!")
                    done = true
                }
            }

        } // END OF ELSE

    } // END OF WHILE-done LOOP

} // END OF MENU COMMAND FUNCTION



/*******************************************************
 * CALCULATIONS
 * Function to calculate number of payments left.
 ******************************************************/

// create a new scanner
val reader = Scanner(System.`in`)
fun calculations() {
    // PROMPT FOR TOTAL DEBT AMOUNT
    println("Please enter the total amount of debt: ")
    val debtAmt = reader.nextDouble()

    // PROMPT TO ENTER PAYMENT AMOUNT
    println("Please enter the monthly payment amount: ")
    val monthlyPymt = reader.nextDouble()

    // CALCULATE NUMBER OF PAYMENTS LEFT AND RETURN
    val pymtsLeft = (debtAmt / monthlyPymt).roundToInt()
    println("You have $pymtsLeft monthly payments left.\n")

}


/*******************************************************
 * MAIN FUNCTION
 ******************************************************/
fun main(args: Array<String>) {

    // WELCOME MSG
    println("Welcome to the DEBT TRACKER!\n")

    // DISPLAY MENU
    menuInteractions()

    // GOODBYE MSG
    println("Good bye.")

}