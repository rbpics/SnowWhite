package com.picsauditing.service.security.API;

import com.picsauditing.service.security.exception.LoginException;
import scala.Option;
import scala.util.Either;

public interface SecurityContext {

    void login(String username, String password) throws LoginException;

    boolean isLoggedIn();

    void logout();

    void touchSession();

    Object getSessionVariable(String key);

    void setSessionVariable(String key, Object value);

    String getUsername();

    Integer getUserID();

}
