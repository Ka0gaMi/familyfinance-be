package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.FinanceDTO;
import com.example.familyfinancebe.finance.model.*;
import com.example.familyfinancebe.finance.repository.FinanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FinanceServiceImpl implements FinanceService{

    private final FinanceRepository financeRepository;

    public FinanceServiceImpl(FinanceRepository financeRepository) {
        this.financeRepository = financeRepository;
    }

    @Override
    public List<Finance> getFinanceByDate(String date) {
        return financeRepository.findByDate(date);
    }

    @Override
    public void addFinance(FinanceDTO financeDto, Type type, ExpectedExpenses expectedExpenses,
                           ActualExpenses actualExpenses, Income income) {
        Finance finance = new Finance();
        finance.setId(UUID.fromString(financeDto.getId()));
        finance.setDate(financeDto.getDate());
        finance.setType(type);
        finance.setExpectedExpenses(expectedExpenses);
        finance.setActualExpenses(actualExpenses);
        finance.setIncome(income);
        financeRepository.save(finance);
    }
}
