.class public final Lrc/a;
.super Ljava/lang/Object;
.source "CopyTradingImplService.kt"

# interfaces
.implements Lcom/kubi/copytrading/ICopyTradingService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0006H\u0096\u0001J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008H\u0096\u0001J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0096\u0001J\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0096\u0001J\u0013\u0010\u0013\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0008H\u0096\u0001J\u001b\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0008H\u0096\u0001J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0008H\u0096\u0001J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\t\u0010 \u001a\u00020!H\u0096\u0001J\t\u0010\"\u001a\u00020!H\u0096\u0001J\t\u0010#\u001a\u00020!H\u0096\u0001J\t\u0010$\u001a\u00020!H\u0096\u0001J\t\u0010%\u001a\u00020!H\u0096\u0001J\u0013\u0010&\u001a\u00020\n2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0096\u0001J\u0011\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0096\u0001J\u001f\u0010,\u001a\u0004\u0018\u00010-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Lcom/kubi/copytrading/service/CopyTradingImplService;",
        "Lcom/kubi/copytrading/ICopyTradingService;",
        "delegate",
        "<init>",
        "(Lcom/kubi/copytrading/ICopyTradingService;)V",
        "addFuturesBottomTab",
        "Lkotlin/Pair;",
        "",
        "Lcom/kubi/sdk/BaseFragment;",
        "checkNeedShowLeaderGuide",
        "",
        "fragment",
        "copyTradingAccountStateFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/copytrading/data/CopyTradingUiState;",
        "fetchSymbolConfig1",
        "",
        "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
        "time",
        "forceSetInterceptFlag",
        "subUid",
        "getCopyTradingAssetsMainFragment",
        "getCopyTradingFragment",
        "uiStateValue",
        "entrySource",
        "getFuturesCopyTradingDelegateImp",
        "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;",
        "futuresFragment",
        "getKlineCopyTradingRecommendFragment",
        "getLeaderUserConfigId",
        "getWidgetOfCopyTrading",
        "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;",
        "isCopytdAccount",
        "",
        "isCopytdNeedShowLeaderTips",
        "isForceSetInterceptFlag",
        "isSupportCopyTrading",
        "jump2CopyTradingSearch",
        "notifyCopyTradingMsg2Rn",
        "bundle",
        "Landroid/os/Bundle;",
        "removeCopyTradingFragment",
        "copyTradingFragment",
        "Landroidx/fragment/app/Fragment;",
        "submitSymbolConfig",
        "",
        "request",
        "CopyTradingLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lcom/kubi/copytrading/ICopyTradingService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lrc/a;-><init>(Lcom/kubi/copytrading/ICopyTradingService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/kubi/copytrading/ICopyTradingService;)V
    .locals 1
    .param p1    # Lcom/kubi/copytrading/ICopyTradingService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/copytrading/ICopyTradingService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    .line 4
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CopyTrading:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lrc/c;

    invoke-direct {p1}, Lrc/c;-><init>()V

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lcom/kubi/copytrading/service/CopyTradingDisabledService;

    invoke-direct {p1}, Lcom/kubi/copytrading/service/CopyTradingDisabledService;-><init>()V

    .line 6
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lrc/a;-><init>(Lcom/kubi/copytrading/ICopyTradingService;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->a(Ljava/util/Map;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public b(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "time"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public c()Lcom/kubi/sdk/BaseFragment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->c()Lcom/kubi/sdk/BaseFragment;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->d()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public e()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->e()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->f()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->g(Landroid/os/Bundle;)V

    .line 6
    return-void
    .line 7
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
.end method

.method public h(Lcom/kubi/sdk/BaseFragment;)Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "futuresFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->h(Lcom/kubi/sdk/BaseFragment;)Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public i()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->i()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public j()Lcom/kubi/kucoin/home/v2/cards/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->j()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "entrySource"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Lcom/kubi/copytrading/ICopyTradingService;->k(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public l()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lcom/kubi/sdk/BaseFragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->l()Lkotlin/Pair;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public m()Lkotlinx/coroutines/flow/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Loc/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->m()Lkotlinx/coroutines/flow/e;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public n()Lcom/kubi/sdk/BaseFragment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->n()Lcom/kubi/sdk/BaseFragment;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public o()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->o()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public p()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->p()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public q(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->q(Ljava/lang/String;)V

    .line 6
    return-void
    .line 7
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
.end method

.method public r(Landroidx/fragment/app/Fragment;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "copyTradingFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->r(Landroidx/fragment/app/Fragment;)V

    .line 11
    return-void
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
.end method

.method public s(Lcom/kubi/sdk/BaseFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lrc/a;->b:Lcom/kubi/copytrading/ICopyTradingService;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/kubi/copytrading/ICopyTradingService;->s(Lcom/kubi/sdk/BaseFragment;)V

    .line 11
    return-void
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
.end method
