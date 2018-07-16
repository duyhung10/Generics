
public class GenericInstanceExample {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		GenericInstance<String> geneStr = new GenericInstance<String>(String.class);
		String str = geneStr.getObj();
		System.out.println(str);
	}
}

class GenericInstance<T> {
	private T obj;

	public GenericInstance(Class<T> classT) throws InstantiationException, IllegalAccessException {
		this.obj = (T) classT.newInstance();
	}

	public T getObj() {
		return obj;
	}
}