package sophosfinalchallenge.bootcamp.FCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sophosfinalchallenge.bootcamp.FCS.entity.SystemUser;
import sophosfinalchallenge.bootcamp.FCS.service.SystemUserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class SystemUserController {

    @Autowired
    SystemUserService systemUserService;


    @GetMapping
    public ResponseEntity<List<SystemUser>> getSystemUser() {
        return new ResponseEntity<>(systemUserService.getAllSystemUser(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemUser> getSystemById(@PathVariable("id") long id) {
        return systemUserService.getSystemUserById(id)
                .map(systemUser -> new ResponseEntity<>(systemUser, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<SystemUser> createSystemUser(@RequestBody SystemUser systemUser){
        return new ResponseEntity<>(systemUserService.createUser(systemUser),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteSystemUserById(@PathVariable("id") long id){
        if(systemUserService.deleteSystemUserById(id)){
            return new ResponseEntity<>(HttpStatus.OK);

        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }


}
