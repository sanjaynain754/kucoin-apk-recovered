.class public final Lcom/kubi/network/websocket/observable/c;
.super Lio/reactivex/Observable;
.source "CompositeObservable.kt"


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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0008\u0000\u0012\u00020\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/network/websocket/observable/c;",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/network/websocket/model/Message;",
        "Lcom/kubi/network/websocket/model/Request;",
        "subscribe",
        "unsubscribe",
        "restful",
        "",
        "waitHeartbeat",
        "Ler/a;",
        "client",
        "<init>",
        "(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V",
        "Lio/reactivex/Observer;",
        "observer",
        "",
        "subscribeActual",
        "(Lio/reactivex/Observer;)V",
        "b",
        "Lcom/kubi/network/websocket/model/Request;",
        "c",
        "d",
        "Lcom/kubi/network/websocket/model/Message;",
        "e",
        "Z",
        "f",
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
.field public final b:Lcom/kubi/network/websocket/model/Request;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/network/websocket/model/Request;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/kubi/network/websocket/model/Message;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Z

.field public final f:Ler/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V
    .locals 1
    .param p1    # Lcom/kubi/network/websocket/model/Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/network/websocket/model/Request;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/network/websocket/model/Message;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ler/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "subscribe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/kubi/network/websocket/observable/c;->b:Lcom/kubi/network/websocket/model/Request;

    .line 5
    iput-object p2, p0, Lcom/kubi/network/websocket/observable/c;->c:Lcom/kubi/network/websocket/model/Request;

    .line 6
    iput-object p3, p0, Lcom/kubi/network/websocket/observable/c;->d:Lcom/kubi/network/websocket/model/Message;

    .line 7
    iput-boolean p4, p0, Lcom/kubi/network/websocket/observable/c;->e:Z

    .line 8
    iput-object p5, p0, Lcom/kubi/network/websocket/observable/c;->f:Ler/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    const/4 p4, 0x1

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    .line 1
    invoke-static {}, Ler/b;->a()Ler/a;

    move-result-object p5

    :cond_3
    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 2
    invoke-direct/range {p1 .. p6}, Lcom/kubi/network/websocket/observable/c;-><init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/Observer;)V
    .locals 7
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
    new-instance v1, Lcom/kubi/network/websocket/observable/CompositeDisposable;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/kubi/network/websocket/observable/c;->b:Lcom/kubi/network/websocket/model/Request;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/kubi/network/websocket/observable/c;->d:Lcom/kubi/network/websocket/model/Message;

    .line 12
    .line 13
    iget-boolean v5, p0, Lcom/kubi/network/websocket/observable/c;->e:Z

    .line 14
    .line 15
    iget-object v6, p0, Lcom/kubi/network/websocket/observable/c;->f:Ler/a;

    .line 16
    move-object v3, p1

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/kubi/network/websocket/observable/CompositeDisposable;-><init>(Lcom/kubi/network/websocket/model/Request;Lio/reactivex/Observer;Lcom/kubi/network/websocket/model/Message;ZLer/a;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3, v1}, Lio/reactivex/Observer;->onSubscribe(Lio/reactivex/disposables/Disposable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/network/websocket/observable/CompositeDisposable;->run()V

    .line 26
    return-void
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
