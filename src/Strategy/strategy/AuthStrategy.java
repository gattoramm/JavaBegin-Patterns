package Strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
