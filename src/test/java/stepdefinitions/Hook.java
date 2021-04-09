package stepdefinitions;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void start(){
        System.out.println("start");
        BasePage.initializeDriver();

    }

    @After
    public void end(){
        BasePage.tearDown();
    }}
