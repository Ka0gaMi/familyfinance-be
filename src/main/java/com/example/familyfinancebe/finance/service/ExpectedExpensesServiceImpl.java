package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.ExpectedExpensesDTO;
import com.example.familyfinancebe.finance.model.ExpectedExpenses;
import com.example.familyfinancebe.finance.repository.ExpectedExpensesRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExpectedExpensesServiceImpl implements ExpectedExpensesService{

    private final ExpectedExpensesRepository expectedExpensesRepository;

    public ExpectedExpensesServiceImpl(ExpectedExpensesRepository expectedExpensesRepository){
        this.expectedExpensesRepository = expectedExpensesRepository;
    }

    @Override
    public ExpectedExpenses createExpectedExpenses(ExpectedExpensesDTO expectedExpensesDto) {
        ExpectedExpenses expectedExpenses = new ExpectedExpenses();
        expectedExpenses.setId(UUID.fromString(expectedExpensesDto.getId()));
        expectedExpenses.setAmount(expectedExpensesDto.getAmount());
        expectedExpensesRepository.save(expectedExpenses);
        return expectedExpenses;
    }

    @Override
    public ExpectedExpenses updateExpectedExpenses(ExpectedExpensesDTO expectedExpensesDto) {
        ExpectedExpenses expectedExpenses = expectedExpensesRepository
                .getExpectedExpensesById(UUID.fromString(expectedExpensesDto.getId()));
        expectedExpenses.setAmount(expectedExpensesDto.getAmount());
        expectedExpensesRepository.save(expectedExpenses);
        return expectedExpenses;
    }

    @Override
    public void deleteExpectedExpenses(String id) {
        expectedExpensesRepository.deleteById(UUID.fromString(id));
    }
}
