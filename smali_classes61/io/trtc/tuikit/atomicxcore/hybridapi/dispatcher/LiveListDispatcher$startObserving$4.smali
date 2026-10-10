.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;->startObserving()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;",
        "onKickedOutOfLive",
        "",
        "liveID",
        "",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;",
        "message",
        "onLiveEnded",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;",
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


# instance fields
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;-><init>()V

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
.end method


# virtual methods
.method public onKickedOutOfLive(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;Ljava/lang/String;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "reason"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "message"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    const/16 v10, 0x1a

    .line 24
    const/4 v11, 0x0

    .line 25
    .line 26
    const-string v5, "listener"

    .line 27
    const/4 v6, 0x0

    .line 28
    .line 29
    const-string v7, "onKickedOutOfLive"

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v4 .. v11}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveKickedOutReason;->getValue()I

    .line 43
    move-result p2

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    invoke-static {v2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    move-result-object p3

    .line 56
    .line 57
    .line 58
    filled-new-array {p1, p2, p3}, [Lkotlin/Pair;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v3, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 69
    return-void
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
.end method

.method public onLiveEnded(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;Ljava/lang/String;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "reason"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "message"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    const/16 v10, 0x1a

    .line 24
    const/4 v11, 0x0

    .line 25
    .line 26
    const-string v5, "listener"

    .line 27
    const/4 v6, 0x0

    .line 28
    .line 29
    const-string v7, "onLiveEnded"

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v4 .. v11}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;->getValue()I

    .line 43
    move-result p2

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    invoke-static {v2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    move-result-object p3

    .line 56
    .line 57
    .line 58
    filled-new-array {p1, p2, p3}, [Lkotlin/Pair;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v3, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 69
    return-void
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
.end method
