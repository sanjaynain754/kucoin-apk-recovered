.class public interface abstract Lyc/e;
.super Ljava/lang/Object;
.source "RequestUiPagingHandler.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Req::",
        "Lwc/a;",
        "ResponseItemEntity:",
        "Ljava/lang/Object;",
        "UiItemEntity:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0004\u0008\u0001\u0010\u0003*\u0004\u0008\u0002\u0010\u00042\u00020\u0005J\u0017\u0010\u0006\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0008J!\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u000b0\n*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u000b0\u000f0\nH\u0016\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;",
        "Req",
        "Lcom/kubi/core/base/arch/api/IRequest;",
        "ResponseItemEntity",
        "UiItemEntity",
        "",
        "getUiItemEntity",
        "responseItem",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "getObservable",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "req",
        "(Lcom/kubi/core/base/arch/api/IRequest;)Lio/reactivex/Observable;",
        "mapUiCompose",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRequestUiPagingHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestUiPagingHandler.kt\ncom/kubi/core/base/arch/api/handler/RequestUiPagingHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1563#2:40\n1634#2,3:41\n*S KotlinDebug\n*F\n+ 1 RequestUiPagingHandler.kt\ncom/kubi/core/base/arch/api/handler/RequestUiPagingHandler\n*L\n26#1:40\n26#1:41,3\n*E\n"
    }
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
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "TUiItemEntity;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
