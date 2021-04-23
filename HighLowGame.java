/*
 * Class: DIT/FT/1B/03
 * Admission Number: p2004051
 * Name: Amanda Quek Yan Ling
 */

package JPRG;
import javax.swing.JOptionPane;
 
public class HighLowGame {
    private int randomNumber;
    private int guess;
    
    public String getName(){
        String name = JOptionPane.showInputDialog(null,"Enter your name.","Name",JOptionPane.QUESTION_MESSAGE);
        return name;
    }
    
    public int generateRandomNumber(){
        randomNumber =  0+(int)(Math.random()*99-0+1);
        return randomNumber;
    }
    public int getUserInput(){
        guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your guess.","Input",JOptionPane.QUESTION_MESSAGE));
        return guess;
    }
    public void getResult(){
        if (guess > randomNumber){
            JOptionPane.showMessageDialog(null, guess+" is more than the Magic Number","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(guess < randomNumber){
            JOptionPane.showMessageDialog(null, guess+" is less than the Magic Number","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"You are right!","Message",JOptionPane.INFORMATION_MESSAGE);
        }

    }
    public boolean gameEnded(){
        if (guess > randomNumber || guess < randomNumber){
            return false;
        }
        else{
            return true;
        }
    }
}

