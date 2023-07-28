package pages;

import acciones.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListPage extends BasePage {

    By registerlinkLocator = By.linkText("REGISTER");
    By registerPageLocater = By.xpath("//img[@src=\"images/mast_register.gif\"]");

    By usernameLocater = By.id("email");
    By passwordLocater = By.name("password");
    By confirmPasswordLocater = By.cssSelector("input[name='confirmPassword']");

    By registerBtnLocater = By.xpath("//input[@src=\"images/submit.gif\"]");

    By registeredMenssage = By.tagName("font");


    public ListPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException {
        clic(registerlinkLocator);
        scroll();
        Thread.sleep(3000);
        if(isDisplayed(registerPageLocater)){
            type(usernameLocater, "darwinacosta");
            type(passwordLocater, "6524278");
            type(confirmPasswordLocater, "6524278");

            clic(registerBtnLocater);
        }else{
            System.out.println("Register page was not found");
        }
    }

    public String registeredMenssage(){
        List<WebElement> fonts = findElemnts(registeredMenssage);
        return getText(fonts.get(5));
    }

}
