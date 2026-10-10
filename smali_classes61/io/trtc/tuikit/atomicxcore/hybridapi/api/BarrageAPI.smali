.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "appendLocalTip",
        "",
        "request",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
        "callback",
        "Lkotlin/Function1;",
        "",
        "sendCustomMessage",
        "sendTextMessage",
        "atomicxcore_release"
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
        "SMAP\nBarrageAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarrageAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,95:1\n215#2,2:96\n45#3,5:98\n45#3,5:103\n*S KotlinDebug\n*F\n+ 1 BarrageAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI\n*L\n23#1:96,2\n31#1:98,5\n86#1:103,5\n*E\n"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI;->context:Landroid/content/Context;

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
.end method


# virtual methods
.method public final appendLocalTip(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 19
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    const-string v1, "request"

    .line 5
    .line 6
    const-string v2, "callback"

    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    .line 11
    invoke-static {v3, v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v4, "liveID"

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v4, v2

    .line 24
    .line 25
    :goto_0
    instance-of v5, v4, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    check-cast v4, Ljava/lang/String;

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v4, v2

    .line 32
    .line 33
    :goto_1
    if-nez v4, :cond_2

    .line 34
    .line 35
    const-string v4, ""

    .line 36
    .line 37
    :cond_2
    if-eqz v1, :cond_3

    .line 38
    .line 39
    const-string v5, "message"

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object v1

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object v1, v2

    .line 46
    .line 47
    :goto_2
    instance-of v5, v1, Ljava/util/Map;

    .line 48
    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    check-cast v1, Ljava/util/Map;

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move-object v1, v2

    .line 54
    .line 55
    :goto_3
    if-eqz v1, :cond_5

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 70
    move-result-object v5

    .line 71
    .line 72
    :try_start_0
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 76
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_4

    .line 78
    :catch_0
    move-object v1, v2

    .line 79
    .line 80
    :goto_4
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 81
    .line 82
    if-nez v1, :cond_6

    .line 83
    .line 84
    :cond_5
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;

    .line 85
    .line 86
    const/16 v17, 0x1ff

    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    .line 92
    const-wide/16 v8, 0x0

    .line 93
    .line 94
    const-wide/16 v10, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v5 .. v18}, Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    move-object v1, v5

    .line 105
    .line 106
    :cond_6
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v4}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->appendLocalTip(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

    .line 114
    .line 115
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 119
    move-result-object v3

    .line 120
    const/4 v4, 0x2

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v3, v2, v4, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->success$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    return-void
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
.end method

.method public final sendCustomMessage(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    const-string v4, "businessID"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move-object v4, v1

    .line 43
    .line 44
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v5, :cond_4

    .line 47
    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move-object v4, v1

    .line 51
    .line 52
    :goto_3
    if-nez v4, :cond_5

    .line 53
    move-object v4, v3

    .line 54
    .line 55
    :cond_5
    if-eqz v0, :cond_6

    .line 56
    .line 57
    const-string v5, "data"

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    move-result-object v0

    .line 62
    goto :goto_4

    .line 63
    :cond_6
    move-object v0, v1

    .line 64
    .line 65
    :goto_4
    instance-of v5, v0, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v5, :cond_7

    .line 68
    move-object v1, v0

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    :cond_7
    if-nez v1, :cond_8

    .line 73
    goto :goto_5

    .line 74
    :cond_8
    move-object v3, v1

    .line 75
    .line 76
    :goto_5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI$sendCustomMessage$completionHandler$1;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI$sendCustomMessage$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->sendCustomMessage(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 89
    return-void
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
.end method

.method public final sendTextMessage(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "text"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v4, v1

    .line 44
    .line 45
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move-object v4, v1

    .line 52
    .line 53
    :goto_3
    if-nez v4, :cond_5

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move-object v3, v4

    .line 56
    .line 57
    :goto_4
    if-eqz v0, :cond_6

    .line 58
    .line 59
    const-string v4, "extensionInfo"

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v0

    .line 64
    goto :goto_5

    .line 65
    :cond_6
    move-object v0, v1

    .line 66
    .line 67
    :goto_5
    instance-of v4, v0, Ljava/util/Map;

    .line 68
    .line 69
    if-eqz v4, :cond_8

    .line 70
    .line 71
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 75
    .line 76
    check-cast v0, Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    move-result v4

    .line 89
    .line 90
    if-eqz v4, :cond_9

    .line 91
    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    move-result-object v4

    .line 95
    .line 96
    check-cast v4, Ljava/util/Map$Entry;

    .line 97
    .line 98
    .line 99
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 100
    move-result-object v5

    .line 101
    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    instance-of v6, v5, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v6, :cond_7

    .line 109
    .line 110
    instance-of v6, v4, Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v6, :cond_7

    .line 113
    .line 114
    .line 115
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    goto :goto_6

    .line 117
    .line 118
    :cond_8
    instance-of v4, v0, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v4, :cond_9

    .line 121
    .line 122
    check-cast v0, Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 126
    move-result-object v4

    .line 127
    .line 128
    :try_start_0
    const-class v5, Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v0, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 132
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    :catch_0
    check-cast v1, Ljava/util/Map;

    .line 135
    .line 136
    :cond_9
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI$sendTextMessage$completionHandler$1;

    .line 143
    .line 144
    .line 145
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI$sendTextMessage$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v3, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->sendTextMessage(Ljava/lang/String;Ljava/util/Map;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 149
    return-void
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
.end method
