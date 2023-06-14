package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.model.Type;

public interface TypeService {

    public Type createType(String name, String typeId);

    public void updateType(String name, String typeId);

    public Type getType(String name);
}
