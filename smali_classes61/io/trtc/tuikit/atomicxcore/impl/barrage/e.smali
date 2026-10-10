.class public final Lio/trtc/tuikit/atomicxcore/impl/barrage/e;
.super Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final d:I

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/barrage/a;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 28
    .line 29
    const-string p1, "file"

    .line 30
    .line 31
    const-string v0, "AtomicXCore-Live"

    .line 32
    .line 33
    const-string v1, "BarrageStoreImpl"

    .line 34
    .line 35
    .line 36
    invoke-static {v1, p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 40
    .line 41
    const/16 p1, 0x3e8

    .line 42
    .line 43
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->d:I

    .line 44
    .line 45
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/barrage/e;)V

    .line 49
    .line 50
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->e:Lio/trtc/tuikit/atomicxcore/impl/barrage/a;

    .line 51
    .line 52
    new-instance v0, Lkotlin/collections/ArrayDeque;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p1}, Lkotlin/collections/ArrayDeque;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->f:Lkotlinx/coroutines/flow/n;

    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->g:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 75
    .line 76
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->h:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;

    .line 77
    return-void
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


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V
    .locals 5

    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->f:Lkotlinx/coroutines/flow/n;

    .line 9
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 10
    move-object v2, v1

    check-cast v2, Lkotlin/collections/ArrayDeque;

    .line 11
    new-instance v3, Lkotlin/collections/ArrayDeque;

    invoke-direct {v3, v2}, Lkotlin/collections/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 12
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iget v4, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->d:I

    if-lt v2, v4, :cond_1

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->removeFirst(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    :cond_1
    invoke-virtual {v3, p1}, Lkotlin/collections/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API: afterEnterRoom called with liveID="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", allowSendMessage="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API: leaveRoom called with liveID="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", messageCount="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->f:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/collections/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 7
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->e:Lio/trtc/tuikit/atomicxcore/impl/barrage/a;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    return-void
.end method

.method public final appendLocalTip(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->a(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

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

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: beforeEnterRoom called with liveID="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p1, ", maxMessageCount="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->d:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    const-string v1, "message"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 44
    .line 45
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 46
    .line 47
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->e:Lio/trtc/tuikit/atomicxcore/impl/barrage/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

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
.end method

.method public final getBarrageState()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->h:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;

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

.method public final sendCustomMessage(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: sendCustomMessage called with businessID="

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
    const-string v2, ", data="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;-><init>()V

    .line 42
    .line 43
    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->businessId:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->data:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 48
    .line 49
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/barrage/c;

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/barrage/e;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sendCustomMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendCustomMessageCallback;)V

    .line 56
    return-void
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

.method public final sendTextMessage(Ljava/lang/String;Ljava/util/Map;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: sendTextMessage called with text="

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
    const-string v2, ", extensionInfo="

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
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;-><init>()V

    .line 42
    .line 43
    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->textContent:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->extensionInfo:Ljava/util/Map;

    .line 46
    .line 47
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 48
    .line 49
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/barrage/d;

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/d;-><init>(Lio/trtc/tuikit/atomicxcore/impl/barrage/e;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sendTextMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SendTextMessageCallback;)V

    .line 56
    return-void
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
