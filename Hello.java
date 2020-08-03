
public class Hello {

  public static void main() {
       String word;
       char letter;
       int tries = 7;
       int check = 0;
       boolean won = false;
       boolean found = false;
    //HangMan
    //Pick a word
       System.out.println("Welcome to HangMan!");
       System.out.println("Player 1: pick a word");
       word = Zystem.ReadWord();
    //Draw dashes
    //1. find number of letters in word
       int totalLength = word.length( );
       //System.out.println("Your word is " + totalLength +  " letters long");
    //2. add hangman drawing
    //3. print "_" that number of times
       int length = 0;
    //creating string that holds dashes
     length = 0;
      String soFar = "";
       while (length < totalLength) {
           soFar += "_";
           length = length + 1;
        }
       System.out.println(soFar);
    //4. Guess a letter
    //a. if the letter is correct, replace the dashes with the letter
     while (tries > 0 && won == false){
         //how do you know when you have won?
     char[] chars = soFar.toCharArray();
     check = 0;
     System.out.println(" ");
     System.out.println("Player 2: guess a letter");
     letter = Zystem.ReadLetter();
     found = false;
     while (check <= (totalLength-1)) {
         if (letter == word.charAt(check)) {
          found = true;
          System.out.println(letter + " has a match at position " + check);
          //if match is found, replace the dash at that same location in the string soFar with the guessed letter
          //that location is the carriable check variable
          chars[check] = letter;
         }
         check++;
     }
     soFar = String.valueOf(chars);
     System.out.println(soFar);
    //b. if the letter is wrong, draw a body part 
        if (found == false) {
         tries = tries - 1;
         System.out.println("Wrong guess, try again");
         System.out.println("You have " + tries + " tries remaining");
        }
    //5. end of game
    int l = 0;
    int count = 0;
    while(l < totalLength) {
        if (chars [l] == '_') {
        count = count + 1;
    }
    l = l + 1;
}
if (count == 0) {
    System.out.println("Player 2 you won! Player 1 you lost!");
    won = true;
}
if (tries == 0) {
    System.out.println("Player 2 you lost! Player 2 you won!");
}
    //a. if the person is hanged, game over. (out of tries).
     //System.out.println("Game Over");
    //b. if no dashes are left, game won.
     //System.out.println("You Won!");

      
} // ~main 
} // ~Hello
} 