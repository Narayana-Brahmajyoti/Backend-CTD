package com.example.CTDCommerceProf.service;

public interface ICommerceService<T> {
    T create(T t);
    T getById(int id);
}
