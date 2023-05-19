package com.example.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Builder
@AllArgsConstructor
@Data
public class Photo {
    private int id;
    private double latitude;
    private double longitude;
    private String owner;
    private String image;
    private String type;
}
