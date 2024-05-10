package net.javaguides.banking.service;

import net.javaguides.banking.dto.AccountDto;
import java.util.*;
public interface AccountService {
    AccountDto createAccount(AccountDto accountdto);

    AccountDto getAccountbyId(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccount();

    void deleteAccount(Long id);
}
