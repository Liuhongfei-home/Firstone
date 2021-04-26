package com.fc.dao;

import com.fc.bean.TbMusic;
import com.fc.bean.TbSheet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbsheetDao {
    List<TbSheet> findAll();

    List<TbMusic> findSongsBySheet(@Param("sheetName") String sheetName);

    int insertSheet(String sheetName);
}
