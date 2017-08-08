package com.krish.web.service;

import com.krish.web.exception.DataNotFoundException;
import com.krish.web.model.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna on 6/21/17.
 */
public class DeveloperService {
    private static List<Developer> developerList = new ArrayList<Developer>(){
        {
            add(new Developer(1, "Krishna", "Software Architect", "USD 60k"));
        }
    };



    public List<Developer> getAllDevelopers() {
        return developerList;
    }

    public Developer getDeveloperHavingId(int id){
        if(id<developerList.size()){
            return developerList.get(id);
        }
     throw  new DataNotFoundException("no Data");
    }

    public void addDeveloper(Developer developer){
         developerList.add(developer);
    }
}
