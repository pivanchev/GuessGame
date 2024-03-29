/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.GuessTheNumber;


 public class GuessGame{
    Player p1;//3 instance variable for 3 Player objects
    Player p2;
    Player p3;
    
        public void startGame(){
        p1=new Player();//create 3 Player Objects and assigne them to the three instance variables
        p2=new Player();
        p3=new Player();
        
        int guessp1=0;//declare 3 variables to hold the 3 guesses the Player make       
        int guessp2=0;
        int guessp3=0;
        
        boolean p1isRight=false;//declare 3 variables to hold true or false based on the player answer
        boolean p2isRight=false;
        boolean p3isRight=false;
        
        int targetNumber=((int)(Math.random()*10));//make a target number that the players have to guess
        System.out.println("I am thinkig of a number between 0 and 9...");
        
        while(true){
            System.out.println("Number to guess is " + targetNumber );
            p1.guess();//call each player guess method
            p2.guess();
            p3.guess();
            
            guessp1=p1.number;
            System.out.println("Player 1 guessed " + guessp1);
            
            guessp2=p2.number;
            System.out.println("Player 2 guessed " + guessp2);   //gets each player guess to see if it matches the target number
            
            guessp3=p3.number;
            System.out.println("Player 3 guessed " + guessp3);
            
            if(guessp1==targetNumber){
                p1isRight=true;              
            }
            if(guessp2==targetNumber){
                p2isRight=true;  
            }
             if(guessp3==targetNumber){
                p3isRight=true;  
            }

            if(p1isRight||p2isRight||p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player 1 got it right? " + p1isRight);
                System.out.println("Player 2 got it right? " + p2isRight);
                System.out.println("Player 3 got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            }else {
                System.out.println("Players will have to try again");
            }
        
        }
    
    }
 }
