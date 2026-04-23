@echo off
echo === STEP 1: Building Producer JAR on Host Machine ===
cd producer
call mvnw clean package -DskipTests
cd ..

echo === STEP 1: Building Consumer JAR on Host Machine ===
cd consumer
call mvnw clean package -DskipTests
cd ..

echo === STEP 2 & 3: Copying JARs to Images and Starting Containers ===
docker-compose up -d --build

echo === Done! ===