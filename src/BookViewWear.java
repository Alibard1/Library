import java.util.ArrayList;
import java.util.Scanner;

public class BookViewWear {
    private ArrayList<Book> bookList = new ArrayList<>();
    public BookViewWear(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void statViewFlow() {
        System.out.println("To view all books print 1, to search print 2");
        Scanner scanner = new Scanner(System.in);
        char choose = scanner.next().charAt(0);
        switch (choose){
            case '1':
                printAllBooks();
                break;
            case '2':
                startSearchFlow();
                break;
        }
    }

    private void startSearchFlow() {

        //  implementation
    }

    private void printAllBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Name " + bookList.get(i).getName() + ", Author " + bookList.get(i).getAuthor() + ", Type " + bookList.get(i).getType());
        }
    }
}
