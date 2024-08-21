package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/sample")

public class scontroller {
   
   @Autowired
sservice ss;
@PostMapping("/mul")
public int  mul(@RequestBody stest t) {
   int mul =ss.mul(t);    
   //return "mul  "+t.getNum1()+" "+t.getNum2()+" "+mul;
    return mul ;
}
@PostMapping("/display")
public String display()
{
	return "HELLO SINDHU";
}

}


