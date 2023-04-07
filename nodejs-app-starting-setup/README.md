## Summary
1. What we do in this module is we create a Dockerfile file that will contain our instruction on how we are going to create the image.
2. We first write the node command to make sure that we will pull the node image from the dockerhub.
3. We set the working directory by executing the WORKDIR /app command.
4. We copy all the files from the local computer to the docker image. 
5. And then we are going to run npm install.
6. We will expose the port 80 of the container to our local pc. 
7. The CMD should always be the last command in every docker file.
8. We now need to build the image by running docker build .
9. We can now go and run docker ps to get the name of the container we created.
10. Then run the newly created container by
    docker run -p 3000:80 {name of container}
11. The run command will run the docker image and then the -p will be to expose our local port to the docker image port. 
