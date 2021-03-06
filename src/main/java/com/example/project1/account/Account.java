package com.example.project1.account;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;


public class Account implements UserDetails{
    private String id;
    private String password;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;
    private Collection <? extends GrantedAuthority> authorities;

    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    @Override
    public Collection <? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return this.authorities;
    }
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public void setAccountNonExpired(boolean isAccountNonExpired){
        this.isAccountNonExpired = isAccountNonExpired;
    }
    public void setAccountNonLocked(boolean isAccountNonLocked){
        this.isAccountNonLocked = isAccountNonLocked;
    }
    public void setCredentialsNonExpired(boolean isCredentialsNonExpired){
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }
    public void setEnabled(boolean isEnabled){
        this.isEnabled = isEnabled;
    }

    public void setAuthorities(Collection <? extends GrantedAuthority> authorities){
        this.authorities = authorities;
    }
    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.id;
    }
    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return this.isAccountNonExpired;
    }
    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return this.isAccountNonLocked;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return this.isCredentialsNonExpired;
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return this.isEnabled;
    }

}