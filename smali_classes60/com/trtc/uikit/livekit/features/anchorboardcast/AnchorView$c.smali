.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;
.super Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;
.source "AnchorView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$coHostListener$1",
        "Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;",
        "onCoHostRequestReceived",
        "",
        "inviter",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "extensionInfo",
        "",
        "onCoHostRequestCancelled",
        "invitee",
        "onCoHostRequestAccepted",
        "onCoHostRequestRejected",
        "onCoHostRequestTimeout",
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

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->b:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;-><init>()V

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
.method public onCoHostRequestAccepted(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

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
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, " onCrossRoomConnectionAccepted:[invitee:"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const/16 v2, 0x5d

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lwd0/f;->f(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 61
    :cond_0
    return-void
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
    .line 187
    .line 188
.end method

.method public onCoHostRequestCancelled(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 2

    .line 1
    .line 2
    const-string p2, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, " onCrossRoomConnectionCancelled:[inviter:"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

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
.end method

.method public onCoHostRequestReceived(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "extensionInfo"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, " onCoHostRequestReceived:[inviter:"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    new-instance v1, Lcom/google/gson/Gson;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const/16 v1, 0x5d

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    const-string v1, "liveInfo"

    .line 68
    const/4 v2, 0x0

    .line 69
    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 74
    move-object v0, v2

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore$Companion;

    .line 85
    .line 86
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    if-nez v3, :cond_1

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 96
    move-object v3, v2

    .line 97
    .line 98
    .line 99
    :cond_1
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    new-instance v3, Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 113
    move-result-object v4

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    .line 120
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    check-cast v4, Ljava/util/List;

    .line 124
    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 127
    move-result-object v4

    .line 128
    .line 129
    .line 130
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    move-result v5

    .line 132
    .line 133
    if-eqz v5, :cond_5

    .line 134
    .line 135
    .line 136
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    move-result-object v5

    .line 138
    .line 139
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 143
    move-result-object v6

    .line 144
    .line 145
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 149
    move-result-object v7

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 153
    move-result-object v7

    .line 154
    .line 155
    .line 156
    invoke-interface {v7}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 157
    move-result-object v7

    .line 158
    .line 159
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 160
    .line 161
    if-eqz v7, :cond_3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 165
    move-result-object v7

    .line 166
    goto :goto_1

    .line 167
    :cond_3
    move-object v7, v2

    .line 168
    .line 169
    .line 170
    :goto_1
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    move-result v6

    .line 172
    .line 173
    if-nez v6, :cond_2

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 177
    move-result-object v6

    .line 178
    .line 179
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 180
    .line 181
    .line 182
    invoke-static {v7}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->e0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    if-nez v7, :cond_4

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 189
    move-object v7, v2

    .line 190
    .line 191
    .line 192
    :cond_4
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 193
    move-result-object v7

    .line 194
    .line 195
    .line 196
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    move-result v6

    .line 198
    .line 199
    if-eqz v6, :cond_2

    .line 200
    .line 201
    .line 202
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    goto :goto_0

    .line 204
    .line 205
    .line 206
    :cond_5
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 207
    move-result v1

    .line 208
    .line 209
    if-eqz v1, :cond_9

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    .line 220
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    check-cast v1, Ljava/util/Collection;

    .line 224
    .line 225
    .line 226
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 227
    move-result v1

    .line 228
    .line 229
    if-eqz v1, :cond_9

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 233
    move-result-object p2

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getInvitees()Lkotlinx/coroutines/flow/w;

    .line 237
    move-result-object p2

    .line 238
    .line 239
    .line 240
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 241
    move-result-object p2

    .line 242
    .line 243
    check-cast p2, Ljava/util/Collection;

    .line 244
    .line 245
    .line 246
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 247
    move-result p2

    .line 248
    .line 249
    if-nez p2, :cond_6

    .line 250
    goto :goto_2

    .line 251
    .line 252
    :cond_6
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 253
    .line 254
    .line 255
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->h0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lwd0/n;

    .line 256
    move-result-object p2

    .line 257
    .line 258
    if-eqz p2, :cond_7

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2}, Lwd0/n;->c()Lkotlinx/coroutines/flow/w;

    .line 262
    move-result-object p2

    .line 263
    .line 264
    if-eqz p2, :cond_7

    .line 265
    .line 266
    .line 267
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 268
    move-result-object p2

    .line 269
    .line 270
    check-cast p2, Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 274
    move-result p2

    .line 275
    const/4 v0, 0x1

    .line 276
    .line 277
    if-ne p2, v0, :cond_7

    .line 278
    return-void

    .line 279
    .line 280
    :cond_7
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->b:Landroid/content/Context;

    .line 281
    .line 282
    sget v0, Lcom/trtc/uikit/livekit/R$string;->common_connect_inviting_append:I

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    .line 289
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    move-result-object p2

    .line 295
    .line 296
    const-string v0, "getString(...)"

    .line 297
    .line 298
    .line 299
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 309
    move-result-object v2

    .line 310
    .line 311
    .line 312
    invoke-static {v0, p2, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->M0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 315
    .line 316
    .line 317
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 318
    move-result-object p2

    .line 319
    .line 320
    if-eqz p2, :cond_8

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 324
    move-result-object p2

    .line 325
    .line 326
    if-eqz p2, :cond_8

    .line 327
    .line 328
    .line 329
    invoke-virtual {p2, p1}, Lwd0/f;->g(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 330
    :cond_8
    return-void

    .line 331
    .line 332
    .line 333
    :cond_9
    :goto_2
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 334
    move-result-object p1

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, p1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->rejectHostConnection(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 338
    return-void
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public onCoHostRequestRejected(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

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
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, " onConnectionRequestReject:[invitee:"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const/16 v2, 0x5d

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lwd0/f;->h(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 61
    :cond_0
    return-void
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
    .line 187
    .line 188
.end method

.method public onCoHostRequestTimeout(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitee"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->f0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, " onCrossRoomConnectionTimeout:[inviter:"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, ",invitee:"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->i0(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->s()V

    .line 63
    .line 64
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$c;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1, p2}, Lwd0/f;->i(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 80
    :cond_1
    return-void
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
.end method
