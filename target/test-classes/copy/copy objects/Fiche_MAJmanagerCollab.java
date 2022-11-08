package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static StepsDefinitions.loginSFSteps.driver;
public class Fiche_MAJmanagerCollab {

    public Fiche_MAJmanagerCollab(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    public void chercher_collab() throws InterruptedException {
        driver.findElement(By.id("bizXSearchField-I")).click();
        driver.findElement(By.id("bizXSearchField-I")).sendKeys("ahmed ahmed ");
        Thread.sleep(2000);
        driver.findElement(By.id("__list4")).click();
        Thread.sleep(3000);
    }
    public void modifier_manager() throws InterruptedException {
        driver.findElement(By.id("__button4-inner")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("__item77")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("__box1-CbBg")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("__picker2-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("__picker2-cal--Month0-20220624")).click();
        Thread.sleep(3000);
        driver.findElements(By.id("__button93-inner")).get(0).click();
        Thread.sleep(3000);
        driver.findElement(By.id("__box3-arrow")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("__item93-__box3-popup-list-1-content")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("__input0-content")).click();
        Thread.sleep(3000);
        // to add text to find the manager
        WebElement element = driver.findElement(By.id("__input0-content"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).sendKeys("T000268").perform();
        Thread.sleep(3000);
        driver.findElement(By.id("__input0-popup-cont")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("__button89")).click();
    }

    public void modif_manager_kimble() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/lightning-input/div/input")).sendKeys("T000268");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[2]/div[1]/div/search_dialog-instant-results-list/div")).click();
    }
}
