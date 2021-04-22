// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TradingTypes.proto

package com.consorsbank.module.tapi.grpc.trading;

/**
 * <pre>
 **
 * Order model represents possible orders
 * </pre>
 *
 * Protobuf enum {@code com.consorsbank.module.tapi.grpc.OrderModel}
 */
public enum OrderModel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   **
   *Order model absent
   * </pre>
   *
   * <code>NO_ORDER_MODEL = 0;</code>
   */
  NO_ORDER_MODEL(0),
  /**
   * <pre>
   **
   * Market order
   * </pre>
   *
   * <code>MARKET = 1;</code>
   */
  MARKET(1),
  /**
   * <pre>
   **
   * Limit order
   * </pre>
   *
   * <code>LIMIT = 2;</code>
   */
  LIMIT(2),
  /**
   * <pre>
   **
   * Stop market order. 
   * </pre>
   *
   * <code>STOP_MARKET = 3;</code>
   */
  STOP_MARKET(3),
  /**
   * <pre>
   **
   * Stop limit order
   * </pre>
   *
   * <code>STOP_LIMIT = 4;</code>
   */
  STOP_LIMIT(4),
  /**
   * <pre>
   **
   * One cancels other market order 
   * </pre>
   *
   * <code>ONE_CANCELS_OTHER_MARKET = 5;</code>
   */
  ONE_CANCELS_OTHER_MARKET(5),
  /**
   * <pre>
   **
   * One cancels other limit order
   * </pre>
   *
   * <code>ONE_CANCELS_OTHER_LIMIT = 6;</code>
   */
  ONE_CANCELS_OTHER_LIMIT(6),
  /**
   * <pre>
   **
   * Trailing stop market order
   * </pre>
   *
   * <code>TRAILING_STOP_MARKET = 7;</code>
   */
  TRAILING_STOP_MARKET(7),
  /**
   * <pre>
   **
   * Trailing stop limit order
   * </pre>
   *
   * <code>TRAILING_STOP_LIMIT = 8;</code>
   */
  TRAILING_STOP_LIMIT(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   **
   *Order model absent
   * </pre>
   *
   * <code>NO_ORDER_MODEL = 0;</code>
   */
  public static final int NO_ORDER_MODEL_VALUE = 0;
  /**
   * <pre>
   **
   * Market order
   * </pre>
   *
   * <code>MARKET = 1;</code>
   */
  public static final int MARKET_VALUE = 1;
  /**
   * <pre>
   **
   * Limit order
   * </pre>
   *
   * <code>LIMIT = 2;</code>
   */
  public static final int LIMIT_VALUE = 2;
  /**
   * <pre>
   **
   * Stop market order. 
   * </pre>
   *
   * <code>STOP_MARKET = 3;</code>
   */
  public static final int STOP_MARKET_VALUE = 3;
  /**
   * <pre>
   **
   * Stop limit order
   * </pre>
   *
   * <code>STOP_LIMIT = 4;</code>
   */
  public static final int STOP_LIMIT_VALUE = 4;
  /**
   * <pre>
   **
   * One cancels other market order 
   * </pre>
   *
   * <code>ONE_CANCELS_OTHER_MARKET = 5;</code>
   */
  public static final int ONE_CANCELS_OTHER_MARKET_VALUE = 5;
  /**
   * <pre>
   **
   * One cancels other limit order
   * </pre>
   *
   * <code>ONE_CANCELS_OTHER_LIMIT = 6;</code>
   */
  public static final int ONE_CANCELS_OTHER_LIMIT_VALUE = 6;
  /**
   * <pre>
   **
   * Trailing stop market order
   * </pre>
   *
   * <code>TRAILING_STOP_MARKET = 7;</code>
   */
  public static final int TRAILING_STOP_MARKET_VALUE = 7;
  /**
   * <pre>
   **
   * Trailing stop limit order
   * </pre>
   *
   * <code>TRAILING_STOP_LIMIT = 8;</code>
   */
  public static final int TRAILING_STOP_LIMIT_VALUE = 8;


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
  public static OrderModel valueOf(int value) {
    return forNumber(value);
  }

  public static OrderModel forNumber(int value) {
    switch (value) {
      case 0: return NO_ORDER_MODEL;
      case 1: return MARKET;
      case 2: return LIMIT;
      case 3: return STOP_MARKET;
      case 4: return STOP_LIMIT;
      case 5: return ONE_CANCELS_OTHER_MARKET;
      case 6: return ONE_CANCELS_OTHER_LIMIT;
      case 7: return TRAILING_STOP_MARKET;
      case 8: return TRAILING_STOP_LIMIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrderModel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrderModel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrderModel>() {
          public OrderModel findValueByNumber(int number) {
            return OrderModel.forNumber(number);
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
    return com.consorsbank.module.tapi.grpc.trading.TradingTypes.getDescriptor().getEnumTypes().get(0);
  }

  private static final OrderModel[] VALUES = values();

  public static OrderModel valueOf(
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

  private OrderModel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.consorsbank.module.tapi.grpc.OrderModel)
}
