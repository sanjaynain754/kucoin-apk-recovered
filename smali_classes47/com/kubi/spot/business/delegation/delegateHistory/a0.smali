.class public final Lcom/kubi/spot/business/delegation/delegateHistory/a0;
.super Ljava/lang/Object;
.source "DelegationHistoryFragmentExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getTradeTypeItemView",
        "Lcom/kubi/spot/business/delegation/delegateHistory/IDelegateHistoryTradeTypeItemView;",
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
.method public static final a(Lcom/kubi/spot/entity/DelegationEntity;)Lcom/kubi/spot/business/delegation/delegateHistory/d0;
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
    const/4 v0, 0x2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/spot/entity/DelegationEntity;->isOCO(I)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/spot/entity/DelegationEntity;->getStopTriggered()Ljava/lang/Boolean;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kubi/spot/entity/DelegationEntity;->isTradingStop(I)Z

    .line 29
    move-result p0

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;-><init>()V

    .line 37
    return-object p0

    .line 38
    .line 39
    :cond_1
    if-eqz p0, :cond_2

    .line 40
    .line 41
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateHistory/c0;

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/c0;-><init>()V

    .line 45
    return-object p0

    .line 46
    .line 47
    :cond_2
    new-instance p0, Lcom/kubi/spot/business/delegation/delegateHistory/b0;

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/b0;-><init>()V

    .line 51
    return-object p0
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
