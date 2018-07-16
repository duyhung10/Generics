
public class GenericsInterfaceDemo {
	public static void main(String[] args) {
		
		IntTest<Integer> objInt = new IntTest<Integer>();
		objInt.doSomething(20);
		
		GeneInterfaceImp<String> objStr  = new GeneInterfaceImp<String>();
		objStr.doSomething("String test");
	}
}

interface GenericsInterface <G> {
	public void doSomething(G obj);
}

class GeneInterfaceImp<G> implements GenericsInterface <G> {
	
	private G value;
	
	@Override
	public void doSomething(G obj) {
		System.out.println("Object : " + obj);
	}
	
}

class IntTest<Integer> extends GeneInterfaceImp <Integer> {
	
}