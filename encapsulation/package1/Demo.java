package encapsulation.package1;

import encapsulation.package2.ClassB;

public class Demo {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		classA.doSomething2();
		
		ClassB classB = new ClassB();
		// classB.doSomethingClassBPrivate(): // is private
		
	}
}
