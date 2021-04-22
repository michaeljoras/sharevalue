// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TradingTypes.proto

package com.consorsbank.module.tapi.grpc.trading;

public interface TradingPossibilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.TradingPossibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * Order model
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderModel order_model = 1;</code>
   */
  int getOrderModelValue();
  /**
   * <pre>
   **
   * Order model
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderModel order_model = 1;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderModel getOrderModel();

  /**
   * <pre>
   **
   * Order supplement
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderSupplement order_supplement = 2;</code>
   */
  int getOrderSupplementValue();
  /**
   * <pre>
   **
   * Order supplement
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderSupplement order_supplement = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderSupplement getOrderSupplement();

  /**
   * <pre>
   **
   * Trailing notation
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.TrailingNotation trailing_notation = 3;</code>
   */
  int getTrailingNotationValue();
  /**
   * <pre>
   **
   * Trailing notation
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.TrailingNotation trailing_notation = 3;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.TrailingNotation getTrailingNotation();

  /**
   * <pre>
   **
   * List of allowed cash_quatations
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.CashQuotation cash_quotations = 4;</code>
   */
  java.util.List<com.consorsbank.module.tapi.grpc.trading.CashQuotation> getCashQuotationsList();
  /**
   * <pre>
   **
   * List of allowed cash_quatations
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.CashQuotation cash_quotations = 4;</code>
   */
  int getCashQuotationsCount();
  /**
   * <pre>
   **
   * List of allowed cash_quatations
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.CashQuotation cash_quotations = 4;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.CashQuotation getCashQuotations(int index);
  /**
   * <pre>
   **
   * List of allowed cash_quatations
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.CashQuotation cash_quotations = 4;</code>
   */
  java.util.List<java.lang.Integer>
  getCashQuotationsValueList();
  /**
   * <pre>
   **
   * List of allowed cash_quatations
   * </pre>
   *
   * <code>repeated .com.consorsbank.module.tapi.grpc.CashQuotation cash_quotations = 4;</code>
   */
  int getCashQuotationsValue(int index);
}
