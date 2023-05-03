## Workshop 37

## Server side

## Windows
set DO_STORAGE_KEY=
set DO_STORAGE_SECRETKEY=
set DO_STORAGE_ENDPOINT=https://kath-lin.sgp1.digitaloceanspaces.com
set DO_STORAGE_ENDPOINT_REGION=sgp1

MVN CLEAN SRPING-BOOT:RUN

## Client side
ng build

copy all files from dist folders to server static folder