package Arrays.FoundationAlgorithms.Sorting;
public class BubbleSort{

  public static void main(String[] args) {
  
    int [] arr={3,5,2,1,8};
    sortArray(arr);
    printArray(arr);


  }

  public static void sortArray(int []arr)
  {

    for(int turn=0;turn<arr.length-1;turn++)
    {

      for(int j=0;j<arr.length-1-turn;j++)
      
      {
//pointer ones -j element is greater than adjacent element then swap
        if(arr[j]>arr[j+1])
        {

          //Swap it
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }

      }
    }
  }
  public static void printArray(int []arr)
  {
    //
    System.out.println("Sorted array with Bubble Sort");
    for(int i:arr)
    {
      System.out.print(i+" ");
    }

  }


}