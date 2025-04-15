package com.shreyash.paper_trading.services;

import com.shreyash.paper_trading.model.PortfolioModel;
import com.shreyash.paper_trading.repo.PortfolioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    PortfolioRepo portfolioRepo;

    public List<PortfolioModel> getPortfolio(){
        return portfolioRepo.findAll();
    }

}
