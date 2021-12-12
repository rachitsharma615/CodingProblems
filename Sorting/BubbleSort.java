package Sorting;
public class BubbleSort 
{
    public static void main(String[] args)
    {
       int[] intArray=new int[]{1,3,2,5,4,7};

       for(int i=0;i<intArray.length-1;i++)
       {
           for(int j=i+1;j<(intArray.length-i);j++)
           {
               if(intArray[j-1]>intArray[j])
               {
                   //Swapping the Arrays
                   intArray[j-1]=(intArray[j-1]+intArray[j])-(intArray[j]=intArray[j-1]);
               }}
       }

       for(int i=0;i<intArray.length;i++) {
        System.out.println("Value of the array after bubble sort are"+intArray[i]);
       }

    }
}