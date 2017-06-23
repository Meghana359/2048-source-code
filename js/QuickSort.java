import java.util.Scanner;

class QuickSort
{
	public static void main(String args[])
	{
			
			System.out.println("Enter no of elements in the array");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for (int l=0;l<n ;l++ ) {
				a[l]=sc.nextInt();
				
			}	
			int low=0,mid,high;
			high=(n-1);	
			sort(low,high,a);
			System.out.println("elements in the array are ");
			for (int k=0;k<n ;k++ ) 
			{
				System.out.println(" "+a[k]);	
			}			
			
	}

	public static void sort(int low,int high,int a[]){
		int j;
		if(low<high)
		{ 
			
			j=partition(a,low,high);
			sort(low,j-1,a);
			sort(j+1,high,a);
		}
	}

	public static int partition(int[] a,int low,int high)
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

