package io.mosip.util.mosiputil.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MosipUtilService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Object callBioSDKwithGetMethod(URI uri, String path, Class<?> responseType) {
        return restTemplate.getForObject(uri, responseType);
    }

    public Object callBioSDKwithPostMethod(String uri, Object request, String log, Class<?> responseType) {
        System.out.println(log + " → " + uri);
        return restTemplate.postForObject(uri, request, responseType);
    }
}
