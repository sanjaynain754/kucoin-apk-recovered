.class public final Lio/trtc/tuikit/atomicxcore/impl/live/a1;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/a1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;-><init>()V

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
.method public final onLiveStatisticsChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;Ljava/util/List;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "statisticData"

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "modifyFlagList"

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/a1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 14
    .line 15
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->a:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/a1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 25
    .line 26
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    move-object v0, p1

    .line 32
    .line 33
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 34
    .line 35
    const/16 v9, 0x7f

    .line 36
    const/4 v10, 0x0

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v0 .. v10}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->copy$default(Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;JIIIIIIILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_VIEWERS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 51
    .line 52
    .line 53
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalViewers:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalViewers(I)V

    .line 62
    .line 63
    :cond_1
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_GIFTS_SENT:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 64
    .line 65
    .line 66
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    iget v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftsSent:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalGiftsSent(I)V

    .line 75
    .line 76
    :cond_2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_GIFT_COINS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 77
    .line 78
    .line 79
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 80
    move-result v0

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    iget v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftCoins:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalGiftCoins(I)V

    .line 88
    .line 89
    :cond_3
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_UNIQUE_GIFT_SENDERS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 90
    .line 91
    .line 92
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 93
    move-result v0

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    iget v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalUniqueGiftSenders:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalGiftUniqueSenders(I)V

    .line 101
    .line 102
    :cond_4
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_LIKES_RECEIVED:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 103
    .line 104
    .line 105
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    iget v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalLikesReceived:I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalLikesReceived(I)V

    .line 114
    .line 115
    :cond_5
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;->TOTAL_MESSAGE_COUNT:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;

    .line 116
    .line 117
    .line 118
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 119
    move-result p3

    .line 120
    .line 121
    if-eqz p3, :cond_6

    .line 122
    .line 123
    iget p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalMessageCount:I

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->setTotalMessageSent(I)V

    .line 127
    .line 128
    :cond_6
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/a1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 129
    .line 130
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 131
    .line 132
    .line 133
    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 134
    return-void
.end method
