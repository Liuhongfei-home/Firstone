package com.fc.service.impl;

import com.fc.bean.TbMusic;
import com.fc.dao.TbMusicDao;
import com.fc.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbMusicServiceImpl implements TbMusicService {
    @Autowired
    private TbMusicDao tbMusicDao;

    @Override
    public List<TbMusic> findAll() {
        return tbMusicDao.findAll();
    }

    @Override
    public TbMusic findById(Integer musicId) {
        return  tbMusicDao.findById(musicId);
    }

    @Override
    public TbMusic prevSong(Integer musicId) {
        List<TbMusic> list=tbMusicDao.findAll();

        //声明一个下标，代表当前歌曲所在歌单中的位置
        int index=0;

        //循环
        for (int i = 0; i < list.size(); i++) {
            //如果当前传递的id和列表中对象的id相同
            if (musicId.equals(list.get(i).getMusicId())){
                //获取当前的位置赋值给index
                index=i;
                break;
            }
        }

        //判断当前歌曲是否在歌曲列表中的第一首的位置
        index = index==0 ? list.size() -1 :index -1;

        return list.get(index);
    }

    @Override
    public TbMusic nextSong(Integer musicId) {
        List<TbMusic> list=tbMusicDao.findAll();

        //声明一个下标，代表当前歌曲所在歌单中的位置
        int index=0;

        //循环
        for (int i = 0; i < list.size(); i++) {
            //如果当前传递的id和列表中对象的id相同
            if (musicId.equals(list.get(i).getMusicId())){
                //获取当前的位置赋值给index
                index=i;
                break;
            }
        }

        //判断当前歌曲是否在歌曲列表中的最后的位置
        index = index==list.size()-1? 0 :index +1;

        return list.get(index);
    }

    @Override
    public List<TbMusic> search(String keyword) {


        return tbMusicDao.search(keyword);
    }


}
