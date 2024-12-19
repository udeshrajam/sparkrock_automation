# sparkrock_automation

##  Hybrid Automation test Framework using BDD

Behaviour Driven Development test automaton framework for assessment

-- In this test framework I used below tech stacks --
* Cucumber - test layer
* Java - primary language

###### Prerequisites:
* Java 11 above
* Maven > 3.8.1


### Framework Structure:
* Config.properties (Path: src/main/resources/config.properties)
    * Browser - firefox or chrome
    * Url
    * Type of Users (problem_user or standard_user)

* Utility
    * testBase  - config get data method
    * baseClass - browser configuration

* Pages (Path: src/main/java/org/example/pages)
    * locators and functions and logics

* Steps (Path: src/test/java/steps_definitions)
    * step definitions

* assessment.feature (Path: src/test/java/features/assessment.feature)
    * Scenario 01: Verify user can sort the product list for "Name Z to A
    * Scenario 02: Verify user can complete an order
        
    
### How to Execute:
* Navigate to assessment.feature -> Right-Click on the feature file -> click Run or Click Play / Run button near the Scenarios.
