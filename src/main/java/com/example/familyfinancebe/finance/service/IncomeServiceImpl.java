package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Income;
import com.example.familyfinancebe.finance.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IncomeServiceImpl implements IncomeService{

    private final IncomeRepository incomeRepository;

    public IncomeServiceImpl(IncomeRepository incomeRepository){
        this.incomeRepository = incomeRepository;
    }

    @Override
    public void createIncome(IncomeDTO incomeDto) {
        Income income = new Income();
        income.setId(UUID.fromString(incomeDto.getId()));
        income.setAmount(incomeDto.getAmount());
        income.setDate(incomeDto.getDate());
        income.setName(incomeDto.getName());
        income.setNotes(incomeDto.getNotes());
        income.setExpectedDay(incomeDto.getExpectedDay());
        income.setIsGot(incomeDto.getIsGot());
        incomeRepository.save(income);
    }

    @Override
    public List<Income> getIncomeByDate(String date) {
        return incomeRepository.getIncomeByDate(date);
    }

    @Override
    public void updateIncome(IncomeDTO incomeDto) {
        Income income = incomeRepository.getIncomeById(UUID.fromString(incomeDto.getId()));
        income.setAmount(incomeDto.getAmount());
        income.setDate(incomeDto.getDate());
        income.setName(incomeDto.getName());
        income.setNotes(incomeDto.getNotes());
        income.setExpectedDay(incomeDto.getExpectedDay());
        income.setIsGot(incomeDto.getIsGot());
        incomeRepository.save(income);
    }

    @Override
    public void deleteIncome(String id) {
        incomeRepository.deleteById(UUID.fromString(id));
    }
}
