package Main;

import person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Welcome to Divyanshi's Contact List App");
        System.out.println ("Press 1 to add a new contact");
        System.out.println ("Press 2 to view all contacts");
        System.out.println ("Press 3 to search for a contact");
        System.out.println ("Press 4 to delete a contact");
        System.out.println ("Press 5 to exit program");

        String choice = scanner.nextLine ();

        switch(choice){
            case "1":// addContacts()
                break;
            case "2":// viewContacts()
                break;
            case "3"://search()
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
