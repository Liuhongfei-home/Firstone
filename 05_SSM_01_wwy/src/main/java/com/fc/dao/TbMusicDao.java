package com.fc.dao;

import com.fc.bean.TbMusic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// dao层接口
@Repository
public interface TbMusicDao {
    // 查询全部歌曲
    List<TbMusic> findAll();

    //根据id查询歌曲
    TbMusic findById(@Param("musicId") Integer musicId);


    //根据歌曲名查询歌曲
    List<TbMusic> search(@Param("keyword") String keyword);
}
