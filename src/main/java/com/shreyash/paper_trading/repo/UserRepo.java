package com.shreyash.paper_trading.repo;

import com.shreyash.paper_trading.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    UserModel findByMobileno(int mobileno);
}
