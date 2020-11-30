package com.qfedu.dao;

import com.qfedu.entity.Advice;

import java.util.List;

public interface FileUploadDao {
    int saveBatch(List<Advice> list);
    List<Advice> selectNum(Integer num);
}
