package contechmentAssigment;

	

	import java.util.Arrays;
	public class MergeArray {

		public static void main(String[] args)
		{
			// first array 
			int[] a = { 2,5,8,9 };

			// second array
			int[] b = { 15,3,7,12};

			int a1 = a.length;
			
			int b1 = b.length;
			
			// resultant array size
			int c1 = a1 + b1;

			// create the resultant array
			int[] c = new int[c1];

			// using the pre-defined function arraycopy
			System.arraycopy(a, 0, c, 0, a1);
			System.arraycopy(b, 0, c, a1, b1);

			// prints the resultant array
			System.out.println(Arrays.toString(c));
		}
	}


