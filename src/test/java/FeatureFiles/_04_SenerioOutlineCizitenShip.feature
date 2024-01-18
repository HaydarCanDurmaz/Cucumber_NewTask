# Senaryo
  #Cizitenship Sayfasına Gidin
  #Create işlmemin dogrulayınız
  #Daha sonra aynı bilgileri tekrar giriniz create yapılmadıgını görünüz (Negatif Test)

  Feature: Cizitenship Funcinality

    Background:// before
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully
      And Navigate to CizitenShip page

    Scenario Outline: New Cizitenship
      When User a CizitenShip name as "<name>" short name as "<short>"
      Then Success message should be displayed

      When User a CizitenShip name as "<name>" short name as "<short>"
      Then Already exist  message should be displayed
      Examples:
        | name    | short   |
        | zorbeY1 | zorbeY1 |
        | zorbeY2 | zorbeY2 |
        | zorbeY3 | zorbeY3 |
        | zorbeY4 | zorbeY4 |