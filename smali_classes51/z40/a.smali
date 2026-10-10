.class public interface abstract Lz40/a;
.super Ljava/lang/Object;
.source "ITradingBotSocket.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J \u0010\u0006\u001a\u00020\u00032\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0005H\'J(\u0010\t\u001a\u00020\u00032\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u0005H\'J\u0012\u0010\r\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/socket/ITradingBotSocket;",
        "",
        "getOrderBookCenter",
        "Lokhttp3/Request;",
        "symbol",
        "",
        "getCurrencyBalance",
        "accountType",
        "currency",
        "getTradeTickerByFreshman",
        "symbols",
        "from",
        "header",
        "getTicker",
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
.method public abstract f(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "accountType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "currency"
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/account/currency-balance"
    .end annotation
.end method
