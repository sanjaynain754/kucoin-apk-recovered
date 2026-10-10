.class public final Lcom/kubi/network/websocket/observable/f;
.super Lio/reactivex/Observable;
.source "SocketObservable.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Observable<",
        "Lcom/kubi/network/websocket/model/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u5efa\u8bae\u76f4\u63a5\u4f7f\u7528RESTful\u65b9\u5f0f"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "KCNetwork"
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u000c2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/network/websocket/observable/f;",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/network/websocket/model/Message;",
        "Lcom/kubi/network/websocket/model/SocketRequest;",
        "subscribe",
        "unsubscribe",
        "Ler/a;",
        "client",
        "<init>",
        "(Lcom/kubi/network/websocket/model/SocketRequest;Lcom/kubi/network/websocket/model/SocketRequest;Ler/a;)V",
        "Lio/reactivex/Observer;",
        "observer",
        "",
        "subscribeActual",
        "(Lio/reactivex/Observer;)V",
        "b",
        "Lcom/kubi/network/websocket/model/SocketRequest;",
        "c",
        "d",
        "Ler/a;",
        "network-adapter-subscribe-old_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lcom/kubi/network/websocket/model/SocketRequest;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/network/websocket/model/SocketRequest;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Ler/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/network/websocket/model/SocketRequest;Lcom/kubi/network/websocket/model/SocketRequest;Ler/a;)V
    .locals 1
    .param p1    # Lcom/kubi/network/websocket/model/SocketRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/network/websocket/model/SocketRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ler/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "subscribe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/kubi/network/websocket/observable/f;->b:Lcom/kubi/network/websocket/model/SocketRequest;

    .line 5
    iput-object p2, p0, Lcom/kubi/network/websocket/observable/f;->c:Lcom/kubi/network/websocket/model/SocketRequest;

    .line 6
    iput-object p3, p0, Lcom/kubi/network/websocket/observable/f;->d:Ler/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/network/websocket/model/SocketRequest;Lcom/kubi/network/websocket/model/SocketRequest;Ler/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 1
    invoke-static {}, Ler/b;->a()Ler/a;

    move-result-object p3

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/network/websocket/observable/f;-><init>(Lcom/kubi/network/websocket/model/SocketRequest;Lcom/kubi/network/websocket/model/SocketRequest;Ler/a;)V

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/Observer;)V
    .locals 3
    .param p1    # Lio/reactivex/Observer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observer<",
            "-",
            "Lcom/kubi/network/websocket/model/Message;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "observer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/network/websocket/observable/SocketDisposable;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/network/websocket/observable/f;->b:Lcom/kubi/network/websocket/model/SocketRequest;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/kubi/network/websocket/observable/f;->d:Ler/a;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, p1, v2}, Lcom/kubi/network/websocket/observable/SocketDisposable;-><init>(Lcom/kubi/network/websocket/model/SocketRequest;Lio/reactivex/Observer;Ler/a;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lio/reactivex/Observer;->onSubscribe(Lio/reactivex/disposables/Disposable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/kubi/network/websocket/observable/SocketDisposable;->run()V

    .line 21
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
