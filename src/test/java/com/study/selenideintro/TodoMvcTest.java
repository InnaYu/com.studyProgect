package com.study.selenideintro;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
public class TodoMvcTest {

    @Test
    void completeTask(){
        Configuration.timeout = 6000;
        Configuration.browser = Browsers.FIREFOX;
        //open TodoMVC
        open("http://todomvc.com/examples/emberjs/");

        //add task: "a", "b", "c";
        // find new task edit box; set value to "a"; press Enter
        element("#new-todo").setValue("a").pressEnter();
        element("#new-todo").setValue("b").pressEnter();
        element("#new-todo").setValue("c").pressEnter();
        //tasks should be: "a", "b", "c";
        elements("#todo-list>li").shouldHave(exactTexts("a", "b", "c"));

        //toggle b
        //1.among all tasks 2.find the one "b" text
        //3. find its "toggle" checkbox 4.Click it
        elements("#todo-list>li").findBy(exactText("b"))
                .find(".toggle").click();

        //completed task should be b

        elements("#todo-list>li").filterBy(cssClass("completed"))
                .shouldHave(exactTexts("b"));
        //active task should be a, c
        elements("#todo-list>li").filterBy(not(cssClass("completed")))
                .shouldHave(exactTexts("a", "c"));



    }
}
