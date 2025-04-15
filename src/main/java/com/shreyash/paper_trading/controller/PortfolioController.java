package com.shreyash.paper_trading.controller;

import com.shreyash.paper_trading.model.PortfolioModel;
import com.shreyash.paper_trading.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @GetMapping("/getPortfolio")
    public List<PortfolioModel> getPortfolio(){
        return portfolioService.getPortfolio();
    }

}
