.class public final Lcom/kubi/restful/q;
.super Lio/reactivex/Observable;
.source "RestfulReturnFactory.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/restful/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000eB\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/restful/q;",
        "T",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/restful/RestfulCall;",
        "originalCall",
        "<init>",
        "(Lcom/kubi/restful/RestfulCall;)V",
        "Lio/reactivex/Observer;",
        "subscriber",
        "",
        "subscribeActual",
        "(Lio/reactivex/Observer;)V",
        "b",
        "Lcom/kubi/restful/RestfulCall;",
        "a",
        "Restful_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field public final b:Lcom/kubi/restful/RestfulCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/restful/RestfulCall<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/restful/RestfulCall;)V
    .locals 1
    .param p1    # Lcom/kubi/restful/RestfulCall;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/restful/RestfulCall<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "originalCall"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/restful/q;->b:Lcom/kubi/restful/RestfulCall;

    .line 11
    return-void
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
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/Observer;)V
    .locals 2
    .param p1    # Lio/reactivex/Observer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observer<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "subscriber"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/restful/q;->b:Lcom/kubi/restful/RestfulCall;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/restful/RestfulCall;->d()Lcom/kubi/restful/RestfulCall;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Lcom/kubi/restful/q$a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Lcom/kubi/restful/q$a;-><init>(Lcom/kubi/restful/RestfulCall;Lio/reactivex/Observer;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Lio/reactivex/Observer;->onSubscribe(Lio/reactivex/disposables/Disposable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/restful/q$a;->isDisposed()Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/restful/RestfulCall;->e(Lcom/kubi/restful/e;)V

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
.end method
