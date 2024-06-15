package homework;

public class PersisterStart {
    public void start() {
        UserService userService = new UserService();
        Persister persister = new Persister(userService.createUser("Bob"));
        persister.report();
    }
}
