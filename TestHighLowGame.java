
package JPRG;
import javax.swing.JOptionPane;

public class TestHighLowGame {
    public static void main(String[] args){
        int players = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of players.","Input",JOptionPane.QUESTION_MESSAGE));
        int score[]=new int[players];
        String name[] = new String[players];
        HighLowGame[] playertypes = new HighLowGame[players];
        
        for ( int i =0; i< players; i++){
            playertypes[i] = new HighLowGame();
            name[i] = playertypes[i].getName();
            JOptionPane.showMessageDialog(null, "Player "+(i+1)+" " + name[i]+" Start","Message",JOptionPane.INFORMATION_MESSAGE);
            playertypes[i].generateRandomNumber();
            int count = 0;
            do {
                count += 1;
                playertypes[i].getUserInput();
                playertypes[i].getResult();
            } while (playertypes[i].gameEnded() == false);
            score[i] = count;
        }
        
        System.out.println("Leaderboard");
        int highest = 0;
        int lowest = 1000;
        int highestplayer = 0;
        int lowestplayer = 0;
        for ( int i =0; i< score.length; i++){
            System.out.println("Player "+(i+1)+" " + name[i]+" has a score of "+score[i]);
            if (highest < score[i]){
                highest = score[i];
                highestplayer = i;
            }
            if (lowest > score[i]){
                lowest = score[i];
                lowestplayer = i;
            }
        }
        System.out.println("Highest score by player "+(highestplayer +1)+" " + name[highestplayer]+" with a score of "+highest);
        System.out.println("Lowest score by player "+(lowestplayer +1)+" " + name[lowestplayer]+" with a score of "+lowest);

        System.out.println("Ended");
        
        
    }
}
