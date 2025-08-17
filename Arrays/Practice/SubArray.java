package Arrays.Practice;

public class SubArray {
  
  public static void main(String[] args) {
    

    int [] arr={2,4,6,8,10};
    subArray(arr);

  }
  //SubArray Method

  public static void subArray(int []arr)
  { //Number of Subarray to check .
    int count=0;

    for(int i=0;i<arr.length;i++)
    {
      System.out.println("( "+arr[i]+" )");
      count++;
      for(int j=i+1;j<arr.length;j++)
      {

        System.out.print("( ");
        for(int k=i;k<=j;k++)
        {
        System.out.print(arr[k]+" ");
        }
        System.out.print(" )");
        count++;
      }
      System.out.println();
    }
    System.out.println("Total number of SubArrays are : "+count);
  }

}
