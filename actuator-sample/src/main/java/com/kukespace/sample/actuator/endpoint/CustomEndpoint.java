package com.kukespace.sample.actuator.endpoint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author chensk
 * @date 2020/8/21
 */
@WebEndpoint(id = "custom")
@Component
public class CustomEndpoint {

    @ReadOperation(produces = MediaType.APPLICATION_JSON_VALUE)
    public WebEndpointResponse<Dto> test(@Nullable String name) {
        Dto build = Dto.builder()
                .name(StringUtils.isEmpty(name) ? "michen" : name)
                .value("michen").build();

        return new WebEndpointResponse<>(build);
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Dto {
        private String name;

        private String value;
    }
}
