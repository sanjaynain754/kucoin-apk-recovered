.class public final Lcom/kubi/flutter/network/socket/SocketIOClient$a;
.super Ljava/lang/Object;
.source "SocketIOClient.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/flutter/network/socket/SocketIOClient;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSocketIOClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$observeMessage$2\n+ 2 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,75:1\n55#2,6:76\n*S KotlinDebug\n*F\n+ 1 SocketIOClient.kt\ncom/kubi/flutter/network/socket/SocketIOClient$observeMessage$2\n*L\n41#1:76,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/flutter/network/socket/SocketIOClient;


# direct methods
.method public constructor <init>(Lcom/kubi/flutter/network/socket/SocketIOClient;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/flutter/network/socket/SocketIOClient$a;->b:Lcom/kubi/flutter/network/socket/SocketIOClient;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.method public final a(Lcom/kubi/network/api/model/NetworkMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object p2, p0, Lcom/kubi/flutter/network/socket/SocketIOClient$a;->b:Lcom/kubi/flutter/network/socket/SocketIOClient;

    .line 3
    .line 4
    const-string v0, "message"

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/kubi/flutter/network/socket/SocketIOClient;->o(Lcom/kubi/flutter/network/socket/SocketIOClient;)Lfg/g;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p1}, Lfg/g;->b(Lcom/kubi/network/api/model/NetworkMessage;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0, p1}, Lcom/kubi/flutter/network/channel/BaseNetworkClient;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    .line 19
    iget-object p2, p0, Lcom/kubi/flutter/network/socket/SocketIOClient$a;->b:Lcom/kubi/flutter/network/socket/SocketIOClient;

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Lcom/kubi/flutter/network/socket/SocketIOClient;->p(Lcom/kubi/flutter/network/socket/SocketIOClient;)Ljava/lang/String;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lgg/a;->b(Ljava/lang/Throwable;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string p2, "NetFlutterIssue"

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {p1, p2}, Lgg/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 39
    .line 40
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/network/api/model/NetworkMessage;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/network/socket/SocketIOClient$a;->a(Lcom/kubi/network/api/model/NetworkMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 46
    .line 47
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
.end method
