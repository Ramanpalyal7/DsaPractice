package Arrays.Practice;

public class MaxSubarraySum {
  
  public static void main(String[] args) {
    
    // int []arr={1,-2,6,-1,3};
    int []arr={2,4,6,8,10};
    MaxSubarraySums(arr);
  }
  public static void MaxSubarraySums(int []arr)
  {

    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
      int sum=0;
      sum+=arr[i];
      if(sum>max)
      {
        max=sum;
      }

      for(int j=i+1;j<arr.length;j++)
      {

        sum=0;

        for(int k=i;k<=j;k++)
        {
             sum+=arr[k];



        }
        if(sum>max)
        {
          max=sum;
        }
      }
    }
    System.out.println("Max Sub-Array Sum is : "+max);
  }
}
