package com.everis.digit.sonarqube.usage.service.impl;

import static org.junit.Assert.assertEquals;

import com.everis.digit.sonarqube.usage.service.DuplicationService;
import org.junit.Before;
import org.junit.Test;

public class DuplicationServiceImplTest {

    private DuplicationService duplicationService;

    @Before
    public void setUp() {
        duplicationService = new DuplicationServiceImpl();
    }

    @Test
    public void originalMethod() {
        assertEquals("orignalMethod", duplicationService.originalMethod());
    }
}