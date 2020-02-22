package contactList;

import java.util.Scanner;

public class ContactList {
    private Node First;
    private Node Last;
    private class Node{
        private int data;
        private Node next;

        public Node(int item){
            this.data = item;
        }
    }
    Scanner sc = new Scanner ( System.in );

    public void addNewContact(){
        System.out.println ("enter your name");
        System.out.println ("first name:"+sc.nextLine());
        System.out.println ("last name:"+sc.nextLine ());
        System.out.println ("contact no.:"+sc.nextLong());
        System.out.println ("would you like to add another contact number:Y or N");
        String C = sc.nextLine();
        if(C=="Y"){
            System.out.println ("contact no.:"+sc.nextLong());
        }
        System.out.println ("would you like to add another contact number:Y or N");
        String C1 = sc.nextLine();
        if(C1=="Y"){
            System.out.println ("contact no.:"+sc.nextLong());
        }
        System.out.println ("would you like to add email address ? :Y or N");
        String C2 = sc.nextLine();
        if(C2=="Y"){
            System.out.println ("Email Address:"+sc.nextLong());
        }
    }
}
