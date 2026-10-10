.class public abstract Lcom/kubi/transfer/TransferStateContract$UiIntent;
.super Ljava/lang/Object;
.source "TransferStateContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckCoinInAccount;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckNeedShowTip;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchBalanceList;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchCoinList;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchFromBalance;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$GoTransfer;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$MultiAccountDialogCloseEvent;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$QueryBatchTransferConfig;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateCoinInfo;,
        Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateSymbolInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/transfer/TransferStateContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "FetchCoinList",
        "FetchBalanceList",
        "CheckCoinInAccount",
        "FetchFromBalance",
        "GoTransfer",
        "QueryBatchTransferConfig",
        "UpdateCoinInfo",
        "UpdateSymbolInfo",
        "MultiAccountDialogCloseEvent",
        "CheckNeedShowTip",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckCoinInAccount;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$CheckNeedShowTip;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchBalanceList;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchCoinList;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$FetchFromBalance;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$GoTransfer;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$MultiAccountDialogCloseEvent;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$QueryBatchTransferConfig;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateCoinInfo;",
        "Lcom/kubi/transfer/TransferStateContract$UiIntent$UpdateSymbolInfo;",
        "TransferLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/transfer/TransferStateContract$UiIntent;-><init>()V

    return-void
.end method
