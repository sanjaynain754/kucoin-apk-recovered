.class public final Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;
.super Ljava/lang/Object;
.source "SocketKCConnection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/network/socket/socketkc/SocketKCConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\u0008\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0015\u001a\u0004\u0008\u000f\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;",
        "",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "request",
        "Lfr/c;",
        "callback",
        "<init>",
        "(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V",
        "a",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "b",
        "()Lcom/kubi/network/api/model/NetworkRequest;",
        "Lfr/c;",
        "()Lfr/c;",
        "Lur/h;",
        "c",
        "Lur/h;",
        "d",
        "()Lur/h;",
        "track",
        "Lokio/AsyncTimeout;",
        "Lokio/AsyncTimeout;",
        "()Lokio/AsyncTimeout;",
        "timeout",
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
.field public final a:Lcom/kubi/network/api/model/NetworkRequest;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lfr/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lur/h;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lokio/AsyncTimeout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic e:Lcom/kubi/network/socket/socketkc/SocketKCConnection;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V
    .locals 1
    .param p1    # Lcom/kubi/network/socket/socketkc/SocketKCConnection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/network/api/model/NetworkRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/api/model/NetworkRequest;",
            "Lfr/c;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->e:Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->a:Lcom/kubi/network/api/model/NetworkRequest;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->b:Lfr/c;

    .line 15
    .line 16
    if-nez p3, :cond_0

    .line 17
    const/4 p3, 0x0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p1}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->g(Lcom/kubi/network/socket/socketkc/SocketKCConnection;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 22
    move-result-object p3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Lcom/kubi/network/socket/WebSocketClient$a;->p()Lur/h;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    :goto_0
    iput-object p3, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->c:Lur/h;

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p1, p0}, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a$a;-><init>(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;)V

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/kubi/network/api/model/NetworkRequest;->getId()I

    .line 39
    move-result p2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p2}, Lur/h;->f(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-static {p1}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;->g(Lcom/kubi/network/socket/socketkc/SocketKCConnection;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->o()J

    .line 50
    move-result-wide p1

    .line 51
    .line 52
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 56
    .line 57
    iput-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->d:Lokio/AsyncTimeout;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lokio/AsyncTimeout;->enter()V

    .line 61
    return-void
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
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
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method


# virtual methods
.method public final a()Lfr/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->b:Lfr/c;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b()Lcom/kubi/network/api/model/NetworkRequest;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->a:Lcom/kubi/network/api/model/NetworkRequest;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final c()Lokio/AsyncTimeout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->d:Lokio/AsyncTimeout;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final d()Lur/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;->c:Lur/h;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method
