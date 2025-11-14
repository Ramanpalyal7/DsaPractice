package Arrays.RevisionPractice;
public class LinearSearch{

    public static void main(String[]args)
    {
      int key=10;
      int arr[]={2,4,8,6,100,1,12,14};

      int value=linearSearch(key, arr);

      if(value==-1)
      {
        System.out.println("Element not present ");
      }
      else
      {
        System.out.println("Element present at index : "+value);
      }

    }

    public static int linearSearch(int key,int arr[])
    {
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==key)
        {
          return i;
        }
      }
      return -1;
    }
}