#!/bin/bash

curl -v -H 'Accept: application/json' \
        -H 'Content-type: application/json' \
        -X POST \
        -d '{ "kind":"weight", "data":{"val":"60", "date":"2016-10-01"}}' \
        http://localhost:8080/api/json/save | jq
