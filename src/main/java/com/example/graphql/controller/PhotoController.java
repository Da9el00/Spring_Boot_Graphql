package com.example.graphql.controller;

import com.example.graphql.model.Photo;
import com.example.graphql.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PhotoController {
    PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @QueryMapping
    public List<Photo> getAllPhotos(){
        return photoService.getPhotos();
    }
}
