package test;

public class test {
	public static void main(String args[]){
		int[] a = {9, 6, 4, 2, 1};
		swapAll(a);
		for(int i =0; i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	public static void swap(int a[],int p1,int p2){
		/* Error checking 1 */
		/*if(p1 > a.length || p1 < 0) {
			System.err.println("Index out of bounds: " + p1);
			return;
		}
		if(p2 > a.length || p2 < 0){
			System.err.println("Index out of bounds: " + p2);
			return;
		}*/
		/* Error checking 2 */
		/* assert((0 < p1 && p1< a.length)&& (p2>0 && p2<a.length)); */
		
		/* Error checking 3 */
		try {
			int temp=0;
			temp = a[p1];
			a[p1] = a[p2];
			a[p2] = temp;
		} catch(Exception e) {
			System.err.println(e);
			System.exit(0);
		}
	
	}
	public static void swapAll(int a[]){
		//int temp=0;
		for (int i=0 ; i< a.length-1 ; i++){
			swap(a, i, i+1);
		}
		swap(a, a.length - 1, 0);
	}
	
	public static int findDis(int a[]){
		int i,j;
		i=0;
		for(j=0;j<a.length;j++){
			if(a[i]!=a[j]){
				i++;
				a[i] = a[j];
			}
		}
		return i+1;
	}
}
