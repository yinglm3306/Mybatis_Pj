package com.hc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 11:59
 * @Description: com.hc.pojo
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Long id;
    private String role_code;
    private String role_name;
    private Long created_by;
    private Date creation_date;
    private Long modify_by;
    private Date modify_date;

}
