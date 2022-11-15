package com.prospecta.postreqapi.controller;


import com.prospecta.postreqapi.entity.PublicApi;
import com.prospecta.postreqapi.payload.PublicApiDto;
import com.prospecta.postreqapi.service.PublicApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/PublicApi")
public class PublicApiController {
    @Autowired
    private PublicApiService ps;

        @PostMapping("/")
        public ResponseEntity<PublicApiDto> createUser(@Valid @RequestBody PublicApiDto pdto) {
            PublicApiDto createpdto=this.ps.createPublicApi(pdto);
            return new ResponseEntity<>(createpdto, HttpStatus.CREATED);

        }

}
