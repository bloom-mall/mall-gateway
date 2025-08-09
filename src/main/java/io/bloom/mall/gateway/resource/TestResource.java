package io.bloom.mall.gateway.resource;

import io.bloom.mall.gateway.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestResource {
    private final NacosConfig nacosConfig;

    @Autowired
    public TestResource(NacosConfig nacosConfig) {
        this.nacosConfig = nacosConfig;
    }

    @GetMapping("config")
    public Map<String, String> getNacosConfig() {
        Map<String, String> result = new HashMap<>();
        result.put("name", nacosConfig.getName());
        return result;
    }
}
