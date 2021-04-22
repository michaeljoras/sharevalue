// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.consorsbank.module.tapi.grpc.order;

public interface ChangeOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.ChangeOrderRequest)
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
   * Trading account number 
   * </pre>
   *
   * <code>string account_number = 2;</code>
   */
  java.lang.String getAccountNumber();
  /**
   * <pre>
   **
   * Trading account number 
   * </pre>
   *
   * <code>string account_number = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountNumberBytes();

  /**
   * <pre>
   **
   * Order number for that this changes should be accepted 
   * </pre>
   *
   * <code>string order_number = 3;</code>
   */
  java.lang.String getOrderNumber();
  /**
   * <pre>
   **
   * Order number for that this changes should be accepted 
   * </pre>
   *
   * <code>string order_number = 3;</code>
   */
  com.google.protobuf.ByteString
      getOrderNumberBytes();

  /**
   * <pre>
   **
   * New limit, shouldn't filled for market order 
   * </pre>
   *
   * <code>double limit = 4;</code>
   */
  double getLimit();

  /**
   * <pre>
   ** 
   *New stop value 
   * </pre>
   *
   * <code>double stop = 5;</code>
   */
  double getStop();

  /**
   * <pre>
   **
   * New stop limit value 
   * </pre>
   *
   * <code>double stop_limit = 6;</code>
   */
  double getStopLimit();

  /**
   * <pre>
   **
   * New amount 
   * </pre>
   *
   * <code>double amount = 7;</code>
   */
  double getAmount();

  /**
   * <pre>
   **
   * New validity date 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Date validity_date = 8;</code>
   */
  boolean hasValidityDate();
  /**
   * <pre>
   **
   * New validity date 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Date validity_date = 8;</code>
   */
  com.consorsbank.module.tapi.grpc.common.Date getValidityDate();
  /**
   * <pre>
   **
   * New validity date 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Date validity_date = 8;</code>
   */
  com.consorsbank.module.tapi.grpc.common.DateOrBuilder getValidityDateOrBuilder();

  /**
   * <pre>
   **
   * New order model 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderModel order_model = 9;</code>
   */
  int getOrderModelValue();
  /**
   * <pre>
   **
   * New order model 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderModel order_model = 9;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderModel getOrderModel();

  /**
   * <pre>
   **
   * New order supplement 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderSupplement order_supplement = 10;</code>
   */
  int getOrderSupplementValue();
  /**
   * <pre>
   **
   * New order supplement 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.OrderSupplement order_supplement = 10;</code>
   */
  com.consorsbank.module.tapi.grpc.trading.OrderSupplement getOrderSupplement();

  /**
   * <pre>
   **
   * Dripping quantity #pro# only 
   * </pre>
   *
   * <code>double dripping_quantity = 11;</code>
   */
  double getDrippingQuantity();

  /**
   * <pre>
   **
   * Validation flag. This request allowes only *WITHOUT_VALIDATION* 
   * and *VALIDATE_ONLY* values. +
   * If value is WITHOUT_VALIDATION then backend system sends order actions directly to the market. + 
   * If value is VALIDATE_ONLY then backend system doesn't send order actions to the market, but validate order parameters.
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Validation validation = 12;</code>
   */
  int getValidationValue();
  /**
   * <pre>
   **
   * Validation flag. This request allowes only *WITHOUT_VALIDATION* 
   * and *VALIDATE_ONLY* values. +
   * If value is WITHOUT_VALIDATION then backend system sends order actions directly to the market. + 
   * If value is VALIDATE_ONLY then backend system doesn't send order actions to the market, but validate order parameters.
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Validation validation = 12;</code>
   */
  com.consorsbank.module.tapi.grpc.order.Validation getValidation();

  /**
   * <pre>
   **
   * New trailing distance 
   * </pre>
   *
   * <code>double trailing_distance = 13;</code>
   */
  double getTrailingDistance();

  /**
   * <pre>
   **
   * New traling limit tolerance 
   * </pre>
   *
   * <code>double trailing_limit_tolerance = 14;</code>
   */
  double getTrailingLimitTolerance();
}