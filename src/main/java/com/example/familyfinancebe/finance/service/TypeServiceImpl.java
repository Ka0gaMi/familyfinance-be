package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.model.Type;
import com.example.familyfinancebe.finance.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TypeServiceImpl implements TypeService{
    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

    @Override
    public Type createType(String name, String typeId) {
        Type type = new Type();
        type.setId(UUID.fromString(typeId));
        type.setName(name);
        typeRepository.save(type);
        return type;
    }

    @Override
    public Type getType(String name) {
        return typeRepository.findByName(name);
    }

    @Override
    public Type getTypeById(String id) {
        return typeRepository.findById(UUID.fromString(id)).orElseThrow(
                () -> new RuntimeException("Type not found")
        );
    }

    @Override
    public void updateType(String name, UUID typeId) {
        Type type = typeRepository.findById(typeId).orElseThrow(
                () -> new RuntimeException("Type not found")
        );
        type.setName(name);
        typeRepository.save(type);
    }

    @Override
    public void deleteType(String id) {
        typeRepository.deleteById(UUID.fromString(id));
    }
}
