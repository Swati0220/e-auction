package com.org.wf.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.wf.auction.service.AuctionSellerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/e-auction/api/v1/buyer")
public class AuctionBuyerController {

	@Autowired
	private AuctionSellerService auctionSellerInterface;
	
	@GetMapping("/hellow world")
	public String helloWorld() {
		return "Hellow World";
	}
	
}
