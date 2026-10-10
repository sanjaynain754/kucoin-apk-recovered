.class public final Lio/trtc/tuikit/atomicxcore/impl/live/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Response: getLiveStatistics failed error="

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string p1, ", message="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    const-string p2, "message"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const/4 p2, 0x2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "statisticData"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 9
    .line 10
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 11
    .line 12
    const-string v1, "message"

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    const-string v3, "Response: getLiveStatistics success"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 21
    .line 22
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 25
    .line 26
    iget v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->liveDuration:I

    .line 27
    int-to-long v2, v2

    .line 28
    .line 29
    iget v4, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalViewers:I

    .line 30
    .line 31
    iget v5, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftsSent:I

    .line 32
    .line 33
    iget v6, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalUniqueGiftSenders:I

    .line 34
    .line 35
    iget v7, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftCoins:I

    .line 36
    .line 37
    iget v8, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalLikesReceived:I

    .line 38
    .line 39
    iget v9, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalMessageCount:I

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v1 .. v9}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;-><init>(JIIIIII)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/c1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 48
    .line 49
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->g:Lkotlinx/coroutines/x1;

    .line 50
    const/4 v1, 0x0

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    const/4 v2, 0x1

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 57
    .line 58
    :cond_0
    iput-object v1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->g:Lkotlinx/coroutines/x1;

    .line 59
    .line 60
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->f:Lkotlinx/coroutines/m0;

    .line 61
    .line 62
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/d1;

    .line 63
    .line 64
    .line 65
    invoke-direct {v6, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/d1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;Lkotlin/coroutines/Continuation;)V

    .line 66
    const/4 v7, 0x3

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    iput-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->g:Lkotlinx/coroutines/x1;

    .line 76
    return-void
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
