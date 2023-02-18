package main.java.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyUser implements User{

    private User user = new Employee();
    private static final List<String> blocked = new ArrayList<>();

    ProxyUser(){
        blocked.add("dosmakhambet");
        blocked.add("java");
        blocked.add("c++");
    }

    @Override
    public void login(String username) {
        if(blocked.contains(username)){
            System.out.println(username + " blocked.");
        }else{
            user.login(username);
        }
    }
}
