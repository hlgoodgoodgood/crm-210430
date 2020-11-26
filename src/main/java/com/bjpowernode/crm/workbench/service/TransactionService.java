package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.bean.Transaction;

import java.util.List;
import java.util.Map;

public interface TransactionService {
    List<String> queryCustomerName(String customerName);

    void saveTransaction(Transaction transaction,String company);

    String queryCustomerByName(String name);

    Transaction queryTransactionById(String id, Map<String, String> stage2PossibilityMap);

    List<Map<String, String>> stageList(String tranId,Map<String,String> map);
}