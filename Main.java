/*
 * This current system is designed to work using loops and static code. Would this
 * work: Yes! It completly could work using loops with no errors. However, based on 
 * the current size scale of the code already, I can tell that it will require a LOT
 * of loops. This will make the code harder to read, and could lead to unseen errors.
 * Because of this, I want to swap to a recursive method based structor. Instead of
 * using loops, I will have everything be its own method. There will be a lot of 
 * involved, but when reading through the main method it will look super straight
 * forward and consise, therefor making it easy to track errors and prevent them. In
 * addition, creating method based code will make it seamless to transition to an
 * account based structure, and will allow me to have a lot less random variables that 
 * are only there to deal with looping.
 * 
 * All this being said, Ive designed method based code before, TicTakToe. I know this
 * works and I know I understnad how to do it. Perhaps makign htis loop based will
 * be a good way for me to practice loops more. Already I can see how implementing code 
 * this way requires me to use many tools which I previously avoided. These are Switch
 * statments, Do Whiles, and enums. 
 * 
 * For this reason, I chose to continue down loop based code so I can practice and 
 * refine my skills in these unfimiliar fields.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    /*
     * surrounding code in {} allows it to be split up, just food for thought
     */
    {System.
        out
        .println
        ("Hi");}

    public static void main(String[] args) {

        // General Variables
        Scanner sc = new Scanner(System.in);
        int action = 0;
        String input;
        char responce = ' ';
        boolean loop1=false;
        enum Menus {
            MAIN_MENU, DEPOSITE, WITHDRAW, BALANCE, LEAVE
        }
        boolean loop2=false;
        Account account = new Account("MyAccount", "Password");
        
        String[] mainMenu = {"Make a Deposite", "Make a withdrawal", "Check Balance", "Leave"};
        
        System.out.println("Welcom to Rob Banks Inc.");

        Menus currentMenu = Menus.MAIN_MENU;
        do {
            switch(currentMenu) {
                case MAIN_MENU:
                    // break MAIN_MENU
                    break;
                case DEPOSITE:
                    // break DEPOSITE
                    break;
                case WITHDRAW:
                    // break WITHDRAW
                    break;
                case BALANCE:
                    // break BALANCE
                    break;
                case LEAVE:
                    while(!loop1) {
                        System.out.println("Please Enter 'y' or 'n'");
                        System.out.println("Are you sure you would like to leave?");
                        System.out.print("Action: ");
                        input = sc.nextLine();
                        if(input.equals("y")) {
                            loop1=true;
                        } else if(input.equals("n")) {
                            currentMenu = Menus.MAIN_MENU;
                            break;
                        } else {
                            System.out.println("Im not sure what this means.");
                        }
                    }
                    // break LEAVE
                    break;
                // case
            }

        } while(!loop1);

        // Main Menu Loop 
        {
            do {
                listOptions(mainMenu);
                /*
                 * Could this all be replaced by nextInt() ?
                 * If I used a try-catch block then yse, but otherwise I could 
                 * have unhandled errors that wuold cause the code to crash. This
                 * current system allows me to avoid a try-catch block, and make 
                 * the code fault proof.
                 * 
                 * Perhaps this could be done through a method - for reusability sake
                 */
                input = sc.nextLine();
                if(!input.equals(null)) {
                    responce = input.charAt(0);
                    if(Character.isDigit(responce)) {
                        action = Character.getNumericValue(responce);
                        if(0 < action && action < mainMenu.length+1) {
                            loop2=true;
                        }
                    }
                }
                if(loop2==false) {
                    System.out.println("I dont understand that responce. Please enter a number\nthat coresponds to a provided choice.");
                }
            } while(!loop2);
            // Resets loop so it can be used again
            loop2=false;

            // Switch Statment for 
        }



        System.out.println("Have a good day, and be back soon!");

    }

    public static void listOptions(String[] a) {
        System.out.println("What would you like to do?");
        for(int i=0; i<a.length; i++) {
            System.out.print("\t"+(i+1)+".) "+a[i]);
            System.out.println();
        }
        System.out.print("Action: ");
    }
}