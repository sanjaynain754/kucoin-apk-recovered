.class public interface abstract Lcom/kubi/payment/channel/data/source/a;
.super Ljava/lang/Object;
.source "IChannelRepository.kt"

# interfaces
.implements Lnt/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0008J\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0008J\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u000b\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u000b\u001a\u00020\"H\u00a7@\u00a2\u0006\u0002\u0010#J.\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u00032\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\'2\u0008\u0010(\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010)J\u001c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010\u000b\u001a\u00020,H\u00a7@\u00a2\u0006\u0002\u0010-J\u001c\u0010.\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u00100\u001a\u0008\u0012\u0004\u0012\u0002010\u00032\u0006\u0010\u000b\u001a\u000202H\u00a7@\u00a2\u0006\u0002\u00103J$\u00104\u001a\u0008\u0012\u0004\u0012\u0002050\u00032\u0006\u00106\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u000207H\u00a7@\u00a2\u0006\u0002\u00108\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00069\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/payment/channel/data/source/IChannelRepository;",
        "Lcom/kubi/payment/base/IRepository;",
        "loadRechargePaymentMethodList",
        "Lcom/kubi/payment/base/Result;",
        "",
        "Lcom/kubi/payment/channel/data/entities/PaymentMethod;",
        "fiatCurrency",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadRechargeGuidePaymentMethod",
        "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;",
        "request",
        "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;",
        "(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadWithdrawPaymentMethodList",
        "loadChannelUserInfo",
        "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCapitualKycStatus",
        "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;",
        "channelKycRequest",
        "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;",
        "(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadPaymentFee",
        "Lcom/kubi/otc/entity/FiatFee;",
        "params",
        "",
        "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadFiatList",
        "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;",
        "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;",
        "(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "previewWithdrawOrder",
        "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;",
        "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;",
        "(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "withdraw",
        "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;",
        "url",
        "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;",
        "validationToken",
        "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refund",
        "Lcom/kubi/payment/channel/data/entities/Refund$Response;",
        "Lcom/kubi/payment/channel/data/entities/Refund$Request;",
        "(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchQrCodeWhiteList",
        "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;",
        "loadIvyConfirmPage",
        "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;",
        "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;",
        "(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createIvyOrder",
        "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;",
        "colorTheme",
        "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;",
        "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "+",
            "Ljava/util/List<",
            "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract F(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract N(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/channel/data/entities/Withdraw$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract V(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/Refund$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/Refund$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/Refund$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c0(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "+",
            "Ljava/util/List<",
            "Lcom/kubi/payment/channel/data/entities/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "+",
            "Ljava/util/List<",
            "Lcom/kubi/payment/channel/data/entities/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract h(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract o(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract q(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract w(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract z(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lnt/k<",
            "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
