.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->V0()V
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
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$createRoom$1",
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


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

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


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v2, "startLiveStream failed:error:"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, ",desc:"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p2, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->b:Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;->sharedInstance()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;->c()Ltd0/a;

    .line 49
    move-result-object p2

    .line 50
    const/4 v0, 0x0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ltd0/a;->g(Z)V

    .line 54
    .line 55
    sget-object p2, Lcom/trtc/uikit/livekit/common/ErrorLocalized;->a:Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;->onError(I)V

    .line 59
    .line 60
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Q(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 64
    return-void
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
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->I0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Landroid/content/Context;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    check-cast v0, Landroid/app/Activity;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->E(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 49
    .line 50
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->b0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const-string v0, "kcRoomInfoService"

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 62
    move-object v0, v2

    .line 63
    .line 64
    :cond_2
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->g0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lkotlinx/coroutines/m0;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, v1}, Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;->j(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lkotlinx/coroutines/m0;)V

    .line 72
    .line 73
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->n0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 77
    .line 78
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->J0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V

    .line 82
    .line 83
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Y(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->a0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v0, v2}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    const-string v0, "activity is exit, stopLiveStream"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->endLive(Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V

    .line 118
    .line 119
    const-string p1, "eventRoomStateChanged"

    .line 120
    .line 121
    const-string v0, "eventSubKeyRoomStateStop"

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v0, v2}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 125
    .line 126
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Y(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->Z(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Ljava/lang/String;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v0, v2}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 140
    .line 141
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$e;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->d0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    if-nez p1, :cond_4

    .line 148
    .line 149
    const-string p1, "liveCoreView"

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 153
    move-object p1, v2

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-virtual {p1, v2, v2}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLocalVideoMuteImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 157
    return-void
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
.end method
