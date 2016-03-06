#!/usr/bin/python
__author__ = 'lipeng'

import subprocess,os,re
print "shit"

def getClipboardData():
    p = subprocess.Popen(['pbpaste'], stdout=subprocess.PIPE)
    retcode = p.wait()
    data = p.stdout.read()
    return data

class A:
    def __init__(self):
        print('I\'m GrandPa')

    def test(self):
            data = getClipboardData()
            a= data
            b= data
print getClipboardData()
