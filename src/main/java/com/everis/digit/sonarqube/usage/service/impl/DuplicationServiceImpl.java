package com.everis.digit.sonarqube.usage.service.impl;

import com.everis.digit.sonarqube.usage.service.DuplicationService;

public class DuplicationServiceImpl implements DuplicationService {

    @Override
    public String originalMethod() {
        if (1 > 0) {
            String conditional = "One is greater than zero";
            for (int i=0; i < 4; i++) {
                int iterationNumber = i;
                System.out.println("The number is " + iterationNumber);
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
                    System.out.println("The number is 2");
                }
            }
        }
        return "orignalMethod";
    }

    @Override
    public String duplicateMethodOne() {
        if (1 > 0) {
            String conditional = "One is greater than zero";
            for (int i=0; i < 4; i++) {
                int iterationNumber = i;
                System.out.println("The number is " + iterationNumber);
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
                    System.out.println("The number is 2");
                }
            }
        }
        return "orignalMethod";
    }

    @Override
    public String duplicateMethodTwo() {
        if (1 > 0) {
            String conditional = "One is greater than zero";
            for (int i=0; i < 4; i++) {
                int iterationNumber = i;
                System.out.println("The number is " + iterationNumber);
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
                    System.out.println("The number is 2");
                }
            }
        }
        return "orignalMethod";
    }

    @Override
    public String duplicateMethodThree() {
        if (1 > 0) {
            String conditional = "One is greater than zero";
            for (int i=0; i < 4; i++) {
                int iterationNumber = i;
                System.out.println("The number is " + iterationNumber);
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
                    System.out.println("The number is 2");
                }
            }
        }
        return "orignalMethod";
    }
}
