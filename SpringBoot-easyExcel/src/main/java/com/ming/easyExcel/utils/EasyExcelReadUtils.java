package com.ming.easyExcel.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.ming.easyExcel.dto.UserDTO;

/**
 * @ClassName: EasyExcelUtils
 * @Description: 工具主要实现读、写方法
 * @Author: ECRZ
 * @Date: 2023/1/10
 */
public class EasyExcelReadUtils implements ReadListener<UserDTO> {

    /**
     * @Description: 每一条数据解析都会来调用
     * @Author: ECRZ
     * @Date: 2023/1/10
     */
    @Override
    public void invoke(UserDTO userDTO, AnalysisContext analysisContext) {
        System.out.println(userDTO.toString());
    }

    /**
     * @Description: 所有数据解析完成了都会来调用
     * @Author: ECRZ
     * @Date: 2023/1/10
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
