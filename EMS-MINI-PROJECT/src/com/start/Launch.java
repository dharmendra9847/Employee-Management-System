package com.start;

import java.util.Scanner;

public class Launch {

    void main(){

        //CREATE A MENU
        /*
        * ****** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ******
        *
        * Press-1 : Add Employee
        * Press-2 : Read All Employee
        * Press-3 : Delete Single Employee
        * Press-4 : Update Single Employee
        * Press-5 : Exit
        * Enter Your Choice:
        *
        * Hint: Scanner, sop, Switch
        */

        //GREETING
        IO.println("\n(:****** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ******:)");
        IO.println("-------------------------------------------------------\n");

        Scanner sc = new Scanner(System.in);

        while (true){
            IO.println("Press-1 : Add Employee");
            IO.println("Press-2 : Read All Employee");
            IO.println("Press-3 : Delete Single Employee");
            IO.println("Press-4 : Update Single Employee");
            IO.println("Press-5 : Exit\n");

            IO.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 5){
                IO.println("Thank You for using my service!");
                break;
            }

            switch (choice){
                case 1:
                    IO.println("Add Employee\n");
                    break;
                case 2:
                    IO.println("Read All Employee\n");
                    break;
                case 3:
                    IO.println("Delete Single Employee\n");
                    break;
                case 4:
                    IO.println("Update Single Employee\n");
                    break;
                case 5:
                    IO.println("Exit");
                    break;
                default:
                    IO.println("Invalid Choice\n");
                    break;
            }//end of switch
        }//end of while
    }//end of main
}
