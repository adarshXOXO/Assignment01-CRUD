package com.Assessment01SpringBootRestAPI.Assessment01.Service;


import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Course;
import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Learner;
import com.Assessment01SpringBootRestAPI.Assessment01.Repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnerService {

    @Autowired
    LearnerRepository learnerRepository;

//    public Learner saveLearner(Learner learner){
//        return learnerRepository.save(learner);
//    }
    public Learner addLearner(Learner learner) {
        return learnerRepository.save(learner);
    }
    public Optional<Learner> findLearnerById(int id){
        Optional<Learner> tempLearner = learnerRepository.findById(id);
        if(tempLearner.isEmpty()){
            System.out.println("Learner doesn't exist");
        }
        return tempLearner;
    }

    public List<Learner> findAllLearners(){
        return learnerRepository.findAll();
    }

    public int countLearners(){
        return (int) learnerRepository.count();
    }

    public void deleteLearnerById(int id){
        Optional<Learner> tempLearner = learnerRepository.findById(id);
        if(tempLearner.isEmpty()){
            System.out.println("Learner doesnt exist");
        }
        learnerRepository.deleteById(id);
    }

    public boolean doesLearnerExists(int id){
        Optional<Learner> tempLearner = learnerRepository.findById(id);
        return tempLearner.isPresent();
    }


//    public Learner updateLearnerEntity(Learner learner){
//        Optional<Learner> tempLearner = learnerRepository.findById();
//        if(tempLearner.isEmpty()){
//            System.out.println("Learner doesn't exists");
//            return null;
//        }
//        else {
//            return null;
//        }
//    }

}
