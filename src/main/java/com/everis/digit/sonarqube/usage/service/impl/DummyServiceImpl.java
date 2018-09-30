package com.everis.digit.sonarqube.usage.service.impl;

import com.everis.digit.sonarqube.usage.service.DummyService;
import java.io.File;

public class DummyServiceImpl implements DummyService {

  @Override
  public String hello(String name) {
    return "Hello " + name;
  }

  @Override
  public String helloWorld() {
    return hello("World!");
  }

  @Override
  public String getFileAbsolutePath(String path) {
    File file = new File(path);
    return file.getAbsolutePath();
  }

  @Override
  public String toString() {
    return "DummyServiceImpl";
  }
}
