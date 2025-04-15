package com.shreyash.paper_trading.services;

import com.shreyash.paper_trading.model.UserModel;
import com.shreyash.paper_trading.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserModel getUser(int mobileNo){
        return userRepo.findByMobileno(mobileNo);
    }



}
