.class public interface abstract Lah/c;
.super Ljava/lang/Object;
.source "ITrialOrderApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u00020\u00012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\'J\u001e\u0010\u0008\u001a\u00020\t2\u0014\u0008\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bH\'J(\u0010\u000c\u001a\u00020\t2\u0014\u0008\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b2\u0008\u0008\u0001\u0010\r\u001a\u00020\u0005H\'Jn\u0010\u000e\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00052\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\'Jx\u0010\u0017\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0001\u0010\r\u001a\u00020\u00052\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0018\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/classic/common/order/api/ITrialOrderApi;",
        "",
        "fetchUserMaxLeverage",
        "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;",
        "symbol",
        "",
        "cancelOrder",
        "orderId",
        "submitOrder",
        "Lcom/kubi/kumex/data/trade/model/OrderResult;",
        "request",
        "",
        "submitOrderV2",
        "validationToken",
        "submitStopOrder",
        "positionSide",
        "marginMode",
        "upType",
        "upPrice",
        "Ljava/math/BigDecimal;",
        "downType",
        "downPrice",
        "channel",
        "submitStopOrderV2",
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


# direct methods
.method public static synthetic c(Lah/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p11, :cond_6

    .line 3
    .line 4
    and-int/lit8 p11, p10, 0x8

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p11, :cond_0

    .line 8
    move-object p4, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p11, p10, 0x10

    .line 11
    .line 12
    if-eqz p11, :cond_1

    .line 13
    move-object p5, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p11, p10, 0x20

    .line 16
    .line 17
    if-eqz p11, :cond_2

    .line 18
    move-object p6, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p11, p10, 0x40

    .line 21
    .line 22
    if-eqz p11, :cond_3

    .line 23
    move-object p7, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit16 p11, p10, 0x80

    .line 26
    .line 27
    if-eqz p11, :cond_4

    .line 28
    move-object p8, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit16 p10, p10, 0x100

    .line 31
    .line 32
    if-eqz p10, :cond_5

    .line 33
    .line 34
    const-string p9, "ANDROID"

    .line 35
    .line 36
    .line 37
    :cond_5
    invoke-interface/range {p0 .. p9}, Lah/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    .line 41
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 42
    .line 43
    const-string p1, "Super calls with default arguments not supported in this target, function: submitStopOrder"

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 47
    throw p0
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
.end method

.method public static synthetic d(Lah/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p12, :cond_6

    .line 3
    .line 4
    and-int/lit8 p12, p11, 0x10

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p12, :cond_0

    .line 8
    move-object p5, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p12, p11, 0x20

    .line 11
    .line 12
    if-eqz p12, :cond_1

    .line 13
    move-object p6, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p12, p11, 0x40

    .line 16
    .line 17
    if-eqz p12, :cond_2

    .line 18
    move-object p7, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit16 p12, p11, 0x80

    .line 21
    .line 22
    if-eqz p12, :cond_3

    .line 23
    move-object p8, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit16 p12, p11, 0x100

    .line 26
    .line 27
    if-eqz p12, :cond_4

    .line 28
    move-object p9, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit16 p11, p11, 0x200

    .line 31
    .line 32
    if-eqz p11, :cond_5

    .line 33
    .line 34
    const-string p10, "ANDROID"

    .line 35
    .line 36
    .line 37
    :cond_5
    invoke-interface/range {p0 .. p10}, Lah/c;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    .line 41
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 42
    .line 43
    const-string p1, "Super calls with default arguments not supported in this target, function: submitStopOrderV2"

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 47
    throw p0
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
.end method


# virtual methods
.method public abstract C(Ljava/lang/String;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Path;
            value = "orderId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/kumex-trial/order/cancel/{orderId}"
    .end annotation
.end method

.method public abstract a(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/km/trial/trade/configs/getCrossUserMaxLeverage"
    .end annotation
.end method

.method public abstract b(Ljava/util/Map;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/FieldMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kubi/kumex/data/trade/model/OrderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:trade-futures-trial"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/kumex-trial/order"
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "symbol"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "positionSide"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "marginMode"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "upStopPriceType"
        .end annotation
    .end param
    .param p5    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "upPrice"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "downStopPriceType"
        .end annotation
    .end param
    .param p7    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "downPrice"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "orderId"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "channel"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:trade-futures-trial-updateStopOrdersFromShortcut"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/kumex-trial/updateStopOrdersFromShortcut"
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "symbol"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "positionSide"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "marginMode"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "upStopPriceType"
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "upPrice"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "downStopPriceType"
        .end annotation
    .end param
    .param p8    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "downPrice"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "orderId"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "channel"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:trade-futures-trial-updateStopOrdersFromShortcut"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/kumex-trial/updateStopOrdersFromShortcut"
    .end annotation
.end method

.method public abstract n(Ljava/util/Map;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/OrderResult;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/FieldMap;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-VALIDATION-TOKEN"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/kubi/kumex/data/trade/model/OrderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "HEADER_FINGER_EVENT:trade-futures-trial"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/kumex-trial/order"
    .end annotation
.end method
