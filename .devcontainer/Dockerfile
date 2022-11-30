FROM clojure:temurin-18-lein-jammy
RUN apt update && apt install -y git npm gcc
ENV LEIN_JVM_OPTS='--add-modules=jdk.incubator.foreign --enable-native-access=ALL-UNNAMED'