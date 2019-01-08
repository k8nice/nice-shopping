package com.nice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author nice
 */
@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = 2321764412609035542L;
    private Long   goodsId;
    private String goodsName;
    private String goodsType;
    private Date   goodsCreateDate;
    private Date   goodsUpdateDate;
    private String goodsRemark;
}
