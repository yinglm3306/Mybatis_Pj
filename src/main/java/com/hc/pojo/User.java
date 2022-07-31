package com.hc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 10:56
 * @Description: com.hc.pojo
 * @Version: 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String user_code;
    private String user_name;
    private String user_password;
    private int gender;
    private Date birthday;
    private String phone;
    private String address;
    private Long userRole;
    private Long created_by;
    private String role_name;

}
