package Arrays.RevisionPractice;

public class LargestNumber2{


    public static void main(String[]args)
    {
      int array[]={24,52,14,28,87,37,-3,-22};

      largestNum(array);

    }

    public static void largestNum(int arr[])
    {

      int largestNumber=Integer.MIN_VALUE;
      int MinimumNumber=Integer.MAX_VALUE;

      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>largestNumber)
        {
          largestNumber=arr[i];
        }
        if(arr[i]<MinimumNumber)
        {
          MinimumNumber=arr[i];
        }
      }

      System.out.println("Largest Number is : "+largestNumber);
      System.out.println("Minimum Number is : "+MinimumNumber);
    }
}