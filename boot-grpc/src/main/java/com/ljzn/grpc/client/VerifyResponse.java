// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/verify.service.proto

package com.ljzn.grpc.client;

/**
 * Protobuf type {@code ClientVerify.VerifyResponse}
 */
public  final class VerifyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientVerify.VerifyResponse)
    VerifyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerifyResponse.newBuilder() to construct.
  private VerifyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerifyResponse() {
    result_ = 0;
    message_ = "";
    score_ = 0F;
    verifyTime_ = 0L;
    photo_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VerifyResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            result_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 29: {

            score_ = input.readFloat();
            break;
          }
          case 32: {

            verifyTime_ = input.readInt64();
            break;
          }
          case 42: {

            photo_ = input.readBytes();
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
    return com.ljzn.grpc.client.VerifyServiceOuterClass.internal_static_ClientVerify_VerifyResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ljzn.grpc.client.VerifyServiceOuterClass.internal_static_ClientVerify_VerifyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ljzn.grpc.client.VerifyResponse.class, com.ljzn.grpc.client.VerifyResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <pre>
   *成功=1,其他失败
   * </pre>
   *
   * <code>int32 result = 1;</code>
   */
  public int getResult() {
    return result_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 3;
  private float score_;
  /**
   * <code>float score = 3;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int VERIFY_TIME_FIELD_NUMBER = 4;
  private long verifyTime_;
  /**
   * <code>int64 verify_time = 4;</code>
   */
  public long getVerifyTime() {
    return verifyTime_;
  }

  public static final int PHOTO_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString photo_;
  /**
   * <code>bytes photo = 5;</code>
   */
  public com.google.protobuf.ByteString getPhoto() {
    return photo_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != 0) {
      output.writeInt32(1, result_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (score_ != 0F) {
      output.writeFloat(3, score_);
    }
    if (verifyTime_ != 0L) {
      output.writeInt64(4, verifyTime_);
    }
    if (!photo_.isEmpty()) {
      output.writeBytes(5, photo_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, result_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, score_);
    }
    if (verifyTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, verifyTime_);
    }
    if (!photo_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, photo_);
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
    if (!(obj instanceof com.ljzn.grpc.client.VerifyResponse)) {
      return super.equals(obj);
    }
    com.ljzn.grpc.client.VerifyResponse other = (com.ljzn.grpc.client.VerifyResponse) obj;

    boolean result = true;
    result = result && (getResult()
        == other.getResult());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (
        java.lang.Float.floatToIntBits(getScore())
        == java.lang.Float.floatToIntBits(
            other.getScore()));
    result = result && (getVerifyTime()
        == other.getVerifyTime());
    result = result && getPhoto()
        .equals(other.getPhoto());
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    hash = (37 * hash) + VERIFY_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVerifyTime());
    hash = (37 * hash) + PHOTO_FIELD_NUMBER;
    hash = (53 * hash) + getPhoto().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.client.VerifyResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ljzn.grpc.client.VerifyResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code ClientVerify.VerifyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientVerify.VerifyResponse)
      com.ljzn.grpc.client.VerifyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ljzn.grpc.client.VerifyServiceOuterClass.internal_static_ClientVerify_VerifyResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljzn.grpc.client.VerifyServiceOuterClass.internal_static_ClientVerify_VerifyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljzn.grpc.client.VerifyResponse.class, com.ljzn.grpc.client.VerifyResponse.Builder.class);
    }

    // Construct using com.ljzn.grpc.client.VerifyResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      result_ = 0;

      message_ = "";

      score_ = 0F;

      verifyTime_ = 0L;

      photo_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ljzn.grpc.client.VerifyServiceOuterClass.internal_static_ClientVerify_VerifyResponse_descriptor;
    }

    public com.ljzn.grpc.client.VerifyResponse getDefaultInstanceForType() {
      return com.ljzn.grpc.client.VerifyResponse.getDefaultInstance();
    }

    public com.ljzn.grpc.client.VerifyResponse build() {
      com.ljzn.grpc.client.VerifyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ljzn.grpc.client.VerifyResponse buildPartial() {
      com.ljzn.grpc.client.VerifyResponse result = new com.ljzn.grpc.client.VerifyResponse(this);
      result.result_ = result_;
      result.message_ = message_;
      result.score_ = score_;
      result.verifyTime_ = verifyTime_;
      result.photo_ = photo_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ljzn.grpc.client.VerifyResponse) {
        return mergeFrom((com.ljzn.grpc.client.VerifyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ljzn.grpc.client.VerifyResponse other) {
      if (other == com.ljzn.grpc.client.VerifyResponse.getDefaultInstance()) return this;
      if (other.getResult() != 0) {
        setResult(other.getResult());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getVerifyTime() != 0L) {
        setVerifyTime(other.getVerifyTime());
      }
      if (other.getPhoto() != com.google.protobuf.ByteString.EMPTY) {
        setPhoto(other.getPhoto());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ljzn.grpc.client.VerifyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ljzn.grpc.client.VerifyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ ;
    /**
     * <pre>
     *成功=1,其他失败
     * </pre>
     *
     * <code>int32 result = 1;</code>
     */
    public int getResult() {
      return result_;
    }
    /**
     * <pre>
     *成功=1,其他失败
     * </pre>
     *
     * <code>int32 result = 1;</code>
     */
    public Builder setResult(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *成功=1,其他失败
     * </pre>
     *
     * <code>int32 result = 1;</code>
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <code>float score = 3;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     * <code>float score = 3;</code>
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float score = 3;</code>
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private long verifyTime_ ;
    /**
     * <code>int64 verify_time = 4;</code>
     */
    public long getVerifyTime() {
      return verifyTime_;
    }
    /**
     * <code>int64 verify_time = 4;</code>
     */
    public Builder setVerifyTime(long value) {
      
      verifyTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 verify_time = 4;</code>
     */
    public Builder clearVerifyTime() {
      
      verifyTime_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString photo_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes photo = 5;</code>
     */
    public com.google.protobuf.ByteString getPhoto() {
      return photo_;
    }
    /**
     * <code>bytes photo = 5;</code>
     */
    public Builder setPhoto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      photo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes photo = 5;</code>
     */
    public Builder clearPhoto() {
      
      photo_ = getDefaultInstance().getPhoto();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientVerify.VerifyResponse)
  }

  // @@protoc_insertion_point(class_scope:ClientVerify.VerifyResponse)
  private static final com.ljzn.grpc.client.VerifyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ljzn.grpc.client.VerifyResponse();
  }

  public static com.ljzn.grpc.client.VerifyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyResponse>
      PARSER = new com.google.protobuf.AbstractParser<VerifyResponse>() {
    public VerifyResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VerifyResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VerifyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyResponse> getParserForType() {
    return PARSER;
  }

  public com.ljzn.grpc.client.VerifyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

