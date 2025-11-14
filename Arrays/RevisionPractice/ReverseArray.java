package Arrays.RevisionPractice;

public class ReverseArray{

  public static void main(String[]args)
  {

    int arr[]={ 2,4,6,8,10};
    reverseArray(arr);
  }
  public static void reverseArray(int []array)
  {
      int low=0;
      int high=array.length-1;

      while(low<high)
      {
        int temp=array[high];
        array[high]=array[low];
        array[low]=temp;

        low++;
        high--;

      }
      for(int i=0;i<array.length;i++)
      {
        System.out.print(array[i]+" ");
      }
  }
}