.class public interface abstract Lt40/a;
.super Ljava/lang/Object;
.source "IFuturesGridApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J&\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\'J:\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00032(\u0008\u0001\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0014H\'J\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00032\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0019H\'J \u0010\u001a\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00032\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u0006H\'J\u001a\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0008\u0008\u0001\u0010\u001f\u001a\u00020 H\'J\u0018\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\"\u001a\u00020#H\'J$\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0008\u0008\u0001\u0010%\u001a\u00020\u00062\u0008\u0008\u0001\u0010&\u001a\u00020\u0017H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\'\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/futures/api/IFuturesGridApi;",
        "",
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
        "getCalculateParams",
        "Lcom/kubi/tradingbotkit/entity/futures/FutureGridParamsEntity;",
        "map",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "getMaxLeverage",
        "createRobot",
        "",
        "params",
        "Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean;",
        "getStrategyList",
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
