# eureka-service

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6fa9396e1a104e5ea8e83b82a5028d8a)](https://app.codacy.com/manual/crina91/eureka-service?utm_source=github.com&utm_medium=referral&utm_content=cdinescu/eureka-service&utm_campaign=Badge_Grade_Settings)

Vitanum: Eureka Service

This is a service discovery server. Once the Kubernetes deployment is finished, it will be replaced by the ClusterIP service.
However, it will be kept in order to facilitate service discovery for the 
automatic unit tests [https://github.com/cdinescu/vitanum-deployment/tree/master/tests]

Technology stack:
  - Spring Framework
  - Spring Cloud
  - Gradle

<hr>

![alt text](https://github.com/cdinescu/eureka-service/blob/master/vitanum_architecture.png)
