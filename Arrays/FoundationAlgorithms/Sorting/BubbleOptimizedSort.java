package Arrays.FoundationAlgorithms.Sorting;

public class BubbleOptimizedSort {
  
  public static void main(String[] args) {
    int []arr={3,8,7,2,1};
 sortArray(arr);
 printArray(arr);

  }


  public static void sortArray(int []arr)
  {

    for(int turn=0;turn<arr.length-1;turn++)
    {

      boolean swapped=false;

      for(int j=0;j<arr.length-1-turn;j++)
      {
        if(arr[j]>arr[j+1])
        {
          //swap it
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped=true;
        }
      }


      if(!swapped)
      {
        break;
      }


    }
  }
  public static void printArray(int []arr)
  {
    System.out.println("Sorted array");

    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }

}
