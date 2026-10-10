.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->d1()V
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
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$enterRoom$1$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;",
        "onSuccess",
        "",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

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
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p2, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 15
    move-result-object p2

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ltd0/a;->g(Z)V

    .line 20
    .line 21
    sget-object p2, Lcom/trtc/uikit/livekit/common/ErrorLocalized;->a:Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;->onError(I)V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Q(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

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
.end method

.method public onSuccess(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->I0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->H0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;I)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->b0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const-string v0, "kcRoomInfoService"

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    move-object v0, v1

    .line 35
    .line 36
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->g0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lkotlinx/coroutines/m0;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1, v2}, Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;->j(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lkotlinx/coroutines/m0;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->O0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 49
    .line 50
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Landroid/content/Context;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    const-string v2, "null cannot be cast to non-null type android.app.Activity"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    check-cast v0, Landroid/app/Activity;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 65
    move-result v2

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->E(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 86
    .line 87
    :cond_2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->n0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 91
    return-void

    .line 92
    .line 93
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    const-string v2, "activity is exit"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->d0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    const-string v2, "liveCoreView"

    .line 111
    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 116
    move-object v0, v1

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setVideoViewAdapter(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getKeepOwnerOnSeat()Z

    .line 123
    move-result p1

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->endLive(Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_5
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->leaveLive(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 137
    .line 138
    :goto_1
    const-string p1, "eventRoomStateChanged"

    .line 139
    .line 140
    const-string v0, "eventSubKeyRoomStateStop"

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 144
    .line 145
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Y(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Z(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v0, v1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 159
    .line 160
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$f;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 161
    .line 162
    .line 163
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->d0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-nez p1, :cond_6

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 170
    move-object p1, v1

    .line 171
    .line 172
    .line 173
    :cond_6
    invoke-virtual {p1, v1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLocalVideoMuteImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 174
    .line 175
    sget-object p1, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 183
    move-result-object p1

    .line 184
    const/4 v0, 0x0

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ltd0/a;->g(Z)V

    .line 188
    return-void
.end method
