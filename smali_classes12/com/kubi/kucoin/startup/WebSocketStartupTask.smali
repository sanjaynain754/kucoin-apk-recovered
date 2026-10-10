.class public final Lcom/kubi/kucoin/startup/WebSocketStartupTask;
.super Ljava/lang/Object;
.source "WebSocketStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "websocket"
    priority = 0x1
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->PreFirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Main:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0008\u0010\u0008\u001a\u00020\tH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/kucoin/startup/WebSocketStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "createWebSocketOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "Companion",
        "LAppNet_googleRelease"
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
        "SMAP\nWebSocketStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketStartupTask.kt\ncom/kubi/kucoin/startup/WebSocketStartupTask\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n16#2:71\n2756#3:72\n1#4:73\n1#4:74\n*S KotlinDebug\n*F\n+ 1 WebSocketStartupTask.kt\ncom/kubi/kucoin/startup/WebSocketStartupTask\n*L\n37#1:71\n37#1:72\n37#1:73\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "AccountContextSwitch"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/kucoin/startup/WebSocketStartupTask;->Companion:Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;

    .line 9
    return-void
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

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/startup/WebSocketStartupTask;->run$lambda$1()Ljava/lang/String;

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

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/startup/WebSocketStartupTask;->run$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic c(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/startup/WebSocketStartupTask;->run$lambda$3(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;

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

.method private static final run$lambda$1()Ljava/lang/String;
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
    return-object v0

    .line 16
    .line 17
    :cond_0
    const-string v0, ""

    .line 18
    return-object v0
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

.method private static final run$lambda$3(Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "reconnect default websocket, state="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/user/model/AccountEventState;->getState()Lcom/kubi/user/model/AccountState;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, ", oldUserId="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/user/model/AccountEventState;->getPreUid()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    const-string v0, "AccountContextSwitch"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ler/b;->a()Ler/a;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Ler/a;->g()V

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    return-object p0
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

.method private static final run$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 10
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    sget-object v1, Lxx/a;->a:Lxx/a;

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 15
    .line 16
    const-class v2, Lxk/g;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/kubi/router/core/Router;->l(Ljava/lang/Class;)Ljava/util/List;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Lxk/g;

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_0
    new-instance v1, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;

    .line 43
    .line 44
    new-instance v2, Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;

    .line 45
    .line 46
    new-instance v7, Lcom/kubi/kucoin/startup/l0;

    .line 47
    .line 48
    .line 49
    invoke-direct {v7}, Lcom/kubi/kucoin/startup/l0;-><init>()V

    .line 50
    .line 51
    const/16 v8, 0xf

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v2 .. v9}, Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    const/4 v3, 0x2

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2, v4, v3, v4}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;-><init>(Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;Lokhttp3/OkHttpClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    new-instance v2, Lcom/kubi/network/socket/WebSocketClient$a;

    .line 66
    .line 67
    .line 68
    invoke-direct {v2}, Lcom/kubi/network/socket/WebSocketClient$a;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Lcom/kubi/kucoin/startup/WebSocketStartupTask;->createWebSocketOkHttpClient()Lokhttp3/OkHttpClient;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->y(Lokhttp3/OkHttpClient;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    new-instance v3, Lvr/a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3}, Lvr/a;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->A(Lcom/kubi/network/socket/a;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    new-instance v3, Lcom/kubi/network/subscribe/codec/SubscribeSocketKCCodec;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3, v1, v0}, Lcom/kubi/network/subscribe/codec/SubscribeSocketKCCodec;-><init>(Ltr/c;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lcom/kubi/network/socket/WebSocketClient$a;->v(Lqr/f;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    new-instance v2, Lur/a;

    .line 97
    const/4 v6, 0x2

    .line 98
    const/4 v7, 0x0

    .line 99
    .line 100
    const-string v3, "push"

    .line 101
    .line 102
    const-wide/16 v4, 0x0

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v2 .. v7}, Lur/a;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->t(Lur/d;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    new-instance v2, Lur/b;

    .line 112
    .line 113
    const-string v3, "push"

    .line 114
    .line 115
    .line 116
    invoke-direct {v2, v3}, Lur/b;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->x(Lur/e;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    new-instance v2, Lur/c;

    .line 123
    .line 124
    .line 125
    invoke-direct {v2, v3}, Lur/c;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lcom/kubi/network/socket/WebSocketClient$a;->z(Lur/g$a;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lcom/kubi/network/socket/WebSocketClient$a;->B(Ltr/c;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/WebSocketClient$a;->a(Landroid/app/Application;)Lcom/kubi/network/socket/WebSocketClient;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient;->connect()V

    .line 141
    .line 142
    const-string v0, "network/channel_default"

    .line 143
    .line 144
    .line 145
    invoke-static {v0, p1}, Ler/b;->g(Ljava/lang/String;Ler/a;)V

    .line 146
    .line 147
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->a()Lio/reactivex/Observable;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    new-instance v0, Lcom/kubi/kucoin/startup/m0;

    .line 154
    .line 155
    .line 156
    invoke-direct {v0}, Lcom/kubi/kucoin/startup/m0;-><init>()V

    .line 157
    .line 158
    new-instance v1, Lcom/kubi/kucoin/startup/n0;

    .line 159
    .line 160
    .line 161
    invoke-direct {v1, v0}, Lcom/kubi/kucoin/startup/n0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 165
    return-void
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
