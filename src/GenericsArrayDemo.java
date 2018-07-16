
public class GenericsArrayDemo {
	public static void main(String[] args) {
		String[] name = new String[] {"Jame", "David", "Fitz"};
		GenericsArray<String> gaMyArray = new GenericsArray(name);
		
		String str = gaMyArray.getLastElement();
		System.out.println(str);
	}
}

class GenericsArray <T> {
	private T[] array;
	
	public GenericsArray(T[] array) {
		this.array = array;
	}
	
	public T[] getArray() {
		return array;
	}
	
	public T getLastElement() {
		if(this.array == null || this.array.length == 0) {
			return null;
		}
		
		return array[this.array.length - 1];
	}
}