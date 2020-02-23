package Main;

import functions.Functions;
import linkedList.LinkedList;
import person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions ();
        LinkedList linkedList = new LinkedList ();
        Scanner scanner = new Scanner(System.in);

        String choice ="0";
        while(choice!="5"){
            System.out.println ();
            System.out.println ("Welcome to Divyanshi's Contact List App");
            System.out.println ("Press 1 to add a new contact");
            System.out.println ("Press 2 to view all contacts");
            System.out.println ("Press 3 to search for a contact");
            System.out.println ("Press 4 to delete a contact");
            System.out.println ("Press 5 to exit program");

             choice = scanner.nextLine ();

            switch(choice){
                case "1":functions.addContacts (linkedList);
                    break;
                case "2":functions.showContacts ( linkedList );
                    break;
                case "3":functions.searchContact ( linkedList );
                    break;
                case "4"://delete
                    break;
                case "5"://exit
                    break;
                default:
                    //invalid choice
            }

        }

    }
}
