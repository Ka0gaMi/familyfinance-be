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
        return financeRepository.getFinancesByDateOrderByType(date);
    }

    @Override
    public List<Finance> getDefaultFinance(String date) {
        List<Finance> defaultFinance = financeRepository.getFinancesByDateOrderByType("default");
        for (Finance finance : defaultFinance) {
            Finance newFinance = new Finance();
            newFinance.setId(UUID.randomUUID());
            newFinance.setDate(date);
            newFinance.setType(finance.getType());
            newFinance.setExpectedExpensesAmount(finance.getExpectedExpensesAmount());
            newFinance.setActualExpensesAmount(finance.getActualExpensesAmount());
            financeRepository.save(newFinance);
        }
        return financeRepository.getFinancesByDateOrderByType(date);
    }

    @Override
    public void addFinance(FinanceDTO financeDto, Type type) {
        Finance finance = new Finance();
        finance.setId(UUID.fromString(financeDto.getId()));
        finance.setDate(financeDto.getDate());
        finance.setType(type);
        finance.setExpectedExpensesAmount(financeDto.getExpectedExpensesAmount());
        finance.setActualExpensesAmount(financeDto.getActualExpensesAmount());
        financeRepository.save(finance);
    }

    @Override
    public void updateFinance(FinanceDTO financeDto, Type type) {
        Finance finance = financeRepository.getFinanceById(UUID.fromString(financeDto.getId()));
        finance.setDate(financeDto.getDate());
        finance.setType(type);
        finance.setExpectedExpensesAmount(financeDto.getExpectedExpensesAmount());
        finance.setActualExpensesAmount(financeDto.getActualExpensesAmount());
        financeRepository.save(finance);
    }

    @Override
    public void deleteFinance(String id) {
        financeRepository.deleteById(UUID.fromString(id));
    }
}
