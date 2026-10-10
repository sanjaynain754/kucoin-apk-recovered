.class public final Ll20/f;
.super Ljava/lang/Object;
.source "DelegationDetailFragmentExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getTradeTypeHeadView",
        "Lcom/kubi/spot/business/delegation/delegateDetail/IDelegateDetailTradeTypeHeaderView;",
        "delegationData",
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
.method public static final a(Lcom/kubi/spot/entity/DelegationEntity;)Ll20/l;
    .locals 2
    .param p0    # Lcom/kubi/spot/entity/DelegationEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "delegationData"

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
    .line 13
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/spot/entity/DelegationEntity;->isTradingStop(I)Z

    .line 22
    move-result p0

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance p0, Ll20/j;

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Ll20/j;-><init>()V

    .line 30
    return-object p0

    .line 31
    .line 32
    :cond_0
    if-eqz p0, :cond_1

    .line 33
    .line 34
    new-instance p0, Ll20/k;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ll20/k;-><init>()V

    .line 38
    return-object p0

    .line 39
    .line 40
    :cond_1
    new-instance p0, Ll20/i;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Ll20/i;-><init>()V

    .line 44
    return-object p0
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
