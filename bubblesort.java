import java.util.*;
class bubblesort
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=SC.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=SC.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        
                    
                