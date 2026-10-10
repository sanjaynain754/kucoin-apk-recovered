.class public interface abstract Lcom/kubi/tradingbotkit/business/dialogs/protocol/a;
.super Ljava/lang/Object;
.source "ISignProtocolApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/dialogs/protocol/ISignProtocolApi;",
        "",
        "requestProtocols",
        "Lkotlinx/coroutines/flow/Flow;",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/Protocol;",
        "Lkotlin/collections/ArrayList;",
        "templateId",
        "",
        "signProtocols",
        "requestBody",
        "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;",
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


# virtual methods
.method public abstract a(Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/robot/user/terms/sign"
    .end annotation
.end method
