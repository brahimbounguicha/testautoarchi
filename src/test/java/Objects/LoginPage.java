package Objects;
import StepsDefinitions.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// *********************************login pour SF *****************************************
public class LoginPage extends BaseClass {
    public WebDriver driver;
    public LoginPage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id = "j_username")
    @CacheLookup
    WebElement txtEmail;
    @FindBy(id = "j_password")
    @CacheLookup
    WebElement txtPassword;
    @FindBy(xpath ="//*[@id=\"logOnFormSubmit\"]")
    @CacheLookup
    WebElement btnLogin;
    public void setUseName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }
    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }
    public void clickLogin() {
driver.findElement(By.xpath("//*[@id=\"logOnFormSubmit\"]")).click();
    }
    @FindBy(xpath = "//*[@id=j_username\"]")
    WebElement txtemailsf;
    @FindBy(xpath = "//*[@id=\"j_password\"]")
    WebElement txtpasssf;
    @FindBy( xpath= "//*[@id=\"logOnFormSubmit\"]")
    WebElement loginsf;
    // ************************login pour kimble************************************
    @FindBy(id = "username")
    @CacheLookup
    WebElement nomutilisateur;
    @FindBy(id = "password")
    @CacheLookup
    WebElement motdepasse;
    @FindBy(id = "Login")
    @CacheLookup
    WebElement se_connecter;
    public void setNomutilisateur(String uname) {
        nomutilisateur.clear();
        nomutilisateur.sendKeys(uname);
    }
    public void setMotdepasse(String pwd) {
        motdepasse.clear();
        motdepasse.sendKeys(pwd);
    }
    public void clickon_seconnecter() {
        se_connecter.click();
    }
    // *****************acceder a SF ************************
    public void user_launch_chrome_browser() {
        // pour lancer google chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
        FCC = new Fiche_CreationCollaborateur(driver);
        FVK = new Fiche_VerifEmpKimble(driver);
    }
    public void user_opens_url(String url) {
        // pour acceder à SF
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void se_connecter_en_tant_que_responsable_rh_sur_sf_avec_email_et_le_mot_de_passe(String email, String password) {
        lp.setUseName(email);
        lp.setPassword(password);
    }
    public void click_on_login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);
    }
    // ****************************acceder a Kimble*********************************
    public void userr_launch_chrome_browser_kimble() {
        // pour lancer google chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
        FCC = new Fiche_CreationCollaborateur(driver);
        FVK = new Fiche_VerifEmpKimble(driver);
    }
    public void userr_opens_url_kimble(String url) {
        // pour acceder à kimble
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void se_connecter_en_tant_que_responsable_rh_sur_kimbe_avec_email_et_le_mot_de_passe(String nomutilisateur, String motdepasse) {
        lp.setNomutilisateur(nomutilisateur);
        lp.setMotdepasse(motdepasse);
    }
    public void click_onn_login_kimble() throws InterruptedException {
        lp.clickon_seconnecter();
        Thread.sleep(3000);
    }
}