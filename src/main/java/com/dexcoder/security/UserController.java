package com.dexcoder.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liyd on 16/6/20.
 */
@Controller
public class UserController {

    @RequestMapping(value = { "", "/index" }, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/user-page", method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin','user')")
    public String userPage() {
        return "user-page";
    }

    @RequestMapping(value = "/admin-page", method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('admin')")
    public String adminPage() {
        return "admin-page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/403")
    public String forbidden() {
        return "403";
    }
}
