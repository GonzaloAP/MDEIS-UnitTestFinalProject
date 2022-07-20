package page;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftSection {

    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox newProjectTextBox = new TextBox(By.id("NewProjNameInput"));
    public Button addButton = new Button(By.id("NewProjNameButton"));
    public Button menuButton = new Button(By.xpath("//div[@style='display: block;']/img"));
    public Button editOption = new Button(By.xpath("//ul[@id='projectContextMenu']/li/a[text()='Edit']"));
    public TextBox editProjectTextBox = new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button saveButton = new Button(By.xpath("//td/div/img[@id='ItemEditSubmit']"));


    public LeftSection(){
    }

    public boolean isNameProjectDisplayed(String projName){
        Label nameProjectLabel = new Label(By.xpath("//td[text()='"+projName+"']"));
        return nameProjectLabel.isControlDisplayed();
    }

    public void clickProjectName(String projName){
        Label nameProjectLabel = new Label(By.xpath("//td[text()='"+projName+"']"));
        nameProjectLabel.click();
    }

}
