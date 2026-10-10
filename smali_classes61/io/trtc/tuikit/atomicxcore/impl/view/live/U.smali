.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/U;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;-><init>()V

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

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    const-string v0, "$inviter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionTimeout(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    const-string v0, "$invitee"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionAccepted(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    :cond_0
    return-void
.end method

.method public static final a(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onConnectedRoomsUpdated(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 6
    :cond_0
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

.method public static final c(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionRequest(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 6
    :cond_0
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

.method public static final d(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "$invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionRejected(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 11
    :cond_0
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
.end method

.method public static final e(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "$user"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onCrossRoomConnectionExited(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 11
    :cond_0
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
.end method


# virtual methods
.method public final onConnectionRequestAccept(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    new-instance v1, Lig0/o;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1}, Lig0/o;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

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
.end method

.method public final onConnectionRequestCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 3
    .line 4
    new-instance v1, Lig0/t;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p1}, Lig0/t;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

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

.method public final onConnectionRequestReceived(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 3
    .line 4
    new-instance p3, Lig0/n;

    .line 5
    .line 6
    .line 7
    invoke-direct {p3, p1}, Lig0/n;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

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
.end method

.method public final onConnectionRequestReject(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    new-instance v1, Lig0/r;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1}, Lig0/r;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

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
.end method

.method public final onConnectionRequestTimeout(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 8
    .line 9
    new-instance v1, Lig0/s;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1, p2}, Lig0/s;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

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
.end method

.method public final onConnectionUserListChanged(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .line 1
    .line 2
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 3
    .line 4
    new-instance v0, Lig0/p;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p1}, Lig0/p;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result p3

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object p3

    .line 29
    .line 30
    check-cast p3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 31
    .line 32
    new-instance v0, Lig0/q;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p3}, Lig0/q;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
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
