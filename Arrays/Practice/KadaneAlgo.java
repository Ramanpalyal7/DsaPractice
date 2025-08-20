package Arrays.Practice;

public class KadaneAlgo {
  
  public static void main(String[] args) {
  
    int [] arr={-2,-3,4,-1,-2,1,5,-3};

    KadaneAlgos(arr);

  }


  public static void KadaneAlgos(int [] arr)
  {
 
    int maxSum=Integer.MIN_VALUE;
    int currentSum=0;
    for(int i=0;i<arr.length;i++)
    {
     currentSum=currentSum+arr[i];

     if(currentSum<0)
     {
      currentSum=0;
     }

     maxSum=Math.max(maxSum, currentSum);
      
    
    }

System.out.println("Maximum sum is : "+maxSum);


  }


}
// public static void KadaneAlgos(int[] arr) {
//     int maxSum = arr[0];
//     int currentSum = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         currentSum = Math.max(arr[i], currentSum + arr[i]);
//         maxSum = Math.max(maxSum, currentSum);
//     }

//     System.out.println("Maximum sum is: " + maxSum);
// }
