## Instruction.
1. Pull the repo.
2. Run docker build .
3. Copy the signature.
4. Run 
```
docker run -it {image signature}
```

## To push the docker image to the docker hub
1. Create a repository in the dockerhub
2. it will show the docker push command on the right side. 
3. Copy everything starting from your name to the repo name. 
4. Build the image by running
```
docker build -t <username>/<repo name>
```
The -t command will name your image. 
5. Now you can push the docker image by running the docker command and you can either omit the tag or not. 