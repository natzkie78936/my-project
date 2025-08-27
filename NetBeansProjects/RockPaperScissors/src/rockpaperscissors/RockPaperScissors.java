    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    package rockpaperscissors;

    import javax.swing.JOptionPane;
    import java.util.Random;

    public class RockPaperScissors {

        public static void main(String[] args) {

            String[] options = {"Rock", "Paper", "Scissors"};
            Random random = new Random();

            int selection = JOptionPane.showConfirmDialog(null, "Do you want to play my game?", "Play Again", JOptionPane.YES_NO_OPTION);
                if (selection == JOptionPane.NO_OPTION) {
                   JOptionPane.showMessageDialog(null, "Ok");
                   
                }
                else
                {
                                   
                boolean Repeat = false;
            while (!Repeat) {

                String userChoice = (String) JOptionPane.showInputDialog(null, "Choose one: Rock, Paper, or Scissors?",
                        "Rock-Paper-Scissors", JOptionPane.PLAIN_MESSAGE, null,options, options[0]);

                 if (userChoice == null) {  
                JOptionPane.showMessageDialog(null, "Thank you for playing our game!");
                break;
            }
                
                int computerChoiceIndex = random.nextInt(options.length);
                String computerChoice = options[computerChoiceIndex];


                String winner;
                if (userChoice.equals(computerChoice)) {
                    winner = "Tie";
                } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors"))
                        || (userChoice.equals("Paper") && computerChoice.equals("Rock"))
                        || (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
                    winner = "You win!";
                } else {
                    winner = "Computer wins!";
                }


                JOptionPane.showMessageDialog(null, "You chose " + userChoice + ".\n" +
                        "Computer chose " + computerChoice + ".\n" + winner);


                int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION) 
                {
                    Repeat = true;
                    JOptionPane.showMessageDialog(null,"Thank you for playing our game!");
                }
                    
            }
            }
        }
    
    }
