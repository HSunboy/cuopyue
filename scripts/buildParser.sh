#!/bin/bash
shopt -s expand_aliases
source ~/.bash_profile
antlr4 -visitor antlr/spark/grammar/spark.g4 -o antlr/spark/output/ -Dlanguage=JavaScript  -Xexact-output-dir