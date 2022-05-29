package com.george.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.george.app.model.Input;

public interface InputRepo extends CrudRepository<Input,String>{

}