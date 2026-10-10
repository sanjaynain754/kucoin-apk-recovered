.class public final Lio/trtc/tuikit/atomicxcore/impl/live/s0;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final h:Lio/trtc/tuikit/atomicxcore/impl/live/o0;

.field public final i:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "sharedInstance(...)"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v1, "liveID"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v1, "roomEngine"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->c:Lkotlinx/coroutines/flow/n;

    .line 38
    const/4 v0, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->d:Lkotlinx/coroutines/flow/n;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->e:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    const-string v2, "file"

    .line 61
    .line 62
    const-string v3, "AtomicXCore-Live"

    .line 63
    .line 64
    const-string v4, "LiveAudienceStoreImpl"

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v2, v3, v4}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 71
    .line 72
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 76
    .line 77
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 78
    .line 79
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/o0;

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/o0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/s0;)V

    .line 83
    .line 84
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->h:Lio/trtc/tuikit/atomicxcore/impl/live/o0;

    .line 85
    .line 86
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 87
    .line 88
    .line 89
    invoke-direct {v2, p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 90
    .line 91
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->i:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

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
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API: afterEnterRoom called with liveInfo="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->fetchAudienceList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    const-string v0, "API: getBannedUserList called"

    .line 6
    invoke-static {p1, v0, v1, v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/live/r0;

    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/s0;)V

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getBannedUserList(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    const-string v1, "API: leaveRoom called with liveID="

    const-string v2, "message"

    const/4 v3, 0x0

    invoke-static {v1, p1, v0, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 10
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->c:Lkotlinx/coroutines/flow/n;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 11
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->d:Lkotlinx/coroutines/flow/n;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 13
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/n;->a:Lio/trtc/tuikit/atomicxcore/impl/common/n;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 15
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->h:Lio/trtc/tuikit/atomicxcore/impl/live/o0;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    return-void
.end method

.method public final addLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: addLiveAudienceListener called with listener="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v2, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

    .line 39
    return-void
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

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    const-string v1, "message"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    const-string v3, "API: beforeEnterRoom called with liveID="

    .line 13
    .line 14
    .line 15
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 16
    .line 17
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->h:Lio/trtc/tuikit/atomicxcore/impl/live/o0;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final disableSendMessage(Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: disableSendingMessageByAdmin called with userID="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", isDisable="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, ", completion="

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    const-string v2, "message"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    const/4 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 45
    .line 46
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 47
    .line 48
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/p0;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, p0, p1, p3, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/p0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/s0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->disableSendingMessageByAdmin(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 55
    return-void
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

.method public final fetchAudienceList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: fetchAudienceList called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/s0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v3, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->i:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

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
.end method

.method public final kickUserOutOfRoom(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: kickUserOutOfRoom called with userID="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", completion="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    const-string v2, "message"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 39
    .line 40
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x6

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 49
    return-void
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
.end method

.method public final removeLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: removeLiveAudienceListener called with listener="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v2, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

    .line 39
    return-void
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

.method public final revokeAdministrator(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: revokeAdministrator called with userID="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", completion="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    const-string v2, "message"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 39
    .line 40
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->GENERAL_USER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 41
    .line 42
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x6

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 51
    return-void
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
.end method

.method public final setAdministrator(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: setAdministrator called with userID="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", completion="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    const-string v2, "message"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/s0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 39
    .line 40
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->MANAGER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 41
    .line 42
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x6

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 51
    return-void
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
.end method
