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

    Scenario: New Cizitenship
      When User a CizitenShip name as "fer232" short name as "232or"
      Then Success message should be displayed

      When User a CizitenShip name as "fer232" short name as "232or"
      Then Already exist  message should be displayed