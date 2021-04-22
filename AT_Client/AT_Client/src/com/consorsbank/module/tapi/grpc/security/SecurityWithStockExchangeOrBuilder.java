// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.consorsbank.module.tapi.grpc.security;

public interface SecurityWithStockExchangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.SecurityWithStockExchange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** Security code object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 1;</code>
   */
  boolean hasSecurityCode();
  /**
   * <pre>
   ** Security code object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityCode getSecurityCode();
  /**
   * <pre>
   ** Security code object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityCode security_code = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityCodeOrBuilder getSecurityCodeOrBuilder();

  /**
   * <pre>
   ** Stock exchange object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 2;</code>
   */
  boolean hasStockExchange();
  /**
   * <pre>
   ** Stock exchange object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchange getStockExchange();
  /**
   * <pre>
   ** Stock exchange object 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchangeOrBuilder getStockExchangeOrBuilder();
}
