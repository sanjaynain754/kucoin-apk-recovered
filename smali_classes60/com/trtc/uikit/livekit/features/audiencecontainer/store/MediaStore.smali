.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;
.super Ljava/lang/Object;
.source "MediaStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0018\u0000 52\u00020\u0001:\u000245B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u001cJ\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020\u001cJ\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0008J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0002J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0008J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\nJ\u000e\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0003J\u0018\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u000c0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u00066"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;",
        "",
        "liveID",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "_isPictureInPictureMode",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "_playbackQuality",
        "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;",
        "_playbackQualityList",
        "",
        "_bigMuteBitmap",
        "Landroid/graphics/Bitmap;",
        "_smallMuteBitmap",
        "roomEngine",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;",
        "kotlin.jvm.PlatformType",
        "roomEngineObserver",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$RoomEngineObserver;",
        "coGuestState",
        "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;",
        "mediaState",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;",
        "getMediaState",
        "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;",
        "destroy",
        "",
        "createVideoMuteBitmap",
        "context",
        "Landroid/content/Context;",
        "bigResId",
        "",
        "smallResId",
        "releaseVideoMuteBitmap",
        "createMuteBitmap",
        "resId",
        "setCustomVideoProcess",
        "enablePictureInPictureMode",
        "enable",
        "onUserVideoSizeChanged",
        "width",
        "height",
        "enableSwitchPlaybackQuality",
        "getMultiPlaybackQuality",
        "roomId",
        "switchPlaybackQuality",
        "quality",
        "parseQualityJsonString",
        "jsonString",
        "getVideoQuality",
        "RoomEngineObserver",
        "Companion",
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


# static fields
.field public static final j:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final k:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final g:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lee0/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 11
    .line 12
    const-string v1, "MediaManager"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getLiveStreamLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->k:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 19
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    iput-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->a:Lkotlinx/coroutines/flow/n;

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    iput-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->b:Lkotlinx/coroutines/flow/n;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    iput-object v4, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c:Lkotlinx/coroutines/flow/n;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    iput-object v5, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    iput-object v6, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 52
    .line 53
    new-instance v7, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$a;

    .line 54
    .line 55
    .line 56
    invoke-direct {v7, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;)V

    .line 57
    .line 58
    iput-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->g:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore$a;

    .line 59
    .line 60
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->h:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 71
    .line 72
    new-instance v1, Lee0/h;

    .line 73
    .line 74
    .line 75
    invoke-direct/range {v1 .. v6}, Lee0/h;-><init>(Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/flow/n;)V

    .line 76
    .line 77
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->i:Lee0/h;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 81
    const/4 p1, 0x1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->f(Z)V

    .line 85
    return-void
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

.method public static synthetic a(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;Ljava/lang/String;)V

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

