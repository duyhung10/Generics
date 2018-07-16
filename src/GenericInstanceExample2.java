import java.lang.reflect.Array;

public class GenericInstanceExample2 {
	public static void main(String[] args) {
		GenericArray<Integer> genericArray = new GenericArray<Integer>(Integer.class);
		Integer[] myArray = genericArray.getMyArray();
		myArray[0] = 2;
		myArray[1] = 3;
		myArray[4] = 5;
		
	}
}
class GenericArray<T> {
	private final int size = 10;
	
	private T[] myArray;
	
	public GenericArray(Class<T> classT) {
		myArray = (T[]) Array.newInstance(classT, size);
 	}
	
	public T[] getMyArray() {
		return this.myArray;
	}
}