# Master Microservices with Spring Boot, Docker, Kubernetes

Welcome to the repository dedicated to mastering Microservices development using Spring, Spring Cloud, Docker, and Kubernetes. Whether you're a newbie or an experienced developer, I've designed this repository to provide you with the essential skills and knowledge needed to build resilient and scalable Microservices architectures.

## My YouTube Channel
#### I've documented various aspects of this project on my YouTube channel. Below are links to the corresponding explanatory videos:

- [Dockerfile | Docker-compose #1 PRACTISE](https://youtu.be/-pKkNqF5bqA?si=3h4tka7r9APmWKHz)
- [Config Server(Docker Compose #2)](https://youtu.be/45s_errticE?si=4pssZy01DGfMOm5f)
- [Elasticsearch+Kibana+Logstash+OAUTH2](https://youtu.be/BrQIEouK7Hg?si=y8vjx3bVqd-XoCRl)
- [Getting Started with Kubernetes Manifest Files](https://youtu.be/RiJ_H9W0-Jw?si=1GwkxQPenviJ2LN5)
- [Kubernetes Dashboard Login](https://youtu.be/bvAHo0AVxQ4?si=W1rdM3mw-8J5_n0R)
- [KUBERNETES DISCOVERY SERVER](https://youtu.be/rVZ1O5SG_-I?si=5WPY7tpEXfmO6iC_)
- [HELM INSTALLATION & CHART Download and Use #1](https://youtu.be/-ZNL3AuL-Lo?si=ySgaedBAl0TEhnek)
- [CREATING A HELM CHART #2](https://youtu.be/9uHKI-5l7Q8?si=CsIhnwjmqRmKPt09)
- [Keycloak(Part-1)](https://youtu.be/wb3AoNVisB4?si=Ejk5PJs5EEJmYW1u)

## Project Structure
#### The projects in Section_1 and Section_2 operate on similar logic, with Section_1 utilizing the Eureka server and Section_2 employing the Kubernetes discovery server.

1. `person-service` and `work-service` facilitate CRUD operations within our project.
2. `api-gateway` serves as the project's gateway.
3. The `kubernetes` folder contains manifest files and configurations for project services. Section_2 differs from Section_1 by including the `kubernetes-discoveryserver.yml` file.
4. The `helm` folder encompasses the project's helm charts and configurations, offering a straightforward method for project execution using helm.

## Deploying

#### Launching the project is straightforward with helm charts:


1. Download and run the Postgresql and keycloak chart inside the helm folder.
```sh
helm install postgresql postgresql
helm install keycloak keycloak
```
2. Download and run the dev-env or prod-env chart inside the environment folder.
```sh
helm install jahangirzada dev-env
```
3.  If you download other charts to your computer and run them, you can benefit from other functionalities of the project
```sh
helm install prometheus kube-prometheus
helm install loki grafana-loki
helm install tempo grafana-tempo
helm install grafana grafana
```

## My Goal In This Repository

#### My goal is to see and push the limits of my power by learning and practicing every day. If you like doing team projects or learning something, don't hesitate to contact me. I will be happy to support you or change the world with you.

[My Linkedin Profile](https://www.linkedin.com/in/jahangirzadanurlan/ "My Linkedin Profile")

