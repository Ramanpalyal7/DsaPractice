package Arrays.Practice;

public class PrefixSumArray {
  
  public static void main(String[] args) {
    
    int[] arr={1,-2,6,-1,3};

    prefixArray(arr);

  }

  public static void prefixArray(int [] arr)
  {
    int maxSum=Integer.MIN_VALUE;

    int [] prefix=new int[arr.length];

    prefix[0]=arr[0];
    //Calculating prefix array
    for(int i=1;i<arr.length;i++)
    {
      prefix[i]= prefix[i-1]+arr[i];

    }

    for(int i=0;i<arr.length;i++)
    {
      int currentSum=0;

      for(int j=i;j<arr.length;j++)
      {

        currentSum= i==0 ? prefix[j] :prefix[j]-prefix[i-1];

      }
      if(currentSum >maxSum)
      {
        maxSum=currentSum;
      }
    }
    System.out.println("Maximum Sub Array Sum is : "+maxSum);
  }
}
