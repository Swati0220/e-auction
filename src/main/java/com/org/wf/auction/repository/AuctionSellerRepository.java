package com.org.wf.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.wf.auction.entity.Seller;

@Repository
public interface AuctionSellerRepository extends JpaRepository<Seller, Long>{

}

