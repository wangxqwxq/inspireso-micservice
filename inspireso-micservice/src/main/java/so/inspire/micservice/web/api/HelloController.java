/*
 * Copyright (c) 2015, Inspire.so and/or its affiliates. All rights reserved.
 */

package so.inspire.micservice.web.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Inspireso Tream
 */

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    // GET /hello/lanxe?wd=aaaa
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/hello/{name}"
    )
    public String hello(
            @PathVariable("name") String name,
            @RequestParam(value = "wd", required = false, defaultValue = "a") String wd) {
        return "hello " + name + String.format("%s", wd);
    }
}
