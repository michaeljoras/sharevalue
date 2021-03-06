// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DepotService.proto

package com.consorsbank.module.tapi.grpc.depot;

public interface DepotPositionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.consorsbank.module.tapi.grpc.DepotPosition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * Ammount of the securities
   * </pre>
   *
   * <code>double amount = 1;</code>
   */
  double getAmount();

  /**
   * <pre>
   **
   * Position identification
   * </pre>
   *
   * <code>string position_id = 2;</code>
   */
  java.lang.String getPositionId();
  /**
   * <pre>
   **
   * Position identification
   * </pre>
   *
   * <code>string position_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getPositionIdBytes();

  /**
   * <pre>
   **
   * True if sell of the position is possible or false otherwise
   * </pre>
   *
   * <code>bool sell_possible = 3;</code>
   */
  boolean getSellPossible();

  /**
   * <pre>
   **
   * Unit note
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.UnitNote unit_note = 4;</code>
   */
  int getUnitNoteValue();
  /**
   * <pre>
   **
   * Unit note
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.UnitNote unit_note = 4;</code>
   */
  com.consorsbank.module.tapi.grpc.common.UnitNote getUnitNote();

  /**
   * <pre>
   **
   * True if entry is blocked or false otherwise
   * </pre>
   *
   * <code>bool blocked = 5;</code>
   */
  boolean getBlocked();

  /**
   * <pre>
   **
   * Purchase quotation or NaN if not defined.
   * Currently this field ALWAYS undefined, reserved for future use
   * </pre>
   *
   * <code>double purchase_quotation = 6;</code>
   */
  double getPurchaseQuotation();

  /**
   * <pre>
   **
   * Purchase currency or empty value if not defined
   * </pre>
   *
   * <code>string purchase_currency = 7;</code>
   */
  java.lang.String getPurchaseCurrency();
  /**
   * <pre>
   **
   * Purchase currency or empty value if not defined
   * </pre>
   *
   * <code>string purchase_currency = 7;</code>
   */
  com.google.protobuf.ByteString
      getPurchaseCurrencyBytes();

  /**
   * <pre>
   **
   * Purchase currency rate or NaN if not defined
   * </pre>
   *
   * <code>double purchase_currency_rate = 8;</code>
   */
  double getPurchaseCurrencyRate();
}
