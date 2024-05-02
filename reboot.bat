@echo off

docker "compose" "down" "--volumes" && "compose" "up" "--build"