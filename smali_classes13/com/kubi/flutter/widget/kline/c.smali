.class public interface abstract Lcom/kubi/flutter/widget/kline/c;
.super Ljava/lang/Object;
.source "IKLineDataInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/c$a;,
        Lcom/kubi/flutter/widget/kline/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0010\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "",
        "bindDataPushFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/flutter/proto/kline/CandleList;",
        "param",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;",
        "loadCdnData",
        "previousTime",
        "",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadActiveOrderData",
        "Lcom/kubi/flutter/proto/kline/OrderList;",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadHistoryOrderData",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "DataParam",
        "OrderParam",
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
.method public abstract a(Lcom/kubi/flutter/widget/kline/c$a;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract b(Lcom/kubi/flutter/widget/kline/c$a;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract d(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
