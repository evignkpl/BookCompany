package com.thebookcompany.repositories;

import com.thebookcompany.repositories.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepositoryImpl<T extends Entity> implements Repository<T> {
    private final List<T> tList = new ArrayList<>();

    @Override
    public boolean create(T t) {
        if (t == null)
        return false;
        tList.add(t);
        return true;
    }

    @Override
    public T read(String name) {
        for(T t : tList){
            if (Objects.equals(t.getName(),name))
                return t;
        }
        return null;
    }

    @Override
    public List<T> read() {
        /* deep copy of the list */
        return new ArrayList<>(tList);
    }

    @Override
    public boolean update(String name, String newName) {
        T t = read(name);
        if(t == null)
            return false;
        t.setName(newName);
        return true;
    }

    @Override
    public boolean delete(String name) throws Exception {
        T t = read(name);
        if(t == null)
            throw new Exception("The entity waq not found");
        tList.remove(t);
        return true;
    }
}




