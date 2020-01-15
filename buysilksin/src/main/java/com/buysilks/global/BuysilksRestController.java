package com.buysilks.global;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BuysilksRestController {
	
	@RequestMapping(value="/buysilks", method=RequestMethod.GET)
	public String display()
	{
	return "Hello Buysilks";	
	}

}
