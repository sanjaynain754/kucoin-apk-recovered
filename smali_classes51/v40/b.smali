.class public final Lv40/b;
.super Ljava/lang/Object;
.source "FuturesGridRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000c2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000c2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000c2\u0006\u0010\u0017\u001a\u00020\u0018J6\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000c2&\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001dJ\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000c2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000c2\u0006\u0010!\u001a\u00020\"J\u001c\u0010#\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0\u000c2\u0006\u0010&\u001a\u00020\u000fJ\u0016\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000c2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000c2\u0006\u0010+\u001a\u00020,J\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000c2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020 R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u00060"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/futures/repostory/FuturesGridRepository;",
        "",
        "<init>",
        "()V",
        "robotSpotApi",
        "Lcom/kubi/tradingbotkit/business/futures/api/IFuturesGridApi;",
        "kotlin.jvm.PlatformType",
        "getRobotSpotApi",
        "()Lcom/kubi/tradingbotkit/business/futures/api/IFuturesGridApi;",
        "robotSpotApi$delegate",
        "Lkotlin/Lazy;",
        "requestLongShort",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridLongShortEntity;",
        "symbol",
        "",
        "requestCurrentSymbolInfo",
        "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridSymbolInfoEntity;",
        "requestAiParams",
        "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridAiParamsEntity;",
        "direction",
        "getDefaultSymbol",
        "Lcom/kubi/tradingbotkit/entity/DefaultSymbolEntity;",
        "templateType",
        "",
        "requestCalculateParams",
        "Lcom/kubi/tradingbotkit/entity/futures/FutureGridParamsEntity;",
        "map",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "requestMaxLeverage",
        "createRobot",
        "",
        "createRobotParamsBean",
        "Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean;",
        "getRunningList",
        "",
        "Lcom/kubi/tradingbotkit/entity/futures/FuturesGridStrategyEntity;",
        "type",
        "shutdownFuturesGrid",
        "stopBean",
        "Lcom/kubi/tradingbotkit/bean/params/StopBean;",
        "requestAddDeposit",
        "futuresAddDepositBean",
        "Lcom/kubi/tradingbotkit/bean/params/futures/FuturesAddDepositBean;",
        "calculateRunningBlowUpPrice",
        "addAmount",
        "taskId",
        "TradingBotKitLib_googleRelease"
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
.field public final a:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lv40/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lv40/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lv40/b;->a:Lkotlin/Lazy;

    .line 15
    return-void
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

.method public static synthetic a()Lt40/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lv40/b;->b()Lt40/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
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

.method public static final b()Lt40/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lt40/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lt40/a;

    .line 13
    return-object v0
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
