package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LeftSection;

public class MyStepProj {

    LeftSection leftSection = new LeftSection();

    @When("yo creo un projecto con el nombre {string}")
    public void yoCreoUnProjectoConElNombre(String projName) {
        leftSection.addNewProjectButton.click();
        leftSection.newProjectTextBox.writeText(projName);
        leftSection.addButton.click();
    }

    @When("yo actualizo el projecto {string} con el nombre {string}")
    public void yoActualizoElProjectoConElNombre(String oldProjName, String newProjName) {
        leftSection.clickProjectName(oldProjName);
        leftSection.menuButton.click();
        leftSection.editOption.click();
        leftSection.newProjectTextBox.writeText(newProjName);
        leftSection.saveButton.click();
    }

    @Then("el projecto {string} deberia ser mostrado")
    public void elProjectoDeberiaSerMostrado(String projName) {
       Assertions.assertTrue(leftSection.isNameProjectDisplayed(projName),
               "ERROR el proyecto no es mostrado");
    }
}
