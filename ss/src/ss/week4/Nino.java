package ss.week4;

public class Nino {

	public static int noNegatives(int[] array){
		int result = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < 0)
				result++;
		}
		return result;
	}
	
	public static int[] reverse(int[] array){
		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
	
	public static void main(String[] args){
		int[] ints = new int[]{1, 4, -3, -6, 5, 7, -8, -9};
		System.out.println(noNegatives(ints));
		
		int[] res = reverse(ints);
		for(int x : res){
			System.out.println(x);
		}
	}
}
