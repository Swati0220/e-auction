package com.org.wf.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.wf.auction.entity.Buyer;
import com.org.wf.auction.entity.Seller;
import com.org.wf.auction.model.SellerRequest;

@Repository
public interface AuctionBuyerRepository extends JpaRepository<Buyer, Long>{

	void saveAll(SellerRequest sellerRequest);

}
