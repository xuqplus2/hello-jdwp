package com.github.xuqplus2.hellojdwp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AController {

	@RequestMapping
	public String a(String param) {
		log.info("param=>{}", param);
		return param;
	}
}
