#!/bin/bash
for i in {1..300}; do
  echo "counter: $i"
  curl http://localhost:8081/send/leak
  sleep 10
done
