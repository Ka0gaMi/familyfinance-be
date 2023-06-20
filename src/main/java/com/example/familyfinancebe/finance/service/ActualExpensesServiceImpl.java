package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.ActualExpensesDTO;
import com.example.familyfinancebe.finance.model.ActualExpenses;
import com.example.familyfinancebe.finance.repository.ActualExpensesRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ActualExpensesServiceImpl implements ActualExpensesService{

    private final ActualExpensesRepository actualExpensesRepository;

    public ActualExpensesServiceImpl(ActualExpensesRepository actualExpensesRepository){
        this.actualExpensesRepository = actualExpensesRepository;
    }

    @Override
    public ActualExpenses createActualExpenses(ActualExpensesDTO actualExpensesDto) {
        ActualExpenses actualExpenses = new ActualExpenses();
        actualExpenses.setId(UUID.fromString(actualExpensesDto.getId()));
        actualExpenses.setAmount(actualExpensesDto.getAmount());
        actualExpensesRepository.save(actualExpenses);
        return actualExpenses;
    }

    @Override
    public ActualExpenses updateActualExpenses(ActualExpensesDTO actualExpensesDto) {
        ActualExpenses actualExpenses = actualExpensesRepository
                .getActualExpensesById(UUID.fromString(actualExpensesDto.getId()));
        actualExpenses.setAmount(actualExpensesDto.getAmount());
        actualExpensesRepository.save(actualExpenses);
        return actualExpenses;
    }

    @Override
    public void deleteActualExpenses(String id) {
        actualExpensesRepository.deleteById(UUID.fromString(id));
    }
}
