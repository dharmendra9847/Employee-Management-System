package com.start;

import com.controller.MyController;
import com.dto.EmployeeDTO;

import java.util.Scanner;

public class Launch {

    void main(){

        //CLIENT SIDE (CONSOLE BASED)
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

        //CREATE OBJECT
        MyController controller = new MyController();

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

                    IO.println("ENTER EID");
                    int eid = sc.nextInt();

                    IO.println("ENTER EAGE");
                    int eage = sc.nextInt();

                    IO.println("ENTER EPINCODE");
                    int epincode = sc.nextInt();

                    EmployeeDTO edto = new EmployeeDTO(eid, eage, epincode);
                    int res = controller.addEmployee(edto);
                    if (res == 100){
                        IO.println("Data Inserted Successfully!\n");
                    }else{
                        IO.println("Data Inserted Failed!\n");
                    }

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
