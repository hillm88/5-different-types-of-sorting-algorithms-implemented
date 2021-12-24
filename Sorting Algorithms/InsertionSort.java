//Mason Hill
//Assignment1
//CMPT 370

//Needed for the array
import java.util.*;

public class InsertionSort{


  //This method does all the work. It takes in an array from the main method and 
  //does the Insertion Sort on that array.
  public static void InsertionSort(int array[], int size){
    //initalizing the holder and j variables
    int holder;
    int j;
    //This for loop runs though every position in the array besides the first one
    //since the first one is always sorted.
    for(int i = 1; i < size;i++){
      //Setting the holder value to whatever the value of the array at position i is.
      holder = array[i];
      //j is the position of the value before i. This is important for checking the list of numbers against the one we are currently adding (i)
      j = i - 1;
      //This while loop is used to make sure that we don't go past the end of the array and the value we are looking at is less than the sorted array at position j
      while(j>=0 && holder<array[j]){
        //While the loop is going, we are moving all the values greater than the value we are looking at, further up the array to make space for the value we are looking at.
        array[j+1]=array[j];
        //Taking away 1 from j to take the current position in the sorted array, 1 lower.
        j--;
      }
      //When the loop is finished, the array at position j+1 will hold the value we are currently looking at with i at the start of the unsorted array.
      array[j+1]=holder;
      //Prints each step of the proccess 
      //System.out.println(Arrays.toString(array));
    }

  }

  public static int[] randomarray(int size){
    

    //Generating random numbers
    Random rand = new Random();

    //Setting the array length.
    int[] randomarray = new int[size];

    //Filling the array with random values.
    for(int i = 0; i < randomarray.length;i++){
      randomarray[i]=rand.nextInt(((size*2)-0)+1)+0;
    }
    return randomarray;
  }



  //Main method
  public static void main(String[] args){

    //Initial array
    //int[] tester = randomarray(selectrandomarraylength);
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
   


    int size = array.length;

    //Making a new variable of type InsertionSort
    InsertionSort Sort = new InsertionSort();


    long startTime = System.currentTimeMillis();
    //Calling the sorter function which will sort the numbers based on the input array
    //Calling the insertion sort method to do the sorting and storing it in Sort
    Sort.InsertionSort(array,size);
    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println(Arrays.toString(array));
    System.out.println("Execution time in milliseconds  : " + totalTime);
    //Printing the end result

    



 
  }



}

