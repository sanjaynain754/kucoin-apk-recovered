.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI;->requestBattle(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;",
        "onError",
        "",
        "code",
        "",
        "desc",
        "",
        "onSuccess",
        "battleInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;",
        "resultMap",
        "",
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
        "SMAP\nBattleAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,156:1\n35#2,2:157\n*S KotlinDebug\n*F\n+ 1 BattleAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1\n*L\n40#1:157,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move v3, p1

    .line 21
    move-object v4, p2

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->failure$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    return-void
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
.end method

.method public onSuccess(Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;Ljava/util/Map;)V
    .locals 6
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "battleInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "resultMap"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    sget-object v3, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 15
    .line 16
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI$requestBattle$battleRequestCallback$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 24
    move-result-object v5

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    const-string/jumbo v5, "toJson(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    filled-new-array {p1, p2}, [Lkotlin/Pair;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v4, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->success(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    return-void
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
.end method
