/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.GuessTheNumber;

    public class Player{
    int number=0;//where the guess goes
    
    public void guess(){
       number=(int)(Math.random()*10);
        System.out.println("I am a guessing " + number);
        
    }
}