#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |

Feature: Scenario Exam functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfullyE

  Scenario Outline: Exam EnterCase Scenario Add

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <ExamName>             |
      | codeInput       | <AcademicPeriodOption> |
      | integrationCode | <GradeLevelOption>     |
    Examples:
      | ExamName        | AcademicPeriodOption | GradeLevelOption |
      | Math exam is1   | academicPeriod1      | gradeLevel2      |
      | IT exam is1     | academicPeriod1      | gradeLevel3      |
      | Oracle exam is1 | academicPeriod1      | gradeLevel4      |
      | Math exam is2   | academicPeriod1      | gradeLevel5      |



