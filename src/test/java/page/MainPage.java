package page;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button signupButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
}
