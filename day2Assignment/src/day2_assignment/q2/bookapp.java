package day2_assignment.q2;

public class bookapp {
	public static void main(String[] args) {
		BookStore bookStore=new BookStore("harman", 5);
		bookStore.sell("spring in action", 2);
		bookStore.display();
	}
}
