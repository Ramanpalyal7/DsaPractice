package Arrays.FoundationAlgorithms.Sorting;

public class SelectinSort {
  

  public static void main(String[] args) {
    
    int []arr={2,7,1,5,3,5,4};

    sortArray(arr);
    printArray(arr);

  }
  

  public static void sortArray(int []arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      int minIndex=i;
      for(int j=i+1;j<arr.length;j++)
      {
// To find the index of minimum value element in array.
        if(arr[j]<arr[minIndex])
        {
          minIndex=j;
        }
      }
      //Swappping
      int temp=arr[minIndex];
      arr[minIndex]=arr[i];
      arr[i]=temp;


    }

  }
  public static void printArray(int []arr)
  {
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }


}
