// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.consorsbank.module.tapi.grpc.security;

public interface SecurityPriceHistoryReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.SecurityPriceHistoryReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 1;</code>
   */
  boolean hasSecurityWithStockexchange();
  /**
   * <pre>
   ** Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange getSecurityWithStockexchange();
  /**
   * <pre>
   ** Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder getSecurityWithStockexchangeOrBuilder();

  /**
   * <pre>
   ** Currency 
   * </pre>
   *
   * <code>string currency = 2;</code>
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   ** Currency 
   * </pre>
   *
   * <code>string currency = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <pre>
   ** List of the price entries 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.PriceEntry price_entries = 3;</code>
   */
  java.util.List<com.consorsbank.module.tapi.grpc.security.PriceEntry> 
      getPriceEntriesList();
  /**
   * <pre>
   ** List of the price entries 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.PriceEntry price_entries = 3;</code>
   */
  com.consorsbank.module.tapi.grpc.security.PriceEntry getPriceEntries(int index);
  /**
   * <pre>
   ** List of the price entries 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.PriceEntry price_entries = 3;</code>
   */
  int getPriceEntriesCount();
  /**
   * <pre>
   ** List of the price entries 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.PriceEntry price_entries = 3;</code>
   */
  java.util.List<? extends com.consorsbank.module.tapi.grpc.security.PriceEntryOrBuilder> 
      getPriceEntriesOrBuilderList();
  /**
   * <pre>
   ** List of the price entries 
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.PriceEntry price_entries = 3;</code>
   */
  com.consorsbank.module.tapi.grpc.security.PriceEntryOrBuilder getPriceEntriesOrBuilder(
      int index);

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
