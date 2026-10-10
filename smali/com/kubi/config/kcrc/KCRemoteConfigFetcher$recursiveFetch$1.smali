.class final Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;
.super Lkotlin/jvm/internal/Lambda;
.source "KCRemoteConfigFetcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->N(Ljava/lang/String;JJZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/config/kcrc/KCRCAllEntity;",
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
        "Lcom/kubi/config/kcrc/KCRCAllEntity;",
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

.field final synthetic $isFirst:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$fetchBy:Ljava/lang/String;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$isFirst:Z

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/kubi/config/kcrc/KCRCAllEntity;

    invoke-virtual {p0, p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->invoke(Lcom/kubi/config/kcrc/KCRCAllEntity;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/kubi/config/kcrc/KCRCAllEntity;)V
    .locals 11

    .line 2
    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$fetchBy:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCAllEntity;->getSuccess()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/kubi/config/kcrc/k;->c(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 3
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCAllEntity;->needRetry()Z

    move-result v0

    if-nez v0, :cond_7

    .line 4
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->i()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->k()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    sget-object v0, Lcom/kubi/config/kcrc/b;->a:Lcom/kubi/config/kcrc/b;

    invoke-virtual {v0}, Lcom/kubi/config/kcrc/b;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCAllEntity;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    const-string v0, "re_all"

    invoke-static {p1, v0}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->g(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$isFirst:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/kubi/config/kcrc/p;->a:Lcom/kubi/config/kcrc/p;

    const-string v4, "entity"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/kubi/config/kcrc/p;->b(Lcom/kubi/config/kcrc/KCRCAllEntity;)V

    .line 9
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCAllEntity;->getData()Lcom/kubi/config/kcrc/KCRCDataAll;

    move-result-object p1

    if-nez p1, :cond_3

    .line 10
    iget-boolean p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$isFirst:Z

    if-nez p1, :cond_2

    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {p1, v1, v2, v3}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->R(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;ZILjava/lang/Object;)V

    :cond_2
    return-void

    .line 11
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getHasMore()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    move-result v0

    .line 12
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getVersion()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    move-result-wide v3

    const-string v1, "category_kc_remote_config"

    const-string v5, "key_kc_remote_config_data_version"

    invoke-static {v1, v5, v3, v4}, Ly70/e;->m(Ljava/lang/String;Ljava/lang/String;J)Ly70/e;

    .line 13
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getVersion()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->u(J)V

    .line 14
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getValues()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 15
    sget-object v3, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {v3}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->j(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->p(Ljava/util/Map;)V

    :cond_5
    if-eqz v0, :cond_6

    .line 16
    sget-object v4, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    iget-object v5, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$recursiveFetch$1;->$fetchBy:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getBeginId()Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getVersion()Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    move-result-wide v8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->r(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;Ljava/lang/String;JJZ)V

    return-void

    .line 17
    :cond_6
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {p1, v2}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->s(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;Z)V

    return-void

    .line 18
    :cond_7
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Retry config"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
