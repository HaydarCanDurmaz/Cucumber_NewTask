Feature: Datatable Case

  Scenario: UserList

    When Write username "zorbey"
    And Write username and pasword "durmaz1" and "1234"
    And Write username  as Datatable
      | zorbey |
      | kayhan |
      | ayhan  |
      | can    |
    And  Write username and password as datatable
      | zorbey | 1234 |
      | kayhan | 4321 |
      | ayhan  | 2134 |
      | can    | 3214 |