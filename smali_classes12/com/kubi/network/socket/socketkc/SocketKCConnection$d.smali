.class public final Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;
.super Lqr/i;
.source "SocketKCConnection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/network/socket/socketkc/SocketKCConnection;-><init>(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqr/i<",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "Lcom/kubi/network/api/model/NetworkMessage<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/network/socket/socketkc/SocketKCConnection$d",
        "Lqr/i;",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "Lcom/kubi/network/api/model/NetworkMessage;",
        "msg",
        "",
        "g",
        "(Lcom/kubi/network/api/model/NetworkRequest;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSocketKCConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$requestStatus$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,270:1\n52#2,33:271\n*S KotlinDebug\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$requestStatus$1\n*L\n92#1:271,33\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lqr/e;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lqr/i;-><init>(Lqr/e;)V

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
.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/network/api/model/NetworkRequest;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->g(Lcom/kubi/network/api/model/NetworkRequest;)V

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

.method public g(Lcom/kubi/network/api/model/NetworkRequest;)V
    .locals 6
    .param p1    # Lcom/kubi/network/api/model/NetworkRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    :try_start_0
    iget-object v2, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->h(Lcom/kubi/network/socket/socketkc/SocketKCConnection;)Lcom/kubi/network/socket/connect/RealConnection;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    iget-object v3, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 16
    .line 17
    .line 18
    invoke-static {v3}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->g(Lcom/kubi/network/socket/socketkc/SocketKCConnection;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/kubi/network/socket/WebSocketClient$a;->e()Lqr/f;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-interface {v3, p1}, Lqr/f;->b(Lcom/kubi/network/api/model/NetworkRequest;)Ljava/lang/Object;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3, v1, v0, v1}, Lqr/g$a;->a(Lqr/g;Ljava/lang/Object;Lfr/c;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-void

    .line 32
    :catch_0
    move-exception v2

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :goto_0
    iget-object v3, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/kubi/network/api/model/NetworkRequest;->getId()I

    .line 42
    move-result p1

    .line 43
    .line 44
    .line 45
    invoke-static {v3, p1, v2}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->l(Lcom/kubi/network/socket/socketkc/SocketKCConnection;ILjava/lang/Throwable;)V

    .line 46
    .line 47
    instance-of p1, v2, Ljava/net/UnknownHostException;

    .line 48
    const/4 v3, 0x1

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :cond_0
    instance-of p1, v2, Ljava/net/SocketException;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_1
    instance-of p1, v2, Ljava/net/SocketTimeoutException;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :cond_2
    instance-of p1, v2, Ljavax/net/ssl/SSLException;

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_3
    instance-of p1, v2, Ljavax/net/ssl/SSLProtocolException;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_4
    instance-of p1, v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_5
    instance-of p1, v2, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    goto :goto_1

    .line 85
    :cond_6
    const/4 p1, 0x0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    if-eqz v4, :cond_d

    .line 92
    .line 93
    const-string v5, "Required SETTINGS preface not received"

    .line 94
    .line 95
    .line 96
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 97
    move-result v5

    .line 98
    .line 99
    if-eqz v5, :cond_7

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_7
    const-string v5, "Unexpected response code for CONNECT"

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 106
    move-result v5

    .line 107
    .line 108
    if-eqz v5, :cond_8

    .line 109
    goto :goto_1

    .line 110
    .line 111
    :cond_8
    const-string v5, "exhausted all routes"

    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 115
    move-result v5

    .line 116
    .line 117
    if-eqz v5, :cond_9

    .line 118
    goto :goto_1

    .line 119
    .line 120
    :cond_9
    const-string v5, "unexpected end of stream"

    .line 121
    .line 122
    .line 123
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 124
    move-result v5

    .line 125
    .line 126
    if-eqz v5, :cond_a

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :cond_a
    const-string v5, "stream was reset: CANCEL"

    .line 130
    .line 131
    .line 132
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 133
    move-result v5

    .line 134
    .line 135
    if-eqz v5, :cond_b

    .line 136
    goto :goto_1

    .line 137
    .line 138
    :cond_b
    const-string v5, "Software caused connection abort"

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v5, p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 142
    move-result v0

    .line 143
    .line 144
    if-eqz v0, :cond_c

    .line 145
    goto :goto_1

    .line 146
    .line 147
    :cond_c
    const-string v0, "closed"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    move-result v0

    .line 152
    .line 153
    if-eqz v0, :cond_d

    .line 154
    goto :goto_1

    .line 155
    :cond_d
    move v3, p1

    .line 156
    .line 157
    :goto_1
    const-string p1, "SocketKCConnection"

    .line 158
    .line 159
    if-eqz v3, :cond_e

    .line 160
    .line 161
    .line 162
    invoke-static {p1, v2}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    goto :goto_3

    .line 164
    .line 165
    .line 166
    :cond_e
    invoke-static {v2, p1}, Lrr/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 167
    goto :goto_3

    .line 168
    .line 169
    :goto_2
    iget-object v1, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;->d:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/kubi/network/api/model/NetworkRequest;->getId()I

    .line 173
    move-result p1

    .line 174
    .line 175
    .line 176
    invoke-static {v1, p1, v0}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->l(Lcom/kubi/network/socket/socketkc/SocketKCConnection;ILjava/lang/Throwable;)V

    .line 177
    :goto_3
    return-void
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method
