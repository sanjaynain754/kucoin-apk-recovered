.class public final Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;
.super Ljava/lang/Object;
.source "LiteCoinDetailRouteInterceptor.kt"

# interfaces
.implements Lzx/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;",
        "Lcom/kubi/router/interceptor/IInterceptor;",
        "<init>",
        "()V",
        "liteRnCoinDetailEnable",
        "",
        "intercept",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "Companion",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLiteCoinDetailRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteCoinDetailRouteInterceptor.kt\ncom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,51:1\n35#2,4:52\n39#2:58\n44#3,2:56\n*S KotlinDebug\n*F\n+ 1 LiteCoinDetailRouteInterceptor.kt\ncom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor\n*L\n26#1:52,4\n26#1:58\n26#1:56,2\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;->b:Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;

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
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "kc_lite_rn_coin_detail_page"

    .line 6
    .line 7
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object v2, v0

    .line 29
    .line 30
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    const/4 v7, 0x0

    .line 34
    .line 35
    const-string v3, "RemoteConfig"

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    const/4 v0, 0x2

    .line 42
    const/4 v2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 46
    move-object v0, v2

    .line 47
    .line 48
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 49
    const/4 v1, 0x0

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    iput-boolean v0, p0, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;->a:Z

    .line 56
    return-void
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 4
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;->a:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "kucoin://krn/router?biz=trade_center&entry=main&component=kc_trade_center_next&route=lite/market/coin/details"

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    const-string v1, "kucoin://flutter?route=lite/market/coin/details"

    .line 19
    .line 20
    :goto_0
    new-instance v2, Lay/a;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v3, "parse(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v1, v0}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v2}, Lzx/a;->a(Lay/a;)Z

    .line 40
    move-result p1

    .line 41
    return p1
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
.end method
