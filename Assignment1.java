import java.util.*;

public class Assignment1 
{
    public static void main(String[] args) 
    { /* Problem number 1 */
        System.out.println(" MMMMMM      MMMMMM               GGGGGGGGGG");
        System.out.println(" MMMMMMM    MMMMMMM             GGG ");
        System.out.println(" MMM MMMM  MMMM MMM             GGG");
        System.out.println(" MMM  MMMM MMMM MMM             GGG");
        System.out.println(" MMM   MMMMMM   MMM             GGG      GGGGGG ");
        System.out.println(" MMM    MMMM    MMM             GGG         GGG ");
        System.out.println("                                GGG         GGG");
        System.out.println("                                 GGGGGGGGGGG");


       /* Problem number 2 */
       Scanner SC = new Scanner(System.in);
       System.out.println("Enter a number in Fahrenheit: ");
       int f = SC.nextInt();
       System.out.println(f);
       int c = (f - 32) * 5/9;
       System.out.println(c);





       /*Problem number 3 */
       Scanner SC2 = new Scanner(System.in);
       System.out.println("Enter a 5 letter word: ");
       String word = SC2.nextLine();
       StringBuilder SB = new StringBuilder();
       SB.append(word);



       System.out.println(word);
       SB.reverse();
       System.out.println(SB);
       SB.deleteCharAt(0);
       SB.deleteCharAt(3);
       System.out.println(SB);





     //*Problem 4 */
     Random rand = new Random();
     System.out.println();
     int upperbound = 16384;
     int r = rand.nextInt(upperbound);
     System.out.println(upperbound);
     System.out.println(r);




     //*Problem 5 */
     System.out.println(c);
     System.out.println(r);
     














    } 
    
    
         
                

    
    
}


                                  




