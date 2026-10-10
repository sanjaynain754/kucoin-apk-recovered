.class public abstract Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;
.super Ljava/lang/Object;
.source "KLineNtfContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ChangeInCallAuctionTrade;,
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ClickNftToggleBtn;,
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineHide;,
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineShow;,
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$RefreshPosition;,
        Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$SymbolChange;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\u0008\tB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "SymbolChange",
        "ChangeInCallAuctionTrade",
        "RefreshPosition",
        "KLineHide",
        "KLineShow",
        "ClickNftToggleBtn",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ChangeInCallAuctionTrade;",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ClickNftToggleBtn;",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineHide;",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineShow;",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$RefreshPosition;",
        "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$SymbolChange;",
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
    invoke-direct {p0}, Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;-><init>()V

    return-void
.end method
