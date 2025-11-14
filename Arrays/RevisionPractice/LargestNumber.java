package Arrays.RevisionPractice;

public class LargestNumber{

  public static void main(String[]args)
  {
    int arr[]={2,97,85,64,9,88};

    largestNumber(arr);

  }
  public static void largestNumber(int array[])
  {

    int largestNum=array[0];

    for(int i=1;i<array.length;i++)
    {
      if(array[i]>=largestNum)
      {
        largestNum=array[i];
      }
    }
    System.out.println("Largest Number is : "+largestNum);

  }
}