package com.github.reline.expandablerecyclerviewsample.model;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.model.Child;

@RealmClass
public class Ingredient implements RealmModel, Child {

    @PrimaryKey
    private String name;
    private boolean vegetarian;
    private boolean favorite;

    public Ingredient() {
        // realm constructor
    }

    public Ingredient(String name, boolean vegetarian) {
        this.name = name;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void toggleFavorite() {
        favorite = !favorite;
    }

    public boolean isFavorite() {
        return favorite;
    }

}
