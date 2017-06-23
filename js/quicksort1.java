import java.util.Scanner;
class partition
{
	int partition(int[] a,int low,int high)
	{
		int pivot=a[low];
		int t;
		int i=low,j=high;
		do
		{
			do
			{
				i=i+1;
			}while(a[i]<=pivot);
			do
			{
				j=j-1;
			}while(a[j]>=pivot);
			if(i<j)
			{
				
				t=a[i];
				a[i]=a[j];
				a[j]=t;

			}

		}while(i<=j);
		a[low]=a[j];
		a[j]=pivot;
		return j;
	}
}
class display
{
	display(int low,int high,int[] a)	
	{
			
		if(low<high)
		{
			QuickSort s=new QuickSort();
			j=s.partition(a,low,high);
			
			display(low,j-1,a);
			display(j+1,high,a);
		}
	}
}
class quicksort1
{
	int j;
	public static void main(String args[])
	{
			int low=0,mid,high;
			System.out.println("Enter no of elements in the array");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[(n+5)];
			high=(n-1);
			System.out.println("Enter the elements");
			for (int l=0;l<n ;l++ ) {
				a[l]=sc.nextInt();
				
			}
			quickSort1 p=new quickSort1();
			p.display(low,high,a);
			System.out.println("elements in the array are ");
			for (int k=0;k<n ;k++ ) 
			{
				System.out.println(" "+a[k]);
				
			
			}
	}
}
