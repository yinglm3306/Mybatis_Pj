package com.hc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 12:08
 * @Description: com.hc.pojo
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider {
    private Long id;
    private String pro_code;
    private String pro_name;
    private String pro_contact;
    private String pro_phone;
    private String pro_address;
    private String pro_fax;
    private Long created_by;
    private Date creation_date;
    private Date modify_date;
}
