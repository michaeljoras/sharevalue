// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockExchangeService.proto

package com.consorsbank.module.tapi.grpc.stock;

public interface StockExchangeDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.StockExchangeDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** Stock exchange information 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchangeInfo stock_exchange_info = 1;</code>
   */
  boolean hasStockExchangeInfo();
  /**
   * <pre>
   ** Stock exchange information 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchangeInfo stock_exchange_info = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchangeInfo getStockExchangeInfo();
  /**
   * <pre>
   ** Stock exchange information 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchangeInfo stock_exchange_info = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchangeInfoOrBuilder getStockExchangeInfoOrBuilder();

  /**
   * <pre>
   **
   * Error information if occuirs
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  boolean hasError();
  /**
   * <pre>
   **
   * Error information if occuirs
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  com.consorsbank.module.tapi.grpc.common.Error getError();
  /**
   * <pre>
   **
   * Error information if occuirs
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  com.consorsbank.module.tapi.grpc.common.ErrorOrBuilder getErrorOrBuilder();
}
