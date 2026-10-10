.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;->startObserving()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;",
        "onLocalCameraClosedByAdmin",
        "",
        "onLocalCameraOpenedByAdmin",
        "policy",
        "Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;",
        "onLocalMicrophoneClosedByAdmin",
        "onLocalMicrophoneOpenedByAdmin",
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
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;-><init>()V

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
.method public onLocalCameraClosedByAdmin()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const/16 v7, 0x1a

    .line 9
    const/4 v8, 0x0

    .line 10
    .line 11
    const-string v2, "listener"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    const-string v4, "onLocalCameraClosedByAdmin"

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v8}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 30
    return-void
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

.method public onLocalCameraOpenedByAdmin(Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "policy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onLocalCameraOpenedByAdmin"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->getValue()I

    .line 29
    move-result p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 47
    return-void
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

.method public onLocalMicrophoneClosedByAdmin()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const/16 v7, 0x1a

    .line 9
    const/4 v8, 0x0

    .line 10
    .line 11
    const-string v2, "listener"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    const-string v4, "onLocalMicrophoneClosedByAdmin"

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v8}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 30
    return-void
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

.method public onLocalMicrophoneOpenedByAdmin(Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "policy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onLocalMicrophoneOpenedByAdmin"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->getValue()I

    .line 29
    move-result p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher$startObserving$4;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 47
    return-void
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
