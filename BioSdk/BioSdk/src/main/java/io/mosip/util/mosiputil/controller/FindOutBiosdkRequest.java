package io.mosip.util.mosiputil.controller;


import io.mosip.util.mosiputil.dto.RequestDto;
import io.mosip.util.mosiputil.service.MosipUtilService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping("/biosdk-service")
@Api(tags = "Sdk")
@CrossOrigin("*")
public class FindOutBiosdkRequest {

    @Autowired
    MosipUtilService mosipUtilService;

    @Value("${mosip.biosdk.url}")
    String uri;

    @GetMapping(path = "/")
    @ApiOperation(value = "Service status")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Service is running...") })
    public ResponseEntity<String> status() {
        String response = null;
        try {
            response = (String) mosipUtilService.callBioSDKwithGetMethod(new URI(uri + "/"), "/", String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping(path = "/status")
    @ApiOperation(value = "Service status 1")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Service is running...") })
    public ResponseEntity<String> status1() {
        String response = null;

        try {
            response = (String) mosipUtilService.callBioSDKwithGetMethod(new URI(uri + "/status"), "/status", String.class);
            log.info("Response /status ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/init", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Initialization")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Initialization successful") })
    public ResponseEntity<String> init(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/init").toString(), request, "Entering /init method", String.class);
            log.info("Request /init ==> {}", request);
            log.info("Response /init ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/match", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Match")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Match successful") })
    public ResponseEntity<String> match(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/match").toString(), request, "Entering /match method", String.class);
            log.info("Request /match ==> {}", request);
            log.info("Response /match ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/check-quality", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Check quality")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Check successful") })
    public ResponseEntity<String> checkQuality(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/check-quality").toString(), request, "Entering /check-quality method", String.class);
            log.info("Request /check-quality ==> {}", request);
            log.info("Response /check-quality ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/extract-template", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Extract template")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Extract successful") })
    public ResponseEntity<String> extractTemplate(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/extract-template").toString(), request, "Entering /extract-template method", String.class);
            log.info("Request /extract-template ==> {}", request);
            log.info("Response /extract-template ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/convert-format", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Convert format")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Convert successful") })
    public ResponseEntity<String> convertFormat(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/convert-format").toString(), request, "Entering /convert-format method", String.class);
            log.info("Request /convert-format ==> {}", request);
            log.info("Response /convert-format ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping(path = "/segment", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Segment")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Segment successful") })
    public ResponseEntity<String> segment(
            @Validated @RequestBody(required = true) RequestDto request,
            @ApiIgnore Errors errors) {
        String response = null;
        try {
            response  = (String) mosipUtilService.callBioSDKwithPostMethod(new URI(uri + "/segment").toString(), request, "Entering /segment method", String.class);
            log.info("Request /segment ==> {}", request);
            log.info("Response /segment ==> {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}