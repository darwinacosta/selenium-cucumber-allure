package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ListPage;

import static org.junit.Assert.assertEquals;

public class TestCucumber {

    private WebDriver driver;
    ListPage listPage;
    @Given("Me he conectado a la base de datos mipcgamer")
    public void meHeConectadoALaBaseDeDatosMipcgamer() {
        listPage = new ListPage(driver);
        driver = listPage.chromeDriverConnection();
        listPage.visit("https://demo.guru99.com/test/newtours/");
    }

    @When("Obtengo la PC de QA Automation")
    public void obtengoLaPCDeQAAutomation() throws InterruptedException {
        listPage.registerUser();

    }

    @Then("Debo obtener los siguientes componentes {string} {string} {string} {string}")
    public void deboObtenerLosSiguientesComponentes(String string, String string2, String string3, String string4) {
        assertEquals("Note: Your user name is darwinacosta.", listPage.registeredMenssage());
        driver.quit();
    }
}
