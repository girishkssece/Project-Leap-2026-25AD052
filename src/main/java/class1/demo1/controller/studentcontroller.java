package class1.demo1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class studentcontroller {
    @GetMapping("/getall")
    String getall(){
        return "Welcome to my world";
    }
    @GetMapping("getbyid/{id}")
    String getbyId(@PathVariable long id){
        return "todo with id" + id;
    }
    @PostMapping("/create")
        String createtodo(@RequestBody String body){
            return "success";
        }

}