.method public static final synthetic b(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->k(II)V

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
.end method

.method public static final i(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->l(Ljava/lang/String;)V

    .line 14
    return-void
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
.method public final c(Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/util/TypedValue;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p2, v0}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 18
    .line 19
    iget v0, v0, Landroid/util/TypedValue;->density:I

    .line 20
    .line 21
    iput v0, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    const-string p2, "decodeResource(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    return-object p1
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

.method public final d(Landroid/content/Context;II)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    :cond_0
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 40
    :cond_1
    return-void
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
.end method

.method public final e(Z)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->k:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "enablePictureInPictureMode enable:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->a:Lkotlinx/coroutines/flow/n;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final f(Z)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-string v1, "enable"

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    const-string p1, "AdvanceSettingManager"

    .line 17
    .line 18
    const-string v1, "enableSwitchPlaybackQuality"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1, v0}, Lcom/tencent/qcloud/tuicore/TUICore;->callService(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    .line 22
    return-void
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

.method public final g()Lee0/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->i:Lee0/h;

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
.end method

.method public final h(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "{\"api\":\"queryPlaybackQualityList\", \"params\":{\"roomId\": \""

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p1, "\"}}"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v1, Lee0/i;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p0}, Lee0/i;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;

    .line 40
    return-void
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

.method public final j(II)Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;
    .locals 0

    .line 1
    mul-int/2addr p1, p2

    .line 2
    .line 3
    .line 4
    const p2, 0x38400

    .line 5
    .line 6
    if-gt p1, p2, :cond_0

    .line 7
    .line 8
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_360P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 9
    return-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    const p2, 0x7e900

    .line 13
    .line 14
    if-gt p1, p2, :cond_1

    .line 15
    .line 16
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_540P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_1
    const p2, 0xe1000

    .line 21
    .line 22
    if-gt p1, p2, :cond_2

    .line 23
    .line 24
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_720P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 25
    return-object p1

    .line 26
    .line 27
    :cond_2
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_1080P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 28
    return-object p1
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

.method public final k(II)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->j(II)Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->b:Lkotlinx/coroutines/flow/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    if-ne p1, p2, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c:Lkotlinx/coroutines/flow/n;

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    check-cast p2, Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 25
    move-result p2

    .line 26
    const/4 v0, 0x1

    .line 27
    .line 28
    if-gt p2, v0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c:Lkotlinx/coroutines/flow/n;

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    check-cast p2, Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 41
    move-result p2

    .line 42
    .line 43
    if-nez p2, :cond_2

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_2
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->h:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 50
    move-result-object p2

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 54
    move-result-object p2

    .line 55
    .line 56
    check-cast p2, Ljava/util/List;

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 60
    move-result p2

    .line 61
    .line 62
    if-gt p2, v0, :cond_4

    .line 63
    .line 64
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->h:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    check-cast p2, Ljava/util/Collection;

    .line 75
    .line 76
    .line 77
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    move-result p2

    .line 79
    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->h:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getInvitees()Lkotlinx/coroutines/flow/w;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    .line 89
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    check-cast p2, Ljava/util/Collection;

    .line 93
    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    move-result p2

    .line 97
    .line 98
    if-nez p2, :cond_3

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :cond_3
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->b:Lkotlinx/coroutines/flow/n;

    .line 102
    .line 103
    .line 104
    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 105
    :cond_4
    :goto_0
    return-void
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

.method public final l(Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "jsonString"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v1, "data"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    .line 29
    :goto_0
    if-ge v4, v2, :cond_4

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getInt(I)I

    .line 33
    move-result v5

    .line 34
    .line 35
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_1080P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->getValue()I

    .line 39
    move-result v7

    .line 40
    .line 41
    if-ne v5, v7, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :cond_0
    :goto_1
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_720P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->getValue()I

    .line 53
    move-result v7

    .line 54
    .line 55
    if-ne v5, v7, :cond_1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    :cond_1
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_540P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->getValue()I

    .line 64
    move-result v7

    .line 65
    .line 66
    if-ne v5, v7, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    :cond_2
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_360P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->getValue()I

    .line 75
    move-result v7

    .line 76
    .line 77
    if-ne v5, v7, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 83
    goto :goto_0

    .line 84
    .line 85
    :cond_4
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->c:Lkotlinx/coroutines/flow/n;

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 92
    move-result v0

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->b:Lkotlinx/coroutines/flow/n;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    return-void

    .line 105
    .line 106
    :goto_2
    sget-object v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->k:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 107
    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    const-string v3, "Failed to decode JSON: "

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const/16 p1, 0x2c

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    :cond_5
    return-void
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

.method public final m()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroid/graphics/Bitmap;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 55
    .line 56
    check-cast v0, Landroid/graphics/Bitmap;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 72
    .line 73
    check-cast v0, Landroid/graphics/Bitmap;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 77
    .line 78
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d:Lkotlinx/coroutines/flow/n;

    .line 79
    const/4 v1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e:Lkotlinx/coroutines/flow/n;

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 88
    return-void
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
.end method

.method public final n()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;->a:Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;->s()V

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
    .line 40
    .line 41
    .line 42
.end method

.method public final o(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "quality"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->getValue()I

    .line 14
    move-result p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    const-string p1, "autoSwitch"

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 24
    .line 25
    new-instance p1, Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    const-string v0, "api"

    .line 31
    .line 32
    const-string v2, "switchPlaybackQuality"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    const-string v0, "params"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p1

    .line 55
    .line 56
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->k:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v2, "Failed to build JSON for switchPlaybackQuality: "

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    return-void
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
