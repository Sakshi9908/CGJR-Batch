package com.capg.day7;
class Student {
	private int sId;
	private String name, city;
	private int sClass;

	public Student(int sId, String name, String city, int sClass) {
		super();
		this.sId = sId;
		this.name = name;
		this.city = city;
		this.sClass = sClass;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getsClass() {
		return sClass;
	}

	public void setsClass(int sClass) {
		this.sClass = sClass;
	}

	public void print() {
		System.out.println("ID    : " + getsId());
		System.out.println("Name  : " + getName());
		System.out.println("City  : " + getCity());
		System.out.println("Class : " + getsClass());
	}
}

class Book {
	private int bId;
	private String bookName, author;

	public Book(int bId, String bookName, String author) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.author = author;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void print() {
		System.out.println("Book ID    : " + getbId());
		System.out.println("Book Name  : " + getBookName());
		System.out.println("Author     : " + getAuthor());
	}
}

class Computer {
	private String brandName;
	private String processor;
	private int storage;

	public Computer(String brandName, String processor, int storage) {
		super();
		this.brandName = brandName;
		this.processor = processor;
		this.storage = storage;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String toString() {
		return "Computer [Brand Name: " + getBrandName() + ", Processor: " + getProcessor() + ", Storage in GB: "
				+ getStorage() + "]";
	}
}

class Address {
	private int zip;
	private String city, state;

	public Address(int zip, String city, String state) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "Address [City: " + getCity() + ", State: " + getState() + ", zip: " + getZip() + "]";
	}
}

public class ClassAndObjects {
	public static void main(String[] args) {
		Student s = new Student(01,"Sakshi","Jalna",12);
		Computer c = new Computer("HP","Intel",500);
		Book b = new Book(1001,"CoreJava", "Programming in Java");
		Address a = new Address(431203,"Jalna","Maharashtra");
		
		s.print();
		b.print();
		System.out.println(c.toString());
		System.out.println(a.toString());
		
	}
}

