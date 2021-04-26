package com.fc.controller;


import com.fc.bean.TbMusic;
import com.fc.bean.TbSheet;
import com.fc.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("sheet")
public class TbSheetController {


    @Autowired
    private TbSheetService tbSheetService;

    @RequestMapping("findAll")
    public List<TbSheet> findAll(){
       return tbSheetService.findAll();
    }


    @RequestMapping("findSongsBySheet")
    public List<TbMusic> findSongsBySheet(String sheetName){
        return tbSheetService.findSongsBySheet(sheetName);
    }

    @RequestMapping("insertSheet")
    public Map<String ,Object> insertSheet(String sheetName){

        int affectedRows = tbSheetService.insertSheet(sheetName);

        Map<String, Object> map = new HashMap<>();
        map.put("success" , false);

        if (affectedRows >0){
            map.put("success",true);
        }
        return map;
    }

}
