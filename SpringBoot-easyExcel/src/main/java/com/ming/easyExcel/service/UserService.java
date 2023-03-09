package com.ming.easyExcel.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import com.ming.easyExcel.dto.UserDTO;
import com.ming.easyExcel.utils.EasyExcelReadUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/10
 */
@Service
public class UserService {

    private List<UserDTO> data() {
        List<UserDTO> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            UserDTO user = new UserDTO();
            user.setUserId(String.valueOf(UUID.randomUUID()));
            user.setUserName("张三");
            user.setUserPassword("999999999");

            list.add(user);
        }
        return list;
    }

    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyExcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), UserDTO.class).sheet("模板").doWrite(data());
    }

    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), UserDTO.class, new EasyExcelReadUtils()).sheet().doRead();
        return "success";
    }
}
