package com.qfedu.dao;

import com.qfedu.entity.Rent;
import com.qfedu.entity.RentGoods;
import com.qfedu.vo.RentGoodsVO;
import com.qfedu.vo.RentVO;

import java.util.List;

public interface RentDao {
    List<RentGoodsVO> selectRentGoods();

    void addRentGood(RentGoods rentGoods);

    RentGoodsVO selectRentGoodById(Integer id);

    void updateRentGood(RentGoods rentGoods);

    void deleteRentGoods(List list);

    List<RentVO> selectRent();

    void addRent(Rent rent);

    Rent selectRentById(Integer id);

    void updateRent(Rent rent);

    void downRent(Integer id);//租的时候  可租减一

    void upRent(Integer id);// 换的时候 可租加一

}
