//Mason Hill
//Assignment1
//CMPT 370

//Needed for the random and Arrays.tostring
import java.util.*;

public class QuickSort{

 public static void main(String[] args) {

    


    //Initial array
    //int[] array = randomarray(selectrandomarraylength);
    //Finding the length of the array.

    int selectrandomarraylength = 40000;

    //Generating random numbers
    Random rand = new Random();

    //Setting the array length.
    int[] array = new int[selectrandomarraylength];

    //Filling the array with random values.
    for(int i = 0; i < array.length;i++){
      array[i]=rand.nextInt(((selectrandomarraylength*2)-0)+1)+0;
    }
   

  

      int count = array.length;


      long startTime = System.currentTimeMillis();
      //Calling the sorter function which will sort the numbers based on the input array

      sorter(array,0,count-1);

      long endTime = System.currentTimeMillis();

      long totalTime = endTime - startTime;
          printer(array,count);
      System.out.println("Execution time in milliseconds  : " + totalTime);
      //Printing the end result


  }



  public static void sorter(int[] array, int low, int high){

      if(low<high){
      //Finding what index to sort on.
      int arrayindex = indexer(array,low,high);

      //Calls the sorter method on the lower array and the higher array
      sorter(array,low,arrayindex-1);
      sorter(array,arrayindex+1,high);
    }
  }


  public static int indexer(int[] array, int low, int high){



    //Gets the last value for comparison
      int splitter = array[high];

      int y = (low-1);

      //Compares the value to every other value in the array
      for(int j = low;j<=high-1;j++){
        //Checking if the end value is bigger than the value we are looking at.
        if(splitter > array[j]){
          y++;
          //Calls the swapper function to swap the 2 selected positions on the array
          swap(array, y, j);

        }


      }



      swap(array,y+1,high);

      return(y+1);

  }




    //Method to swap two spots in an array
    public static void swap(int[] array, int i, int j){

      int holder = array[i];
      array[i] = array[j];
      array[j]=holder;
    }
    //Used to print the output of the array.
    public static void printer (int[] array, int size){
      for(int i=0; i<size; i++)
        System.out.print(array[i]+" ");

      System.out.println();

    }



}
