//Mason Hill
//Assignment1
//CMPT 370

//Needed for the random and Arrays.tostring
import java.util.*;

public class MergeSort{






    //This method merges all the single number arrays together.
  public static void merger(int[] array, int half, int low, int high)
  {
    //The two temp array values hold the size that the lower and higher array are.
    int temparray1 = half - low + 1;
    int temparray2 = high - half;

    //This creates two arrays that are used to hold the values of the original array that are higher and lower than the midpoint.
    int LowArray[] = new int [temparray1];
    int HighArray[] = new int [temparray2];

    //This loop will copy the data from below the midpoint of the array, into the lower array value holder.
    for (int i = 0; i < temparray1; i++)
        LowArray[i] = array[low + i];
    //This loop will copy the data from above the midpoint of the array, into the higher array value holder.
    for (int j = 0; j < temparray2; j++)
        //The original array is being searched starting at 1 position above the midpoint.
        HighArray[j] = array[1 + half + j];


    //These two values are counter values. x is for the lower array and y is for the upper array.
    int x = 0;
    int y = 0;
    //This value is a counter for the main array.
    int z = low;

    //The condition for this while loop checks that the x and y counters are not greater than the sizes of the lower and higher arrays.
    while (x < temparray1 && y < temparray2) {
        //This if statment checks that values put in the lower array are less than those of the higher array
        //If they are not, they the higher array at the current position has its value inserted back into the main array
        if (LowArray[x] <= HighArray[y]) {
            //Inserting the value at the current counter position for the lower array into the main array.
            array[z] = LowArray[x];
            //Incrementing the counter for the lower array
            x++;
        }
        else {
            //Inserting the value of the higher array if the lower array at its current position is greater than it.
            array[z] = HighArray[y];
            //Incrementing the higher counter.
            y++;
        }
        //Incrementing the main array counter.
        z++;
    }
    
    //This while loop puts any remaining values left in the lower array, into the main array if the above while loop has been broken.
    while (x < temparray1) {
        //Inserting the values into the main array
        array[z] = LowArray[x];
        //Incrementing counters
        x++;
        z++;
    }

    //This while loop puts any remaining values left in the higher array, into the main array if the above while loop has been broken.
    while (y < temparray2) {
        //Inserting the values into the main array
        array[z] = HighArray[y];
        //Incrementing counters.
        y++;
        z++;
    }
    
}
  


  

  public static void sorter(int[] array, int low, int high){

    //This checks that the array has been exhausted of numbers.
    if(low < high){
        //This finds the halfway point in the array
        int halfway = low+(high-low)/2;
    
        //This sorts the numbers that are less than the halfway point of the current array
        sorter(array,low,halfway);
        //This sorts the numbers that are greater than the halfway point of the current array.
        sorter(array,halfway+1,high);
        //This does the merging of the singular number arrays into a whole main array.
        merger(array,halfway,low,high);
    }


  }



 

    public static void main(String[] args) {

  
        /*int array[] = new int[40001];
        int k = 40000;
        for(int i = 0; i<=40000;i++){
          array[i]=k;
          k--;
        }*/
        int selectrandomarraylength = 40000;

    //Generating random numbers
    Random rand = new Random();

    //Setting the array length.
    int[] array = new int[selectrandomarraylength];

    //Filling the array with random values.
    for(int i = 0; i < array.length;i++){
      array[i]=rand.nextInt(((selectrandomarraylength*2)-0)+1)+0;
    }
   
 
      
        //Finding the length of the array.
        int size = array.length;
         
    
          long startTime = System.currentTimeMillis();
          //Calling the sorter function which will sort the numbers based on the input array along with its size.
    
         sorter(array,0,size-1);
    
          long endTime = System.currentTimeMillis();
    
          long totalTime = endTime - startTime;
          
        System.out.println(Arrays.toString(array));
          System.out.println("Execution time in milliseconds  : " + totalTime);
          //Printing the end result
    
    
      }



}

