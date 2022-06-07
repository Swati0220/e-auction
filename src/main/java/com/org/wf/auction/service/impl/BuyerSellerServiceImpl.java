package com.org.wf.auction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.wf.auction.repository.AuctionBuyerRepository;
import com.org.wf.auction.service.AuctionBuyerService;

public class BuyerSellerServiceImpl implements AuctionBuyerService{
	
	@Autowired
	private AuctionBuyerRepository auctionBuyerRepository;
	
	
}
