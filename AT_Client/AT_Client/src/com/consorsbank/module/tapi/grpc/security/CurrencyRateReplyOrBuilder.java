// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.consorsbank.module.tapi.grpc.security;

public interface CurrencyRateReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.CurrencyRateReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** Source currency 
   * </pre>
   *
   * <code>string currency_from = 1;</code>
   */
  java.lang.String getCurrencyFrom();
  /**
   * <pre>
   ** Source currency 
   * </pre>
   *
   * <code>string currency_from = 1;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyFromBytes();

  /**
   * <pre>
   ** Target currency
   * </pre>
   *
   * <code>string currency_to = 2;</code>
   */
  java.lang.String getCurrencyTo();
  /**
   * <pre>
   ** Target currency
   * </pre>
   *
   * <code>string currency_to = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyToBytes();

  /**
   * <pre>
   ** Currency rate
   * </pre>
   *
   * <code>double currency_rate = 3;</code>
   */
  double getCurrencyRate();

  /**
   * <pre>
   ** Error information if occuirs 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  boolean hasError();
  /**
   * <pre>
   ** Error information if occuirs 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  com.consorsbank.module.tapi.grpc.common.Error getError();
  /**
   * <pre>
   ** Error information if occuirs 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.Error error = 1000;</code>
   */
  com.consorsbank.module.tapi.grpc.common.ErrorOrBuilder getErrorOrBuilder();
}
