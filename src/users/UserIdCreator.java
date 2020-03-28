package users;

public class UserIdCreator {
    private static UserIdCreator currentInstance;
    private int userID = 0;
    private  UserIdCreator() {
    }

    public static UserIdCreator newInstance(){
        if (currentInstance == null) {
            currentInstance = new UserIdCreator();
        }
        return currentInstance;
    }

    public int generateId() {
        return userID++;
    }
}
