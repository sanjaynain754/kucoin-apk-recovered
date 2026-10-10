.class public interface abstract Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;
.super Ljava/lang/Object;
.source "HistoryOrdersUiData.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;,
        Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;,
        Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;,
        Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;,
        Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u00012\u00020\u0002:\u000556789R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0006R\u0014\u0010!\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0006R\u0014\u0010#\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0006R\u0014\u0010%\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0006R\u0014\u0010\'\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u0006R\u0014\u0010)\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0006R\u0014\u0010+\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u0006R\u0014\u0010-\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u0006R\u0014\u0010/\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0006R\u0014\u00101\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u0006R\u0014\u00103\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u0010\u0006\u0082\u0001\u0005:;<=>\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006?\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData;",
        "Landroid/os/Parcelable;",
        "orderId",
        "",
        "getOrderId",
        "()Ljava/lang/String;",
        "symbol",
        "getSymbol",
        "symbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "getSymbolInfo",
        "()Lcom/kubi/data/entity/SymbolInfoEntity;",
        "side",
        "getSide",
        "time",
        "",
        "getTime",
        "()Ljava/lang/Long;",
        "hidden",
        "",
        "getHidden",
        "()Ljava/lang/Boolean;",
        "iceberg",
        "getIceberg",
        "averagePrice",
        "getAveragePrice",
        "dealSize",
        "getDealSize",
        "size",
        "getSize",
        "orderType",
        "getOrderType",
        "stp",
        "getStp",
        "funds",
        "getFunds",
        "filledFunds",
        "getFilledFunds",
        "sizeUnit",
        "getSizeUnit",
        "fee",
        "getFee",
        "feeCurrency",
        "getFeeCurrency",
        "tax",
        "getTax",
        "taxCurrency",
        "getTaxCurrency",
        "status",
        "getStatus",
        "cancelReason",
        "getCancelReason",
        "Limit",
        "StopLimit",
        "AdvancedLimit",
        "Market",
        "StopMarket",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAveragePrice()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCancelReason()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getDealSize()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getFee()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getFeeCurrency()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getFilledFunds()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getFunds()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getHidden()Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getIceberg()Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getOrderId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getOrderType()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSide()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSize()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSizeUnit()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getStatus()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getStp()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSymbol()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getTax()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getTaxCurrency()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getTime()Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
