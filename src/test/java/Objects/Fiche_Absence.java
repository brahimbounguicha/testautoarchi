package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static StepsDefinitions.loginSFSteps.driver;
public class Fiche_Absence {
    public Fiche_Absence(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    public void creationAbsence () throws InterruptedException {
        // appuyer sur conges/absence
        driver.findElement(By.id("__wrapper19")).click();
        Thread.sleep(2000);
        // cliquer sur creer absence
        driver.findElement(By.id("idEssContainer---main--newAbsenceButton")).click();
        Thread.sleep(3000);
        Thread.sleep(3000);
        //selectionner lenombre d'absence
        driver.findElement(By.id("__box3-arrow")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/ul/li[2]")).click();
        Thread.sleep(4000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,9000)");
        //ajouter un commantaire
        driver.findElement(By.id("__area0-inner")).clear();
        driver.findElement(By.id("__area0-inner")).sendKeys("ok ok ");
        Thread.sleep(2000);
        //scroller la page pour trouver l'element
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement Element = driver.findElement(By.id("__box6-arrow"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        // selectionner matin/midi
        driver.findElement(By.id("__box6-arrow")).click();
        driver.findElement(By.id("__box6-arrow")).click();
        driver.findElement(By.id("__box6-arrow")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/ul/li[2]")).click();
        Thread.sleep(2000);
        //cliquer sur soummettre
        driver.findElement(By.id("idEssContainer---main--saveAbsenceButton")).click();
    }
}