#!/bin/sh
apt-get update -qq
apt-get install -qq clamav-daemon
freshclam
ls -al /etc/clamav/clamd.conf
echo TCPSocket 3310 >> /etc/clamav/clamd.conf
/etc/init.d/clamav-daemon start
cat /etc/clamav/clamd.conf
