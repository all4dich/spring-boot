# Sunjoo Park - Spring Boot Sample Web UI

## Quick Start for running an application 
1. Clone 'sunjoo' branche with this command. If you want to show a full history, drop ```--depth 1```.
```
$> git clone -b sunjoo --depth 1 https://github.com/all4dich/spring-boot.git
```
2. Run 'goto-web-ui-dir.sh' script in ```spring-boot``` directory
```
$> pushd spring-boot
$> . goto-web-ui-dir.sh
```
3. Run ```./devops.sh help``` to show a list of commands
```
$> ./devops.sh help
Available commands:
devops.sh [start | stop | restart | deploy | status | scale-adjust]
```
4. Run ```./devops.sh start``` to start services
5. Check ```./logs``` directory to view applications containers/nginx proxy server's logs

## Commands 

### ```./devops.sh start ${Number of app containers}```
* Create services that you define in docker-compose.yaml
* If you don't define ${Number of app containers} value as an integer, 
two of application containers are created and made

### ```./devops.sh stop ```
* Stop all containers for services and remove generated resources

### ```./devops.sh restart ```
* Stop all containers for services and remove generated resources

### ```./devops.sh deploy ${Number of app containers}```
* Rebuild all images for containers and  recreate running containers
* If  ${Number of app containers} is greater than current number of containers
** Create more containers.

### ```./devops.sh status```
* Show a list of containers that are running for services

### ```./devops.sh scale-adjust ${Number of app containers}```
* Show a list of containers that are running for services

## Environments
* Logs
  * Container logs: ```$WORKSPACE/logs/container_log/$HOSTNAME.log```
  * NGINX logs: ```$WORKSPACE/logs/nginx/```




