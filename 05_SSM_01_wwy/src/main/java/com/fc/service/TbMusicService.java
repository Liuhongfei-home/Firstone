package com.fc.service;

import com.fc.bean.TbMusic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 业务层接口
public interface TbMusicService {
    List<TbMusic> findAll();


    TbMusic findById(Integer musicId);

    TbMusic prevSong(Integer musicId);

    TbMusic nextSong(Integer musicId);


    List<TbMusic> search(String keyword);
}
