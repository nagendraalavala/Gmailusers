package com.example.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GmailController
{
    @Autowired
    private GmailService gmailService;

    private GmailEntityMain gmailEntityMain;

    //save
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<GmailEntityMain> data(@RequestBody GmailEntityMain gmailEntityMain)
    {
        return new ResponseEntity<>(gmailService.saveuser(gmailEntityMain), HttpStatus.valueOf(201));
    }

    //getall
    @GetMapping("/")
    public ResponseEntity<List<GmailEntityMain>> findall()
    {
        return new ResponseEntity(gmailService.findall(),HttpStatus.valueOf(200));

    }

    //findbyid
    @GetMapping("/{id}")
    public ResponseEntity<GmailEntityMain> findbyid(@PathVariable Integer id)
    {
        Optional<GmailEntityMain> gmailEntity=gmailService.find(id);
        GmailEntityMain gmailEntityMain1 =gmailEntity.get();
        if (gmailEntity.isPresent())
        {
            return new ResponseEntity(gmailEntity,HttpStatus.valueOf(200));
        }
        else
        {
            throw  new RuntimeException("User Not Found");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GmailEntityMain> update(@PathVariable Integer id, @RequestBody GmailEntityMain gmailEntityMain)
    {
        Optional<GmailEntityMain> gmailEntity1=gmailService.find(id);
        GmailEntityMain gmailEntityMain2 =gmailEntity1.get();
        gmailEntityMain2.setName(gmailEntityMain.getName());
        gmailEntityMain2.setAge(gmailEntityMain.getAge());
        ;
        return new ResponseEntity<>(gmailService.saveuser(gmailEntityMain2),HttpStatus.valueOf(200));

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id)
    {
        gmailService.deleteuser(gmailEntityMain);

    }


}
