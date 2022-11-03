public class plants {

	public static void main(String[] args) {
		int n=3;
		int arr[] = {7,8,10};
		int max=0;
		int h=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]%2==0)
				h=h+((max-arr[i])/2);
				
			else
				h=h+(max-arr[i]);
		}
		System.out.println(h);

	}

}
