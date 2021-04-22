// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.consorsbank.module.tapi.grpc.order;

public interface QuoteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.QuoteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * Access token
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   **
   * Access token
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <pre>
   **
   * Security code 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 2;</code>
   */
  boolean hasSecurityCode();
  /**
   * <pre>
   **
   * Security code 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityCode getSecurityCode();
  /**
   * <pre>
   **
   * Security code 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityCodeOrBuilder getSecurityCodeOrBuilder();

  /**
   * <pre>
   **
   * Order type. Only BUY or SELL are allowed 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderType order_type = 3;</code>
   */
  int getOrderTypeValue();
  /**
   * <pre>
   **
   * Order type. Only BUY or SELL are allowed 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderType order_type = 3;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderType getOrderType();

  /**
   * <pre>
   **
   * Amount of securities. Relevant to the short term markets 
   * </pre>
   *
   * <code>double amount = 4;</code>
   */
  double getAmount();

  /**
   * <pre>
   **
   * List of stock exchanges 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.StockExchange stock_exchanges = 5;</code>
   */
  java.util.List<com.consorsbank.module.tapi.grpc.stock.StockExchange> 
      getStockExchangesList();
  /**
   * <pre>
   **
   * List of stock exchanges 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.StockExchange stock_exchanges = 5;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchange getStockExchanges(int index);
  /**
   * <pre>
   **
   * List of stock exchanges 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.StockExchange stock_exchanges = 5;</code>
   */
  int getStockExchangesCount();
  /**
   * <pre>
   **
   * List of stock exchanges 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.StockExchange stock_exchanges = 5;</code>
   */
  java.util.List<? extends com.consorsbank.module.tapi.grpc.stock.StockExchangeOrBuilder> 
      getStockExchangesOrBuilderList();
  /**
   * <pre>
   **
   * List of stock exchanges 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.StockExchange stock_exchanges = 5;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchangeOrBuilder getStockExchangesOrBuilder(
      int index);
}
