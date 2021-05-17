package com.hyunsu.teslaweb.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ShopController {

    @RequestMapping("/shop")
    public String shop() {
        log.info("shop controller test");
        return "tesla_shop_main";
    }
}
