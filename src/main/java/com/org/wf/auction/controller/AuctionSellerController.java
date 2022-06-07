package com.org.wf.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.wf.auction.model.SellerRequest;
import com.org.wf.auction.service.AuctionSellerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/e-auction/api/v1/seller")
public class AuctionSellerController {

	@Autowired
	private AuctionSellerService auctionSellerInteface;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping("/rest/employee/create")
	public String createAuctionSeller(@RequestBody SellerRequest sellerRequest) {
		try {
			 auctionSellerInteface.createAuctionSeller(sellerRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
