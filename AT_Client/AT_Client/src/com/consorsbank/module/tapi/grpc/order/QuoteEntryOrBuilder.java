// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.consorsbank.module.tapi.grpc.order;

public interface QuoteEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.QuoteEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** Stock exchange where infomation was requested 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 1;</code>
   */
  boolean hasStockExchange();
  /**
   * <pre>
   ** Stock exchange where infomation was requested 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchange getStockExchange();
  /**
   * <pre>
   ** Stock exchange where infomation was requested 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.StockExchange stock_exchange = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.stock.StockExchangeOrBuilder getStockExchangeOrBuilder();

  /**
   * <pre>
   ** Buy price 
   * </pre>
   *
   * <code>double buy_price = 2;</code>
   */
  double getBuyPrice();

  /**
   * <pre>
   ** Buy volume 
   * </pre>
   *
   * <code>double buy_volume = 3;</code>
   */
  double getBuyVolume();

  /**
   * <pre>
   ** Sell price 
   * </pre>
   *
   * <code>double sell_price = 4;</code>
   */
  double getSellPrice();

  /**
   * <pre>
   ** Sell volume 
   * </pre>
   *
   * <code>double sell_volume = 5;</code>
   */
  double getSellVolume();

  /**
   * <pre>
   ** Last price 
   * </pre>
   *
   * <code>double last_price = 6;</code>
   */
  double getLastPrice();

  /**
   * <pre>
   ** Last volume 
   * </pre>
   *
   * <code>double last_volume = 7;</code>
   */
  double getLastVolume();

  /**
   * <pre>
   ** Date and time of the last price 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Timestamp last_time = 8;</code>
   */
  boolean hasLastTime();
  /**
   * <pre>
   ** Date and time of the last price 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Timestamp last_time = 8;</code>
   */
  com.consorsbank.module.tapi.grpc.common.Timestamp getLastTime();
  /**
   * <pre>
   ** Date and time of the last price 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Timestamp last_time = 8;</code>
   */
  com.consorsbank.module.tapi.grpc.common.TimestampOrBuilder getLastTimeOrBuilder();

  /**
   * <pre>
   ** Currency 
   * </pre>
   *
   * <code>string currency = 9;</code>
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   ** Currency 
   * </pre>
   *
   * <code>string currency = 9;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <pre>
   ** Quote reference. Used for the accept quite request. Can be empty if accept quote is not possible. 
   * </pre>
   *
   * <code>string quote_reference = 10;</code>
   */
  java.lang.String getQuoteReference();
  /**
   * <pre>
   ** Quote reference. Used for the accept quite request. Can be empty if accept quote is not possible. 
   * </pre>
   *
   * <code>string quote_reference = 10;</code>
   */
  com.google.protobuf.ByteString
      getQuoteReferenceBytes();

  /**
   * <pre>
   ** Used by call order type 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderType order_type = 11;</code>
   */
  int getOrderTypeValue();
  /**
   * <pre>
   ** Used by call order type 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderType order_type = 11;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderType getOrderType();

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
