.class public final Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;
.super Lokio/AsyncTimeout;
.source "SocketKCConnection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;-><init>(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/kubi/network/socket/socketkc/SocketKCConnection$a$a",
        "Lokio/AsyncTimeout;",
        "",
        "timedOut",
        "()V",
        "network-core-socket_release"
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
.field public final synthetic a:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

.field public final synthetic b:Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;->a:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;->b:Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lokio/AsyncTimeout;-><init>()V

    .line 8
    return-void
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method


# virtual methods
.method public timedOut()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;->a:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;->b:Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->b()Lcom/kubi/network/api/model/NetworkRequest;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/network/api/model/NetworkRequest;->getId()I

    .line 12
    move-result v1

    .line 13
    .line 14
    new-instance v2, Ljava/util/concurrent/TimeoutException;

    .line 15
    .line 16
    const-string v3, "request is timeout"

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->l(Lcom/kubi/network/socket/socketkc/SocketKCConnection;ILjava/lang/Throwable;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
