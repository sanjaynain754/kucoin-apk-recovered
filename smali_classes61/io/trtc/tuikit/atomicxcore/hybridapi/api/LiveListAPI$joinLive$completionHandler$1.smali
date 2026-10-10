.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI;->joinLive(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;",
        "onFailure",
        "",
        "code",
        "",
        "desc",
        "",
        "onSuccess",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
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
        "SMAP\nLiveListAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,249:1\n35#2,2:250\n*S KotlinDebug\n*F\n+ 1 LiveListAPI.kt\nio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1\n*L\n72#1:250,2\n*E\n"
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

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
.method public onFailure(ILjava/lang/String;)V
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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

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

.method public onSuccess(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$joinLive$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    const-string/jumbo v3, "toJson(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->success(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    return-void
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
.end method
