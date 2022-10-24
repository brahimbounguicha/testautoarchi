package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static StepsDefinitions.loginSFSteps.driver;
public class Fiche_VerifEmpKimble {
    public Fiche_VerifEmpKimble(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
    }
    public void verif_emp_nestpas_ajouter() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/lightning-input/div/input")).sendKeys("oumar ibrahim");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[2]/div[1]/div/search_dialog-instant-results-list/div")).click();
        driver.quit();
    }
    public static String Contractant_Externe ,First_Name ,Business_Unit ,Last_Name , pôle ,Legal_entity,Location , Grade , manager,time_recording_variable,Expense_Reimbursement_Currency,start_date,end_date;
        public void get_champs_a_verifier() throws InterruptedException {
        // selectionner le collab
        driver.findElement(By.id("bizXSearchField-I")).click();
        driver.findElement(By.id("bizXSearchField-I")).sendKeys("brahim bounguicha");
        Thread.sleep(2000);
        driver.findElement(By.id("__list4")).click();
        Thread.sleep(3000);
        // get la valeur de First name
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[1]/div/div[2]/div/div[1]/div/div/button[1]")).click();
        First_Name=driver.findElements(By.id("__label24")).get(0).getText();
        System.out.println("le PRENOM de collab est : "+First_Name);
        // get la valeur de last name
        Last_Name=driver.findElement(By.id("__label26")).getText();
        System.out.println("le NOM de collab est : "+Last_Name);
        // get la valeur de business unit
        Business_Unit=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[1]/div[2]/div/div[2]/div/div[1]/div/div/div/div[3]/div/table/tbody/tr[6]/td[2]/span")).getText();
        System.out.println(("la valeur de business unit est : "+Business_Unit));
        // get la valeur du pole
        pôle=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[1]/div[2]/div/div[2]/div/div[1]/div/div/div/div[3]/div/table/tbody/tr[7]/td[2]/span")).getText();
        System.out.println(("la valeur du pole est : "+pôle));
        // get la valeur de contractan Externe
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[2]/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(3500);
        Contractant_Externe=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[3]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/span")).getText();
        System.out.println("la valeur de Contractant externe est : "+Contractant_Externe);
        // get la valeur de legal entity __label49
        Legal_entity=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[7]/td[2]/span")).getText();
        System.out.println(("la valeur du Legal_entity est : "+Legal_entity));
        //get la valeur de location Location
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[2]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div/span/div/button[1]")).click();
       Thread.sleep(2000);
       String x=driver.findElement(By.id("__box1-inner")).getAttribute("value");
       String z=driver.findElement(By.id("__input4-inner")).getAttribute("value");
       Location=x+" "+z;
       System.out.println(("la valeur du Location est : "+Location));
       driver.findElement(By.xpath("/html/body/div[3]/div[3]/section/div/div/div/div/footer/div/button[2]")).click();
       Thread.sleep(2000);
       // get la valeur du grade
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[2]/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        Grade=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[1]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr[9]/td[2]/span")).getText();
        System.out.println("la valeur du Grade est : "+Grade);
        // get la valeur du start_date (Probationary Period End Date)
        start_date =driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/span")).getText();
        System.out.println("la valeur du start date est " + start_date);
        // get la valeur du end_date
        end_date= driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr[5]/td[2]/span")).getText();
        System.out.println("la valeur de end date est : "+end_date);
        // get la valeur de manager(responsable )
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[2]/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);
        manager = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td/div/div/div[2]/div/div[1]/div/div[1]/a")).getText();
        System.out.println("le manager est : "+ manager);
        Thread.sleep(1000);
        // get time recording variable ( time pattren variable )
        time_recording_variable = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[4]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div/table/tbody/tr/td[2]/table/tbody/tr[5]/td[2]/span")).getText();
        System.out.println("la valeur de time_recording_variable est : "+ time_recording_variable);
        // get Expense Reimbursement Currency (currency)
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/header/div[2]/div/div[2]/div/div[3]/div/div/button[1]")).click();
        Thread.sleep(2000);
        Expense_Reimbursement_Currency = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/section[2]/section[5]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div/table/tbody/tr[2]/td[2]/div/div[1]/div[3]/span")).getText();
        System.out.println("la valeur de Expense_Reimbursement_Currency est : "+Expense_Reimbursement_Currency);
            driver.quit();
    }
    public void verifier_les_champs()throws InterruptedException {
        // chercher le collab par son id   T003464
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/lightning-input/div/input")).sendKeys("brahim bounguicha");
        Thread.sleep(2000);
        By by = By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[2]/div[1]/div/search_dialog-instant-results-list/div/search_dialog-instant-result-item[1]/div");
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(by);
        action.moveToElement(elem);
        action.perform();
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/span[2]/ul/li[3]/a")).click();
        Thread.sleep(10000);
       String FN=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_kimbleone__resource__c___012000000000000aaa___full___clone___recordlayout2/records-record-layout-block/slot/records-record-layout-section/div/div/div/slot/records-record-layout-row[8]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-base-input/lightning-input/div/input")).getAttribute("value");
       System.out.println("le f name at kimble         "+FN);
       System.out.println("le f name at SF     "+First_Name);
      //  Assert.assertEquals(First_Name,FN);
        String LN=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_kimbleone__resource__c___012000000000000aaa___full___clone___recordlayout2/records-record-layout-block/slot/records-record-layout-section/div/div/div/slot/records-record-layout-row[7]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-base-input/lightning-input/div/input")).getAttribute("value");
        System.out.println("le L name at kimble : "+LN);
        System.out.println("le L name at SF : "+ Last_Name);
      //  Assert.assertEquals(Last_Name,LN);
        String BUSUNIT =driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_kimbleone__resource__c___012000000000000aaa___full___clone___recordlayout2/records-record-layout-block/slot/records-record-layout-section/div/div/div/slot/records-record-layout-row[9]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-lookup/lightning-lookup/lightning-lookup-desktop/lightning-grouped-combobox/div/div/lightning-base-combobox/div/div[1]/input")).getAttribute("value");
        System.out.println("leBusiness Unit at kimble : "+BUSUNIT);
        System.out.println("le Business Unit at SF : "+ Business_Unit);
       // Assert.assertEquals(Business_Unit,BUSUNIT);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[1]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/lightning-input/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/lightning-input/div/input")).sendKeys("brahim bounguicha");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[2]/div[1]/div/search_dialog-instant-results-list/div/search_dialog-instant-result-item[1]/div")).click();
        Thread.sleep(8000);
        String  POLE = driver.findElement(By.cssSelector("body>div>form>div>div>div>div>div>table>tbody>tr>td")).getAttribute("value");
        System.out.println("la valeur du pole at kimble : "+POLE);
    }
}