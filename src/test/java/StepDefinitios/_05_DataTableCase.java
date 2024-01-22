package StepDefinitios;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableCase {
    @When("Write username {string}")
    public void writeUsername(String userName) {
        System.out.println("userName" + userName);
    }

    @And("Write username and pasword {string} and {string}")
    public void writeUsernameAndPaswordAnd(String userName, String password) {
        System.out.println("userName and password" + userName + " " + password);

    }

    @And("Write username  as Datatable")
    public void writeUsernameAsDatatable(DataTable items) {
        List<String> itemsList = items.asList(String.class);
        for (String u : itemsList)
            System.out.println("u = " + u);
    }

    @And("Write username and password as datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable items) {
        List<List<String>> listElemanlar = items.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++) {
            System.out.println("listElemanlar = " +
                    listElemanlar.get(i).get(0) + " " + //username
                    listElemanlar.get(i).get(1));
            //listElemanlar.get(i).get(2)

        }
    }
}
