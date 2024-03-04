//5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and 
//	remove books from a collection.
package Java;

public class Book
{
	String title;
	String author;
	String ISBN;
	Book(String title,String author,String ISBN)
	{
		this.title =title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public String  gettitle()
	{
		return title;
	}
	public String  getauthor()
	{
		return author;
	}
	public  String  getISBN()
	{
		return ISBN;
	}
	static void addBook(Book[] b,Book nb)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i] == null)
			{
				b[i]= nb;
				break;
			}
		}
	}
	static void removeBook(Book[] b,int loc)
	{
		if(loc >= 0 && loc<b.length)
		{
			b[loc]=null;
		}
		else
		{
			System.out.println("Location Not Valid");
		}
	}
	 static void display(Book[] b)
	{
		System.out.println("Books in Array");
//		for(int i=0;i<b.length;i++)
		for(Book i :b)
		{
			 if (i != null) {
		System.out.println("Title :"+i.gettitle()+" Author : "+i.getauthor()+" ISBN : "+i.getISBN());
			 }
		}
		
	}
	 public static void main(String[] args)
	 {
		 Book[] b = new Book[3];
		Book b1 = new Book("Java","H M Deitel","ww123");
		Book b2 = new Book("Python","H M Deitel","ww123");
		
		System.out.println("Title :"+b1.gettitle()+" Author : "+b1.getauthor()+" ISBN : "+b1.getISBN());
		System.out.println("Title :"+b2.gettitle()+" Author : "+b2.getauthor()+" ISBN : "+b2.getISBN());
		
		addBook(b,new Book("cpp","H M Deitel","ww123"));
		addBook(b,new Book("C","H M Deitel","ww123"));
		display(b);
		removeBook(b,1);
		display(b);
		
		
		
		 
		 
	 }
}
