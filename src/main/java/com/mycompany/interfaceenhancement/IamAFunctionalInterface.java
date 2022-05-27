package com.mycompany.interfaceenhancement;


@FunctionalInterface //this annotation tells compiler to check the condition of single abstarct method, 
public interface IamAFunctionalInterface {

void display(Integer x);//1 abstract method
//void display1();
 static void staticfn1() {
	 }
static void staticfn2() {
	
}
default void defaultfn1() {
	
}

}

