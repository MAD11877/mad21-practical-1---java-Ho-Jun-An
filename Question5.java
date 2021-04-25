import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner amtObj = new Scanner(System.in);
    System.out.println("Enter number of integers you will enter:");
    int amt = amtObj.nextInt();

    ArrayList<Integer> numList = new ArrayList<>();

    for(int i = amt; i > 0; i--){
      Scanner numObj = new Scanner(System.in);
      System.out.println("Enter number:");
      int num = numObj.nextInt();

      numList.add(num);
    }

    int popular = numList.get(0);
    int popularCount = 0;

    for(int element : numList){
      int count = 0;

      for(int check : numList){
        if(check == element){
          count++;
        }
      }

      if(count > popularCount){
        popular = element;
        popularCount = count;
      }
    }

    System.out.println("The mode is: " + popular);
  }
}
