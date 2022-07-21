package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.ProfileSection;

import java.util.Map;

public class MyStepChangePassword {

    MainPage mainPage = new MainPage();

    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    ProfileSection profileSection = new ProfileSection();
    @When("realizo clic en el boton settings")
    public void realizoClicEnElBotonSettings() {
        menuSection.settingsButton.click();
    }

    @And("registro la nueva clave")
    public void registroLaNuevaClave(Map<String,String> changePasswordForm) {
        profileSection.oldPassword.writeText(changePasswordForm.get("oldPassword"));
        profileSection.newPassword.writeText(changePasswordForm.get("newPassword"));
        profileSection.okButton.click();
        menuSection.logoutButton.click();
    }

    @Then("deberia ingresar nuevamente a la pag web")
    public void deberiaIngresarNuevamenteALaPagWeb(Map<String, String> credentials) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credentials.get("email"));
        loginModal.pwdTxtBox.writeText(credentials.get("password"));
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
