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
	
	public static void main(String[] args){
		int[] ints = new int[]{1, 4, -3, -6, 7, -8, -9};
		System.out.println(noNegatives(ints));
	}
}
