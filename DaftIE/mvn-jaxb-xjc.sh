#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export LANG=en
set -e

cd $PROJECT_DIR
rm -f jaxb.timestamp
rm -f src/main/java/org/openestate/io/daft_ie/xml/*.*
$MVN jaxb2:xjc