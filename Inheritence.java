package com.practice;

class Animal {
	Animal(){
		System.out.println("Animal Called");
	}
	Animal(String a){
		System.out.println("Animal Param Called");
	}
	void test() {
		System.out.println("Tesing of parent class");
	}
}

class Dog extends Animal {
	Dog(){
		System.out.println("Dog Called");
	}
}

class Cat extends Animal {
	Cat(){
		System.out.println("Cat Called");
	}
	
	Cat(String s){
		System.out.println(s+" Cat Called");
	}
	Cat(String s, String y){
//		super.test();
		System.out.println(s+" Cat Called and also "+y);
	}
	void test() {
		System.out.println("Tesing of Cat class");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Animal();
		d.test();
		Cat c = new Cat("Perry", "John");
		c.test();
	}

}
