public class SelectSort{
	public static void main(String[] args){
		int[] array = {1,3,2,5,4,7,6,0,9,8};
		sort(array);
		print(array);
	}

	private static void sort(int[] array){
		int min;
		int n = array.length;
		for(int i = 0; i < n-1; i++){
			min = i;
			for(y=i+1;y < n; y++)
			if(array[min]>array[i]){
				min = y;
			}
			swap(array[min],array[i]);
		}
	}

	private static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}

	public void print(){

	}
}