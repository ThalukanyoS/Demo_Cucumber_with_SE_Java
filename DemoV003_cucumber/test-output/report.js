$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.the_user_Enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "the user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user Enters Email as \"\u003cemail\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin1@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.the_user_Enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Enters Email as \"admin1@yourstore.com\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.the_user_Enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.Steps.page_Title_should_be(Steps.java:58)\r\n\tat ✽.Page Title should be \"Dashboard / nopCommerce administration\"(file:Features/Login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});