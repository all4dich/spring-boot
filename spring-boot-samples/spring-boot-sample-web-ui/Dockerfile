FROM gradle:6.2-jdk8
MAINTAINER Sunjoo Park "all4dich@gmail.com"
ENV app_dir=spring-boot-samples/spring-boot-sample-web-ui
RUN rm -rf /work
RUN git clone --depth 1 -b sunjoo https://github.com/all4dich/spring-boot.git /work
#WORKDIR /work/spring-boot-samples/spring-boot-sample-web-ui
WORKDIR /work/$app_dir
CMD ["gradle", "bootRun"]

