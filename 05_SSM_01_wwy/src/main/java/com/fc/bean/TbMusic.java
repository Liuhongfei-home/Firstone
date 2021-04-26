package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class TbMusic implements Serializable {
    private Integer musicId;
    private String musicName;
    private String musicAlbumName;
    private String musicAlbumPicUrl;
    private String musicMp3Url;
    private String musicArtistName;
    private Integer sheetId;
}
