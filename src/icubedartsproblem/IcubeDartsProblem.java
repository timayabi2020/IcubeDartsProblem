/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icubedartsproblem;

/**
 *
 * @author Timothy.Wamalwa
 */
public class IcubeDartsProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        if(args==null){
            System.out.println("Please put x and y coordinates e.g 0 10 ");
        }else{
            if(args[0]==null || args[0].isEmpty()){
                System.out.println("Please put x and y coordinates e.g 0 10 ");
            }else if (args[1]==null || args[1].isEmpty()){
                System.out.println("Please put x and y coordinates e.g 0 10 ");
            }else{
                System.out.println("Score is " + score(Long.parseLong(args[0]), Long.parseLong(args[1])));
            }
        }
        }catch(Exception ex){
            System.out.println("Arguements missing. Please put x and y coordinates e.g 0 10 ");
        }
    }
    
     /**Defines upper and lower bounds for both x and y coordinates. */
     public static int score(Long x,Long y){
        
        /*First scenario
         Value in the x coordinate should satisfy the condition that:
         1. x is more than 5 and x is less than or requal to 10 and at all times the 
            value in the y coordinate should be less than or equal to 10
                                           OR 
         2. value in the y coordinate  is more than 5 and y is less than or requal to 10 and at all times the 
            value in the x coordinate should be less than or equal to 10.
         This will always give a score of 1
         */
        if((x>5 && x<=10 && y<=10) || (y>5 && y<=10 && x<=10)){
            return 1;
        }
         /*Second scenario
         Value in the x coordinate should satisfy the condition that:
         1. x is more than 1 and x is less than or requal to 5 and at all times the 
            value in the y coordinate should be less than or equal to 5
                                           OR 
         2. value in the y coordinate  is more than 1 and y is less than or requal to 5 and at all times the 
            value in the x coordinate should be less than or equal to 5.
         This will always give a score of 5
         */
        if((x>1 && x<=5 && y<=5) || (y>1 && y<=5 && x<=5)){
            return 5;
        }
        
           /*Third scenario
         Value in the x coordinate should satisfy the condition that:
         1. x is less than or requal to 1 and at all times the 
            value in the y coordinate should be less than or equal to 1
                                           OR 
         2. value in the y coordinate is less than or requal to 1 and at all times the 
            value in the x coordinate should be less than or equal to 1.
         This will always give a score of 10
         */
        if((x<=1 && y<=1) || (y<=1 && x<=1)){
            return 10;
        }
        return 0;
    }
}
