// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/verify.service.proto

package com.ljzn.grpc.client;

public interface VerifyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientVerify.VerifyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *罪犯id
   * </pre>
   *
   * <code>string criminal_id = 1;</code>
   */
  java.lang.String getCriminalId();
  /**
   * <pre>
   *罪犯id
   * </pre>
   *
   * <code>string criminal_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCriminalIdBytes();

  /**
   * <pre>
   *罪犯特征
   * </pre>
   *
   * <code>.ClientVerify.VerifyRequest.CriminalFeature feature = 2;</code>
   */
  boolean hasFeature();
  /**
   * <pre>
   *罪犯特征
   * </pre>
   *
   * <code>.ClientVerify.VerifyRequest.CriminalFeature feature = 2;</code>
   */
  com.ljzn.grpc.client.VerifyRequest.CriminalFeature getFeature();
  /**
   * <pre>
   *罪犯特征
   * </pre>
   *
   * <code>.ClientVerify.VerifyRequest.CriminalFeature feature = 2;</code>
   */
  com.ljzn.grpc.client.VerifyRequest.CriminalFeatureOrBuilder getFeatureOrBuilder();

  /**
   * <pre>
   *超时时间(秒)
   * </pre>
   *
   * <code>int32 delay_time = 3;</code>
   */
  int getDelayTime();
}
