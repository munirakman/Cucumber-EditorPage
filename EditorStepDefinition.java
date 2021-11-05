package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.EditorPage;

public class EditorStepDefinition {

    EditorPage editorPage = new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
            editorPage.newButonu.click();
    }

    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstName) {
            editorPage.firsNameBox.sendKeys(firstName);
    }


    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastName) {
            editorPage.lastNameBox.sendKeys(lastName);
    }


    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String positiontText) {
            editorPage.positionBox.sendKeys(positiontText);

    }
    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String officeText) {
            editorPage.officeBox.sendKeys(officeText);

    }

    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extensionText) {

            editorPage.extnBox.sendKeys(extensionText);
    }

    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {

            editorPage.dateBox.sendKeys(startDate);
    }

    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {

            editorPage.salaryBox.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

            editorPage.createButton.click();
    }
}
