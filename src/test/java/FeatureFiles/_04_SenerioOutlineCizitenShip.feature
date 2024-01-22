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

      When User delete the "<name>"
      Then Success message should be displayed

      Examples:
        | name    | short  |
        | zorb1h1 | eY1as  |
        | zor2h2  | zY12ds |
        | zorY33n | zo43as |
        | zbeY4f4 | 23zY4ds |