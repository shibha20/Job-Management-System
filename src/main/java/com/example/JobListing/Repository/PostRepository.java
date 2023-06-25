package com.example.JobListing.Repository;

import com.example.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends MongoRepository<Post,String> {
}
