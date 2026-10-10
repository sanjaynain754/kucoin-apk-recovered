.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;
.super Ljava/lang/Object;
.source "TUILiveListManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListResult;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsModifyFlag;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V
.end method

.method public abstract fetchLiveList(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoListCallback;)V
.end method

.method public abstract getLiveInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
.end method

.method public abstract getLiveStatistics(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsCallback;)V
.end method

.method public abstract joinLive(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
.end method

.method public abstract leaveLive(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;)V
.end method

.method public abstract setLiveInfo(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract startLive(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
.end method

.method public abstract startPreloadVideoStream(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V
.end method

.method public abstract stopLive(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$StopLiveCallback;)V
.end method

.method public abstract stopPreloadVideoStream(Ljava/lang/String;)V
.end method
