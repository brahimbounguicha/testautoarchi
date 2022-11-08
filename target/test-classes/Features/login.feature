Feature: login
  @LoginSF
  Scenario: login SF
    Given user launch chrome browser
    When User opens URL "https://anbdrsquk.accounts.ondemand.com/saml2/idp/sso?sp=https://www.successfactors.com/talancorpoD&idp=https://anbdrsquk.accounts.ondemand.com"
    Given Se connecter en tant que responsable RH sur SF avec email "testDEV@talan.com" et le mot de passe "Talan1234!"
    And  Click on login
  @LoginKimble
  Scenario: login Kimble
    Given user launch chrome browser  kimble
    When User opens URL kimble "https://talan--fulluat.lightning.force.com/lightning/page/home"
    Given Se connecter en tant que responsable RH sur kimble avec email "malek.hammami@talan.com.fulluat" et le mot de passe "Recette-2022"
    Then Click on login kimble