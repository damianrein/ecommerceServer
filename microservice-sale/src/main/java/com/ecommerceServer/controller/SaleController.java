package com.ecommerceServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.SaleService;

@RestController
@RequestMapping("/v8")
public class SaleController {

	private SaleService service;
}
