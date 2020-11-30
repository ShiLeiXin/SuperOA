package com.qfedu.dao;

import com.qfedu.vo.AddressVO;

import java.util.List;

public interface AddressDao {
    List<AddressVO> selectProvinces();
    List<AddressVO> selectCities(String provinceCode);
    List<AddressVO> selectAreas(String cityCode);
}
