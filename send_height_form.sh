#!/bin/bash

curl -v \
   -d 'kind=height' \
   -d 'val=180' \
   -d 'date=2015/11/02' \
   http://localhost:8080/api/form/save | jq
