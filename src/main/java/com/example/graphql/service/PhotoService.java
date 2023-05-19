package com.example.graphql.service;

import com.example.graphql.model.Photo;
import com.example.graphql.repository.PhotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService() {
        photoRepository = new PhotoRepository();
    }

    public List<Photo> getPhotos(){
        return photoRepository.getPhotos();
    }
}
