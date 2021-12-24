//Mason Hill
//Assignment1
//CMPT 370

//Needed for the random and Arrays.tostring
import java.util.*;

public class SelectionSort{
  
 public static void main(String[] args) {


   

        

    //An array to store a value when swapping numbers in the main array.
    int temparray[] = new int[]{0};

   

    //Gets the first value for comparison
    /*for(int i=0;i<array.length;i++){
      int smallest = i;

      //Compares the value to every other value in the array
      for(int j = i+1;j<array.length;j++){
        if(array[j]<array[smallest])
        smallest=j;
      }

      //storing the smallest value in a temporary array.
      temparray[0] = array[smallest];
      //Making the array at the smallest values location = to the array at the position we are currently looking at.
      array[smallest] = array[i];
      //Making the array at the position we are currently looking at into the smallest value.
      array[i]=temparray[0];
      System.out.println(Arrays.toString(array));
    }
*/

    //Random array part
    // use this value to select the length of the random array
    int selectrandomarraylength = 40000;

    //Generating random numbers
    Random rand = new Random();

    //Setting the array length.
    int[] array = new int[selectrandomarraylength];

    //Filling the array with random values.
    for(int i = 0; i < array.length;i++){
      array[i]=rand.nextInt(((selectrandomarraylength*2)-0)+1)+0;
    }
   
    long startTime = System.currentTimeMillis();
    //The same code basically as the above code. If I had to do a 3rd version of this I would make it a method and call it as such.
    for(int i=0;i<array.length;i++){
      int smallest = i;
      for(int j = i+1;j<array.length;j++){
        if(array[j]<array[smallest])
        smallest=j;
      }
      temparray[0] = array[smallest];
      array[smallest] = array[i];
      array[i]=temparray[0];
      
    }
    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
  
  
    System.out.println(Arrays.toString(array));
    System.out.println("Execution time in milliseconds  : " + totalTime);
  
  
   
  }

 

 
  
  

}
