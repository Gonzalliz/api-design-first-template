#!/bin/bash

PROJECT_ROOT_DIR="../"
SRC_PATH="../src/main/java/"
PACKAGE_NAME="com/demo/bootstrap/"

# post processing
# removal of unwanted files created by the openapi-generator plugin
rm "${parent_path}${SRC_PATH}${PACKAGE_NAME}OpenAPI2SpringBoot.java"

cd ${parent_path}${SRC_PATH}
rmdir -p org/openapitools/configuration
rmdir -p src/main/resources