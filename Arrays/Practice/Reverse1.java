package Arrays.Practice;

public class Reverse1 {
  public static void main(String[] args) {
    
    int [] arr= {2,4,6,8,10,11};

    reverseArray(arr);
  }
  

  //Reverse method
  public static void reverseArray(int []arr)
  {

    int j=arr.length-1;
    for(int i=0;i<j;i++,j--)
    {
      
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }
}
