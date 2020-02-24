#!/bin/bash
CMD=${1}
APP_CONTAINER="sunjoo-sample-ui"
APP_CONTAINER_SCALE=2
num_pattern='^[0-9]+$'

if [[ ${2} =~ ${num_pattern} ]] ; then
APP_CONTAINER_SCALE=${2}
fi

case $CMD in 
    start)
        docker-compose up -d --scale ${APP_CONTAINER}=${APP_CONTAINER_SCALE}
        ;;
    stop)
        docker-compose down
        ;;
    status)
        docker-compose ps
        ;;
    restart)
        docker-compose down
        docker-compose up -d --scale ${APP_CONTAINER}=${APP_CONTAINER_SCALE}
        ;;
    deploy)
        docker-compose build  --no-cache ${APP_CONTAINER}
        docker-compose up -d --scale ${APP_CONTAINER}=${APP_CONTAINER_SCALE} --build --force-recreate
        ;;
    scale-adjust)
        docker-compose up -d --scale ${APP_CONTAINER}=${APP_CONTAINER} --build --force-recreate
        ;;
esac
