package com.mtinalo.practice.anilist.models;

import java.util.List;

/**
 * Created by Tina Lo on 1/13/2017.
 *
 * note: as of 1/13/2017 will concentrate on manga only
 */

public class UserInfoComplete extends UserInfoBrief {

    //private Long animeTimeBookmark;
    private Integer mangaChapterBookmark;
    private String about;
    private Integer listOrder;
    private Boolean allowsAdultContent;
    private Boolean isFollowing;
    private String imgBanner;
    private String titleLanguage;
    private String scoreType;
    //private List<String> customAnimeList;
    private List<String> customMangaList;
    private Boolean advancedRating;
    private List<String> advanceRatingNames;
    private Integer numberOfNotifs;

    public Integer getMangaChapterBookmark() {
        return mangaChapterBookmark;
    }

    public void setMangaChapterBookmark(Integer mangaChapterBookmark) {
        this.mangaChapterBookmark = mangaChapterBookmark;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getListOrder() {
        return listOrder;
    }

    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    public Boolean getAllowsAdultContent() {
        return allowsAdultContent;
    }

    public void setAllowsAdultContent(Boolean allowsAdultContent) {
        this.allowsAdultContent = allowsAdultContent;
    }

    public Boolean getFollowing() {
        return isFollowing;
    }

    public void setFollowing(Boolean following) {
        isFollowing = following;
    }

    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }

    public String getTitleLanguage() {
        return titleLanguage;
    }

    public void setTitleLanguage(String titleLanguage) {
        this.titleLanguage = titleLanguage;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public List<String> getCustomMangaList() {
        return customMangaList;
    }

    public void setCustomMangaList(List<String> customMangaList) {
        this.customMangaList = customMangaList;
    }

    public Boolean getAdvancedRating() {
        return advancedRating;
    }

    public void setAdvancedRating(Boolean advancedRating) {
        this.advancedRating = advancedRating;
    }

    public List<String> getAdvanceRatingNames() {
        return advanceRatingNames;
    }

    public void setAdvanceRatingNames(List<String> advanceRatingNames) {
        this.advanceRatingNames = advanceRatingNames;
    }

    public Integer getNumberOfNotifs() {
        return numberOfNotifs;
    }

    public void setNumberOfNotifs(Integer numberOfNotifs) {
        this.numberOfNotifs = numberOfNotifs;
    }
}
