package com.myproj.dao;

import org.springframework.data.repository.CrudRepository;

import com.myproj.entity.ItemEntity;

public interface ItemDao extends CrudRepository<ItemEntity, Integer>{

}
