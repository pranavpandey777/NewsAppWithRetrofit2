package com.example.pranav.allinone;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ModelList {
    @SerializedName("articles")
    ArrayList<Model> arrayList;

    public ArrayList<Model> getArrayList() {
        return arrayList;
    }
}
