package com.everis.digit.sonarqube.usage.service.impl;

import com.everis.digit.sonarqube.usage.service.DuplicationService;

import java.util.logging.Logger;

public class DuplicationServiceImpl implements DuplicationService {

    private static final Logger LOGGER = Logger.getLogger(DuplicationServiceImpl.class.getName());

    @Override
    public String originalMethod() {
        if (1 > 0) {
            String conditional = "One is greater than zero";
            for (int i=0; i < 4; i++) {
                LOGGER.info(conditional);
                int numberTwo;
                switch (i) {
                    case 0:
                        numberTwo = 0;
                        break;
                    case 2:
                        numberTwo = 2;
                        break;
                    default:
                        numberTwo = 0;
                        break;
                }
                if (numberTwo == 2) {
                    LOGGER.info("The number is 2");
                }
            }
        }
        return "orignalMethod";
    }

    @Override
    public String duplicateMethodOne() {
        return originalMethod();
    }

    @Override
    public String duplicateMethodTwo() {
        return originalMethod();
    }

    @Override
    public String duplicateMethodThree() {
        return originalMethod();
    }
}
