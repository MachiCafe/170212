public class BubbleSort{
	public static void main(String[] args) {
		int[] array = {1,3,2,5,4,9,0,6,7,8};
		sort(array);
		print(array);
	}

	private static void swap(int i, int y, int[] array){
		int temp = array[i];
		array[i] = array[y];
		array[y] = temp;
	}

	private static void print(int[] array){
		for(int i = 0; i<array.length; i++)
			System.out.println(array[i]);
	}

	private static void sort(int[] array){
		int n = array.length;
		for(int i = n; i > 0; i--){
			for(int y = 0;y < i - 1; y++){
				if(array[y]>array[y+1]){
					swap(y,y+1,array);
				}
			}
		}
	}

	
}