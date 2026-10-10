.class public final Lnt/l;
.super Ljava/lang/Object;
.source "Result.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\u0002H\u0006\"\u0004\u0008\u0000\u0010\u0006*\u0008\u0012\u0004\u0012\u0002H\u00060\u00022\u0006\u0010\u0007\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u0008\u001a)\u0010\u000c\u001a\u00020\r\"\u0006\u0008\u0000\u0010\u0006\u0018\u0001*\u0008\u0012\u0004\u0012\u0002H\u00060\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u000fH\u0086\u0008\u001a)\u0010\u000c\u001a\u00020\r\"\u0006\u0008\u0000\u0010\u0006\u0018\u0001*\u0008\u0012\u0004\u0012\u0002H\u00060\u00022\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0011H\u0086\u0008\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"#\u0010\t\u001a\u0004\u0018\u0001H\u0006\"\u0004\u0008\u0000\u0010\u0006*\u0008\u0012\u0004\u0012\u0002H\u00060\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "succeeded",
        "",
        "Lcom/kubi/payment/base/Result;",
        "getSucceeded",
        "(Lcom/kubi/payment/base/Result;)Z",
        "successOr",
        "T",
        "fallback",
        "(Lcom/kubi/payment/base/Result;Ljava/lang/Object;)Ljava/lang/Object;",
        "data",
        "getData",
        "(Lcom/kubi/payment/base/Result;)Ljava/lang/Object;",
        "updateOnSuccess",
        "",
        "liveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "stateFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "PaymentLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lnt/k;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lnt/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnt/k<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p0, Lnt/k$b;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lnt/k$b;

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p0, v1

    .line 15
    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    return-object v1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
