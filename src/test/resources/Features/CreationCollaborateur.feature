Feature: CreationCollaborateur
 @CreationCollaborateur
  Scenario: Creation Collab
    When  User click on Organigramme Menu
    And   click on  ajouter un nouvel employé
    Then  user can view Ajouter un nouvel employé page
    When  User enter employé info
    And   click on Continuer
    When  user enter les données du collab
    When  user enter Informations organisationnelles
    And   user enter Informations sur la rémunération