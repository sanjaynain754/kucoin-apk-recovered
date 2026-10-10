.class public interface abstract Lcom/kubi/core/biz/submit/j2;
.super Ljava/lang/Object;
.source "SubmitOrderConfig.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/biz/submit/j2$a;,
        Lcom/kubi/core/biz/submit/j2$b;,
        Lcom/kubi/core/biz/submit/j2$c;,
        Lcom/kubi/core/biz/submit/j2$d;,
        Lcom/kubi/core/biz/submit/j2$e;,
        Lcom/kubi/core/biz/submit/j2$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015J\u0012\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0012\u0010\r\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000c\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/biz/submit/TradeTypeUiData;",
        "",
        "isChecked",
        "",
        "()Z",
        "tradeType",
        "Lcom/kubi/tradebase/tradetype/TradeType;",
        "getTradeType",
        "()Lcom/kubi/tradebase/tradetype/TradeType;",
        "titleRes",
        "",
        "getTitleRes",
        "()I",
        "descRes",
        "getDescRes",
        "copyData",
        "Limit",
        "Market",
        "AdvancedLimit",
        "StopLimit",
        "StopMarket",
        "Segment",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$AdvancedLimit;",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$Limit;",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$Market;",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$Segment;",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$StopLimit;",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData$StopMarket;",
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
.method public abstract a()Lcom/kubi/tradebase/tradetype/TradeType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b()I
.end method

.method public abstract c(Z)Lcom/kubi/core/biz/submit/j2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isChecked()Z
.end method
