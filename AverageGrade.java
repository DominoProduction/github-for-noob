public class MyArrays {
	public static void main(String[]args){
		
		int[] grades;
		int size = 13;
		
		grades = new int[size];
		
		grades[0] = 99;
		grades[1] = grades[0] - 10;
		
		for(int i = 0; i < grades.length; i++){
			grades [i] = 100;
		}
		
		double[] data = new double[100];
		
		for(int i = 0;  i < data.length; i++){
			data[i] = Math.random();
		}
		
		for(double d : data){
			System.out.println(d);
			
		}
		double result;
		result = findaverage(data);
		System.out.println("the average is:" + result);
	
	}//end main
	
	static double findaverage(double[] array){
		double average = 0.0, sum = 0.0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
			
		}
		average = sum/array.length;
		return average;
	}
}