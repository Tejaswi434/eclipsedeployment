package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class sservice {
	int mul(stest t)
	{
	    return t.getNum1()*t.getNum2();
	}
	}