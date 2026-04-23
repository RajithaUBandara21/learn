# Asyncronence Communication beatween two service using kafka with streaming data 

## 1. Project Overview

This project shows the real world simulation how comunicate microservices through kafka.with stream data
---

## 2. Objective

Build a async comunication beatween two services using kfka and send stream data.

1. Get stream data from wikimedia api
2. Create producer server using spring boot
3. create consumer using spring boot
4. configure kafka topic and test
5. display comming messages in html page

---

## 3. Inputs

Wikimedia steram API
"https://stream.wikimedia.org/v2/stream/recentchange"

---

## 4. Required Outputs

Display stream data in HTML page :


## 5. How to Build

i create automation script for build jar file for two service and run docker compose after it. all automaticaly start.

From the task directory:

```powershell

for windows ./windows_run-all.cmd
for mca or linux bash mac_run-all.cmd
```

---

## 6. How to Run (Tests)

```
get cal send to this api "http://localhost:8010/api/v1/wikimedia"

and open display folder Html file it display all stream messages 
```

Expected output:

```
sreaming messages
```

