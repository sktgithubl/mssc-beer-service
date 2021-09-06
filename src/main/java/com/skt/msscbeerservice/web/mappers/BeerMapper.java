package com.skt.msscbeerservice.web.mappers;

import com.skt.msscbeerservice.domain.Beer;
import com.skt.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
