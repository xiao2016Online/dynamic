package com.xiaopy.dynamic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaopeiyu
 * @since 2020/4/4
 */
@RestController
@RequestMapping("#{getUrl}/123")
public class CustomController {

    @GetMapping("/custom")
    public String getTest(){
        return "custom";
    }

}
