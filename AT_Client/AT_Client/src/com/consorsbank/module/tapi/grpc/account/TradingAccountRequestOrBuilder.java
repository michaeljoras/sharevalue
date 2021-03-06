// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AccountService.proto

package com.consorsbank.module.tapi.grpc.account;

public interface TradingAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.TradingAccountRequest)
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
   * Trading account
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.TradingAccount trading_account = 2;</code>
   */
  boolean hasTradingAccount();
  /**
   * <pre>
   **
   * Trading account
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.TradingAccount trading_account = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.account.TradingAccount getTradingAccount();
  /**
   * <pre>
   **
   * Trading account
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.TradingAccount trading_account = 2;</code>
   */
  com.consorsbank.module.tapi.grpc.account.TradingAccountOrBuilder getTradingAccountOrBuilder();
}
