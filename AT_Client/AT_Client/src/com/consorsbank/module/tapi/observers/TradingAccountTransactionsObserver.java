/*
 * Copyright 2018, Trading-API, Consorsbank.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.consorsbank.module.tapi.observers;

import java.util.List;

// tag::TradingAccountTransactionsObserver[]
import com.consorsbank.module.tapi.grpc.AccountServiceGrpc.AccountServiceStub;
import com.consorsbank.module.tapi.grpc.account.TradingAccount;
import com.consorsbank.module.tapi.grpc.account.TradingAccountRequest;
import com.consorsbank.module.tapi.grpc.account.TradingAccountTransactions;
import com.consorsbank.module.tapi.grpc.account.TradingAccountTransactions.Transaction;
import com.consorsbank.module.tapi.grpc.common.Error;

public class TradingAccountTransactionsObserver extends ServerSubscription<TradingAccount, TradingAccountTransactions>{
  private final AccountServiceStub orderServiceStub;

  public TradingAccountTransactionsObserver(
      TradingAccountRequest request, AccountServiceStub orderServiceStub) {
    
    this.orderServiceStub = orderServiceStub;
    this.orderServiceStub.streamTradingAccountTransactions(request, this); // <1>
  }

  @Override
  public void onCompleted() { // <2>
    System.out.println("Call completed!");
  }
  
  @Override
  public void onNext(TradingAccountTransactions transactions) { // <3>
    Error error = transactions.getError(); // <4>
    if (error==Error.getDefaultInstance()) {
      System.out.printf("Async trading transactions: %s%n", transactions);
      TradingAccount account = transactions.getAccount();
      List<Transaction> transactionsList = transactions.getTransactionsList();
      // ...
    } else {
      System.out.printf("Error: %s%n", error);
    }
  }
}
// end::TradingAccountTransactionsObserver[]