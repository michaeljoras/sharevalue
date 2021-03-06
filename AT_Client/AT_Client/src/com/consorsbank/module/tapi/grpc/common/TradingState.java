// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Common.proto

package com.consorsbank.module.tapi.grpc.common;

/**
 * <pre>
 **
 * Trading state represents information about tradability. 
 * Security can be tradable or not (ex. index)
 * </pre>
 *
 * Protobuf enum {@code com.consorsbank.module.tapi.grpc.TradingState}
 */
public enum TradingState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   **
   * Trading state is not defined
   * </pre>
   *
   * <code>NO_TRADING_STATE = 0;</code>
   */
  NO_TRADING_STATE(0),
  /**
   * <pre>
   **
   * Tradable state
   * </pre>
   *
   * <code>TRADABLE = 1;</code>
   */
  TRADABLE(1),
  /**
   * <pre>
   **
   * Not tradable state
   * </pre>
   *
   * <code>NOT_TRADABLE = 2;</code>
   */
  NOT_TRADABLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   **
   * Trading state is not defined
   * </pre>
   *
   * <code>NO_TRADING_STATE = 0;</code>
   */
  public static final int NO_TRADING_STATE_VALUE = 0;
  /**
   * <pre>
   **
   * Tradable state
   * </pre>
   *
   * <code>TRADABLE = 1;</code>
   */
  public static final int TRADABLE_VALUE = 1;
  /**
   * <pre>
   **
   * Not tradable state
   * </pre>
   *
   * <code>NOT_TRADABLE = 2;</code>
   */
  public static final int NOT_TRADABLE_VALUE = 2;


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
  public static TradingState valueOf(int value) {
    return forNumber(value);
  }

  public static TradingState forNumber(int value) {
    switch (value) {
      case 0: return NO_TRADING_STATE;
      case 1: return TRADABLE;
      case 2: return NOT_TRADABLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradingState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradingState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradingState>() {
          public TradingState findValueByNumber(int number) {
            return TradingState.forNumber(number);
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
    return com.consorsbank.module.tapi.grpc.common.Common.getDescriptor().getEnumTypes().get(0);
  }

  private static final TradingState[] VALUES = values();

  public static TradingState valueOf(
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

  private TradingState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.consorsbank.module.tapi.grpc.TradingState)
}

