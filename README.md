# SonarQube Usage
Example Java code to be analyzed by SonarQube for metrics example.

![Image of SonnarQube](https://www.sonarqube.org/assets/logo-31ad3115b1b4b120f3d1efd63e6b13ac9f1f89437f0cf6881cc4d8b5603a52b4.svg)

## Requirements
- Java 8
- Apache Maven 3+

## Usage
- Download SonarQube from the following link: https://www.sonarqube.org/downloads/
- Unzip where desired once it's downloaded
- Start SonarQube server, executing StartSonar.bat on windows or sonar.sh on other OS from bin folder
- When server is already started, log in to http://localhost:9000 with System Administrator credentials (admin/admin)
- Once logged, there is a tutorial to start analyzing a project, you need to provide:
  - A word to generate the token: introduce "sonarqube-usage"
  - Project language: select "Java"
  - Build technology: select "Maven"
- Uncomment "sonar.login" maven property on project's pom.xml and replace its value with SonarQube provided token
- Execute `mvn clean install sonar:sonar` at project root level
- See the result of the analysis on SonarQube server
