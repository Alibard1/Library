
import users.AdminUser;
import users.User;
import users.UserIdCreator;
import users.UsualUser;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static ArrayList<Book> bookList = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    private static BookViewWear bookViewWear;
    public static void main(String[] args) {
        bookViewWear = new BookViewWear(bookList);
        initAdminUser();
        initUsers();
        UserIdCreator.newInstance();
        bookList.add(createBook());
        System.out.println("Welcome to the library!!!");
        validateUser();
    }



    private static void validateUser() {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(isUserValid(name)){
            startDialog(getUser(name));
        }
        else{
            addUser();
        }
    }

    private static User getUser(String name) {
        return null;
    }

    private static boolean isUserValid(String name) {
        for(int i=0; i<users.size(); i++) {
            if (users.get(i).getName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    private static void addUser() {
        System.out.println("Input new user name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (isUserExist(name)) {
            users.add(new User(name, UserIdCreator.newInstance().generateId()));
        }else{
            System.out.println("users.User name is incorrect");
        }
    }

    private static boolean isUserExist(String name) {
        return false;
    }

    private static void initUsers() {
        users.add(new UsualUser("Sasha", UserIdCreator.newInstance().generateId()));
    }
    private static void initAdminUser() {
        users.add(new AdminUser("Admin", UserIdCreator.newInstance().generateId()));
    }

    private static void startDialog(User user) {
        if(user instanceof UsualUser){
            showUserDialogFlow(user);
        }else if(user instanceof AdminUser){
            showAdminDialogFlow(user);
        }
    }

    private static void showAdminDialogFlow(User user) {

    }

    private static void showUserDialogFlow(User user) {
        System.out.println("To Add book enter 1, to view all books enter 2.");
        Scanner scanner = new Scanner(System.in);
        char choose = scanner.next().charAt(0);

        System.out.println(bookList.size());
        switch (choose) {
            case '1':
                bookList.add(createBook());
                break;
            case '2':
                bookViewWear.statViewFlow();
                break;
        }

        System.out.println("Add more book? Y/N");
        char bookAnswer = scanner.next().charAt(0);
        switch (bookAnswer) {
            case 'Y':
                showUserDialogFlow(user);
                break;
            default:
                nextStep();
                break;
        }
    }


    private static void nextStep() {

    }

    private static Book createBook() {
        Book newBook = new Book("Bookvar", "Narod", Book.BookType.Yjasu);
        return newBook;
    }
}
