package StepsDefinitions;

import Objects.Fiche_CreationCollaborateur;
import Objects.Fiche_VerifEmpKimble;
import Objects.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginSFSteps extends BaseClass {
    public static WebDriver driver ;
    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        // pour lancer google chrome
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
        FCC = new Fiche_CreationCollaborateur(driver);
        FVK = new Fiche_VerifEmpKimble(driver);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        // pour acceder à SF
        driver.get(url);
        driver.manage().window().maximize();
    }
    @Given("Se connecter en tant que responsable RH sur SF avec email {string} et le mot de passe {string}")
    public void se_connecter_en_tant_que_responsable_rh_sur_sf_avec_email_et_le_mot_de_passe(String email, String password) {
        lp.setUseName(email);
        lp.setPassword(password);
    }
    @When("Click on login")
    public void click_on_login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"logOnFormSubmit\"]")).click();
        Thread.sleep(3000);
    }
}
