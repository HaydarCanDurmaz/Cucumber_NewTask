package StepDefinitios;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void after(){
        System.out.println("Senaryo Case is done");
        GWD.quitDriver();
    }
}
