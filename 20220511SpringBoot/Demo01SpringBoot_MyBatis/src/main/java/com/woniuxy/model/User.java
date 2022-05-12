package com.woniuxy.model;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:32
 * @Version： 1.0
 */
@Data
//@ApiModel(value="SysUsers对象", description="用户表")
public class User implements Serializable{
        private static final long serialVersionUID = 1L;

       // @ApiModelProperty(value = "用户编号")

        private Integer userId;

       // @ApiModelProperty(value = "登录名称")
        private String userLoginid;

       // @ApiModelProperty(value = "登录密码")
        private String userLoginpwd;

        //@ApiModelProperty(value = "用户姓名")
        private String userName;

        //@ApiModelProperty(value = "用户邮箱")
        private String userEmail;

        //@ApiModelProperty(value = "用户手机号码")
        private String userPhone;

        //@ApiModelProperty(value = "用户地址")
        private String userAddress;

        //@ApiModelProperty(value = "角色编号")
        private Integer roleId;
}
