package functions;

import linkedList.LinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    LinkedList linkedList  =new LinkedList ();
    Scanner scanner = new Scanner ( System.in );
    ArrayList arrayList = new ArrayList<String> (  );

    //addContacts
    public void addContacts(LinkedList linkedList){
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
    }
}
