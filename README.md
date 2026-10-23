## Docker Introduction:
   --> Docker is an open-source platform used to develop, package, and run applications inside lightweight, isolated environments called containers. 
   --> It packages an application along with its dependencies, libraries, and configuration so that it runs consistently across different environments.
   --> Docker is tool to acheive containerization.
   --> Docker used different component to acheive this

Example: An application runs the same way on a developer's laptop, a testing server, and a production server using Docker.

1. Virtualization
Definition: Virtualization is a technology that allows multiple virtual machines (VMs) to run on a single physical machine. Each VM has its own operating system.

Example: Running Windows and Linux as separate virtual machines on one computer using VirtualBox.
2. Containerization
Definition: Containerization is a technology that packages an application and its dependencies into an isolated environment called a container. Containers share the host OS kernel.

Example: Running a Java Spring Boot application inside a Docker container.
3. Docker Image
Definition: A Docker image is a read-only template that contains the application code, libraries, dependencies, and configuration required to create a container.

Example: The nginx:latest image contains the files needed to run an Nginx web server.
4. Docker Container
Definition: A Docker container is an instance of a Docker image that runs an application in an isolated environment. It can be started, stopped, and deleted.

Example: Creating and running an Nginx container using the nginx:latest image.
5. Docker Hub
Definition: Docker Hub is a cloud-based registry where developers can store, share, and download Docker images.

Example: Downloading the Nginx image from Docker Hub using:
docker pull nginx
