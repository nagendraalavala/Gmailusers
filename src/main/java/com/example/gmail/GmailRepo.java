package com.example.gmail;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GmailRepo extends CrudRepository<GmailEntityMain,Integer>
{

}
