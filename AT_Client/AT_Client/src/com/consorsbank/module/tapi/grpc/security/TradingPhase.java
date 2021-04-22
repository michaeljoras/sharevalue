// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.consorsbank.module.tapi.grpc.security;

/**
 * <pre>
 **
 * Represents stock exchange trading phase. 
 * Some values are refer to the Xetra stock exchange 
 * </pre>
 *
 * Protobuf enum {@code com.consorsbank.module.tapi.grpc.TradingPhase}
 */
public enum TradingPhase
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   ** Unknown trading phase 
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <pre>
   **  Pretrade trading phase 
   * </pre>
   *
   * <code>PRETRADE = 1;</code>
   */
  PRETRADE(1),
  /**
   * <pre>
   **  Posttrade trading phase 
   * </pre>
   *
   * <code>POSTTRADE = 2;</code>
   */
  POSTTRADE(2),
  /**
   * <pre>
   **  Start trading phase 
   * </pre>
   *
   * <code>START = 3;</code>
   */
  START(3),
  /**
   * <pre>
   **  End trading phase 
   * </pre>
   *
   * <code>END = 4;</code>
   */
  END(4),
  /**
   * <pre>
   **  Vola trading phase 
   * </pre>
   *
   * <code>VOLA = 5;</code>
   */
  VOLA(5),
  /**
   * <pre>
   **  OCall trading phase 
   * </pre>
   *
   * <code>OCALL = 6;</code>
   */
  OCALL(6),
  /**
   * <pre>
   **  ICall trading phase 
   * </pre>
   *
   * <code>ICALL = 7;</code>
   */
  ICALL(7),
  /**
   * <pre>
   **  CCall trading phase 
   * </pre>
   *
   * <code>CCALL = 8;</code>
   */
  CCALL(8),
  /**
   * <pre>
   **  Trade trading phase 
   * </pre>
   *
   * <code>TRADE = 9;</code>
   */
  TRADE(9),
  /**
   * <pre>
   **  Trade indicative trading phase 
   * </pre>
   *
   * <code>TRADE_INDICATIVE = 10;</code>
   */
  TRADE_INDICATIVE(10),
  /**
   * <pre>
   **  Trade best bid / ask trading phase 
   * </pre>
   *
   * <code>TRADE_BEST_BID_ASK = 11;</code>
   */
  TRADE_BEST_BID_ASK(11),
  /**
   * <pre>
   **  Trade auction, but not indicative trading phase 
   * </pre>
   *
   * <code>TRADE_AUCTION_NO_INDICATIVE = 12;</code>
   */
  TRADE_AUCTION_NO_INDICATIVE(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   ** Unknown trading phase 
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <pre>
   **  Pretrade trading phase 
   * </pre>
   *
   * <code>PRETRADE = 1;</code>
   */
  public static final int PRETRADE_VALUE = 1;
  /**
   * <pre>
   **  Posttrade trading phase 
   * </pre>
   *
   * <code>POSTTRADE = 2;</code>
   */
  public static final int POSTTRADE_VALUE = 2;
  /**
   * <pre>
   **  Start trading phase 
   * </pre>
   *
   * <code>START = 3;</code>
   */
  public static final int START_VALUE = 3;
  /**
   * <pre>
   **  End trading phase 
   * </pre>
   *
   * <code>END = 4;</code>
   */
  public static final int END_VALUE = 4;
  /**
   * <pre>
   **  Vola trading phase 
   * </pre>
   *
   * <code>VOLA = 5;</code>
   */
  public static final int VOLA_VALUE = 5;
  /**
   * <pre>
   **  OCall trading phase 
   * </pre>
   *
   * <code>OCALL = 6;</code>
   */
  public static final int OCALL_VALUE = 6;
  /**
   * <pre>
   **  ICall trading phase 
   * </pre>
   *
   * <code>ICALL = 7;</code>
   */
  public static final int ICALL_VALUE = 7;
  /**
   * <pre>
   **  CCall trading phase 
   * </pre>
   *
   * <code>CCALL = 8;</code>
   */
  public static final int CCALL_VALUE = 8;
  /**
   * <pre>
   **  Trade trading phase 
   * </pre>
   *
   * <code>TRADE = 9;</code>
   */
  public static final int TRADE_VALUE = 9;
  /**
   * <pre>
   **  Trade indicative trading phase 
   * </pre>
   *
   * <code>TRADE_INDICATIVE = 10;</code>
   */
  public static final int TRADE_INDICATIVE_VALUE = 10;
  /**
   * <pre>
   **  Trade best bid / ask trading phase 
   * </pre>
   *
   * <code>TRADE_BEST_BID_ASK = 11;</code>
   */
  public static final int TRADE_BEST_BID_ASK_VALUE = 11;
  /**
   * <pre>
   **  Trade auction, but not indicative trading phase 
   * </pre>
   *
   * <code>TRADE_AUCTION_NO_INDICATIVE = 12;</code>
   */
  public static final int TRADE_AUCTION_NO_INDICATIVE_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TradingPhase valueOf(int value) {
    return forNumber(value);
  }

  public static TradingPhase forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return PRETRADE;
      case 2: return POSTTRADE;
      case 3: return START;
      case 4: return END;
      case 5: return VOLA;
      case 6: return OCALL;
      case 7: return ICALL;
      case 8: return CCALL;
      case 9: return TRADE;
      case 10: return TRADE_INDICATIVE;
      case 11: return TRADE_BEST_BID_ASK;
      case 12: return TRADE_AUCTION_NO_INDICATIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradingPhase>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradingPhase> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradingPhase>() {
          public TradingPhase findValueByNumber(int number) {
            return TradingPhase.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.consorsbank.module.tapi.grpc.security.SecurityService.getDescriptor().getEnumTypes().get(3);
  }

  private static final TradingPhase[] VALUES = values();

  public static TradingPhase valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TradingPhase(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.consorsbank.module.tapi.grpc.TradingPhase)
}
