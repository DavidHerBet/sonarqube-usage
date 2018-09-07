package com.everis.digit.sonarqube.usage.service;

public interface DummyService {

  String hello(String name);

  /**
   * Provides "Hello World!" string.
   * @return "Hello World!".
   */
  String helloWorld();

  String getFileAbsolutePath(String path);

}
