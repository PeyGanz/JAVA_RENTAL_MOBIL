package Main;
import View.ViewLogin;
import Controller.ControllerLogin;
import View.ViewInput;
public class Main {
    
    public static void main(String[] args) {
        ViewLogin login=new ViewLogin();
        new ControllerLogin(login);
    }
    
}
