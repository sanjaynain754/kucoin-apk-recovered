.class public final Lcom/kubi/kumex/BKumexWebSocketStartUpTask;
.super Ljava/lang/Object;
.source "BKumexWebSocketStartUpTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "b_kumex_websocket"
    priority = 0x2
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->PreFirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Main:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\u0008\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/kumex/BKumexWebSocketStartUpTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "initWS",
        "createWebSocketOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "KumexLib_googleRelease"
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
        "SMAP\nBKumexWebSocketStartUpTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BKumexWebSocketStartUpTask.kt\ncom/kubi/kumex/BKumexWebSocketStartUpTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->initWS$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 4
    return-void
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

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->initWS$lambda$1()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic c(Lcom/kubi/kumex/BKumexWebSocketStartUpTask;Landroid/app/Application;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->run$lambda$0(Lcom/kubi/kumex/BKumexWebSocketStartUpTask;Landroid/app/Application;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final createWebSocketOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->e()Lokhttp3/OkHttpClient;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-wide/16 v1, 0x600

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->minWebSocketMessageToCompress(J)Lokhttp3/OkHttpClient$Builder;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
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

.method public static synthetic d(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->initWS$lambda$3(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final initWS(Landroid/app/Application;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lzl/e;->a:Lzl/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lzl/e;->a()Ljava/util/ArrayList;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;

    .line 11
    .line 12
    const-string v3, "isWs"

    .line 13
    .line 14
    const-string v4, "true"

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    const-string v4, "biz"

    .line 21
    .line 22
    const-string v5, "kumex"

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    .line 29
    filled-new-array {v3, v4}, [Lkotlin/Pair;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    new-instance v7, Lwl/g;

    .line 37
    .line 38
    .line 39
    invoke-direct {v7}, Lwl/g;-><init>()V

    .line 40
    .line 41
    const/16 v8, 0xb

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    .line 47
    .line 48
    invoke-direct/range {v2 .. v9}, Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    const/4 v4, 0x2

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v2, v3, v4, v3}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;-><init>(Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;Lokhttp3/OkHttpClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    new-instance v2, Lcom/kubi/network/socket/WebSocketClient$a;

    .line 55
    .line 56
    .line 57
    invoke-direct {v2}, Lcom/kubi/network/socket/WebSocketClient$a;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->createWebSocketOkHttpClient()Lokhttp3/OkHttpClient;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->y(Lokhttp3/OkHttpClient;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    new-instance v3, Lvr/a;

    .line 68
    .line 69
    .line 70
    invoke-direct {v3}, Lvr/a;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->A(Lcom/kubi/network/socket/a;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    new-instance v3, Lcom/kubi/network/subscribe/codec/SubscribeSocketKCCodec;

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, v1, v0}, Lcom/kubi/network/subscribe/codec/SubscribeSocketKCCodec;-><init>(Ltr/c;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->v(Lqr/f;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    new-instance v2, Lur/a;

    .line 86
    const/4 v6, 0x2

    .line 87
    const/4 v7, 0x0

    .line 88
    .line 89
    const-string v3, "contract"

    .line 90
    .line 91
    const-wide/16 v4, 0x0

    .line 92
    .line 93
    .line 94
    invoke-direct/range {v2 .. v7}, Lur/a;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->t(Lur/d;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    new-instance v2, Lur/b;

    .line 101
    .line 102
    const-string v3, "contract"

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, v3}, Lur/b;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->x(Lur/e;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    new-instance v2, Lur/c;

    .line 112
    .line 113
    .line 114
    invoke-direct {v2, v3}, Lur/c;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->z(Lur/g$a;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/kubi/network/socket/WebSocketClient$a;->B(Ltr/c;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/WebSocketClient$a;->a(Landroid/app/Application;)Lcom/kubi/network/socket/WebSocketClient;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient;->connect()V

    .line 130
    .line 131
    const-string v0, "network/channel_futures"

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p1}, Ler/b;->g(Ljava/lang/String;Ler/a;)V

    .line 135
    .line 136
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->a()Lio/reactivex/Observable;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    new-instance v0, Lwl/h;

    .line 143
    .line 144
    .line 145
    invoke-direct {v0}, Lwl/h;-><init>()V

    .line 146
    .line 147
    new-instance v1, Lwl/i;

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, v0}, Lwl/i;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 154
    return-void
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

.method private static final initWS$lambda$1()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/kubi/user/model/LoginUserEntity;->id:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method private static final initWS$lambda$3(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/model/AccountEventState;->getState()Lcom/kubi/user/model/AccountState;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/user/model/AccountState;->SwitchAccount:Lcom/kubi/user/model/AccountState;

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/user/model/AccountEventState;->getState()Lcom/kubi/user/model/AccountState;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/user/model/AccountState;->Login:Lcom/kubi/user/model/AccountState;

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Ler/b;->b()Ler/a;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ler/a;->g()V

    .line 24
    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p0
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

.method private static final initWS$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    return-void
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

.method private static final run$lambda$0(Lcom/kubi/kumex/BKumexWebSocketStartUpTask;Landroid/app/Application;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->initWS(Landroid/app/Application;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.method public run(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 8
    .line 9
    new-instance v1, Lwl/f;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lwl/f;-><init>(Lcom/kubi/kumex/BKumexWebSocketStartUpTask;Landroid/app/Application;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

    .line 16
    return-void
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
