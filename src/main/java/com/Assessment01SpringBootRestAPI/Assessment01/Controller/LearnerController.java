package com.Assessment01SpringBootRestAPI.Assessment01.Controller;

import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Learner;
import com.Assessment01SpringBootRestAPI.Assessment01.Service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/learner")
public class LearnerController {

    @Autowired
    LearnerService learnerService;

    @PostMapping("/createLearner")
    public Learner createLearner(@RequestBody Learner learner){
        return learnerService.addLearner(learner);
    }

    @GetMapping("/findLearner/{id}")
    public Optional<Learner> findLearnerById(@PathVariable int id){
        return learnerService.findLearnerById(id);
    }

    @GetMapping("/findAllLearners")
    public List<Learner> findAllLearners(){
        return learnerService.findAllLearners();
    }

    @GetMapping("/countLearners")
    public int countAllLearners(){
        return learnerService.countLearners();
    }

    @DeleteMapping("/delLearner/{id}")
    public void deleteLearnerById(@PathVariable int id){
        learnerService.deleteLearnerById(id);
    }

    @GetMapping("/isPresentLearner/{id}")
    public boolean isLearnerPresent(@PathVariable int id){
        return learnerService.doesLearnerExists(id);
    }

//    @PutMapping("/updateLearner")
//    public Learner updateLearner(@RequestBody Learner learner){
//        return learnerService.updateLearnerEntity(learner);
//    }
}
