package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Income;
import com.example.familyfinancebe.finance.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IncomeServiceImpl implements IncomeService{

    private final IncomeRepository incomeRepository;

    public IncomeServiceImpl(IncomeRepository incomeRepository){
        this.incomeRepository = incomeRepository;
    }

    @Override
    public Income createIncome(IncomeDTO incomeDto) {
        Income income = new Income();
        income.setId(UUID.fromString(incomeDto.getId()));
        income.setAmount(incomeDto.getAmount());
        incomeRepository.save(income);
        return income;
    }
}
