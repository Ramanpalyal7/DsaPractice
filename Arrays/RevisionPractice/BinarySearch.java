package Arrays.RevisionPractice;

public class BinarySearch{

  public static void main(String[]args)
  {
    int arr[]={2,4,6,8,10,12,14};
    int key=10;

  int value= binarySearch(key,arr);
  if(value==-1)
  {
    System.out.println("Element is not present ");
  }
  else{
    System.out.println("Element is present at index : "+value);
  }

  }
  public static int binarySearch(int key,int arr[])
  {
    int low=0;
    int high=arr.length-1;
    while(low<=high)
    {

      int mid=(low+high)/2;

        if(arr[mid]==key)
        {
          return mid;
        }
        else if(arr[mid]>key)
        {
          high=mid-1;
        }
        else{

          low=mid+1;
        }
    }
    return -1;
  }

} 