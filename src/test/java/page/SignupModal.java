package page;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class SignupModal {

    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));

    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));

    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));

    public Button serviceTerms = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));

    public Button signupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public SignupModal() {
    }

    public boolean isErrorMessageDisplayed(){
        Label errorMessage = new Label(By.id("HeaderMessageError"));
        return errorMessage.isControlDisplayed();
    }
}
