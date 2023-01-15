import java.util.Scanner;
 public class Main {
     public static void main(String[] args)
     {
         int[] array = new int[200000000];
         for(int i = 0; i < array.length; i++)
         {
             array[i] = i+1;
         }
         System.out.print("Enter any number from 1 to 100: ");
         Scanner in = new Scanner(System.in);
         int enterNumber = in.nextInt();
         int low = array[0];
         int hight = array[array.length-1];
         int counter = 0;

         while(low <= hight)
         {
             int mid = (int) Math.floor((low + hight)/2);
             int guess = array[mid-1];
             if(enterNumber == guess)
             {
                 counter += 1;
                 System.out.println(mid + " " + counter);
                 break;
             } else if (guess > enterNumber && enterNumber >= low) {
                 hight = mid - 1;
                 counter += 1;
             } else if (guess < enterNumber && enterNumber <= hight) {
                 low = mid + 1;
                 counter += 1;
             } else if (enterNumber < low || enterNumber > hight) {
                 System.out.println("this array hasn't this number");
                 break;
             } else{
                 System.out.println("this array hasn't this number");
                 break;
             }
         }
         for(int i = 0; i < array.length; i++)
         {
             if(array[i] == enterNumber)
             {
                 counter += 1;
                 System.out.println(enterNumber);
             }
         }
     }
 }
