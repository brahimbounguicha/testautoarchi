package StepsDefinitions;
import Objects.Fiche_MAJmanagerCollab;
import Objects.Fiche_VerifEmpKimble;
import Objects.LoginPage;
import io.cucumber.java.en.*;
public class MAJmanagerCollab extends BaseClass {
    @Then("Chercher un collaborateur déjà créé")
    public void chercher_un_collaborateur_déjà_créé() throws InterruptedException {
        lp = new LoginPage(driver);
        FVK = new Fiche_VerifEmpKimble(driver);
        MAJ = new Fiche_MAJmanagerCollab(driver);
        lp.user_launch_chrome_browser();
        Thread.sleep(2000);
        lp.user_opens_url("https://anbdrsquk.accounts.ondemand.com/saml2/idp/sso?sp=https://www.successfactors.com/talancorpoD&idp=https://anbdrsquk.accounts.ondemand.com");
        Thread.sleep(2000);
        lp.se_connecter_en_tant_que_responsable_rh_sur_sf_avec_email_et_le_mot_de_passe("testDEV@talan.com","Talan1234!");
        Thread.sleep(2000);
        lp.clickLogin();
        Thread.sleep(2000);
        MAJ.chercher_collab();
        Thread.sleep(2000);
    }
    @When("Modifier son manager au niveau des données emploi")
    public void modifier_son_manager_au_niveau_des_données_emploi() throws InterruptedException {
        MAJ.modifier_manager();
        Thread.sleep(3000);
    }
    @Then("Lancer le job de update du collaborateur")
    public void lancer_le_job_de_update_du_collaborateur() {
    }
    @Then("Se connecter ayant droit de gestion des collaborateur dans Kimble")
    public void se_connecter_ayant_droit_de_gestion_des_collaborateur_dans_kimble() throws InterruptedException {
        lp = new LoginPage(driver);
        lp.userr_launch_chrome_browser_kimble();
        Thread.sleep(2000);
        lp.userr_opens_url_kimble("https://talan--fulluat.lightning.force.com/lightning/page/home");
        Thread.sleep(2000);
        lp.se_connecter_en_tant_que_responsable_rh_sur_kimbe_avec_email_et_le_mot_de_passe("malek.hammami@talan.com.fulluat","Recette-2022");
        Thread.sleep(2000);
        lp.click_onn_login_kimble();
    }
    @Then("Vérifier que la fiche collaborateur s'est mise à jour au niveau de Kimble")
    public void vérifier_que_la_fiche_collaborateur_s_est_mise_à_jour_au_niveau_de_kimble() throws InterruptedException {
        MAJ.modif_manager_kimble();
        Thread.sleep(1000);

    }

}
