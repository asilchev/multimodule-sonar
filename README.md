### Create sonarqube volumes

```
docker volume create --name sonarqube_data
docker volume create --name sonarqube_logs
docker volume create --name sonarqube_extensions
```

### Build image

```
docker build -t sonarqube .
```

### Create and run container

```
docker run \
  --name sonarqube \
  --publish 9000:9000 \
  --rm \
  --detach \
 sonarqube:latest
```

### Go to sonarqube

http://host:9000

default user/pass - admin/admin
