package com.ming.easyExcel.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName: UserDTO
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/10
 */
@Data
public class UserDTO {
    @ExcelProperty(value = "用户id")
    private String userId;

    @ExcelProperty(value = "用户名称")
    private String userName;

    @ExcelProperty(value = "用户密码")
    private String userPassword;

    @ExcelProperty(value = "用户类型")
    private int userType;
}
