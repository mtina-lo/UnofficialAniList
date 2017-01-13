package com.mtinalo.practice.anilist.models;

import java.io.Serializable;

/**
 * Created by Tina Lo on 1/13/2017.
 */

public class UserInfoBrief implements Serializable{

    private Integer id;
    private String displayName;
    private String imgRegular;
    private String imgSmall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImgRegular() {
        return imgRegular;
    }

    public void setImgRegular(String imgRegular) {
        this.imgRegular = imgRegular;
    }

    public String getImgSmall() {
        return imgSmall;
    }

    public void setImgSmall(String imgSmall) {
        this.imgSmall = imgSmall;
    }
}
