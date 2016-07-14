#!/bin/bash

DIR=~/mujava/mujava/result/$1

mkdir $1 && cd $1
cp -r $DIR/original .

mkdir mutants && cd mutants
for func in $(cat $DIR/traditional_mutants/method_list); do
    cp -r $DIR/traditional_mutants/$func/. .
done
