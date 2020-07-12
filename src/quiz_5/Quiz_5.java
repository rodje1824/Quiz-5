/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_5;

import quiz_5.EmptyTransaction;
import doublylinkedlist.DNode;
/**
/**
 *
 * @author DOTR
 */
public class Quiz_5 {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Persona s1= new Persona(11,"Alonto");
        Persona s2= new Persona(23,"Ray");
        Persona s3= new Persona(39,"Lacson");
        Persona s4= new Persona(40,"Perez");
        Persona s5= new Persona(54,"Dizon"); &*/
        
        DNode<String> transac1 = new DNode(null,"Nezuko", null);
        DNode<String> transac2 = new DNode(null,"Tanjiro", null);
        DNode<String> transac3 = new DNode(null,"Kusina", null);
        DNode<String> transac4 = new DNode(null,"Mushimoto", null);
        DNode<String> transac5 = new DNode(null,"Kagami", null);
        
        
        Register<DNode> transaction = new Register<>();
        
        try{
        transaction.addLast(transac1);
        transaction.addLast(transac2);
        transaction.addFirst(transac3);
        transaction.addFirst(transac4);
        transaction.addFirst(transac5);
        
         System.out.println("List of Transactions: \n");
         transaction.showTransaction();
    
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
    
          System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
           System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          
          } catch (EmptyTransaction ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
