.class public final Lcom/kubi/network/socket/WebSocketClient;
.super Ljava/lang/Object;
.source "WebSocketClient.kt"

# interfaces
.implements Ler/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/network/socket/WebSocketClient$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0004*\u000236\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00140\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010 R\u001a\u0010%\u001a\u00020!8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\"\u001a\u0004\u0008#\u0010$R4\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0014\u0018\u00010&8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00107\u00a8\u00069"
    }
    d2 = {
        "Lcom/kubi/network/socket/WebSocketClient;",
        "Ler/a;",
        "Lcom/kubi/network/socket/WebSocketClient$a;",
        "config",
        "<init>",
        "(Lcom/kubi/network/socket/WebSocketClient$a;)V",
        "",
        "connect",
        "()V",
        "g",
        "disconnect",
        "",
        "c",
        "()Ljava/lang/String;",
        "Lfr/d;",
        "callback",
        "a",
        "(Lfr/d;)V",
        "b",
        "Lkotlinx/coroutines/flow/e;",
        "Lcom/kubi/network/api/model/NetworkMessage;",
        "d",
        "()Lkotlinx/coroutines/flow/e;",
        "Lcom/kubi/network/api/model/NetworkRequest;",
        "request",
        "Lfr/b;",
        "f",
        "(Lcom/kubi/network/api/model/NetworkRequest;)Lfr/b;",
        "Lfr/c;",
        "e",
        "(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)Lfr/b;",
        "cancelAll",
        "Lcom/kubi/network/socket/WebSocketClient$a;",
        "Lcom/kubi/network/socket/core/Dispatcher;",
        "Lcom/kubi/network/socket/core/Dispatcher;",
        "j",
        "()Lcom/kubi/network/socket/core/Dispatcher;",
        "dispatcher",
        "Lqr/g;",
        "Lqr/g;",
        "k",
        "()Lqr/g;",
        "setSocketConnection$network_core_socket_release",
        "(Lqr/g;)V",
        "socketConnection",
        "Lcom/kubi/network/socket/bus/MessageBus;",
        "Lcom/kubi/network/socket/bus/MessageBus;",
        "messageBus",
        "Lqr/e;",
        "Lqr/e;",
        "externalCalls",
        "com/kubi/network/socket/WebSocketClient$b",
        "Lcom/kubi/network/socket/WebSocketClient$b;",
        "internalCall",
        "com/kubi/network/socket/WebSocketClient$networkReceiver$1",
        "Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;",
        "networkReceiver",
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
        "SMAP\nWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketClient.kt\ncom/kubi/network/socket/WebSocketClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/kubi/network/socket/WebSocketClient$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/network/socket/core/Dispatcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lqr/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqr/g<",
            "Lcom/kubi/network/api/model/NetworkRequest;",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/kubi/network/socket/bus/MessageBus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lqr/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/kubi/network/socket/WebSocketClient$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/WebSocketClient$a;)V
    .locals 7
    .param p1    # Lcom/kubi/network/socket/WebSocketClient$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/network/socket/core/Dispatcher;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/network/socket/core/Dispatcher;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->b:Lcom/kubi/network/socket/core/Dispatcher;

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/network/socket/bus/MessageBus;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->l()Ljava/util/List;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lcom/kubi/network/socket/bus/MessageBus;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->d:Lcom/kubi/network/socket/bus/MessageBus;

    .line 29
    .line 30
    new-instance v0, Lqr/e;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lo00/g;->e()Ljava/util/concurrent/Executor;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Lqr/e;-><init>(Ljava/util/concurrent/Executor;)V

    .line 38
    .line 39
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->e:Lqr/e;

    .line 40
    .line 41
    new-instance v0, Lcom/kubi/network/socket/WebSocketClient$b;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/kubi/network/socket/WebSocketClient$b;-><init>(Lcom/kubi/network/socket/WebSocketClient;)V

    .line 45
    .line 46
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->f:Lcom/kubi/network/socket/WebSocketClient$b;

    .line 47
    .line 48
    new-instance v0, Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;-><init>(Lcom/kubi/network/socket/WebSocketClient;)V

    .line 52
    .line 53
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->g:Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->q()Lcom/kubi/network/socket/a;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    new-instance v1, Lcom/kubi/network/socket/b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->m()Lokhttp3/OkHttpClient;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->n()Ljava/util/List;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    new-instance v5, Lcom/kubi/network/socket/WebSocketClient$1;

    .line 72
    .line 73
    .line 74
    invoke-direct {v5, p0}, Lcom/kubi/network/socket/WebSocketClient$1;-><init>(Lcom/kubi/network/socket/WebSocketClient;)V

    .line 75
    .line 76
    new-instance v6, Lcom/kubi/network/socket/WebSocketClient$2;

    .line 77
    .line 78
    .line 79
    invoke-direct {v6, p0}, Lcom/kubi/network/socket/WebSocketClient$2;-><init>(Lcom/kubi/network/socket/WebSocketClient;)V

    .line 80
    move-object v3, p0

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v1 .. v6}, Lcom/kubi/network/socket/b;-><init>(Lokhttp3/OkHttpClient;Ler/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v1}, Lcom/kubi/network/socket/a;->a(Lcom/kubi/network/socket/b;)V

    .line 87
    :cond_0
    return-void
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
.end method

