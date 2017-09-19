#!/bin/sh
a=0
javac ping.java
while [ $a -lt 50 ]
do
   xterm -e 'java ping | less' &
   a=`expr $a + 1`
done

