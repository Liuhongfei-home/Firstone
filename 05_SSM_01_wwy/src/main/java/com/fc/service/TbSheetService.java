package com.fc.service;

import com.fc.bean.TbMusic;
import com.fc.bean.TbSheet;

import java.util.List;

public interface TbSheetService {
    List<TbSheet> findAll();


    List<TbMusic> findSongsBySheet(String sheetName);


    int insertSheet(String sheetName);
}
