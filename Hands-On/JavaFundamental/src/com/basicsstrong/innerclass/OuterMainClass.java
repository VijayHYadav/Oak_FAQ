package com.basicsstrong.innerclass;

public class OuterMainClass {
	
	public static void main(String[] args) {
		NestedClass out = new NestedClass();
		NestedClass.InnerClass in = out.new InnerClass();
		in.display();
		
		NestedClass.StaticNested nested = new NestedClass.StaticNested();
		nested.print();
	}

}
