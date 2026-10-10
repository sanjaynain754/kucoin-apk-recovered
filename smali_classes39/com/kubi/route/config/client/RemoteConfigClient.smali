.class public final Lcom/kubi/route/config/client/RemoteConfigClient;
.super Ljava/lang/Object;
.source "RemoteConfigClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/route/config/client/RemoteConfigClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008JB\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/route/config/client/RemoteConfigClient;",
        "",
        "<init>",
        "()V",
        "",
        "version",
        "Lcom/kubi/route/config/model/RouteConfigEntry;",
        "a",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "T",
        "",
        "retryCount",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "block",
        "b",
        "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "route-config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRemoteConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/route/config/client/RemoteConfigClient\n+ 2 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n*L\n1#1,87:1\n44#2,2:88\n*S KotlinDebug\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/route/config/client/RemoteConfigClient\n*L\n32#1:88,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/route/config/client/RemoteConfigClient$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/route/config/client/RemoteConfigClient$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/route/config/client/RemoteConfigClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/route/config/client/RemoteConfigClient;->a:Lcom/kubi/route/config/client/RemoteConfigClient$Companion;

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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
.end method

.method public static synthetic c(Lcom/kubi/route/config/client/RemoteConfigClient;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x1

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p1, 0x3

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/route/config/client/RemoteConfigClient;->b(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/route/config/model/RouteConfigEntry;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;-><init>(Lcom/kubi/route/config/client/RemoteConfigClient;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    const-string v7, "RouteConfig::RemoteConfigClient"

    .line 38
    const/4 v8, 0x0

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    move-object v1, p1

    .line 50
    goto :goto_3

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    :try_start_1
    const-string p2, "fetchRouteConfig start"

    .line 64
    .line 65
    .line 66
    invoke-static {v7, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    const-class v1, Lcom/kubi/route/config/client/a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    check-cast p2, Lcom/kubi/route/config/client/a;

    .line 79
    .line 80
    new-instance v3, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1;

    .line 81
    .line 82
    .line 83
    invoke-direct {v3, p2, p1, v8}, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1;-><init>(Lcom/kubi/route/config/client/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 84
    .line 85
    iput v2, v4, Lcom/kubi/route/config/client/RemoteConfigClient$fetchRouteConfig$1;->label:I

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v5, 0x1

    .line 88
    const/4 v6, 0x0

    .line 89
    move-object v1, p0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v1 .. v6}, Lcom/kubi/route/config/client/RemoteConfigClient;->c(Lcom/kubi/route/config/client/RemoteConfigClient;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    if-ne p2, v0, :cond_3

    .line 96
    return-object v0

    .line 97
    .line 98
    :cond_3
    :goto_2
    check-cast p2, Lcom/kubi/route/config/model/RouteConfigEntry;

    .line 99
    .line 100
    if-nez p2, :cond_4

    .line 101
    .line 102
    const-string p1, "fetchRouteConfig end: already latest version"

    .line 103
    .line 104
    .line 105
    invoke-static {v7, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-object v8

    .line 107
    .line 108
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    const-string v0, "fetchRouteConfig end "

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-static {v7, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 127
    return-object p2

    .line 128
    .line 129
    :goto_3
    new-instance v0, Lcom/kubi/route/config/issue/RouteConfigException;

    .line 130
    .line 131
    const/16 v5, 0x8

    .line 132
    const/4 v6, 0x0

    .line 133
    .line 134
    const-string v2, "RouteConfig::RemoteConfigClient"

    .line 135
    const/4 v3, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    .line 138
    .line 139
    invoke-direct/range {v0 .. v6}, Lcom/kubi/route/config/issue/RouteConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 140
    const/4 p1, 0x2

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v8, p1, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 144
    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    const-string p2, "fetchRouteConfig fail: "

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    .line 167
    invoke-static {v7, p1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    return-object v8
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
.end method

.method public final b(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;-><init>(Lcom/kubi/route/config/client/RemoteConfigClient;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget p1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$2:I

    .line 44
    .line 45
    iget p2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$1:I

    .line 46
    .line 47
    iget v2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$0:I

    .line 48
    .line 49
    iget-object v6, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ljava/lang/Throwable;

    .line 52
    .line 53
    iget-object v7, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    .line 58
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    move-object p3, v7

    .line 60
    goto :goto_4

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1

    .line 69
    .line 70
    :cond_2
    iget p1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$2:I

    .line 71
    .line 72
    iget p2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$1:I

    .line 73
    .line 74
    iget v2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$0:I

    .line 75
    .line 76
    iget-object v6, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    return-object p3

    .line 83
    :catchall_0
    move-exception p3

    .line 84
    move-object v11, v6

    .line 85
    move-object v6, p3

    .line 86
    move-object p3, v11

    .line 87
    goto :goto_2

    .line 88
    :catch_0
    move-exception p1

    .line 89
    goto :goto_5

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    const/4 p3, 0x0

    .line 94
    move-object v11, p2

    .line 95
    move p2, p1

    .line 96
    move p1, p3

    .line 97
    move-object p3, v11

    .line 98
    .line 99
    :goto_1
    if-ge p1, p2, :cond_8

    .line 100
    .line 101
    :try_start_1
    iput-object p3, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v4, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput p2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$0:I

    .line 106
    .line 107
    iput p1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$1:I

    .line 108
    .line 109
    iput p1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$2:I

    .line 110
    .line 111
    iput v5, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->label:I

    .line 112
    .line 113
    .line 114
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object p1
    :try_end_1
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    if-ne p1, v1, :cond_4

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    return-object p1

    .line 120
    :catchall_1
    move-exception v2

    .line 121
    move-object v6, v2

    .line 122
    move v2, p2

    .line 123
    move p2, p1

    .line 124
    :goto_2
    add-int/2addr p1, v5

    .line 125
    .line 126
    if-eq p1, v2, :cond_6

    .line 127
    .line 128
    const-wide/16 v7, 0x3e8

    .line 129
    int-to-long v9, p1

    .line 130
    mul-long/2addr v9, v7

    .line 131
    .line 132
    iput-object p3, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v6, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->L$1:Ljava/lang/Object;

    .line 135
    .line 136
    iput v2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$0:I

    .line 137
    .line 138
    iput p2, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$1:I

    .line 139
    .line 140
    iput p1, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->I$2:I

    .line 141
    .line 142
    iput v3, v0, Lcom/kubi/route/config/client/RemoteConfigClient$retryWhenException$1;->label:I

    .line 143
    .line 144
    .line 145
    invoke-static {v9, v10, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 146
    move-result-object v7

    .line 147
    .line 148
    if-ne v7, v1, :cond_5

    .line 149
    :goto_3
    return-object v1

    .line 150
    .line 151
    :cond_5
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    const-string v8, "retryWhenException: count="

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string p1, ", exception="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    const-string v6, "RouteConfig::RemoteConfigClient"

    .line 177
    .line 178
    .line 179
    invoke-static {v6, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    add-int/lit8 p1, p2, 0x1

    .line 182
    move p2, v2

    .line 183
    goto :goto_1

    .line 184
    :cond_6
    throw v6

    .line 185
    .line 186
    :goto_5
    iget-object p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 187
    .line 188
    const-string p3, "50006"

    .line 189
    .line 190
    .line 191
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    move-result p2

    .line 193
    .line 194
    if-eqz p2, :cond_7

    .line 195
    return-object v4

    .line 196
    :cond_7
    throw p1

    .line 197
    :cond_8
    return-object v4
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
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
.end method
