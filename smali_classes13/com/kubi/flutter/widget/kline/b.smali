.class public interface abstract Lcom/kubi/flutter/widget/kline/b;
.super Ljava/lang/Object;
.source "KLineContract.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/b$a;,
        Lcom/kubi/flutter/widget/kline/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0013H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/IKLineContainer;",
        "",
        "getChannel",
        "Lcom/kubi/flutter/widget/kline/IKLineChannel;",
        "updateState",
        "",
        "state",
        "Lcom/kubi/flutter/widget/kline/KLineLoadingState;",
        "changeLifecycleState",
        "event",
        "Landroidx/lifecycle/Lifecycle$Event;",
        "onJumpOrder",
        "orderItem",
        "Lcom/kubi/flutter/proto/kline/OrderItem;",
        "addListener",
        "listener",
        "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;",
        "removeListener",
        "addStateListener",
        "Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;",
        "removeStateListener",
        "EventListener",
        "StateListener",
        "LKLineWidget_googleRelease"
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
.method public abstract a(Lcom/kubi/flutter/proto/kline/OrderItem;)V
    .param p1    # Lcom/kubi/flutter/proto/kline/OrderItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract b(Landroidx/lifecycle/Lifecycle$Event;)V
    .param p1    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d(Lcom/kubi/flutter/widget/kline/KLineLoadingState;)V
    .param p1    # Lcom/kubi/flutter/widget/kline/KLineLoadingState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract e(Lcom/kubi/flutter/widget/kline/b$a;)V
    .param p1    # Lcom/kubi/flutter/widget/kline/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract getChannel()Lcom/kubi/flutter/widget/kline/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
