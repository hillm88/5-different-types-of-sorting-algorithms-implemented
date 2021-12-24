//Mason Hill
//Assignment1
//CMPT 370


import java.util.*;
public class BubbleSort{

  public static void main(String[] args){

 
    int selectrandomarraylength = 40000;

    //Generating random numbers
    Random rand = new Random();

    //Setting the array length.
    int[] array = new int[selectrandomarraylength];

    //Filling the array with random values.
    for(int i = 0; i < array.length;i++){
      array[i]=rand.nextInt(((selectrandomarraylength*2)-0)+1)+0;
    }
   


    //Initial array
    //int[] tester = randomarray(selectrandomarraylength);
    //Finding the length of the array.
  

    //Making our array.
   
    
    int size = array.length;

    //Start the timer
    long startTime = System.currentTimeMillis();
    //Calls editor function which does everything, and it takes in the array and size of the array.
    editor(array,size);
    //End the timer
    long endTime = System.currentTimeMillis();
    //Finds total time
    long totalTime = endTime - startTime;
    System.out.println(Arrays.toString(array));
    System.out.println("Execution time in milliseconds  : " + totalTime);
    //Printing the end result



  }

  //This method takes an array, and the size of that array.
  public static void editor(int[] array,int size){
    //Setting j equal to 1 so we can reference the second array position and basically stay a position further than i.
    int j=1;
    //For loop to ensure the sorter continues to do passes through the array
    for(int i=0;i<size-1;i++){
      //Checking if the spot ahead of our current one is a smaller value than our current one 
      if(array[i]>array[j]){
          //This is used to look at the position ahead of our current one

          int counter=1;
          //This is the main loop that does the swapping by starting at the first array position and checking the numbers against the next one in the array.
          for(int k=0;k<size-1;k++){
            //If the current position is bigger than the next one, swap the two values
            if(array[k]>array[counter]){
              swap(array,k,counter);
            }
            //Going to the next position ahead of the current array one.
            counter++;
            
          }
        editor(array,size);
      }
      j++;
    }

  }

  public static void swap(int[] array, int i, int j){

    int holder = array[i];
    array[i] = array[j];
    array[j]=holder;
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

}





