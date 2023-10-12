FROM ubuntu:latest
LABEL authors="elasri"

ENTRYPOINT ["top", "-b"]