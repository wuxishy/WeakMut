#!/bin/bash

DIR=~/mujava/mujava/result/$1

mkdir $1 && cd $1
cp -r $DIR/original .

mkdir mutants && cd mutants
for func in $(cat $DIR/traditional_mutants/method_list); do
    for mut in $(ls $DIR/traditional_mutants/$func); do
        cp $DIR/traditional_mutants/$func/$mut/$1.java $mut.java
    done
done
