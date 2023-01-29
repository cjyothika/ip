package duke;

import duke.task.Task;

import java.util.Scanner;

/**
 * The type Ui.
 */
public class Ui {

    /**
     * Shows welcome.
     */
    public static void showWelcome() {
        showLine();
        System.out.println(" Hello! I'm Duke\n" + " What can I do for you?");
        showLine();
    }

    /**
     * Shows line.
     */
    public static void showLine() {
        System.out.println("\n____________________________________________________________\n");
    }

    /**
     * Shows error message.
     *
     * @param errorMessage the error message
     */
    public static void showError(String errorMessage) {
        System.out.println("☹ OOPS!!! " + errorMessage);
    }

    /**
     * Reads user input and returns the corresponding command string.
     *
     * @return the string
     */
    public static String readCommand() {
        Scanner userInput = new Scanner(System.in);
        String newInput = userInput.nextLine();
        return newInput;
    }

    /**
     * Shows loading error.
     */
    public static void showLoadingError() {
        showError("an error occurred while loading file from given filepath");
    }

    /**
     * Shows added task.
     *
     * @param newTask    the new task
     * @param numOfTasks the num of tasks
     */
    public static void showTask(Task newTask, int numOfTasks) {
        System.out.println(String.format("Got it. I've added this task:\n %s\n Now you have %d tasks in the list."
                ,newTask, numOfTasks));
    }

    /**
     * Says goodbye.
     */
    public static void sayGoodbye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    /**
     * Shows action done by Duke.
     *
     * @param action the action
     */
    public static void showAction(String action) {
        System.out.println(action);
    }

}
