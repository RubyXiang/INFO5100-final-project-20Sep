package service;

import io.Dealer;

import java.io.IOException;

public interface DealerLoginService {

    public boolean dealerVerifyLogin(String id, String password) throws IOException;
}
