// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/verify.service.proto

package com.ljzn.grpc.client;

public final class VerifyServiceOuterClass {
  private VerifyServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientVerify_VerifyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientVerify_VerifyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientVerify_VerifyRequest_CriminalFeature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientVerify_VerifyRequest_CriminalFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientVerify_VerifyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientVerify_VerifyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033client/verify.service.proto\022\014ClientVer" +
      "ify\"\244\001\n\rVerifyRequest\022\023\n\013criminal_id\030\001 \001" +
      "(\t\022<\n\007feature\030\002 \001(\0132+.ClientVerify.Verif" +
      "yRequest.CriminalFeature\022\022\n\ndelay_time\030\003" +
      " \001(\005\032,\n\017CriminalFeature\022\013\n\003len\030\001 \001(\005\022\014\n\004" +
      "data\030\002 \003(\002\"d\n\016VerifyResponse\022\016\n\006result\030\001" +
      " \001(\005\022\017\n\007message\030\002 \001(\t\022\r\n\005score\030\003 \001(\002\022\023\n\013" +
      "verify_time\030\004 \001(\003\022\r\n\005photo\030\005 \001(\0142V\n\rVeri" +
      "fyService\022E\n\006Verify\022\033.ClientVerify.Verif" +
      "yRequest\032\034.ClientVerify.VerifyResponse\"\000" +
      "B!\n\024com.ljzn.grpc.clientP\001\242\002\006CLIENTb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ClientVerify_VerifyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientVerify_VerifyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientVerify_VerifyRequest_descriptor,
        new java.lang.String[] { "CriminalId", "Feature", "DelayTime", });
    internal_static_ClientVerify_VerifyRequest_CriminalFeature_descriptor =
      internal_static_ClientVerify_VerifyRequest_descriptor.getNestedTypes().get(0);
    internal_static_ClientVerify_VerifyRequest_CriminalFeature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientVerify_VerifyRequest_CriminalFeature_descriptor,
        new java.lang.String[] { "Len", "Data", });
    internal_static_ClientVerify_VerifyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ClientVerify_VerifyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientVerify_VerifyResponse_descriptor,
        new java.lang.String[] { "Result", "Message", "Score", "VerifyTime", "Photo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
