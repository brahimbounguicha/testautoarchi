package copy;
import Objects.Fiche_Absence;
import Objects.LoginPage;
import io.cucumber.java.en.*;
public class Absence extends BaseClass{
    @Given("Créer une nouvelle absence")
    public void créer_une_nouvelle_absence() throws InterruptedException {
        lp = new LoginPage(driver);
        ABS = new Fiche_Absence(driver);
        lp.user_launch_chrome_browser();
        lp.user_opens_url("https://anbdrsquk.accounts.ondemand.com/saml2/idp/sso?sp=https://www.successfactors.com/talancorpoD&idp=https://anbdrsquk.accounts.ondemand.com");
        lp.se_connecter_en_tant_que_responsable_rh_sur_sf_avec_email_et_le_mot_de_passe("testDEV@talan.com","Talan1234!");
        lp.clickLogin();
        Thread.sleep(3000);
    }
    @Then("Approuver la demande le manager du collaborateur")
    public void approuver_la_demande_le_manager_du_collaborateur()  throws InterruptedException {
        ABS.creationAbsence();
    }
}