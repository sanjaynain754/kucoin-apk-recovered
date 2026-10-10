.class final Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$1;
.super Lkotlin/jvm/internal/Lambda;
.source "KCRemoteConfigFetcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->C(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/config/kcrc/KCRCIncrementEntity;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "entity",
        "Lcom/kubi/config/kcrc/KCRCIncrementEntity;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $fetchBy:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$1;->$fetchBy:Ljava/lang/String;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/kubi/config/kcrc/KCRCIncrementEntity;

    invoke-virtual {p0, p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$1;->invoke(Lcom/kubi/config/kcrc/KCRCIncrementEntity;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/kubi/config/kcrc/KCRCIncrementEntity;)V
    .locals 6

    .line 2
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCIncrementEntity;->needRetry()Z

    move-result v0

    if-nez v0, :cond_9

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->y(I)V

    .line 4
    iget-object v1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$1;->$fetchBy:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCIncrementEntity;->getSuccess()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/kubi/config/kcrc/k;->c(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 5
    sget-object v1, Lcom/kubi/config/kcrc/b;->a:Lcom/kubi/config/kcrc/b;

    invoke-virtual {v1}, Lcom/kubi/config/kcrc/b;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCIncrementEntity;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    const-string v0, "re_all"

    invoke-static {p1, v0}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->g(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCIncrementEntity;->getData()Lcom/kubi/config/kcrc/KCRCDataIncrement;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 8
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataIncrement;->getVersion()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->u(J)V

    .line 9
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataIncrement;->getUpdate()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "{}"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v4

    :goto_0
    if-eqz v1, :cond_3

    .line 10
    sget-object v3, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {v3}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->j(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->p(Ljava/util/Map;)V

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v0

    .line 11
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataIncrement;->getRemove()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v4

    :goto_2
    if-eqz p1, :cond_5

    .line 12
    sget-object v1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->j(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->q(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move v1, v2

    :cond_5
    if-eqz v1, :cond_7

    .line 13
    const-string p1, "fetchConfigsIncrement. changed and notify"

    invoke-static {p1}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->m()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    if-eqz p1, :cond_6

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 15
    :cond_6
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->j(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    move-result-object p1

    invoke-static {p1, v0, v2, v4}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->n(Lcom/kubi/config/kcrc/KCRemoteConfigCache;ZILjava/lang/Object;)V

    return-void

    .line 16
    :cond_7
    const-string p1, "fetchConfigsIncrement. nothing changed"

    invoke-static {p1}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    :cond_8
    return-void

    .line 17
    :cond_9
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Retry configIncrease"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
