
public class GenericsDemo {
	public static void main(String[] args) {
		KeyValue<Integer, String> entry1 = new KeyValue<Integer, String>(152455, "Tom");
		
		int phone = entry1.getKey();
		String name =entry1.getValue();	
		
		System.out.println("Name: " + name + ", " + "NumberPhone: " + phone);
		
		int number = MyUtils.getKey(entry1);
		System.out.println("Test methor generics, number: " + number);
		
		PhoneNameEntry phoneName = new PhoneNameEntry(1426554, "James");
		
		StringValueEntry stringValue = new StringValueEntry("Car", 3.14);
		
		KeyValueInfo keyValueInfo = new KeyValueInfo(14254, "David", true);
		
	}
}

class KeyValue<K, V> {			// Class KeyValue voi 2 tham so kieu K va V
	private K key;
	private V value;
	
	public KeyValue() {
		
	}
	public KeyValue(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

class MyUtils {
	// Methor Generics
	public static <K, V> K getKey(KeyValue<K, V> entry) {
		K key = entry.getKey();
		return key;
	}
}


// Inheritance types
class PhoneNameEntry extends KeyValue<Integer, String> {
	public PhoneNameEntry(Integer key, String value) {
		super(key, value);
	}
}

class StringValueEntry<V> extends KeyValue<String, V> {
	public StringValueEntry(String key, V value) {
		super(key, value);
	}
}

class KeyValueInfo<K, V, I> extends KeyValue<K, V> {
	I info;
	public KeyValueInfo(K key, V value, I info) {
		super(key, value);
		this.info = info;
	}
}










