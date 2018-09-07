package com.everis.digit.sonarqube.usage.service.impl;

import static org.junit.Assert.assertEquals;

import com.everis.digit.sonarqube.usage.service.DummyService;
import org.junit.Before;
import org.junit.Test;

public class DummyServiceImplTest {

    private DummyService dummyService;

    @Before
    public void setUp() {
        dummyService = new DummyServiceImpl();
    }

    @Test
    public void hello() {
        assertEquals("Hello World!", dummyService.hello("World!"));
    }

    @Test
    public void helloWorld() {
        assertEquals("Hello World!", dummyService.helloWorld());
    }
}