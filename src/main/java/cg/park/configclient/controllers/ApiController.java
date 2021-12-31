package cg.park.configclient.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/test")
    public String apiTest() {

        logger.info("### info !!!");
        logger.debug("### debug !!!");
        return "test입니다.";
    }

}