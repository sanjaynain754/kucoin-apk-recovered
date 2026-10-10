.class public interface abstract Lcom/kubi/network/socket/core/a;
.super Ljava/lang/Object;
.source "IChain.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0006\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/network/socket/core/a;",
        "",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "request",
        "()Lcom/kubi/network/api/model/NetworkRequest;",
        "Lcom/kubi/network/api/model/NetworkResponse;",
        "a",
        "(Lcom/kubi/network/api/model/NetworkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "network-core-socket_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/network/api/model/NetworkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/network/api/model/NetworkRequest;
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
            "Lcom/kubi/network/api/model/NetworkRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/network/api/model/NetworkResponse<",
            "*>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract request()Lcom/kubi/network/api/model/NetworkRequest;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
