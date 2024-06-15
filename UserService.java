package homework;

public class UserService {
    public User createUser(String name) {
        User user = new User(name);
        save(user);
        return user;
    }

    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
