package com.github.adamsiemion.onionarch;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDaoMongo extends MongoRepository<User, String> {
}
