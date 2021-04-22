// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AccountService.proto

package com.consorsbank.module.tapi.grpc.account;

public final class AccountService {
  private AccountService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccounts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccounts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountInformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccountInformation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024AccountService.proto\022 com.consorsbank." +
      "module.tapi.grpc\032\014Common.proto\"^\n\016Tradin" +
      "gAccount\022\026\n\016account_number\030\001 \001(\t\022\024\n\014depo" +
      "t_number\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\020\n\010tradable" +
      "\030\004 \001(\010\"x\n\025TradingAccountRequest\022\024\n\014acces" +
      "s_token\030\001 \001(\t\022I\n\017trading_account\030\002 \001(\01320" +
      ".com.consorsbank.module.tapi.grpc.Tradin" +
      "gAccount\"\216\001\n\017TradingAccounts\022B\n\010accounts" +
      "\030\001 \003(\01320.com.consorsbank.module.tapi.grp" +
      "c.TradingAccount\0227\n\005error\030\350\007 \001(\0132\'.com.c" +
      "onsorsbank.module.tapi.grpc.Error\"\275\003\n\032Tr" +
      "adingAccountTransactions\022A\n\007account\030\001 \001(" +
      "\01320.com.consorsbank.module.tapi.grpc.Tra" +
      "dingAccount\022^\n\014transactions\030\002 \003(\0132H.com." +
      "consorsbank.module.tapi.grpc.TradingAcco" +
      "untTransactions.Transaction\0227\n\005error\030\350\007 " +
      "\001(\0132\'.com.consorsbank.module.tapi.grpc.E" +
      "rror\032\302\001\n\013Transaction\022@\n\020transaction_date" +
      "\030\001 \001(\0132&.com.consorsbank.module.tapi.grp" +
      "c.Date\022\016\n\006amount\030\002 \001(\001\022\020\n\010opponent\030\003 \001(\t" +
      "\022\023\n\013information\030\004 \001(\t\022:\n\nvalue_date\030\005 \001(" +
      "\0132&.com.consorsbank.module.tapi.grpc.Dat" +
      "e\"\222\002\n\031TradingAccountInformation\022A\n\007accou" +
      "nt\030\001 \001(\01320.com.consorsbank.module.tapi.g" +
      "rpc.TradingAccount\022\017\n\007balance\030\002 \001(\001\022\024\n\014c" +
      "redit_limit\030\003 \001(\001\022\024\n\014buying_power\030\004 \001(\001\022" +
      "\035\n\025credit_limit_intraday\030\t \001(\001\022\035\n\025buying" +
      "_power_intraday\030\n \001(\001\0227\n\005error\030\350\007 \001(\0132\'." +
      "com.consorsbank.module.tapi.grpc.ErrorB," +
      "\n(com.consorsbank.module.tapi.grpc.accou" +
      "ntP\001b\006proto3"
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
          com.consorsbank.module.tapi.grpc.common.Common.getDescriptor(),
        }, assigner);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccount_descriptor,
        new java.lang.String[] { "AccountNumber", "DepotNumber", "Name", "Tradable", });
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccountRequest_descriptor,
        new java.lang.String[] { "AccessToken", "TradingAccount", });
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccounts_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccounts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccounts_descriptor,
        new java.lang.String[] { "Accounts", "Error", });
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_descriptor,
        new java.lang.String[] { "Account", "Transactions", "Error", });
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_Transaction_descriptor =
      internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_descriptor.getNestedTypes().get(0);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccountTransactions_Transaction_descriptor,
        new java.lang.String[] { "TransactionDate", "Amount", "Opponent", "Information", "ValueDate", });
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountInformation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_consorsbank_module_tapi_grpc_TradingAccountInformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_consorsbank_module_tapi_grpc_TradingAccountInformation_descriptor,
        new java.lang.String[] { "Account", "Balance", "CreditLimit", "BuyingPower", "CreditLimitIntraday", "BuyingPowerIntraday", "Error", });
    com.consorsbank.module.tapi.grpc.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}