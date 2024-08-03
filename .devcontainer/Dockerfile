# syntax=docker/dockerfile:1
FROM gastudil/courses:base
MAINTAINER Gabriel Astudillo Muñoz "gabriel.astudillo@uv.cl"


ARG DEBIAN_FRONTEND=noninteractive
ENV TZ=America/Santiago


RUN apt update && apt -y upgrade
RUN apt install -y sudo apache2     \
					make g++ cmake  \
					vim             \
					jq              \					
					bc              \
					pip             \
					git             \
					default-jdk	\
					supervisor     


RUN apt clean && rm -rf /var/lib/apt/lists/*
					
RUN adduser --gecos "" --disabled-password --ingroup www-data devuser
RUN adduser devuser sudo

RUN ldconfig

ADD ["image_dir/etc/sudoers", "/etc/sudoers"]
ADD ["image_dir/etc/apache2/sites-available/000-default.conf", "/etc/apache2/sites-available/" ]
ADD ["image_dir/etc/supervisord.conf", "/etc/supervisord.conf"]


USER devuser

RUN cd /home/devuser && mkdir workspace
#git clone https://github.com/gabriel-astudillo/demps.git


WORKDIR /home/devuser/

USER root

EXPOSE 80
ENTRYPOINT ["/usr/bin/supervisord", "-c", "/etc/supervisord.conf"]







