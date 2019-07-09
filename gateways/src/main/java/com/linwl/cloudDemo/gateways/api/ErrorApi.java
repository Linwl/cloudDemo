package com.linwl.cloudDemo.gateways.api;

import com.linwl.cloudDemo.commons.response.ERRORCODE;
import com.linwl.cloudDemo.commons.response.ResponseMsg;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/9 17:01
 * @description：
 */
@RestController
public class ErrorApi implements ErrorController {

    @Override
    public String getErrorPath(){
        return "/error";
    }

    @RequestMapping("/error")
    public ResponseMsg error() {
        return new ResponseMsg.Builder().setErrorCode(ERRORCODE.SystemErr).build();
    }
}
