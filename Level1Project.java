/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1project;

/**
 *
 * @author gasela
 */
public class Level1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("===================Task 1 ==================");
           System.out.println("This two 73,5 number contains 3 "+checkNumberContain_3(73,5));
        
           System.out.println("===================Task 2 ==================");
        System.out.println("check  two 73,5 number have  65 "+checkNumberContain_65(73,56));
    }
   static boolean checkNumberContain_3(int num1, int num2)
            {
                int number=0;
                
                int sum=num1+num2;
                  
                    
                while(sum>0){
                    
                     number=sum%10;
                   
                     
                     if( num1==3 || num2==3 && number==3)
                         return true;
               
                     
                    sum =sum/10;
            
                }
                
                return false;
                
            }


static boolean checkNumberContain_65(int n1, int n2){
                 
                
                int sum=n1+n2;
             
             
                     if( n1==65 || n2==65 && sum==65)
                         return true;
                
                return false;
                
                
            }   
}
