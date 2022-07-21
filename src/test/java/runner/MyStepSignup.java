package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MainPage;
import page.MenuSection;
import page.SignupModal;

import java.util.Map;

public class MyStepSignup {

    MainPage mainPage = new MainPage();
    SignupModal signupModal = new SignupModal();
    MenuSection menuSection= new MenuSection();

    @When("realizo clic en el boton signup")
    public void realizoClicEnElBotonSignup() {
        mainPage.signupButton.click();
    }

    @And("me registro en la pagina")
    public void meRegistroEnLaPagina(Map<String,String> signupForm) {
        String auxEmail = signupForm.get("email").replace("{number}", signupForm.get("counter"));

        signupModal.fullNameTxtBox.writeText(signupForm.get("fullName"));
        signupModal.emailTxtBox.writeText(auxEmail);
        signupModal.passwordTxtBox.writeText(signupForm.get("password"));
        signupModal.serviceTerms.click();
        signupModal.signupButton.click();

        if (signupModal.isErrorMessageDisplayed()) {
            int counter = Integer.parseInt(signupForm.get("counter") + 1);
            signupForm.put("counter", Integer.toString(counter));
            meRegistroEnLaPagina(signupForm);
        }
    }

    @Then("deberia ingresar a la app web")
    public void deberiaIngresarALaAppWeb() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR la creación de la cuenta fallo");
    }
}
