.class public final Lio/trtc/tuikit/atomicxcore/impl/live/Y0;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final i:Lio/trtc/tuikit/atomicxcore/impl/live/V0;

.field public final j:Lio/trtc/tuikit/atomicxcore/impl/live/W0;

.field public k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

.field public l:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

.field public final m:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->c:Lkotlinx/coroutines/flow/n;

    .line 38
    .line 39
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 40
    const/4 v4, 0x7

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v0 .. v5}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->d:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->e:Lkotlinx/coroutines/flow/n;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->f:Lkotlinx/coroutines/flow/n;

    .line 75
    .line 76
    const-string v3, "file"

    .line 77
    .line 78
    const-string v4, "AtomicXCore-Live"

    .line 79
    .line 80
    const-string v5, "LiveSeatStoreImpl"

    .line 81
    .line 82
    .line 83
    invoke-static {v5, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 87
    .line 88
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 89
    .line 90
    .line 91
    invoke-direct {v3}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 92
    .line 93
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 94
    .line 95
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/V0;

    .line 96
    .line 97
    .line 98
    invoke-direct {v3, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/V0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 99
    .line 100
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->i:Lio/trtc/tuikit/atomicxcore/impl/live/V0;

    .line 101
    .line 102
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/W0;

    .line 103
    .line 104
    .line 105
    invoke-direct {v3, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/W0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 106
    .line 107
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->j:Lio/trtc/tuikit/atomicxcore/impl/live/W0;

    .line 108
    .line 109
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 110
    .line 111
    .line 112
    invoke-direct {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 113
    .line 114
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->m:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 78
    const-string v0, "message"

    const/4 v1, 0x0

    const-string v2, "callExperimentalAPI querySeatLayout response: "

    invoke-static {v2, p1, p0, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;
    .locals 6

    .line 63
    const-string v0, "message"

    const-string v1, "callExperimentalAPI querySeatLayout response: "

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 64
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 65
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a:Ljava/lang/String;

    const-string v5, "roomId"

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v4, "api"

    const-string v5, "querySeatLayout"

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v4, "params"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    :try_start_0
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lfg0/a;

    invoke-direct {v4, p0}, Lfg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    invoke-virtual {v3, v2, v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;

    move-result-object v2

    .line 69
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 71
    invoke-virtual {v3, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    if-eqz v2, :cond_0

    .line 72
    instance-of v1, v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 73
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lio/trtc/tuikit/atomicxcore/impl/live/P0;->a(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 74
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "callExperimentalAPI querySeatLayout failed, "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 76
    invoke-virtual {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API: afterEnterRoom called with liveInfo="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 4
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->querySeatList()Ljava/util/List;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a(Ljava/util/List;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    const-string v1, "message"

    const/4 v2, 0x0

    const-string v3, "API: leaveRoom called with liveID="

    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 9
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 10
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/n;->a:Lio/trtc/tuikit/atomicxcore/impl/common/n;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 12
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->i:Lio/trtc/tuikit/atomicxcore/impl/live/V0;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 13
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    move-result-object p1

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->j:Lio/trtc/tuikit/atomicxcore/impl/live/W0;

    invoke-virtual {p1, v0}, Lcom/tencent/trtc/TRTCCloud;->removeListener(Lcom/tencent/trtc/TRTCCloudListener;)V

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 21

    move-object/from16 v0, p0

    .line 14
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a()Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 15
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->d:Lkotlinx/coroutines/flow/n;

    .line 16
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 17
    move-object v4, v3

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 18
    invoke-interface {v2, v3, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 19
    :cond_1
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->c:Lkotlinx/coroutines/flow/n;

    .line 20
    :cond_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 21
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 22
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 24
    check-cast v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 25
    const-string v7, "seatFullInfo"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v9, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 27
    iget-object v10, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userName:Ljava/lang/String;

    .line 28
    iget-object v11, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userAvatar:Ljava/lang/String;

    .line 29
    iget-object v13, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->roomId:Ljava/lang/String;

    .line 30
    iget-object v7, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    const-string/jumbo v8, "userMicrophoneStatus"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v14

    .line 31
    iget-object v7, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    const-string/jumbo v8, "userCameraStatus"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v16

    .line 32
    iget-object v7, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    sget-object v8, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->CLOSED_BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    const/4 v15, 0x1

    if-eq v7, v8, :cond_3

    move/from16 v17, v15

    goto :goto_1

    :cond_3
    const/16 v17, 0x0

    .line 33
    :goto_1
    iget-object v12, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    if-eq v12, v8, :cond_4

    goto :goto_2

    :cond_4
    const/4 v15, 0x0

    .line 34
    :goto_2
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus$Companion;

    invoke-virtual {v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->getValue()I

    move-result v7

    invoke-virtual {v8, v7}, Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;

    move-result-object v18

    .line 35
    new-instance v8, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 36
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/4 v12, 0x0

    .line 40
    invoke-direct/range {v8 .. v20}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    new-instance v9, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 42
    iget v10, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->x:I

    .line 43
    iget v11, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->y:I

    .line 44
    iget v12, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->width:I

    .line 45
    iget v13, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->height:I

    .line 46
    iget v14, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->zorder:I

    .line 47
    invoke-direct/range {v9 .. v14}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;-><init>(IIIII)V

    .line 48
    new-instance v10, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;-><init>(IZLio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    iget v7, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->seatIndex:I

    invoke-virtual {v10, v7}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->setIndex(I)V

    .line 50
    iget-boolean v6, v6, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->isSeatLocked:Z

    invoke-virtual {v10, v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->setLocked(Z)V

    .line 51
    invoke-virtual {v10, v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->setUserInfo(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 52
    invoke-virtual {v10, v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->setRegion(Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;)V

    .line 53
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 54
    :cond_5
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 55
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    .line 56
    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 57
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v3

    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    .line 58
    :cond_8
    :goto_3
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->f:Lkotlinx/coroutines/flow/n;

    .line 59
    :cond_9
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 60
    move-object v3, v1

    check-cast v3, Ljava/util/List;

    .line 61
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 62
    invoke-interface {v2, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_4
    return-void
.end method

.method public final addLiveSeatEventListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: addLiveSeatEventListener called with listener="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

    .line 34
    return-void
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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->i:Lio/trtc/tuikit/atomicxcore/impl/live/V0;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 23
    .line 24
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->j:Lio/trtc/tuikit/atomicxcore/impl/live/W0;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/tencent/trtc/TRTCCloud;->addListener(Lcom/tencent/trtc/TRTCCloudListener;)V

    .line 34
    return-void
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
.end method

.method public final closeRemoteCamera(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "API: closeRemoteCamera called with userID="

    .line 6
    .line 7
    const-string v3, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, p1, v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 19
    .line 20
    const-string v1, "Response: closeRemoteCamera failed, user not find:"

    .line 21
    const/4 v2, 0x2

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p1, v0, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 32
    move-result p1

    .line 33
    .line 34
    .line 35
    const-string/jumbo v0, "user not find"

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 39
    :cond_0
    return-void

    .line 40
    .line 41
    :cond_1
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 42
    .line 43
    .line 44
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 45
    const/4 v1, 0x1

    .line 46
    .line 47
    iput-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockVideo:Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenMicrophone()Z

    .line 55
    move-result v2

    .line 56
    xor-int/2addr v1, v2

    .line 57
    .line 58
    iput-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockAudio:Z

    .line 59
    .line 60
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    .line 64
    move-result v0

    .line 65
    .line 66
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 67
    const/4 v3, 0x6

    .line 68
    const/4 v4, 0x0

    .line 69
    .line 70
    .line 71
    invoke-direct {v2, p2, v4, v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 75
    return-void
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

.method public final closeRemoteMicrophone(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "API: closeRemoteMicrophone called with userID="

    .line 5
    .line 6
    const-string v2, "message"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p1, v0, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 19
    .line 20
    const-string v1, "closeRemoteMicrophone failed, user not find:"

    .line 21
    const/4 v4, 0x2

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p1, v0, v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 25
    .line 26
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Response: closeRemoteMicrophone onFailure with code="

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 39
    move-result v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v4, ", message=user not find"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 61
    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 66
    move-result p1

    .line 67
    .line 68
    .line 69
    const-string/jumbo v0, "user not find"

    .line 70
    .line 71
    .line 72
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 73
    :cond_0
    return-void

    .line 74
    .line 75
    :cond_1
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 79
    const/4 v1, 0x1

    .line 80
    .line 81
    iput-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockAudio:Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenCamera()Z

    .line 89
    move-result v2

    .line 90
    xor-int/2addr v1, v2

    .line 91
    .line 92
    iput-boolean v1, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockVideo:Z

    .line 93
    .line 94
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    .line 98
    move-result v0

    .line 99
    .line 100
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 101
    const/4 v3, 0x6

    .line 102
    const/4 v4, 0x0

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, p2, v4, v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 109
    return-void
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

.method public final getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->m:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

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

.method public final kickUserOutOfSeat(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: kickUserOutOfSeat called with userID="

    .line 8
    .line 9
    .line 10
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x6

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 20
    const/4 p2, -0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/DeprecatedRoomEngineAPI;->kickUserOffSeatByAdmin(ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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

.method public final leaveSeat(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: leaveSeat called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x6

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->leaveSeat(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public final lockSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: lockSeat called with seatIndex="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockSeat:Z

    .line 37
    .line 38
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 39
    .line 40
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x6

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public final moveUserToSeat(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: moveUserToSeat called with userID="

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
    const-string v2, ", targetIndex="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, ", policy="

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
    .line 47
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x6

    .line 56
    const/4 v2, 0x0

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 61
    .line 62
    new-instance p3, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 63
    .line 64
    .line 65
    invoke-direct {p3, p4, v2, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->moveToSeat(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 69
    return-void

    .line 70
    .line 71
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 72
    .line 73
    if-nez p3, :cond_1

    .line 74
    .line 75
    sget-object p3, Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;->ABORT_WHEN_OCCUPIED:Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;

    .line 76
    .line 77
    :cond_1
    const-string v3, "policy"

    .line 78
    .line 79
    .line 80
    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/O0;->a:[I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 86
    move-result p3

    .line 87
    .line 88
    aget p3, v3, p3

    .line 89
    const/4 v3, 0x1

    .line 90
    .line 91
    if-eq p3, v3, :cond_4

    .line 92
    const/4 v3, 0x2

    .line 93
    .line 94
    if-eq p3, v3, :cond_3

    .line 95
    const/4 v3, 0x3

    .line 96
    .line 97
    if-ne p3, v3, :cond_2

    .line 98
    .line 99
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->SWAP_POSITION:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;

    .line 100
    goto :goto_0

    .line 101
    .line 102
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 103
    .line 104
    .line 105
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 106
    throw p1

    .line 107
    .line 108
    :cond_3
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->FORCE_REPLACE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_4
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;->ABORT_WHEN_OCCUPIED:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;

    .line 112
    .line 113
    :goto_0
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 114
    .line 115
    .line 116
    invoke-direct {v3, p4, v2, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p1, p2, p3, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->moveUserToSeatByAdmin(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MoveSeatPolicy;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 120
    return-void
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
.end method

.method public final muteMicrophone()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: muteMicrophone called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->muteLocalAudio()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final openRemoteCamera(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "policy"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: openRemoteCamera called with userID="

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
    const-string v2, ", policy="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    const-string v2, "message"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    const/4 v3, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 42
    .line 43
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->UNLOCK_ONLY:Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;

    .line 44
    .line 45
    if-ne p2, v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    if-nez p2, :cond_0

    .line 52
    .line 53
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 54
    .line 55
    const-string v0, "Response: openRemoteCamera failed, user not find:"

    .line 56
    const/4 v1, 0x2

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1, p2, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 60
    .line 61
    if-eqz p3, :cond_1

    .line 62
    .line 63
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 67
    move-result p1

    .line 68
    .line 69
    .line 70
    const-string/jumbo p2, "user not find"

    .line 71
    .line 72
    .line 73
    invoke-interface {p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_0
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 77
    .line 78
    .line 79
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 80
    .line 81
    iput-boolean v3, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockVideo:Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenMicrophone()Z

    .line 89
    move-result v0

    .line 90
    .line 91
    xor-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    iput-boolean v0, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockAudio:Z

    .line 94
    .line 95
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    .line 99
    move-result p2

    .line 100
    .line 101
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 102
    const/4 v2, 0x6

    .line 103
    const/4 v3, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v1, p3, v3, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 110
    :cond_1
    return-void
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

.method public final openRemoteMicrophone(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "policy"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: openRemoteMicrophone called with userID="

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
    const-string v2, ", policy="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    const-string v2, "message"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    const/4 v3, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 42
    .line 43
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->UNLOCK_ONLY:Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;

    .line 44
    .line 45
    if-ne p2, v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    if-nez p2, :cond_0

    .line 52
    .line 53
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 54
    .line 55
    const-string v0, "Response: openRemoteMicrophone failed, user not find:"

    .line 56
    const/4 v1, 0x2

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1, p2, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 60
    .line 61
    if-eqz p3, :cond_1

    .line 62
    .line 63
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 67
    move-result p1

    .line 68
    .line 69
    .line 70
    const-string/jumbo p2, "user not find"

    .line 71
    .line 72
    .line 73
    invoke-interface {p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_0
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 77
    .line 78
    .line 79
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 80
    .line 81
    iput-boolean v3, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockAudio:Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenCamera()Z

    .line 89
    move-result v0

    .line 90
    .line 91
    xor-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    iput-boolean v0, p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockVideo:Z

    .line 94
    .line 95
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    .line 99
    move-result p2

    .line 100
    .line 101
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 102
    const/4 v2, 0x6

    .line 103
    const/4 v3, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v1, p3, v3, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 110
    :cond_1
    return-void
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

.method public final removeLiveSeatEventListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: removeLiveSeatEventListener called with listener="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

    .line 34
    return-void
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
.end method

.method public final takeSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: takeSeat called with seatIndex="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 31
    .line 32
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/X0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/X0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 36
    .line 37
    const/16 p2, 0x3c

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/DeprecatedRoomEngineAPI;->takeSeat(IILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 41
    return-void
    .line 42
    .line 43
.end method

.method public final unlockSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: unlockSeat called with seatIndex="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;-><init>()V

    .line 34
    .line 35
    iput-boolean v2, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;->lockSeat:Z

    .line 36
    .line 37
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 38
    .line 39
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x6

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->lockSeatByAdmin(ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatLockParams;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 48
    return-void
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
.end method

.method public final unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: unmuteMicrophone called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x6

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
