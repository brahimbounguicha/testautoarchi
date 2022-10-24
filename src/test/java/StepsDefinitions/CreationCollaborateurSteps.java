package StepsDefinitions;
import Objects.*;
import io.cucumber.java.en.*;
public class CreationCollaborateurSteps extends BaseClass {
    @When("User click on Organigramme Menu")
    public void user_click_on_organigramme_menu() throws InterruptedException {
        lp = new LoginPage(driver);
        FCC = new Fiche_CreationCollaborateur(driver);
        lp.user_launch_chrome_browser();
        lp.user_opens_url("https://anbdrsquk.accounts.ondemand.com/saml2/idp/sso?sp=https://www.successfactors.com/talancorpoD&idp=https://anbdrsquk.accounts.ondemand.com");
        lp.se_connecter_en_tant_que_responsable_rh_sur_sf_avec_email_et_le_mot_de_passe("testDEV@talan.com","Talan1234!");
        lp.clickLogin();
        Thread.sleep(3000);
        FCC.clickOnOrganigrammeMenu();
        Thread.sleep(2000);
    }
    @When("click on  ajouter un nouvel employé")
    public void click_on_ajouter_un_nouvel_employé() throws InterruptedException {
        FCC.clickOnnewemploye();
        Thread.sleep(2000);
    }
    @Then("user can view Ajouter un nouvel employé page")
    public void user_can_view_ajouter_un_nouvel_employé_page() throws InterruptedException {
        FCC.donnes_de_base();
        Thread.sleep(1500);
    }
    @When("User enter employé info")
    public void user_enter_employé_info() throws InterruptedException {
        FCC.reseigner_employe_info();
        Thread.sleep(1500);
    }
    @When("click on Continuer")
    public void click_on_continuer() throws InterruptedException {
        FCC.continuer();
        Thread.sleep(4000);
    }
    @When("user enter les données du collab")
    public void user_enter_les_données_du_collab() throws InterruptedException {
        FCC.données_du_collab();
        Thread.sleep(2000);
    }
    @When("user enter Informations organisationnelles")
    public void user_enter_informations_organisationnelles() throws InterruptedException {
        FCC.Informations_organisationnelles();
        Thread.sleep(2000);
    }
    @When("user enter Informations sur la rémunération")
    public void user_enter_informations_sur_la_rémunération() throws InterruptedException {
        FCC.informations_sur_la_rémunération();
        Thread.sleep(2000);
    }
}
