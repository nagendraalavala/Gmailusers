package com.example.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class GmailService
{

    @Autowired
    private GmailRepo gmailRepo;

//    @Autowired
//    private GmailEntity gmailEntity;
//
//    @Autowired
//    public GmailService(GmailRepo gmailRepo, GmailEntity gmailEntity) {
//        this.gmailRepo = gmailRepo;
//        this.gmailEntity = gmailEntity;
//    }

    //save
    public GmailEntityMain saveuser(GmailEntityMain gmailEntityMain)
    {
        return gmailRepo.save(gmailEntityMain);
    }

    //findall
    public List<GmailEntityMain> findall()
    {
        return (List<GmailEntityMain>) gmailRepo.findAll();
    }

    //findbyid
    public Optional<GmailEntityMain> find(Integer id)
    {
        return gmailRepo.findById(id);
    }

    public void deleteuser(GmailEntityMain gmailEntityMain)
    {
        gmailRepo.delete(gmailEntityMain);
    }



}
