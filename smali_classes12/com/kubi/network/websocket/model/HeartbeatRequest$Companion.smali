.class public final Lcom/kubi/network/websocket/model/HeartbeatRequest$Companion;
.super Ljava/lang/Object;
.source "Request.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/network/websocket/model/HeartbeatRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/network/websocket/model/HeartbeatRequest$Companion;",
        "",
        "()V",
        "subscribe",
        "Lcom/kubi/network/websocket/model/HeartbeatRequest;",
        "request",
        "Lokhttp3/Request;",
        "unsubscribe",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final subscribe(Lokhttp3/Request;)Lcom/kubi/network/websocket/model/HeartbeatRequest;
    .locals 10
    .param p1    # Lokhttp3/Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 8
    .line 9
    const/16 v8, 0x3c

    .line 10
    const/4 v9, 0x0

    .line 11
    .line 12
    const-string v2, "subscribe"

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v3, p1

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v1 .. v9}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    return-object v1
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

.method public final unsubscribe(Lokhttp3/Request;)Lcom/kubi/network/websocket/model/HeartbeatRequest;
    .locals 10
    .param p1    # Lokhttp3/Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 8
    .line 9
    const/16 v8, 0x3c

    .line 10
    const/4 v9, 0x0

    .line 11
    .line 12
    const-string v2, "unsubscribe"

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v3, p1

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v1 .. v9}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    return-object v1
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
