package com.tankehui.dao;

import com.tankehui.entity.City;
import org.springframework.stereotype.Repository;

/**
 * 城市 DAO 接口类
 *
 */
@Repository
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(String cityName);

	void insertSelective(City city);

}
