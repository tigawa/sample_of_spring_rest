#!/bin/bash

curl -v \
   -d 'kind=weight' \
   -d 'val=a' \
   -d 'date=2016/10/01' \
   http://localhost:8080/api/form/save | jq
