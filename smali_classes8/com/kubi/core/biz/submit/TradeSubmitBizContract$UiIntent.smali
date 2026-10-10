.class public abstract Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;
.super Ljava/lang/Object;
.source "TradeSubmitBizContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeBuyOrSellDirection;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeSymbol;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeTradeType;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$FetchSymbolBalance;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Hide;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$PanelModelChange;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Refresh;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateBbo;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateCallAuctionState;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputTriggerPrice;,
        Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateSymbolInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u000c\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000fB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u000c\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "ChangeSymbol",
        "UpdateSymbolInfo",
        "UpdateBbo",
        "UpdateInputPrice",
        "UpdateInputTriggerPrice",
        "UpdateCallAuctionState",
        "Hide",
        "Refresh",
        "ChangeTradeType",
        "ChangeBuyOrSellDirection",
        "FetchSymbolBalance",
        "PanelModelChange",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeBuyOrSellDirection;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeSymbol;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeTradeType;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$FetchSymbolBalance;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Hide;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$PanelModelChange;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Refresh;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateBbo;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateCallAuctionState;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputTriggerPrice;",
        "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateSymbolInfo;",
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
    invoke-direct {p0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;-><init>()V

    return-void
.end method
