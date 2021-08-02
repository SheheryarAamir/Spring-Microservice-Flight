package com.stse.flight.utils;

import com.stse.flight.VO.FlightVO;
import com.stse.flight.entity.FlightEntity;
import org.springframework.beans.BeanUtils;

public class Mapper {

    public static FlightVO entityToVo(FlightEntity flightEntity) {
        FlightVO flightVO = new FlightVO();
        BeanUtils.copyProperties(flightEntity, flightVO);
        return flightVO;
    }

    public static FlightEntity voToEntity(FlightVO flightVO) {
        FlightEntity flightEntity = new FlightEntity();
        BeanUtils.copyProperties(flightVO, flightEntity);
        return flightEntity;
    }

}
