package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.model.Type;

import java.util.List;
import java.util.UUID;

public interface TypeService {

    Type createType(String name, String typeId);

    Type getType(String name);

    Type getTypeById(String id);

    void updateType(String name, UUID typeId);

    void deleteType(String id);

    List<Type> getTypes();
}
