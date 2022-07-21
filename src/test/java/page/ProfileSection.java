package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProfileSection {

    public TextBox oldPassword = new TextBox(By.id("TextPwOld"));

    public TextBox newPassword = new TextBox(By.id("TextPwNew"));

    public Button okButton = new Button(By.xpath("//span[@class='ui-button-text'][text()='Ok']"));
}
