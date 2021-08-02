package com.stse.price.utils;

import com.stse.price.entity.PriceEntity;
import com.stse.price.vo.PricingVO;
import org.springframework.beans.BeanUtils;

public class Mapper {

    public static PricingVO entityToVo(PriceEntity priceEntity) {
        PricingVO pricingVO = new PricingVO();
        BeanUtils.copyProperties(priceEntity, pricingVO);
        return pricingVO;
    }

    public static PriceEntity voToEntity(PricingVO pricingVO) {
        PriceEntity priceEntity = new PriceEntity();
        BeanUtils.copyProperties(pricingVO, priceEntity);
        return priceEntity;
    }

}
