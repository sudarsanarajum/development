---
applications:
- name: hello-boot
  memory: 512M
    instances: 1
      services: []
        host: hello-boot-rags
          path: ./target/myproject-0.0.1-SNAPSHOT.jar
            env:
               JAVA_OPTS: -Drebel.remoting_plugin=t^Z
~

