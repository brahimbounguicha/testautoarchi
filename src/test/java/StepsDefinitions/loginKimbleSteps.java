package StepsDefinitions;
import Objects.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginKimbleSteps extends BaseClass {
    @Given("user launch chrome browser  kimble")
    public void userr_launch_chrome_browser() {
        // pour lancer google chrome
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }
    @When("User opens URL kimble {string}")
    public void userr_opens_url(String url) {
        // pour acceder à kimble
        driver.get(url);
        driver.manage().window().maximize();
    }
    @Given("Se connecter en tant que responsable RH sur kimble avec email {string} et le mot de passe {string}")
    public void se_connecter_en_tant_que_responsable_rh_sur_kimbe_avec_email_et_le_mot_de_passe(String nomutilisateur, String motdepasse) {
        lp.setNomutilisateur(nomutilisateur);
        lp.setMotdepasse(motdepasse);
    }
    @When("Click on login kimble")
    public void click_onn_login() throws InterruptedException {
        lp.clickon_seconnecter();
        Thread.sleep(3000);
    }
}
