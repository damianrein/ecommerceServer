package com.ecommerceServer.controller;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.ExcelService;

@RestController
@RequestMapping("/f1")
public class ExcelController {

	private ExcelService service;

	public ExcelController(ExcelService service) {
		this.service = service;
	}
	
	@GetMapping("/excel")
	public ResponseEntity<Workbook> retireInfo(){
		return ResponseEntity.ok(service.allUserInfo());
	}
}
