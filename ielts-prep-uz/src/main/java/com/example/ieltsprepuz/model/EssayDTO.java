package com.example.ieltsprepuz.model;

public class EssayDTO {

    private String tile;
    private String description;
    private int wordLimit;
    private int duration;
    private String essay;

    public EssayDTO(String tile, String description, int wordLimit, int duration, String essay) {
        this.tile = tile;
        this.description = description;
        this.wordLimit = wordLimit;
        this.duration = duration;
        this.essay = essay;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWordLimit() {
        return wordLimit;
    }

    public void setWordLimit(int wordLimit) {
        this.wordLimit = wordLimit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }
}
