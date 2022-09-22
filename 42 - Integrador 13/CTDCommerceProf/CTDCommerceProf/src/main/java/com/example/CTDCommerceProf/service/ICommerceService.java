package com.example.CTDCommerceProf.service;

import com.example.CTDCommerceProf.exception.NotFoundException;

import java.util.List;

public interface ICommerceService<T> {
    T create(T t);
    T getById(int id) throws NotFoundException;
    List<T> getAll();
    String delete(int id);
    T update(T t);
}
