// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TradingAPI.proto

package com.consorsbank.module.tapi.grpc;

public final class TradingAPI {
  private TradingAPI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020TradingAPI.proto\022 com.consorsbank.modu" +
      "le.tapi.grpc\032\014Common.proto\032\032StockExchang" +
      "eService.proto\032\025SecurityService.proto\032\024A" +
      "ccountService.proto\032\022OrderService.proto\032" +
      "\022DepotService.proto\032\023AccessService.proto" +
      "2\340\001\n\rAccessService\022e\n\005Login\022..com.consor" +
      "sbank.module.tapi.grpc.LoginRequest\032,.co" +
      "m.consorsbank.module.tapi.grpc.LoginRepl" +
      "y\022h\n\006Logout\022/.com.consorsbank.module.tap" +
      "i.grpc.LogoutRequest\032-.com.consorsbank.m" +
      "odule.tapi.grpc.LogoutReply2\310\005\n\017Security" +
      "Service\022}\n\017GetSecurityInfo\0225.com.consors" +
      "bank.module.tapi.grpc.SecurityInfoReques" +
      "t\0323.com.consorsbank.module.tapi.grpc.Sec" +
      "urityInfoReply\022\214\001\n\020StreamMarketData\022;.co" +
      "m.consorsbank.module.tapi.grpc.SecurityM" +
      "arketDataRequest\0329.com.consorsbank.modul" +
      "e.tapi.grpc.SecurityMarketDataReply0\001\022\211\001" +
      "\n\017StreamOrderBook\022:.com.consorsbank.modu" +
      "le.tapi.grpc.SecurityOrderBookRequest\0328." +
      "com.consorsbank.module.tapi.grpc.Securit" +
      "yOrderBookReply0\001\022\202\001\n\022StreamCurrencyRate" +
      "\0225.com.consorsbank.module.tapi.grpc.Curr" +
      "encyRateRequest\0323.com.consorsbank.module" +
      ".tapi.grpc.CurrencyRateReply0\001\022\225\001\n\027GetSe" +
      "curityPriceHistory\022=.com.consorsbank.mod" +
      "ule.tapi.grpc.SecurityPriceHistoryReques" +
      "t\032;.com.consorsbank.module.tapi.grpc.Sec" +
      "urityPriceHistoryReply2\250\002\n\024StockExchange" +
      "Service\022\206\001\n\021GetStockExchanges\0224.com.cons" +
      "orsbank.module.tapi.grpc.AccessTokenRequ" +
      "est\032;.com.consorsbank.module.tapi.grpc.S" +
      "tockExchangeDescriptions\022\206\001\n\020GetStockExc" +
      "hange\0226.com.consorsbank.module.tapi.grpc" +
      ".StockExchangeRequest\032:.com.consorsbank." +
      "module.tapi.grpc.StockExchangeDescriptio" +
      "n2\227\010\n\014OrderService\022s\n\014StreamOrders\0227.com" +
      ".consorsbank.module.tapi.grpc.TradingAcc" +
      "ountRequest\032(.com.consorsbank.module.tap" +
      "i.grpc.Orders0\001\022p\n\014UpdateOrders\0227.com.co" +
      "nsorsbank.module.tapi.grpc.TradingAccoun" +
      "tRequest\032\'.com.consorsbank.module.tapi.g" +
      "rpc.Empty\022h\n\010GetQuote\022..com.consorsbank." +
      "module.tapi.grpc.QuoteRequest\032,.com.cons" +
      "orsbank.module.tapi.grpc.QuoteReply\022q\n\013A" +
      "cceptQuote\0224.com.consorsbank.module.tapi" +
      ".grpc.AcceptQuoteRequest\032,.com.consorsba" +
      "nk.module.tapi.grpc.OrderReply\022k\n\010AddOrd" +
      "er\0221.com.consorsbank.module.tapi.grpc.Ad" +
      "dOrderRequest\032,.com.consorsbank.module.t" +
      "api.grpc.OrderReply\022q\n\013ChangeOrder\0224.com" +
      ".consorsbank.module.tapi.grpc.ChangeOrde" +
      "rRequest\032,.com.consorsbank.module.tapi.g" +
      "rpc.OrderReply\022q\n\013CancelOrder\0224.com.cons" +
      "orsbank.module.tapi.grpc.CancelOrderRequ" +
      "est\032,.com.consorsbank.module.tapi.grpc.O" +
      "rderReply\022u\n\rActivateOrder\0226.com.consors" +
      "bank.module.tapi.grpc.ActivateOrderReque" +
      "st\032,.com.consorsbank.module.tapi.grpc.Or" +
      "derReply\022y\n\017DeactivateOrder\0228.com.consor" +
      "sbank.module.tapi.grpc.DeactivateOrderRe" +
      "quest\032,.com.consorsbank.module.tapi.grpc" +
      ".OrderReply2\276\003\n\016AccountService\022}\n\022GetTra" +
      "dingAccounts\0224.com.consorsbank.module.ta" +
      "pi.grpc.AccessTokenRequest\0321.com.consors" +
      "bank.module.tapi.grpc.TradingAccounts\022\216\001" +
      "\n\024StreamTradingAccount\0227.com.consorsbank" +
      ".module.tapi.grpc.TradingAccountRequest\032" +
      ";.com.consorsbank.module.tapi.grpc.Tradi" +
      "ngAccountInformation0\001\022\233\001\n StreamTrading" +
      "AccountTransactions\0227.com.consorsbank.mo" +
      "dule.tapi.grpc.TradingAccountRequest\032<.c" +
      "om.consorsbank.module.tapi.grpc.TradingA" +
      "ccountTransactions0\0012\371\001\n\014DepotService\022x\n" +
      "\013StreamDepot\0227.com.consorsbank.module.ta" +
      "pi.grpc.TradingAccountRequest\032..com.cons" +
      "orsbank.module.tapi.grpc.DepotEntries0\001\022" +
      "o\n\013UpdateDepot\0227.com.consorsbank.module." +
      "tapi.grpc.TradingAccountRequest\032\'.com.co" +
      "nsorsbank.module.tapi.grpc.EmptyB$\n com." +
      "consorsbank.module.tapi.grpcP\001b\006proto3"
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
          com.consorsbank.module.tapi.grpc.stock.StockExchangeService.getDescriptor(),
          com.consorsbank.module.tapi.grpc.security.SecurityService.getDescriptor(),
          com.consorsbank.module.tapi.grpc.account.AccountService.getDescriptor(),
          com.consorsbank.module.tapi.grpc.order.OrderService.getDescriptor(),
          com.consorsbank.module.tapi.grpc.depot.DepotService.getDescriptor(),
          com.consorsbank.module.tapi.grpc.access.AccessService.getDescriptor(),
        }, assigner);
    com.consorsbank.module.tapi.grpc.common.Common.getDescriptor();
    com.consorsbank.module.tapi.grpc.stock.StockExchangeService.getDescriptor();
    com.consorsbank.module.tapi.grpc.security.SecurityService.getDescriptor();
    com.consorsbank.module.tapi.grpc.account.AccountService.getDescriptor();
    com.consorsbank.module.tapi.grpc.order.OrderService.getDescriptor();
    com.consorsbank.module.tapi.grpc.depot.DepotService.getDescriptor();
    com.consorsbank.module.tapi.grpc.access.AccessService.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}