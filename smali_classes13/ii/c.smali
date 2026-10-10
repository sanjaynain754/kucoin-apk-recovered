.class public final Lii/c;
.super Ljava/lang/Object;
.source "FuturesNoticeSettingImpl.kt"

# interfaces
.implements Lhi/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\t\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\u0007H\u0016J\u0008\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/futures/trade/config/impl/FuturesNoticeSettingImpl;",
        "Lcom/kubi/futures/trade/config/IFuturesNoticeSetting;",
        "notice",
        "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;",
        "<init>",
        "(Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;)V",
        "enableDeepBook",
        "",
        "enableMarkPriceDeviation",
        "enableLimitOrderConfirmAgain",
        "enableMarketOrderConfirmAgain",
        "enableTriggerOrderConfirmAgain",
        "KumexLib_googleRelease"
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
.field public final a:Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "notice"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lii/c;->a:Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;

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
    .line 32
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lii/c;->a:Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;->getConfirmConfig()Ljava/util/HashMap;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, "LIMIT"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 23
    move-result v0

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public b()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lii/c;->a:Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;->getConfirmConfig()Ljava/util/HashMap;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, "MISOPERATION"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 23
    move-result v0

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public c()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lii/c;->a:Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;->getConfirmConfig()Ljava/util/HashMap;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, "LIMIT_CLOSE"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 23
    move-result v0

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
