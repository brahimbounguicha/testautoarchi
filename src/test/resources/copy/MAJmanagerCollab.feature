Feature: MAJmanagerCollab
  @MAJmanager
  Scenario: MAJmanagerCollab
    Then  Chercher un collaborateur déjà créé
    When  Modifier son manager au niveau des données emploi
    Then  Lancer le job de update du collaborateur
    Then  Se connecter ayant droit de gestion des collaborateur dans Kimble
    And   Vérifier que la fiche collaborateur s'est mise à jour au niveau de Kimble