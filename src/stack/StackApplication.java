package stack;

import java.util.Scanner;

public class StackApplication {

    public static void main(String[] args){

        Scanner kboard = new Scanner(System.in);
        ArrayStack <String> arrayStack = new ArrayStack<>();
        LinkedStack <String> linkedStack = new LinkedStack<>();
        int choice = 0;
        boolean debug = false;

        do {

            System.out.println("Please choose from the following options:");
            System.out.println("1. Add to stacks");
            System.out.println("2. Show the top of each stack");
            System.out.println("3. Remove the top items from each stack");

            if(debug){
                System.out.println("4. Print contents of stacks");
                System.out.println("5. Exit debug mode");
            } else {
                System.out.println("4. Enter debug mode");
            }

            System.out.println("0: Quit");
            choice = kboard.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the string to be added to the stacks");
                    String dummy = kboard.nextLine();
                    String addition = kboard.nextLine();
                    arrayStack.push(addition);
                    linkedStack.push(addition);
                    break;

                case 2:
                    System.out.println("Array: " + arrayStack.top());
                    System.out.println("Linked: " + linkedStack.top());
                    break;

                case 3:
                    arrayStack.pop();
                    linkedStack.pop();
                    break;

                case 4:
                    if(!debug){
                        debug = true;
                    } else {
                        System.out.println(arrayStack);
                        System.out.println(linkedStack);
                    }
                    break;

                case 5:
                    if(debug){
                        debug = false;
                    } else {
                        System.out.println("Incorrect value entered. Please try again.");
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Incorrect value entered. Please try again.");
                    break;
            }

        } while (choice != 0);

    }

}
