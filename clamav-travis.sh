#!/bin/sh
apt-get update -qq
apt-get install -qq clamav-daemon
time freshclam
echo TCPSocket 3310 >> /etc/clamav/clamd.conf
/etc/init.d/clamav-daemon start
