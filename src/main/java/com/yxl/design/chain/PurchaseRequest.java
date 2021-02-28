package com.yxl.design.chain;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/28 20:20
 */
@Data
@ToString
public class PurchaseRequest {

    private Integer type;

    private BigDecimal price;

    private Integer id = 0;

    public PurchaseRequest(Integer type, BigDecimal price, Integer id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }


}
