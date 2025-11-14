package Arrays.FoundationAlgorithms.Searching;

public class BinarySearch {
  
  public static void main(String[] args) {
    

    int []nums={11,22,33,44,55,88,99};
    int key=88;
    int value=binarySearch(nums, key);
    if(value==-1)
    {
      System.out.println("Element not found ");
    }
    else{
      System.out.println("Element found at index "+value);
    }

  }

  public static int binarySearch(int [] nums,int key)
  {

    int start=0;
    int end=nums.length-1;
     
    while (start<=end) {

      int mid=(start+end)/2;

      if(nums[mid]==key)
      {
        return mid;
      }
      if(nums[mid]>key)
      {
        end=mid-1;
      
      }
      else{
        start=mid+1;
      }

      
    }
    return -1;
  }

}
