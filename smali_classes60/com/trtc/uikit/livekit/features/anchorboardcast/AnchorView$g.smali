.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e1(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$exitLive$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;",
        "onSuccess",
        "",
        "statisticsData",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;",
        "onFailure",
        "code",
        "",
        "desc",
        "",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string p1, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->F0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2, v0, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->w(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;ILjava/lang/Object;)V

    .line 18
    return-void
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
.end method

.method public onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "statisticsData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->C(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->F0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$g;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, v1, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->w(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;ILjava/lang/Object;)V

    .line 23
    return-void
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
.end method
