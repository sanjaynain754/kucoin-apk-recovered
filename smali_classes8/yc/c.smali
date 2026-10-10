.class public interface abstract Lyc/c;
.super Ljava/lang/Object;
.source "RequestObserverHandler.kt"


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
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u001b\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;",
        "Req",
        "Lcom/kubi/core/base/arch/api/IRequest;",
        "Resp",
        "Lcom/kubi/core/base/arch/api/IResponse;",
        "",
        "execute",
        "Lio/reactivex/Observable;",
        "req",
        "(Lcom/kubi/core/base/arch/api/IRequest;)Lio/reactivex/Observable;",
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
.method public abstract a(Lwc/a;)Lio/reactivex/Observable;
    .param p1    # Lwc/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReq;)",
            "Lio/reactivex/Observable<",
            "TResp;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
