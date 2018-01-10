package com.service.sinorocse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSinorocse {

        SinorocseDelegate sinorocseDelegate = new SinorocseDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sinorocseDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}