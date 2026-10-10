.class public interface abstract Lcom/kubi/core/base/order/data/TradeSide;
.super Ljava/lang/Object;
.source "CommonData.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/base/order/data/TradeSide$BUY;,
        Lcom/kubi/core/base/order/data/TradeSide$SELL;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0002\u000c\r\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/order/data/TradeSide;",
        "Landroid/os/Parcelable;",
        "param",
        "",
        "getParam",
        "()Ljava/lang/String;",
        "displayResStr",
        "",
        "getDisplayResStr",
        "()I",
        "BUY",
        "SELL",
        "Lcom/kubi/core/base/order/data/TradeSide$BUY;",
        "Lcom/kubi/core/base/order/data/TradeSide$SELL;",
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
.method public abstract getDisplayResStr()I
.end method

.method public abstract getParam()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
