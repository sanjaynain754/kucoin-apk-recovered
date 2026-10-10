.class public final Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;
.super Ljava/lang/Object;
.source "NetworkInfoStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e*\u0001\u001c\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0002J\u0014\u00100\u001a\u00020\u001f2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020302J\u0018\u00104\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00105\u001a\u00020/H\u0002J\u0014\u00106\u001a\u00020\u001f2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020802J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020,H\u0002J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010B\u001a\u00020/2\u0006\u0010>\u001a\u000208H\u0002J\u0010\u0010C\u001a\u00020\u001f2\u0006\u0010>\u001a\u000208H\u0002J\u0008\u0010D\u001a\u00020\u001fH\u0002J\u0008\u0010E\u001a\u00020\u001fH\u0002J\u0008\u0010F\u001a\u00020\u001fH\u0002J\u0008\u0010G\u001a\u00020\u001fH\u0002J\u0012\u0010H\u001a\u00020/2\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010I\u001a\u00020\u001f2\u0008\u0010J\u001a\u0004\u0018\u00010/H\u0002\u00a2\u0006\u0002\u0010KR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001d\u00a8\u0006M"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "networkInfoState",
        "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;",
        "getNetworkInfoState",
        "()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;",
        "logger",
        "Lcom/trtc/uikit/livekit/common/LiveKitLogger;",
        "appContext",
        "userId",
        "",
        "trtcCloud",
        "Lcom/tencent/trtc/TRTCCloud;",
        "tuiRoomEngine",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;",
        "networkCallback",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "networkReceiver",
        "Landroid/content/BroadcastReceiver;",
        "networkBadStartTime",
        "",
        "subscribeStateJob",
        "Lkotlinx/coroutines/Job;",
        "engineObserver",
        "com/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$engineObserver$1",
        "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$engineObserver$1;",
        "initAudioCaptureVolume",
        "",
        "setAudioCaptureVolume",
        "volume",
        "",
        "updateAudioStatusByVolume",
        "updateAudioMode",
        "audioQuality",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;",
        "checkDeviceTemperature",
        "addObserver",
        "removeObserver",
        "handleNetworkQualityChange",
        "networkInfo",
        "Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;",
        "handleAudioStateChanged",
        "hasAudio",
        "",
        "handleSeatListChanged",
        "seatList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;",
        "handleVideoStateChanged",
        "hasVideo",
        "handleStatisticsChanged",
        "statisticsList",
        "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;",
        "updateNetworkInfo",
        "info",
        "checkAndShowNetworkWeakTips",
        "getLocalStreamStats",
        "Lcom/tencent/trtc/TRTCStatistics$TRTCLocalStatistics;",
        "statistics",
        "Lcom/tencent/trtc/TRTCStatistics;",
        "updateResolution",
        "updateVideoStatus",
        "isBitrateAbnormal",
        "updateAudioStatus",
        "startListenNetworkConnection",
        "stopListenNetworkConnection",
        "registerNetworkCallback",
        "registerBroadcastReceiver",
        "isNetworkAvailable",
        "onNetworkConnectionChange",
        "isConnection",
        "(Ljava/lang/Boolean;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetworkInfoStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkInfoStore.kt\ncom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n1#2:390\n*E\n"
    }
.end annotation


# static fields
.field public static final k:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/tencent/trtc/TRTCCloud;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Landroid/net/ConnectivityManager$NetworkCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:J

.field public i:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final j:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->k:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$Companion;

    .line 9
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
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
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    new-instance v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;-><init>()V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 16
    .line 17
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 18
    .line 19
    const-string v1, "NetworkInfoService"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getComponentLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string v0, "getApplicationContext(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->c:Landroid/content/Context;

    .line 37
    .line 38
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    :cond_0
    const-string p1, ""

    .line 63
    .line 64
    :cond_1
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->d:Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    const-string v0, "getTRTCCloud(...)"

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->e:Lcom/tencent/trtc/TRTCCloud;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    const-string v0, "sharedInstance(...)"

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 91
    .line 92
    new-instance p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)V

    .line 96
    .line 97
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->j:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;

    .line 98
    return-void
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

