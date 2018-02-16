package com.jimsp.playgroud.cucumber.stepdefs;

import com.jimsp.playgroud.JHipsterPlaygroudApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JHipsterPlaygroudApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
