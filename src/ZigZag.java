
import java.util.Scanner;

/**
 *Create by luca on 30-Jun-2016
 *
 */
public class ZigZag {
      
     private int[] myArray = new int[5];

      public ZigZag(int[] myArray) {
            this.myArray = myArray;
      }

      public ZigZag() {
      }
     
     public void print(int[] array){
           for (int i = 0; i < array.length; i++) {
                 System.out.println("Al numero "+ i +" abbiamo:"+array[i]);
           }
     }
     
     public void populate(int[] array){
           Scanner read = new Scanner(System.in);
           for (int i = 0; i < 5; i++) {
                 System.out.println("Inserisci il numero all'elemento "+(i+1));
                 array[i] = read.nextInt();
           }
     }
     
     public void overTurnArray(int[] arrayInput){
           int[] copiedArray = new int[arrayInput.length];
           int j = (arrayInput.length - 1);
           for (int i = 0; i < arrayInput.length; i++) {
                 copiedArray[i] = arrayInput[j];
                 j--;
           }
          print(copiedArray);
     }
     
     public void execute(){
           populate(this.myArray);
           overTurnArray(this.myArray);
     }

}
