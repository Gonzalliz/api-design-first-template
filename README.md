## Table of Contents

* [Project title](#project-title)
* [Project overview](#project-overview)
* [Repository overview](#repository-overview)
* [Getting started](#getting-started)
* [Usage](#usage)
* [References](#references)
* [Contact](#contact)
* [License](#license)


<!-- Project title
Include the project title
-->
## Project title
### api-design-first-template


<!-- About the project
Include the following
* A brief about the business problem, research
* High level functionality 
* A brief on the tech stack
* Architectural diagrams, flow diagrams (store in an `assert` directory)
 -->
## Project overview

API design first template using open-api-generator. 
This template lets automatic code generation by referring to the API contract. I strongly recommend following [this](https://medium.com/@chamaral/what-is-api-design-first-approach-draft-ee14ae1369c4) 
document to get to the context before proceeding.

### Project features
- Auto generation of stubs based on the API contract

### Tech stack

* [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)

<!-- Repository overview
Include the tree view of the directory structure and a brief of content
-->
## Repository overview

The overview of the imaginary project directory structure
```
├── gradlew
├── gradlew.bat
├── README.md
├── scripts
│   └── clean.sh
├── settings.gradle
├── specs                                                           # openAPI specification documents
│   └── customer
│       └── customer-api.yml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── demo
    │   │           └── bootstrap
    │   │               ├── ApiDesignFirstApplication.java
    │   │               ├── config                                  # openAPI specific configurations
    │   │               │   └── openapi
    │   │               │       ├── HomeController.java
    │   │               │       └── OpenAPIDocumentationConfig.java
    │   │               ├── controller                              # controller package which contains routes
    │   │               ├── dto                                     # dto package
    │   │               └── RFC3339DateFormat.java                  # openAPI generated file
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── com
                └── demo
                    └── bootstrap
                        └── ApiDesignFirstApplicationTests.java                                    
```

<!-- Getting started
Include how to setup guides, instruction
* Prerequisites
* Installation, local setup instructions
-->
## Getting started

To get a local copy follow these steps

### Prerequisites

* Java 11 or higher

<!-- Usage
Include project building and running instructions
* Build project instructions
* Run project instructions
* Swagger references or endpoint information
* Unit test execution instructions
* CI/CD instruction
-->
## Usage

### Building and Running Locally

1. Clone or create a repository out from this template repository - Refer [this](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template)

2. Generate the codes against the sample customer CRUD API contract in `specs/customer/customer-api.yml`
```sh
./gradlew openApiGenerate
```

3. Clean the code
```sh
cd scripts
./clean.sh
```

<!--References
Include the confluence pages or any reference materials related to the project
* What's next documentation links
-->
## References
* [Open API Tools](https://github.com/OpenAPITools/openapi-generator)

<!-- Contact
Include the main contact points of the team
* Distribution list
-->
## Contact

* Chuck Norris

<!-- License
Include license information if applicable
-->
## License
N/A