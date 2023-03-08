class Book 
{
	String name;
	int price;
	Author author;
	Book(String n,int p,Author author)
	{
		this.name=n;
		this.price=p;
		this.author=author;
	}
	public static void main(String[] args) 
	{
		Author author=new Author("john",42,"usa");
		Book b=new Book("java",800,author);
       System.out.println("Book Name:"+b.name);
	   System.out.println("Book price:"+b.price);
	   System.out.println("-------Author Details-------");
	   System.out.println("Author Name:"+b.author.authorName);
	   System.out.println("Author Age:"+b.author.age);
	   System.out.println("Author Place:"+b.author.place);
	}
}
