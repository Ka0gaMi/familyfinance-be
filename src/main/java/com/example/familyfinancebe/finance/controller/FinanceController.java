package com.example.familyfinancebe.finance.controller;

import com.example.familyfinancebe.finance.dto.FinanceDTO;
import com.example.familyfinancebe.finance.dto.IncomeDTO;
import com.example.familyfinancebe.finance.model.Type;
import com.example.familyfinancebe.finance.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/finance")
@CrossOrigin(origins = "http://localhost:3000")
public class FinanceController {

    private final FinanceService financeService;

    private final IncomeService incomeService;

    private final TypeService typeService;

    public FinanceController(FinanceService financeService, IncomeService incomeService,
                             TypeService typeService) {
        this.financeService = financeService;
        this.incomeService = incomeService;
        this.typeService = typeService;
    }

    @GetMapping("/get_finance")
    public ResponseEntity<?> getFinanceByDate(@RequestParam String date) {
        try {
            return ResponseEntity.ok(financeService.getFinanceByDate(date));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @PostMapping("/add_finance")
    public ResponseEntity<?> addFinance(@RequestBody FinanceDTO financeDto) {
        try {
            Type type = typeService.getType(financeDto.getType().getName());

            if (type == null) {
                String name = financeDto.getType().getName();
                String typeId = financeDto.getType().getId();
                type = typeService.createType(name, typeId);
            }

            financeService.addFinance(financeDto, type);

            return ResponseEntity.ok("Finance added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @PutMapping("/update_finance")
    public ResponseEntity<?> updateFinance(@RequestBody FinanceDTO financeDto) {
        try {
            Type type = typeService.getTypeById(financeDto.getType().getId());

            if (type == null) {
                String name = financeDto.getType().getName();
                String typeId = financeDto.getType().getId();
                type = typeService.createType(name, typeId);
            } else {
                typeService.updateType(financeDto.getType().getName(), type.getId());
            }

            financeService.updateFinance(financeDto, type);

            return ResponseEntity.ok("Finance updated successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @DeleteMapping("/delete_finance")
    public ResponseEntity<?> deleteFinance(@RequestBody FinanceDTO financeDto) {
        try {
            financeService.deleteFinance(financeDto.getId());
            typeService.deleteType(financeDto.getType().getId());
            return ResponseEntity.ok("Finance deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @GetMapping("/get_income")
    public ResponseEntity<?> getIncomeByDate(@RequestParam String date) {
        try {
            return ResponseEntity.ok(incomeService.getIncomeByDate(date));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/add_income")
    public ResponseEntity<?> addIncome(@RequestBody IncomeDTO incomeDTO) {
        try {
            incomeService.createIncome(incomeDTO);
            return ResponseEntity.ok("Income added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @PutMapping("/update_income")
    public ResponseEntity<?> updateIncome(@RequestBody IncomeDTO incomeDTO) {
        try {
            incomeService.updateIncome(incomeDTO);
            return ResponseEntity.ok("Income updated successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @DeleteMapping("/delete_income")
    public ResponseEntity<?> deleteIncome(@RequestParam String id) {
        try {
            incomeService.deleteIncome(id);
            return ResponseEntity.ok("Income deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @GetMapping("/get_default_finance")
    public ResponseEntity<?> getDefaultFinance(@RequestParam String date) {
        try {
            return ResponseEntity.ok(financeService.getDefaultFinance(date));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @GetMapping("/get_default_income")
    public ResponseEntity<?> getDefaultIncome(@RequestParam String date) {
        try {
            return ResponseEntity.ok(incomeService.getDefaultIncome(date));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }
}
