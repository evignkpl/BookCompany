package com.thebookcompany.repositories;

import java.util.List;

public interface Repository<E> {

    //Crud
    boolean create(E t);
    E read(int id);

    E read(String name);

    List<E> read();
    boolean update(String name, String newName);
    boolean delete(String name) throws Exception;

}
