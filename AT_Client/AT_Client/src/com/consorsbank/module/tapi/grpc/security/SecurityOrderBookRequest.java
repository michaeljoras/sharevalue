// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.consorsbank.module.tapi.grpc.security;

/**
 * <pre>
 **
 * Requests orderbook data for security with stockexchange
 * </pre>
 *
 * Protobuf type {@code com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest}
 */
public  final class SecurityOrderBookRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest)
    SecurityOrderBookRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityOrderBookRequest.newBuilder() to construct.
  private SecurityOrderBookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityOrderBookRequest() {
    accessToken_ = "";
    currency_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityOrderBookRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            accessToken_ = s;
            break;
          }
          case 18: {
            com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder subBuilder = null;
            if (securityWithStockexchange_ != null) {
              subBuilder = securityWithStockexchange_.toBuilder();
            }
            securityWithStockexchange_ = input.readMessage(com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(securityWithStockexchange_);
              securityWithStockexchange_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.consorsbank.module.tapi.grpc.security.SecurityService.internal_static_com_consorsbank_module_tapi_grpc_SecurityOrderBookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.consorsbank.module.tapi.grpc.security.SecurityService.internal_static_com_consorsbank_module_tapi_grpc_SecurityOrderBookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.class, com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.Builder.class);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object accessToken_;
  /**
   * <pre>
   **
   * Access token
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   * Access token
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_WITH_STOCKEXCHANGE_FIELD_NUMBER = 2;
  private com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange securityWithStockexchange_;
  /**
   * <pre>
   ** 
   * Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
   */
  public boolean hasSecurityWithStockexchange() {
    return securityWithStockexchange_ != null;
  }
  /**
   * <pre>
   ** 
   * Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
   */
  public com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange getSecurityWithStockexchange() {
    return securityWithStockexchange_ == null ? com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.getDefaultInstance() : securityWithStockexchange_;
  }
  /**
   * <pre>
   ** 
   * Security with stockExchange object (security code, stock exchange) 
   * </pre>
   *
   * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
   */
  public com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder getSecurityWithStockexchangeOrBuilder() {
    return getSecurityWithStockexchange();
  }

  public static final int CURRENCY_FIELD_NUMBER = 3;
  private volatile java.lang.Object currency_;
  /**
   * <pre>
   ** 
   * Requested currency. If not filled used default currency. 
   * Otherwise values will be converted to requested currency. 
   * </pre>
   *
   * <code>string currency = 3;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <pre>
   ** 
   * Requested currency. If not filled used default currency. 
   * Otherwise values will be converted to requested currency. 
   * </pre>
   *
   * <code>string currency = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (securityWithStockexchange_ != null) {
      output.writeMessage(2, getSecurityWithStockexchange());
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currency_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (securityWithStockexchange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecurityWithStockexchange());
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currency_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest)) {
      return super.equals(obj);
    }
    com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest other = (com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest) obj;

    boolean result = true;
    result = result && getAccessToken()
        .equals(other.getAccessToken());
    result = result && (hasSecurityWithStockexchange() == other.hasSecurityWithStockexchange());
    if (hasSecurityWithStockexchange()) {
      result = result && getSecurityWithStockexchange()
          .equals(other.getSecurityWithStockexchange());
    }
    result = result && getCurrency()
        .equals(other.getCurrency());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (hasSecurityWithStockexchange()) {
      hash = (37 * hash) + SECURITY_WITH_STOCKEXCHANGE_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityWithStockexchange().hashCode();
    }
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * Requests orderbook data for security with stockexchange
   * </pre>
   *
   * Protobuf type {@code com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest)
      com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.consorsbank.module.tapi.grpc.security.SecurityService.internal_static_com_consorsbank_module_tapi_grpc_SecurityOrderBookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.consorsbank.module.tapi.grpc.security.SecurityService.internal_static_com_consorsbank_module_tapi_grpc_SecurityOrderBookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.class, com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.Builder.class);
    }

    // Construct using com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      accessToken_ = "";

      if (securityWithStockexchangeBuilder_ == null) {
        securityWithStockexchange_ = null;
      } else {
        securityWithStockexchange_ = null;
        securityWithStockexchangeBuilder_ = null;
      }
      currency_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.consorsbank.module.tapi.grpc.security.SecurityService.internal_static_com_consorsbank_module_tapi_grpc_SecurityOrderBookRequest_descriptor;
    }

    @java.lang.Override
    public com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest getDefaultInstanceForType() {
      return com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest build() {
      com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest buildPartial() {
      com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest result = new com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest(this);
      result.accessToken_ = accessToken_;
      if (securityWithStockexchangeBuilder_ == null) {
        result.securityWithStockexchange_ = securityWithStockexchange_;
      } else {
        result.securityWithStockexchange_ = securityWithStockexchangeBuilder_.build();
      }
      result.currency_ = currency_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest) {
        return mergeFrom((com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest other) {
      if (other == com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest.getDefaultInstance()) return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.hasSecurityWithStockexchange()) {
        mergeSecurityWithStockexchange(other.getSecurityWithStockexchange());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     * <pre>
     **
     * Access token
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     **
     * Access token
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     * Access token
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * Access token
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder clearAccessToken() {
      
      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * Access token
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessToken_ = value;
      onChanged();
      return this;
    }

    private com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange securityWithStockexchange_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder> securityWithStockexchangeBuilder_;
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public boolean hasSecurityWithStockexchange() {
      return securityWithStockexchangeBuilder_ != null || securityWithStockexchange_ != null;
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange getSecurityWithStockexchange() {
      if (securityWithStockexchangeBuilder_ == null) {
        return securityWithStockexchange_ == null ? com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.getDefaultInstance() : securityWithStockexchange_;
      } else {
        return securityWithStockexchangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public Builder setSecurityWithStockexchange(com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange value) {
      if (securityWithStockexchangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityWithStockexchange_ = value;
        onChanged();
      } else {
        securityWithStockexchangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public Builder setSecurityWithStockexchange(
        com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder builderForValue) {
      if (securityWithStockexchangeBuilder_ == null) {
        securityWithStockexchange_ = builderForValue.build();
        onChanged();
      } else {
        securityWithStockexchangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public Builder mergeSecurityWithStockexchange(com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange value) {
      if (securityWithStockexchangeBuilder_ == null) {
        if (securityWithStockexchange_ != null) {
          securityWithStockexchange_ =
            com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.newBuilder(securityWithStockexchange_).mergeFrom(value).buildPartial();
        } else {
          securityWithStockexchange_ = value;
        }
        onChanged();
      } else {
        securityWithStockexchangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public Builder clearSecurityWithStockexchange() {
      if (securityWithStockexchangeBuilder_ == null) {
        securityWithStockexchange_ = null;
        onChanged();
      } else {
        securityWithStockexchange_ = null;
        securityWithStockexchangeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder getSecurityWithStockexchangeBuilder() {
      
      onChanged();
      return getSecurityWithStockexchangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    public com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder getSecurityWithStockexchangeOrBuilder() {
      if (securityWithStockexchangeBuilder_ != null) {
        return securityWithStockexchangeBuilder_.getMessageOrBuilder();
      } else {
        return securityWithStockexchange_ == null ?
            com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.getDefaultInstance() : securityWithStockexchange_;
      }
    }
    /**
     * <pre>
     ** 
     * Security with stockExchange object (security code, stock exchange) 
     * </pre>
     *
     * <code>.com.consorsbank.module.tapi.grpc.SecurityWithStockExchange security_with_stockexchange = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder> 
        getSecurityWithStockexchangeFieldBuilder() {
      if (securityWithStockexchangeBuilder_ == null) {
        securityWithStockexchangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchange.Builder, com.consorsbank.module.tapi.grpc.security.SecurityWithStockExchangeOrBuilder>(
                getSecurityWithStockexchange(),
                getParentForChildren(),
                isClean());
        securityWithStockexchange_ = null;
      }
      return securityWithStockexchangeBuilder_;
    }

    private java.lang.Object currency_ = "";
    /**
     * <pre>
     ** 
     * Requested currency. If not filled used default currency. 
     * Otherwise values will be converted to requested currency. 
     * </pre>
     *
     * <code>string currency = 3;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     ** 
     * Requested currency. If not filled used default currency. 
     * Otherwise values will be converted to requested currency. 
     * </pre>
     *
     * <code>string currency = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     ** 
     * Requested currency. If not filled used default currency. 
     * Otherwise values will be converted to requested currency. 
     * </pre>
     *
     * <code>string currency = 3;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** 
     * Requested currency. If not filled used default currency. 
     * Otherwise values will be converted to requested currency. 
     * </pre>
     *
     * <code>string currency = 3;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** 
     * Requested currency. If not filled used default currency. 
     * Otherwise values will be converted to requested currency. 
     * </pre>
     *
     * <code>string currency = 3;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest)
  }

  // @@protoc_insertion_point(class_scope:com.consorsbank.module.tapi.grpc.SecurityOrderBookRequest)
  private static final com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest();
  }

  public static com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityOrderBookRequest>
      PARSER = new com.google.protobuf.AbstractParser<SecurityOrderBookRequest>() {
    @java.lang.Override
    public SecurityOrderBookRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityOrderBookRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityOrderBookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityOrderBookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.consorsbank.module.tapi.grpc.security.SecurityOrderBookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

