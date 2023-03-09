package com.ming.easyExcel.controller;

import com.ming.easyExcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: UserController
 * @Description: Excel的上传和下载
 * @Author: ECRZ
 * @Date: 2023/1/10
 */
@RestController
@RequestMapping("excel")
public class UserController {

    // 不建议字段注入
    @Autowired
    private UserService userService;

    @GetMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        userService.download(response);
    }

    @PostMapping("upload")
    public String upload(@RequestParam("file")MultipartFile file) throws IOException {
        return userService.upload(file);
    }


}
