package com.example.graphql.repository;


import com.example.graphql.model.Photo;

import java.util.List;

public class PhotoRepository {
    public List<Photo> getPhotos(){
        Photo photoA = Photo.builder().id(0).latitude(10.2).longitude(0.23).owner("askdhkw").image("Dog").type("NEW").build();
        Photo photoB = Photo.builder().id(1).latitude(12.5).longitude(-1.8).owner("hjksd").image("Cat").type("OLD").build();
        Photo photoC = Photo.builder().id(2).latitude(9.8).longitude(0.6).owner("kajsdf").image("Bird").type("NEW").build();
        Photo photoD = Photo.builder().id(3).latitude(11.1).longitude(-0.5).owner("qwekjh").image("Horse").type("OLD").build();
        Photo photoE = Photo.builder().id(4).latitude(10.9).longitude(0.3).owner("zxcvbn").image("Fish").type("NEW").build();
        Photo photoF = Photo.builder().id(5).latitude(10.3).longitude(0.8).owner("mnvbcx").image("Turtle").type("OLD").build();

        return List.of(photoA, photoB, photoC, photoD, photoE, photoF);
    }
}
