package com.shreyash.paper_trading.repo;

import com.shreyash.paper_trading.model.PortfolioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepo extends JpaRepository<PortfolioModel, Integer> {

}
