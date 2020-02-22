FROM gradle:6.2-jdk8
MAINTAINER Sunjoo Park "all4dich@gmail.com"
RUN mkdir /work
WORKDIR /work
RUN git clone -b sunjoo https://github.com/all4dich/spring-boot.git .
CMD ["gradle", "bootRun"]

