package acciones;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasePage {

     WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locater){
        return driver.findElement(locater);
    }

    public List<WebElement> findElemnts(By locater){
        return driver.findElements(locater);
    }

    public String getText(WebElement element){
        return element.getText();
    }
    public String getText(By locater){
        return driver.findElement(locater).getText();
    }

    public void type(By locater, String text){
        driver.findElement(locater).sendKeys(text);
    }

    public void clic(By locater){
        driver.findElement(locater).click();
    }

    public Boolean isDisplayed(By locater){
        try {
            return driver.findElement(locater).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void visit(String url){
        driver.get(url);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

}
