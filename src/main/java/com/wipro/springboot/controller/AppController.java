package com.wipro.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

@Value(value="${custom.message}") private String message;
@RequestMapping("/message")
@ResponseBody
private String getMessage()
{
	return message;
}
}
