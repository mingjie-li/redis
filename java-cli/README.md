**maven build**

```mvn clean install```

**docker**

```docker build -t test:1.0.0 .```

**run cli in minikube**

```kubectl run java-cli --image=test:1.0.0 --image-pull-policy=Never```

make sure your minikube can connect to local docker daemon.

otherwise check this doc: https://github.com/kubernetes/minikube/blob/0c616a6b42b28a1aab8397f5a9061f8ebbd9f3d9/README.md#reusing-the-docker-daemon