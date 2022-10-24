package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static StepsDefinitions.loginSFSteps.driver;
public class Fiche_CreationCollaborateur {
    public Fiche_CreationCollaborateur(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnOrganigrammeMenu(){
        driver.findElement(By.id("__tile17")).click();
    }
    public void clickOnnewemploye(){
        driver.findElement(By.id("__xmlview0--newHireButton")).click();
    }
    public void donnes_de_base() throws InterruptedException {
        // selectionner le date
        driver.findElement(By.id("__picker1-icon")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__picker1-cal--Month0-20220601")).click();
        //selctioner entite legale
        driver.findElement(By.id("__box0-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__item5-__box0-popup-list-5")).click();
        //selectionner Raison de l’événement
        driver.findElement(By.id("__box1-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div/ul/li[1]")).click();
        //selectionner mdele d'embauche
        driver.findElement(By.id("__box2-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        // cliquer sur continuer
        driver.findElement(By.id("__button2-inner")).click();
        Thread.sleep(1500);
    }
    public void reseigner_employe_info() throws InterruptedException {
        // date d'entrée entite
        driver.findElement(By.id("__picker2-icon")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__picker2-cal--Month0-20220531")).click();
        Thread.sleep(1500);
        //entite legale
        driver.findElement(By.id("__box3-arrow")).click();
        Thread.sleep(800);
        driver.findElement(By.id("__item10-__box3-popup-list-0")).click();
        //raison de l'evenement
        driver.findElement(By.id("__box4-arrow")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/div/ul/li[1]")).click();
        //prenom
        driver.findElement(By.id("__input0-inner")).clear();
        driver.findElement(By.id("__input0-inner")).sendKeys("oumar");
        Thread.sleep(1000);
        //nom
        driver.findElement(By.id("__input1-inner")).clear();
        driver.findElement(By.id("__input1-inner")).sendKeys("ibrahim");
        Thread.sleep(1000);
        //civilite
        driver.findElement(By.id("__box5-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div/ul/li[1]")).click();
        //date de naissance
        driver.findElement(By.id("__picker3-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("__picker3-cal--Head-B2")).click();
        driver.findElement(By.id("__picker3-cal--Head-prev")).click();
        driver.findElement(By.id("__picker3-cal--YP-y19960101")).click();
        driver.findElement(By.id("__picker3-cal--Month0-19960523")).click();
        // pays de naissance
        driver.findElement(By.id("__box6-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__item19")).click();
        Thread.sleep(1500);
        //Lieu de naissance
        driver.findElement(By.id("__input5-inner")).clear();
        driver.findElement(By.id("__input5-inner")).sendKeys("tunisie");
    }
    public void continuer() throws InterruptedException {
        driver.findElement(By.id("__button23")).click();
        Thread.sleep(4000);
    }
    public void données_du_collab() throws InterruptedException {
        // selectionner Nationalité
        driver.findElement(By.id("__box9-arrow")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div/div/div/div/div/ul/li[3]")).click();
        Thread.sleep(1500);
        //selectionner pays region
        driver.findElements(By.id("__box11-arrow")).get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[10]/div/div/div/ul/li[80]")).click();
        Thread.sleep(1500);
        // cliquer sur continuer
        driver.findElements(By.id("__button43")).get(0).click();
        Thread.sleep(4000);
    }
    public void Informations_organisationnelles() throws InterruptedException {
        //selectionner Business Unit
        driver.findElement(By.id("__box22-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        // selectionner pole
        driver.findElement(By.id("__box23-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        //selectionner site contractuelle
        driver.findElement(By.id("__box27-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[13]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        // selectionner metier
        driver.findElement(By.id("__box31-arrow")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        // selectioner Filière
        driver.findElement(By.id("__box32-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[15]/div/div/div/div/div/ul/li")).click();
        Thread.sleep(1500);
        // ecrire emplooi
        driver.findElement(By.id("__input15-inner")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__input15-inner")).sendKeys("commercial");
        Thread.sleep(1500);
        // selectionner garde
        driver.findElement(By.id("__box33-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[16]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(1500);
        //ecrire responsable hearchique
        driver.findElement(By.id("__input16-inner")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__input16-inner")).sendKeys("ahmed ahmed ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[17]/div/div/div/table/tbody/tr[1]/td[2]/div")).click();
        Thread.sleep(1500);
        // resenier categorie d'employee
        driver.findElement(By.id("__box38-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[18]/div/div/div/div/div/ul/li[2]")).click();
        Thread.sleep(1500);
        // Type de contrat
        driver.findElement(By.id("__box40-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[19]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(2000);
        //date du fin du contrat
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/section/div[2]/div[2]/div/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div[6]/div/div[2]/div/div/div/span")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__picker4-cal--Head-B2")).click();
        driver.findElement(By.id("__picker4-cal--YP-y20270101")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("__picker4-cal--Month0-20270527")).click();
        Thread.sleep(1500);
        // remplir pension%
        driver.findElement(By.id("__input18-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"__input18-inner\"]")).sendKeys("80");
        // Healthcare
        driver.findElement(By.id("__box43-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[21]/div/div/div/div/div/ul/li[2]")).click();
        //Healthcare Dental
        driver.findElement(By.id("__box44-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[22]/div/div/div/div/div/ul/li[2]")).click();
        //Healthcare extra payment
        driver.findElement(By.id("__input19-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("__input19-inner")).sendKeys("500");
        //Calendrier des jours fériés
        driver.findElement(By.id("__box45-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[23]/div/div/div/div/div/ul")).click();
        //Horaires de travail
        driver.findElement(By.id("__schedule0-arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[24]/div/div/div/div/div/ul/li[1]")).click();
        Thread.sleep(2000);
        //Profil de temps
        driver.findElement(By.id("__box46-arrow")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[25]/div/div/div/div/div/ul")).click();
        Thread.sleep(2000);
        // cliquer sur continuer
        driver.findElement(By.id("__button61")).click();
        Thread.sleep(4000);
    }
        public void informations_sur_la_rémunération() throws InterruptedException {
        // Type de rémunération
        driver.findElement(By.id("__box55-arrow")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[26]/div/div/div/div/div/ul/li")).click();
        Thread.sleep(4000);
        // methode du paiement
            driver.findElement(By.id("__box56-arrow")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("/html/body/div[1]/div[27]/div/div/div/div/div/ul/li")).click();
        // titulaire du compte
            Thread.sleep(2500);
        driver.findElement(By.id("__input25-inner")).click();
        driver.findElement(By.id("__input25-inner")).clear();
        driver.findElement(By.id("__input25-inner")).sendKeys("brahiim brahiim");
        Thread.sleep(2000);
        //BANQUE
        driver.findElement(By.id("__input29-inner")).click();
        driver.findElement(By.id("__input29-inner")).clear();
        driver.findElement(By.id("__input29-inner")).sendKeys("BNA");
        Thread.sleep(1000);
        // pays ou region
            driver.findElement(By.id("__box57-inner")).sendKeys("fr");
            Thread.sleep(2000);
            driver.findElement(By.id("__item425-__box57-popup-list-1")).click();
            Thread.sleep(2000);
        // Code B.I.C.
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/section/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div[50]/div/div[2]/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/section/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div[50]/div/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/section/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div[50]/div/div[2]/div/div/input")).sendKeys("SOGEFRPP");
        Thread.sleep(1500);
        //IBAN
        driver.findElement(By.id("__area0-inner")).click();
        driver.findElement(By.id("__area0-inner")).clear();
        driver.findElement(By.id("__area0-inner")).sendKeys("FR7630001007941234567890185");
        Thread.sleep(1500);
        // click sur continuer
        driver.findElement(By.id("__button72")).click();
        Thread.sleep(1000);
    }
}