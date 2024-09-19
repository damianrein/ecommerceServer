package com.ecommerceServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.ExcelService;

@RestController
@RequestMapping("/f1")
public class ExcelController {

	private ExcelService service;
}
