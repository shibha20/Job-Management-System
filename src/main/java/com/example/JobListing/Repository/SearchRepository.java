package com.example.JobListing.Repository;

import com.example.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
