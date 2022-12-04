package encapsulation.package2;

import encapsulation.package1.ClassA;

public class ClassB extends ClassA{


	void doSomthingClassB() {
		doSomething2();
		doSomethingClassBPrivate();
	}
	
	private void doSomethingClassBPrivate() {
		
	}
}
