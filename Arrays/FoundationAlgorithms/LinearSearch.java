package Arrays.FoundationAlgorithms;

public class LinearSearch {

  public static void main(String[] args) {
    
    int []arr={2,45,24,1,40,22,54};
    int target=20;
    int value=linearSearch(arr, target);
    if(value==-1)
    {
      System.out.println("Target Not Present in the array");
    }
    else
    {
      System.out.println("Target element found at "+value);
    }
  }
  

  public static int linearSearch(int[] arr,int target)
  {

    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==target)
      {
        return i;
      }
    }
    return -1;
  }

}
