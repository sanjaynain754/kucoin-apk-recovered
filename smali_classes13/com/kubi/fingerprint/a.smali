.class public interface abstract Lcom/kubi/fingerprint/a;
.super Ljava/lang/Object;
.source "FingerApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/fingerprint/a;",
        "",
        "Lcom/kubi/fingerprint/entity/FingerRequest;",
        "fingerRequest",
        "Lcom/kubi/fingerprint/entity/FingerResponse;",
        "Lcom/kubi/fingerprint/entity/FingerToken;",
        "a",
        "(Lcom/kubi/fingerprint/entity/FingerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Fingerprint_release"
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
.method public abstract a(Lcom/kubi/fingerprint/entity/FingerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/fingerprint/entity/FingerRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/fingerprint/entity/FingerRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/fingerprint/entity/FingerResponse<",
            "Lcom/kubi/fingerprint/entity/FingerToken;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/device-tracking"
    .end annotation
.end method
