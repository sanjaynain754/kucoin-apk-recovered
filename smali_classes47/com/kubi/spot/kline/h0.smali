.class public final Lcom/kubi/spot/kline/h0;
.super Ljava/lang/Object;
.source "KuCoinKlineFragmentExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "getLoadKlineAction",
        "Lcom/kubi/spot/kline/ILoadKlineAction;",
        "Lcom/kubi/spot/kline/KuCoinKlineFragment;",
        "SpotLib_googleRelease"
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
.method public static final a(Lcom/kubi/spot/kline/KuCoinKlineFragment;)Lcom/kubi/spot/kline/a;
    .locals 3
    .param p0    # Lcom/kubi/spot/kline/KuCoinKlineFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    sget-object p0, Lcom/kubi/core/biz/callauction/j;->a:Lcom/kubi/core/biz/callauction/j;

    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v2, v0, v1}, Lcom/kubi/core/biz/callauction/j;->i(Lcom/kubi/core/biz/callauction/j;ZILjava/lang/Object;)Z

    .line 14
    move-result p0

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p0, Lcom/kubi/spot/business/callAuction/action/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/kubi/spot/business/callAuction/action/a;-><init>()V

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_0
    new-instance p0, Lcom/kubi/spot/kline/y0;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/kubi/spot/kline/y0;-><init>()V

    .line 28
    return-object p0
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
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
.end method