.method public static final synthetic h(Lcom/kubi/network/socket/WebSocketClient;)Lqr/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/network/socket/WebSocketClient;->e:Lqr/e;

    .line 3
    return-object p0
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

.method public static final synthetic i(Lcom/kubi/network/socket/WebSocketClient;)Lcom/kubi/network/socket/bus/MessageBus;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/network/socket/WebSocketClient;->d:Lcom/kubi/network/socket/bus/MessageBus;

    .line 3
    return-object p0
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


# virtual methods
.method public a(Lfr/d;)V
    .locals 1
    .param p1    # Lfr/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->e:Lqr/e;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lqr/e;->f(Lfr/d;)V

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

.method public b(Lfr/d;)V
    .locals 1
    .param p1    # Lfr/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->e:Lqr/e;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lqr/e;->o(Lfr/d;)V

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

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lqr/g;->c()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    const-string v0, "disconnect"

    .line 15
    return-object v0
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

.method public cancelAll()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->b:Lcom/kubi/network/socket/core/Dispatcher;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/network/socket/core/Dispatcher;->a()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->q()Lcom/kubi/network/socket/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lcom/kubi/network/socket/a;->cancelAll()V

    .line 17
    :cond_0
    return-void
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

.method public connect()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/network/socket/WebSocketClient;->disconnect()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->f()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "socket_io_protocol"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/network/socket/socketio/SocketIOConnection;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, Lcom/kubi/network/socket/socketio/SocketIOConnection;-><init>(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    new-instance v0, Lcom/kubi/network/socket/socketkc/SocketKCConnection;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0, v1}, Lcom/kubi/network/socket/socketkc/SocketKCConnection;-><init>(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V

    .line 37
    .line 38
    :goto_0
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 39
    .line 40
    new-instance v1, Lcom/kubi/network/socket/WebSocketClient$connect$1;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0}, Lcom/kubi/network/socket/WebSocketClient$connect$1;-><init>(Lcom/kubi/network/socket/WebSocketClient;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Lqr/g;->f(Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->f:Lcom/kubi/network/socket/WebSocketClient$b;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v1}, Lqr/g;->a(Lfr/d;)V

    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Lqr/g;->connect()V

    .line 63
    .line 64
    :cond_3
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->q()Lcom/kubi/network/socket/a;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-interface {v0}, Lcom/kubi/network/socket/a;->connect()V

    .line 74
    .line 75
    :cond_4
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->c()Landroid/app/Application;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->g:Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;

    .line 82
    .line 83
    new-instance v2, Landroid/content/IntentFilter;

    .line 84
    .line 85
    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 86
    .line 87
    .line 88
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 92
    return-void
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
.end method

.method public d()Lkotlinx/coroutines/flow/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->d:Lcom/kubi/network/socket/bus/MessageBus;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/network/socket/bus/MessageBus;->d()Lkotlinx/coroutines/flow/e;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public disconnect()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/network/socket/WebSocketClient;->cancelAll()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->q()Lcom/kubi/network/socket/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/network/socket/a;->disconnect()V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->f:Lcom/kubi/network/socket/WebSocketClient$b;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lqr/g;->b(Lfr/d;)V

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lqr/g;->disconnect()V

    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    .line 33
    iput-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/network/socket/WebSocketClient$a;->c()Landroid/app/Application;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->g:Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 45
    return-void
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
.end method

.method public e(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)Lfr/b;
    .locals 1
    .param p1    # Lcom/kubi/network/api/model/NetworkRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lfr/c;
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
    const-string v0, "callback"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/kubi/network/socket/WebSocketClient;->f(Lcom/kubi/network/api/model/NetworkRequest;)Lfr/b;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2}, Lfr/b;->a(Lfr/c;)V

    .line 18
    return-object p1
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

.method public f(Lcom/kubi/network/api/model/NetworkRequest;)Lfr/b;
    .locals 2
    .param p1    # Lcom/kubi/network/api/model/NetworkRequest;
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
    new-instance v0, Lcom/kubi/network/socket/core/NetworkCall;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/network/socket/WebSocketClient;->a:Lcom/kubi/network/socket/WebSocketClient$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1, p1}, Lcom/kubi/network/socket/core/NetworkCall;-><init>(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;Lcom/kubi/network/api/model/NetworkRequest;)V

    .line 13
    return-object v0
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

.method public g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/network/socket/exception/ConnectUserException;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/network/socket/exception/ConnectUserException;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lqr/g;->d(Ljava/lang/Throwable;)V

    .line 13
    :cond_0
    return-void
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

.method public final j()Lcom/kubi/network/socket/core/Dispatcher;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->b:Lcom/kubi/network/socket/core/Dispatcher;

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

.method public final k()Lqr/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqr/g<",
            "Lcom/kubi/network/api/model/NetworkRequest;",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient;->c:Lqr/g;

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
