#! /usr/bin/env python3 
# -*- coding: utf-8 -*-

from sys import argv, stdin

start = 0
input = argv[1].strip() if len(argv) > 1 else stdin.read().strip()
for token in input.split():
    end = start + len(token)
    print("({:>4}, {:>4})\t{}".format(start, end, token))
    start = end + 1
