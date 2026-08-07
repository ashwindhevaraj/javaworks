package Interviewprograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library{
	Map<Integer,Book> books=new HashMap<>();
	Map<Integer,person> persons=new HashMap<>();
	public void addBooks(Book k) {
		if(!books.containsKey(k.getBookId())) {
			books.put(k.getBookId(),k);
		}
	}
	public void addPerson(person p) {
		if(!persons.containsKey(p.getId())) {
			persons.put(p.getId(),p);
		}
		else {
			System.out.println("person already present in DB");
		}
	}
	public void issueBook(Book k,person p) {
		if(!books.containsKey(k.getBookId())) {
			System.out.println("Book not avalialble right now");
		}
		else {
			if(books.get(k.getBookId()).status()==Bookstatus.Issued) {
				System.out.println("Book was issued");
			}
			else {
				books.get(k.getBookId()).issueBook(p);
			}
		}
	}
	public void returnbook(Book k,person p) {
		if(!books.containsKey(k.getBookId())) {
			System.out.println("Book not avalialble right now");
		}
		else {
			if(books.get(k.getBookId()).status()==Bookstatus.available) {
				System.out.println("Book was not issued before");
			}
			else {
				books.get(k.getBookId()).returnBook(p);
			}
		}
	}
	public void displayBooks() {
		books.values().forEach(System.out::println);
	}
}
class person{
	int id;
	String name;
	public person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return this.id+" "+this.name;
	}
}
enum Bookstatus{
	Issued,
	available;
}
class Book{
	private String name;
	private int id;
	private String authorname;
	private Bookstatus status;
	private person per;
	public Book(String name,int id,String authorname) {
		this.name=name;
		this.id=id;
		this.authorname=authorname;
		this.status=Bookstatus.available;
	}
	public String getBookName() {
		return this.name;
	}
	public int getBookId() {
		return this.id;
	}
	public String getAuthorname() {
		return this.authorname;
	}
	public Bookstatus status(){
		return this.status;
	}
	public void issueBook(person p) {
		this.per=p;
		this.status=Bookstatus.Issued;
	}
	public void returnBook(person p) {
		this.per=null;
		this.status=Bookstatus.available;
	}
	public String toString() {
		return this.name+" "+this.id+" "+this.authorname+" "+this.status+"Issued to "+this.per;
	}
}

public class Librarymanagement {
public static void main(String args[]) {
	System.out.println("Library of VEC");
	Book b1=new Book("Java",1,"Walsh");
	Book b2=new Book("Python",2,"Steve");
	Book b3=new Book("Dotnet",3,"Mark");
	person p1=new person(1,"ash");
	person p2=new person(2,"cec");
	Library l1=new Library();
	l1.addBooks(b1);
	l1.addBooks(b2);
	l1.addBooks(b3);
	l1.addPerson(p1);
	l1.addPerson(p2);
	System.out.println("Book details now");
	l1.displayBooks();
	l1.issueBook(b1,p1);
	System.out.println("Book details now after issue");
	l1.displayBooks();
	l1.issueBook(b1,p1);
	l1.returnbook(b1, p1);
	System.out.println("Book details now after return");
	l1.displayBooks();
}
}
