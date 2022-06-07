package com.org.wf.auction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.wf.auction.model.SellerRequest;
import com.org.wf.auction.repository.AuctionBuyerRepository;
import com.org.wf.auction.service.AuctionSellerService;

@Service
public class AuctionSellerServiceImpl implements AuctionSellerService{
	@Autowired
	private AuctionBuyerRepository auctionBuyerRepository;

	@Override
	public String createAuctionSeller(SellerRequest sellerRequest) {
		return null;
		//auctionBuyerRepository.saveAndFlush(sellerRequest);
	}
	
	
}
