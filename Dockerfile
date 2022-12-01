FROM ubuntu:18.04

RUN apt-get -y update
RUN apt-get -y upgrade
RUN apt-get -y install curl

RUN curl -sL https://github.com/CRaC/openjdk-builds/releases/download/17-crac%2B3/openjdk-17-crac+3_linux-x64.tar.gz | tar zx -C /opt

ENV JAVA_HOME /opt/openjdk-17-crac+3_linux-x64
ENV PATH $PATH:$JAVA_HOME/bin
