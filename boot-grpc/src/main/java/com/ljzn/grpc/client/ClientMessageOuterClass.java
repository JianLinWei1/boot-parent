// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/client.message.proto

package com.ljzn.grpc.client;

public final class ClientMessageOuterClass {
  private ClientMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PrisonSystem_ClientMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PrisonSystem_ClientMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033client/client.message.proto\022\014PrisonSys" +
      "tem\"\324\001\n\rClientMessage\022\023\n\013deviceSeril\030\001 \001" +
      "(\t\022\022\n\ndeviceName\030\002 \001(\t\022\022\n\ndeviceType\030\003 \001" +
      "(\005\022\025\n\rdeviceAddress\030\004 \001(\t\022\026\n\016deviceAccur" +
      "acy\030\005 \001(\t\022\026\n\016serviceAccount\030\006 \001(\t\022\027\n\017ser" +
      "vicePassword\030\007 \001(\t\022\021\n\tclient_ip\030\010 \001(\t\022\023\n" +
      "\013client_port\030\t \001(\005B!\n\024com.ljzn.grpc.clie" +
      "ntP\001\242\002\006CLIENTb\006proto3"
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
    internal_static_PrisonSystem_ClientMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PrisonSystem_ClientMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PrisonSystem_ClientMessage_descriptor,
        new java.lang.String[] { "DeviceSeril", "DeviceName", "DeviceType", "DeviceAddress", "DeviceAccuracy", "ServiceAccount", "ServicePassword", "ClientIp", "ClientPort", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
