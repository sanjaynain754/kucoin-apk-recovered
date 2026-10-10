.class public interface abstract Lyc/b;
.super Ljava/lang/Object;
.source "RequestCallbackHandlerCompat.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Req::",
        "Lwc/a;",
        "Resp:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J5\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000cH&\u00a2\u0006\u0002\u0010\r\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/arch/api/handler/RequestCallbackHandlerCompat;",
        "Req",
        "Lcom/kubi/core/base/arch/api/IRequest;",
        "Resp",
        "Lcom/kubi/core/base/arch/api/IResponse;",
        "",
        "execute",
        "",
        "req",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "callback",
        "Lkotlin/Function1;",
        "(Lcom/kubi/core/base/arch/api/IRequest;Lio/reactivex/disposables/CompositeDisposable;Lkotlin/jvm/functions/Function1;)V",
        "TradeCoreBizLib_googleRelease"
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
.method public abstract a(Lwc/a;Lio/reactivex/disposables/CompositeDisposable;Lkotlin/jvm/functions/Function1;)V
    .param p1    # Lwc/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/disposables/CompositeDisposable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReq;",
            "Lio/reactivex/disposables/CompositeDisposable;",
            "Lkotlin/jvm/functions/Function1<",
            "-TResp;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
