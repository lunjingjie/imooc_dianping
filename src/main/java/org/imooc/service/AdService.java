package org.imooc.service;

import org.imooc.dto.AdDto;

import java.util.List;

public interface AdService {

    List<AdDto> searchByPage(AdDto adDto);
}
