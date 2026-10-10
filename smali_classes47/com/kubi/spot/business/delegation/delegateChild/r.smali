.class public final Lcom/kubi/spot/business/delegation/delegateChild/r;
.super Ljava/lang/Object;
.source "DelegationChildFragmentExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getTradeTypeItemView",
        "Lcom/kubi/spot/business/delegation/delegateChild/IDelegateChildTradeTypeItemView;",
        "item",
        "Lcom/kubi/spot/entity/DelegationEntity;",
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
.method public static final a(Lcom/kubi/spot/entity/DelegationEntity;)Lcom/kubi/spot/business/delegation/delegateChild/u;
    .locals 2
    .param p0    # Lcom/kubi/spot/entity/DelegationEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "item"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/spot/entity/DelegationEntity;->isOCO(I)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/spot/entity/DelegationEntity;->isTradingStop(I)Z

    .line 14
    move-result p0

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateChild/t;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateChild/t;-><init>()V

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildTSOItemView;

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildTSOItemView;-><init>()V

    .line 30
    return-object p0

    .line 31
    .line 32
    :cond_1
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateChild/s;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateChild/s;-><init>()V

    .line 36
    return-object p0
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
