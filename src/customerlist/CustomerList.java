/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customerlist;

import java.io.*; 
import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class CustomerList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int amountOfPeopleint=0;
        boolean noError = true;
       
      String amountOfPeople = JOptionPane.showInputDialog("Please enter the amount of people: ");   
      
     while(noError == true)  {
      try{  
          amountOfPeopleint=  Integer.parseInt(amountOfPeople);
          noError = false;
      }catch (NumberFormatException nfe){
          System.out.println("You did not enter an Integer");
          System.out.println(nfe);
           noError=true;
      }
     }
    for(int i=0; i<amountOfPeopleint; i++ ){    
      String name = JOptionPane.showInputDialog("Please enter your name: ");
      String address = JOptionPane.showInputDialog("Please enter your address: ");
      String city= JOptionPane.showInputDialog("Please enter your city of residance: ");
      String postalCode   = JOptionPane.showInputDialog("Please enter your postal code (No spaces): ");
      String province   = JOptionPane.showInputDialog("Please enter your province of residance: ");
    
      int fun =7;
        int win =6;
    for(int j=0; j<3; j++){
      win--;
      win--;
      
     char postal = postalCode.charAt(win);
     if(Character.isLetter(postal)){
     }else{
         JOptionPane.showMessageDialog(null, "Please enter a correct postalcode");
         System.exit(1);
        
     }
     System.out.println(postal);
    }
     for(int j=0; j<3; j++){
      fun--;
      fun--;
      
     char postal = postalCode.charAt(fun);
     if(Character.isDigit(postal)){
     }else{
         JOptionPane.showMessageDialog(null, "Please enter a correct postalcode");
         System.exit(1);
        
     }
     System.out.println(postal);
    }
    
      String fileOut = name + "\n";
            fileOut  += address + "\n";
            fileOut   += city + "\n";
            fileOut   += postalCode + "\n";
            fileOut   += province + "\n";
            fileOut += "--------------------";
      PrintWriter fileout = new PrintWriter(new FileWriter(
      "info.txt",true));
      System.out.println(fileOut);
      fileout.println(fileOut);
       fileout.close();
    }
    
    
    } 

}