#!/usr/bin/env bash
./mvnw clean package
docker build -t eureka_ms .
docker run -d -p 2101:2101 --name eureka_ms eureka_ms
