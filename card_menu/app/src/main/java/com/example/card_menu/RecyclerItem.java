package com.example.card_menu;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class RecyclerItem {

    private String title;
    private String description;
    private Drawable image;

    public RecyclerItem(String title, String description, Drawable image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
