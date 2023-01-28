### Create sonarqube volumes

```bash
docker volume create --name sonarqube_data
docker volume create --name sonarqube_logs
docker volume create --name sonarqube_extensions
```

### Build image

```bash
docker build -t sonarqube .
```

### Create and run container

```bash
docker run \
  --name sonarqube \
  --publish 9000:9000 \
  --rm \
  --detach \
 sonarqube:latest
```

### Go to sonarqube

<p>
http://host:9000

<p>
default user/pass - admin/admin
