package com.fc.service.impl;

import com.fc.bean.TbMusic;
import com.fc.bean.TbSheet;
import com.fc.dao.TbsheetDao;
import com.fc.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSheetServiceImpl implements TbSheetService {

    @Autowired
    private TbsheetDao tbsheetDao;

    @Override
    public List<TbSheet> findAll() {
        return tbsheetDao.findAll();
    }

    @Override
    public List<TbMusic> findSongsBySheet(String sheetName) {
        return tbsheetDao.findSongsBySheet(sheetName);
    }

    @Override
    public int insertSheet(String sheetName) {
        return tbsheetDao.insertSheet(sheetName);
    }


}
