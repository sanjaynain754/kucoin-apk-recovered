.class public interface abstract Lcom/kubi/payment/kucoinpay/data/source/remote/a;
.super Ljava/lang/Object;
.source "KuCoinPayWebService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\n\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayWebService;",
        "",
        "loadQrCode",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;",
        "request",
        "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;",
        "(Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchQrPayLogoList",
        "Lcom/kubi/payment/kucoinpay/qrscan/QrCodeLogoEntity;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "PaymentLib_googleRelease"
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
.method public abstract G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/kucoinpay/qrscan/QrCodeLogoEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "pmtapi/promotion/qr/pay/detail"
    .end annotation
.end method

.method public abstract a(Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "pmtapi/preorder/init"
    .end annotation
.end method
