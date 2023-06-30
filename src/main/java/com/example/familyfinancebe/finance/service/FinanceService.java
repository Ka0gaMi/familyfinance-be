package com.example.familyfinancebe.finance.service;

import com.example.familyfinancebe.finance.dto.FinanceDTO;
import com.example.familyfinancebe.finance.model.*;

import java.util.List;

public interface FinanceService {

    List<Finance> getFinanceByDate(String date);

    List<Finance> getDefaultFinance(String date);

    Finance getFinanceById(String id);

    void addFinance(FinanceDTO financeDto, Type type);

    void updateFinance(FinanceDTO financeDto, Type type);

    void deleteFinance(String id);
}
