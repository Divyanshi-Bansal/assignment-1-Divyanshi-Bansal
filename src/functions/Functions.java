package functions;

import linkedList.LinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    LinkedList linkedList  =new LinkedList ();
    Scanner scanner = new Scanner ( System.in );


    //addContacts
    public void addContacts(LinkedList linkedList){
        ArrayList arrayList = new ArrayList<String> (  );
        System.out.println ("Enter your first name.");
        String firstName = scanner.nextLine ();
        System.out.println ("Enter your last name.");
        String lastName = scanner.nextLine ();
        System.out.println ("Enter your contact no.");
        String contact = scanner.nextLine ();
        arrayList.add ( contact );
        System.out.println ("enter your email address.");
        String email = scanner.nextLine ();
        linkedList.addLast ( new Person (firstName,lastName,arrayList,email));
        System.out.println (firstName+" "+lastName+ "  has been added.");
    }

    public void showContacts(LinkedList linkedList){
//        System.out.println ("Contact List--->");
        linkedList.display ();
    }

    public void searchContact(LinkedList linkedList){
        System.out.println ("Enter First Name:");
        String name = scanner.nextLine ();
        System.out.println ("Email.?");
        String email = scanner.nextLine ();
        if(linkedList.indexOf (name,email)>=0){
            System.out.println ("Match Found!! Hurray!");
            linkedList.getNode (linkedList.indexOf (name,email));
        }
        else{
            System.out.println ("Oops not found! Try again.");
        }

    }

    public void deleteContact(LinkedList linkedList){
        linkedList.displayOne();
        System.out.println ("Choose the no. against the contact you wanna delete..");
        int pos = scanner.nextInt ();
        scanner.nextLine ();
        linkedList.deleteNode (pos);
        System.out.println ("congooo!! your contact delete.");
    }

    //public void exit(){}
}