.method public static final synthetic a(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic b(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->j(Ljava/lang/String;Z)V

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

.method public static final synthetic c(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->n(Ljava/lang/String;Z)V

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

.method public static final synthetic d(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Landroid/content/Context;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->q(Landroid/content/Context;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic e(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->r(Ljava/lang/Boolean;)V

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


# virtual methods
.method public final A(Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->g()Lkotlinx/coroutines/flow/n;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getDelay()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->d()Lkotlinx/coroutines/flow/n;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getDownLoss()I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->h()Lkotlinx/coroutines/flow/n;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getUpLoss()I

    .line 44
    move-result v1

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->e()Lkotlinx/coroutines/flow/n;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getQuality()Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 65
    return-void
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

.method public final B(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->f()Lkotlinx/coroutines/flow/n;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getVideoWidth()I

    .line 15
    move-result p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p1, " P"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final C(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Closed:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->e()Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 28
    .line 29
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->VERY_BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 30
    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->DOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 34
    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    goto :goto_2

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getFrameRate()I

    .line 46
    move-result v1

    .line 47
    .line 48
    const/16 v2, 0xf

    .line 49
    .line 50
    if-lt v1, v2, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->p(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_2
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_3
    :goto_0
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Abnormal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Abnormal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 78
    return-void
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

.method public final f()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->v()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->j:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v4, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$addObserver$1;

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Lkotlin/coroutines/Continuation;)V

    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i:Lkotlinx/coroutines/x1;

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final g(Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getQuality()Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getQuality()Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->VERY_BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;->getQuality()Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->DOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    .line 30
    .line 31
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    move-result-wide v0

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    iget-wide v4, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->h:J

    .line 39
    .line 40
    cmp-long p1, v4, v2

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->h:J

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_2
    sub-long v2, v0, v4

    .line 48
    .line 49
    const-wide/16 v4, 0x7530

    .line 50
    .line 51
    cmp-long p1, v2, v4

    .line 52
    .line 53
    if-ltz p1, :cond_4

    .line 54
    .line 55
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->k()Lkotlinx/coroutines/flow/n;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    iput-wide v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->h:J

    .line 67
    goto :goto_2

    .line 68
    .line 69
    :cond_3
    iput-wide v2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->h:J

    .line 70
    .line 71
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->e()Lkotlinx/coroutines/flow/n;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 82
    .line 83
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->VERY_BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 84
    .line 85
    if-eq p1, v0, :cond_6

    .line 86
    .line 87
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->DOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 88
    .line 89
    if-ne p1, v0, :cond_5

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    return-void

    .line 92
    .line 93
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Abnormal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 103
    return-void
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

.method public final h(Landroid/content/Context;)V
    .locals 3
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
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "checkDeviceTemperature:[context:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v2, 0x5d

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v0, Landroid/content/IntentFilter;

    .line 35
    .line 36
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const-string v0, "temperature"

    .line 49
    const/4 v1, 0x0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    .line 56
    const/high16 v0, 0x41200000    # 10.0f

    .line 57
    div-float/2addr p1, v0

    .line 58
    .line 59
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 60
    .line 61
    const/high16 v2, 0x42340000    # 45.0f

    .line 62
    .line 63
    cmpl-float p1, p1, v2

    .line 64
    .line 65
    if-lez p1, :cond_0

    .line 66
    const/4 v1, 0x1

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->n(Z)V

    .line 70
    :cond_1
    return-void
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

.method public final i()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

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

.method public final j(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->d:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Mute:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 29
    .line 30
    if-eq p2, v0, :cond_0

    .line 31
    .line 32
    sget-object p2, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    sget-object p2, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Closed:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 39
    :cond_1
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

.method public final k(Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "networkInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->l()Lkotlinx/coroutines/flow/n;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->A(Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->g(Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;)V

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final l(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "seatList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->d:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->m()Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->m()Lkotlinx/coroutines/flow/n;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 61
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

.method public final m(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "statisticsList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getUserID()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 26
    move-result v1

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->B(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->C(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->y(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V

    .line 44
    :cond_0
    return-void
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

.method public final n(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->d:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    sget-object p2, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    sget-object p2, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Closed:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 25
    :cond_1
    return-void
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

.method public final o()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    const-string v1, "initAudioCaptureVolume:[]"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->a()Lkotlinx/coroutines/flow/n;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->e:Lcom/tencent/trtc/TRTCCloud;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/tencent/trtc/TRTCCloud;->getAudioCaptureVolume()I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 27
    return-void
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

.method public final p(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getVideoWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getVideoHeight()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getVideoBitrate()I

    .line 12
    move-result p1

    .line 13
    .line 14
    const/16 v2, 0xf0

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    if-eq v0, v2, :cond_b

    .line 19
    .line 20
    const/16 v2, 0x168

    .line 21
    .line 22
    if-eq v0, v2, :cond_9

    .line 23
    .line 24
    const/16 v2, 0x1e0

    .line 25
    .line 26
    if-eq v0, v2, :cond_7

    .line 27
    .line 28
    const/16 v2, 0x21c

    .line 29
    .line 30
    if-eq v0, v2, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x438

    .line 33
    .line 34
    if-eq v0, v1, :cond_0

    .line 35
    return v4

    .line 36
    .line 37
    :cond_0
    const/16 v0, 0x5dc

    .line 38
    .line 39
    if-ge p1, v0, :cond_1

    .line 40
    return v3

    .line 41
    :cond_1
    return v4

    .line 42
    .line 43
    :cond_2
    if-eq v1, v2, :cond_5

    .line 44
    .line 45
    const/16 v0, 0x3c0

    .line 46
    .line 47
    if-eq v1, v0, :cond_3

    .line 48
    return v4

    .line 49
    .line 50
    :cond_3
    const/16 v0, 0x320

    .line 51
    .line 52
    if-ge p1, v0, :cond_4

    .line 53
    return v3

    .line 54
    :cond_4
    return v4

    .line 55
    .line 56
    :cond_5
    const/16 v0, 0x1f4

    .line 57
    .line 58
    if-ge p1, v0, :cond_6

    .line 59
    return v3

    .line 60
    :cond_6
    return v4

    .line 61
    .line 62
    :cond_7
    const/16 v0, 0x15e

    .line 63
    .line 64
    if-ge p1, v0, :cond_8

    .line 65
    return v3

    .line 66
    :cond_8
    return v4

    .line 67
    .line 68
    :cond_9
    const/16 v0, 0xc8

    .line 69
    .line 70
    if-ge p1, v0, :cond_a

    .line 71
    return v3

    .line 72
    :cond_a
    return v4

    .line 73
    .line 74
    :cond_b
    const/16 v0, 0x64

    .line 75
    .line 76
    if-ge p1, v0, :cond_c

    .line 77
    return v3

    .line 78
    :cond_c
    return v4
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

.method public final q(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    const-string v1, "connectivity"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    instance-of v1, p1, Landroid/net/ConnectivityManager;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    .line 20
    :goto_0
    if-nez p1, :cond_2

    .line 21
    return v0

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    return v0

    .line 29
    .line 30
    .line 31
    :cond_3
    invoke-virtual {p1, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    if-nez p1, :cond_4

    .line 35
    return v0

    .line 36
    .line 37
    :cond_4
    const/16 v1, 0xc

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_6

    .line 44
    const/4 v1, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-nez v2, :cond_5

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 54
    move-result v2

    .line 55
    .line 56
    if-nez v2, :cond_5

    .line 57
    const/4 v2, 0x3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 61
    move-result p1

    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    :cond_5
    return v1

    .line 65
    :cond_6
    return v0
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

.method public final r(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->e()Lkotlinx/coroutines/flow/n;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->DOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Abnormal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->e()Lkotlinx/coroutines/flow/n;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->i()Lkotlinx/coroutines/flow/n;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 54
    return-void
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

.method public final s()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->c:Landroid/content/Context;

    .line 3
    .line 4
    const-string v1, "connectivity"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    instance-of v1, v0, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    new-instance v1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$b;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;)V

    .line 25
    .line 26
    iput-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->g:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 27
    .line 28
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 32
    .line 33
    const/16 v2, 0xc

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->g:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 50
    return-void
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

.method public final t()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->w()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->j:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i:Lkotlinx/coroutines/x1;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 20
    :cond_0
    return-void
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

.method public final u(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "setAudioCaptureVolume:[volume:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const/16 v2, 0x5d

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->a()Lkotlinx/coroutines/flow/n;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->e:Lcom/tencent/trtc/TRTCCloud;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/tencent/trtc/TRTCCloud;->setAudioCaptureVolume(I)V

    .line 46
    return-void
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

.method public final v()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->s()V

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
.end method

.method public final w()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->c:Landroid/content/Context;

    .line 3
    .line 4
    const-string v1, "connectivity"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    instance-of v1, v0, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->g:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 26
    :cond_1
    return-void
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

.method public final x(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V
    .locals 3
    .param p1    # Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "audioQuality"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "updateAudioMode:[audioQuality:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v2, 0x5d

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->b()Lkotlinx/coroutines/flow/n;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->updateAudioQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;)V

    .line 47
    return-void
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

.method public final y(Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 13
    .line 14
    sget-object v1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Closed:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    sget-object v1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Mute:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;->getAudioBitrate()I

    .line 31
    move-result p1

    .line 32
    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_1
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Abnormal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 42
    :cond_2
    :goto_1
    return-void
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

.method public final z(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "updateAudioStatusByVolume:[volume:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const/16 v2, 0x5d

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sget-object v1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Closed:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 40
    .line 41
    if-eq v0, v1, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->a:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->c()Lkotlinx/coroutines/flow/n;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Mute:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_0
    sget-object p1, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;->Normal:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState$Status;

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 58
    :cond_1
    return-void
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
