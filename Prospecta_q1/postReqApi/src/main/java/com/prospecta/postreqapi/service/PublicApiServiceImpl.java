package com.prospecta.postreqapi.service;

import com.prospecta.postreqapi.entity.PublicApi;
import com.prospecta.postreqapi.payload.PublicApiDto;
import com.prospecta.postreqapi.repository.PublicApiRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicApiServiceImpl implements  PublicApiService {

    @Autowired
    private PublicApiRepo pupi;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public PublicApiDto createPublicApi(PublicApiDto pApiDto) {
        PublicApi p=this.modelMapper.map(pApiDto,PublicApi.class);
        PublicApi sp= this.pupi.save(p);
        return this.modelMapper.map(sp,PublicApiDto.class);
    }
}
