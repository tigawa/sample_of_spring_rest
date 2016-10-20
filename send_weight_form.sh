#!/bin/bash

curl -v \
   -d 'kind=weight' \
   -d 'val=60.1' \
   -d 'date=2015/11/01' \
   http://localhost:8080/api/form/save | jq
