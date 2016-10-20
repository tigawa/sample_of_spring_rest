#!/bin/bash

curl -v -H 'Accept: application/json' \
        -H 'Content-type: application/json' \
        -X POST \
        -d '{ "kind":"height", "val":"180", "date":"2015-11-01" }' \
        http://localhost:8080/api/json/save | jq
