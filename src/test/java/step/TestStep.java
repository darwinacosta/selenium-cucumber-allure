package step;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ListPage;

import static org.junit.Assert.assertEquals;


public class TestStep {

    private WebDriver driver;
    ListPage listPage;

    @Before
    public void setUp(){
        listPage = new ListPage(driver);
        driver = listPage.chromeDriverConnection();
        listPage.visit("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void test() throws InterruptedException {
        listPage.registerUser();
        assertEquals("Note: Your user name is darwinacosta.", listPage.registeredMenssage());

    }
    @After
    public void exit(){
        driver.quit();
    }

}
