.class public final Lio/trtc/tuikit/atomicxcore/impl/live/e1;
.super Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final d:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/live/a1;

.field public final f:Lkotlinx/coroutines/m0;

.field public g:Lkotlinx/coroutines/x1;

.field public final h:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 13

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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->a:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 28
    .line 29
    const/16 v11, 0x7f

    .line 30
    const/4 v12, 0x0

    .line 31
    .line 32
    const-wide/16 v3, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v2 .. v12}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;-><init>(JIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    const-string v1, "file"

    .line 50
    .line 51
    const-string v2, "AtomicXCore-Live"

    .line 52
    .line 53
    const-string v3, "LiveSummaryStoreImpl"

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 60
    .line 61
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    const-string v1, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveListManager"

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 73
    .line 74
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->d:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 75
    .line 76
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/live/a1;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/a1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;)V

    .line 80
    .line 81
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->e:Lio/trtc/tuikit/atomicxcore/impl/live/a1;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->f:Lkotlinx/coroutines/m0;

    .line 92
    .line 93
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 97
    .line 98
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->h:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;

    .line 99
    return-void
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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->d:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->a:Ljava/lang/String;

    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c1;

    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/c1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;)V

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;->getLiveStatistics(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsCallback;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    const-string v1, "message"

    const/4 v2, 0x0

    const-string v3, "API: leaveRoom called with liveID="

    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 10
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->d:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->e:Lio/trtc/tuikit/atomicxcore/impl/live/a1;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;->removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V

    .line 11
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->g:Lkotlinx/coroutines/x1;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 12
    :cond_0
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->g:Lkotlinx/coroutines/x1;

    return-void
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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->d:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->e:Lio/trtc/tuikit/atomicxcore/impl/live/a1;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V

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

.method public final getLiveSummaryState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->h:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;

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
