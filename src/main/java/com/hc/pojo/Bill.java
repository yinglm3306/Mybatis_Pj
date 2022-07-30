package com.hc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 11:24
 * @Description: com.hc.pojo
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {

    private Long id;
    private String bill_code;
    private String product_name;
    private String product_desc;
    private String product_unit;
    private BigDecimal product_count;
    private BigDecimal total_rice;
    private int is_payment;
    private Long created_by;
    private Date creation_date;

}
