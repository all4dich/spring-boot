FROM gradle:6.2-jdk8
MAINTAINER Sunjoo Park "all4dich@gmail.com"
ENV app_dir=spring-boot-samples/spring-boot-sample-web-ui
RUN rm -rf /work
RUN mkdir -p /var/container_log
RUN git clone --depth 1 -b sunjoo https://github.com/all4dich/spring-boot.git /work
#WORKDIR /work/spring-boot-samples/spring-boot-sample-web-ui
WORKDIR /work/$app_dir
#CMD ["gradle", "bootRun", "2>&1",  "|", "tee", "/dev/stderr", ">", "/var/container_log/${HOSTNAME}.log"]
CMD /bin/bash -c "gradle bootRun 2>&1 | tee /dev/stderr > /var/container_log/${HOSTNAME}.log"

