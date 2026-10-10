.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
.super Ljava/lang/Object;
.source "AnchorStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 Q2\u00020\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010\'\u001a\u00020%J\u0006\u0010(\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020\u0015J\u0006\u0010*\u001a\u00020\u0017J\u0006\u0010+\u001a\u00020\u0019J\u0006\u0010,\u001a\u00020\u001bJ\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\tJ\u000e\u00108\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u00109\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020#J\u000e\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020%2\u0008\u0010B\u001a\u0004\u0018\u00010CJ\u0008\u0010D\u001a\u00020%H\u0002J\u0006\u0010E\u001a\u00020%J\u0010\u0010F\u001a\u00020%2\u0008\u0008\u0002\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020%2\u0006\u0010J\u001a\u00020KJ\u0014\u0010M\u001a\u00020%2\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u00020P0OR$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u0008j\u0008\u0012\u0004\u0012\u00020\t`\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u0008j\u0008\u0012\u0004\u0012\u00020\t`\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "<init>",
        "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V",
        "_lockAudioUserList",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Ljava/util/LinkedHashSet;",
        "",
        "Lkotlin/collections/LinkedHashSet;",
        "_lockVideoUserList",
        "state",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;",
        "liveAudienceStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;",
        "liveSummaryStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;",
        "logger",
        "Lcom/trtc/uikit/livekit/common/LiveKitLogger;",
        "userStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;",
        "mediaStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;",
        "anchorCoHostStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;",
        "anchorBattleStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;",
        "listenerDispatcher",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/dispatcher/AnchorViewListenerDispatcher;",
        "roomEngineObserver",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/RoomEngineObserver;",
        "imFriendshipListener",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/IMFriendshipListener;",
        "externalState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorBoardcastState;",
        "addObserver",
        "",
        "removeObserver",
        "destroy",
        "getLiveAudienceStore",
        "getUserStore",
        "getMediaStore",
        "getAnchorCoHostStore",
        "getAnchorBattleStore",
        "getState",
        "getCoHostState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;",
        "getBattleState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;",
        "getUserState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;",
        "getMediaState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;",
        "setRoomId",
        "roomId",
        "initCreateRoomState",
        "updateRoomState",
        "enablePipMode",
        "enable",
        "",
        "getExternalState",
        "setExternalState",
        "messageCount",
        "",
        "setLiveStatisticsData",
        "data",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;",
        "initExternalState",
        "notifyPictureInPictureClick",
        "notifyRoomExit",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;",
        "addAnchorViewListener",
        "listener",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;",
        "removeAnchorViewListener",
        "onSeatLockStateChanged",
        "seatList",
        "",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;",
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
        "SMAP\nAnchorStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,246:1\n230#2,5:247\n230#2,5:252\n*S KotlinDebug\n*F\n+ 1 AnchorStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore\n*L\n235#1:247,5\n243#1:252,5\n*E\n"
    }
.end annotation


# static fields
.field public static final o:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lwd0/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lwd0/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lwd0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lxd0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lyd0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lyd0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;

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

.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

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
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->a:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->b:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v2, Lwd0/i;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v3, p1, v0, v1}, Lwd0/i;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 40
    .line 41
    iput-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 42
    .line 43
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 44
    .line 45
    const-string v1, "AnchorStore"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getFeaturesLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->f:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 52
    .line 53
    new-instance v0, Lwd0/p;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0}, Lwd0/p;-><init>()V

    .line 57
    .line 58
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->g:Lwd0/p;

    .line 59
    .line 60
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;-><init>()V

    .line 64
    .line 65
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 66
    .line 67
    new-instance v1, Lwd0/f;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, p1}, Lwd0/f;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 71
    .line 72
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->i:Lwd0/f;

    .line 73
    .line 74
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 78
    .line 79
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 80
    .line 81
    new-instance v1, Lxd0/a;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1}, Lxd0/a;-><init>()V

    .line 85
    .line 86
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 87
    .line 88
    new-instance v1, Lyd0/b;

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, p0}, Lyd0/b;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V

    .line 92
    .line 93
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->l:Lyd0/b;

    .line 94
    .line 95
    new-instance v1, Lyd0/a;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, p0}, Lyd0/a;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V

    .line 99
    .line 100
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->m:Lyd0/a;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->d()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->D(Ljava/lang/String;)V

    .line 111
    .line 112
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->d:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 123
    .line 124
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore$Companion;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    iput-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->e:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->j()V

    .line 138
    const/4 v1, 0x1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->f(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->r(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 145
    .line 146
    new-instance p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 147
    .line 148
    .line 149
    invoke-direct {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;-><init>()V

    .line 150
    .line 151
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->s()V

    .line 155
    return-void
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

.method public static synthetic a(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->u(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic b(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->x(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final u(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;->u()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static synthetic w(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;->ENDED_BY_HOST:Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->v(Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;)V

    .line 10
    return-void
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
.end method

.method public static final x(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;->w(Lcom/trtc/uikit/livekit/features/anchorboardcast/a;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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
.method public final A()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->l:Lyd0/b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->m:Lyd0/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->removeFriendListener(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

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

.method public final B(I)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lwd0/i;->a()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCreateTime()J

    .line 16
    move-result-wide v3

    .line 17
    sub-long/2addr v1, v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->g(J)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 23
    int-to-long v1, p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->k(J)V

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
.end method

.method public final C(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V
    .locals 3
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 6
    .line 7
    iget v1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalViewers:I

    .line 8
    int-to-long v1, v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->l(J)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 14
    .line 15
    iget v1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalUniqueGiftSenders:I

    .line 16
    int-to-long v1, v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->i(J)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 22
    .line 23
    iget v1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalGiftCoins:I

    .line 24
    int-to-long v1, v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->h(J)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 30
    .line 31
    iget p1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;->totalLikesReceived:I

    .line 32
    int-to-long v1, p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->j(J)V

    .line 36
    return-void
    .line 37
    .line 38
    .line 39
.end method

.method public final D(Ljava/lang/String;)V
    .locals 3
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
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lwd0/i;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->f:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    move-result v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, " setRoomId:[mRoomId="

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string p1, "],mLiveObserver:"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->l:Lyd0/b;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 43
    move-result p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const/16 p1, 0x5d

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    return-void
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

.method public final E(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lwd0/i;->e(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 11
    return-void
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

.method public final c(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lxd0/a;->a(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V

    .line 11
    return-void
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

.method public final d()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->l:Lyd0/b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->m:Lyd0/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->addFriendListener(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

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

.method public final e()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->A()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->d()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;->e()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lxd0/a;->b()V

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

.method public final f(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->g(Z)V

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

.method public final g()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

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

.method public final h()Lwd0/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->i:Lwd0/f;

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

.method public final i()Lwd0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->g()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;->f()Lwd0/a;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final j()Lwd0/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lwd0/f;->b()Lwd0/e;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final k()Lcom/trtc/uikit/livekit/features/anchorboardcast/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

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

.method public final l()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->d:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

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

.method public final m()Lwd0/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;->h()Lwd0/n;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final n()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

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

.method public final o()Lwd0/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

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

.method public final p()Lwd0/o;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->q()Lwd0/p;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lwd0/p;->g()Lwd0/o;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final q()Lwd0/p;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->g:Lwd0/p;

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

.method public final r(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->f:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "initCreateRoomState roomId [roomId: "

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, ", roomName:"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveName()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lwd0/i;->f(Ljava/lang/String;)V

    .line 53
    return-void
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

.method public final s()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->g(J)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->l(J)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->k(J)V

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
.end method

.method public final t()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 3
    .line 4
    new-instance v1, Lwd0/k;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lwd0/k;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lxd0/a;->c(Lkotlin/jvm/functions/Function1;)V

    .line 11
    return-void
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

.method public final v(Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "reason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;->ENDED_BY_SERVER:Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->e:Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;->getLiveSummaryState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryState;->getSummaryData()Lkotlinx/coroutines/flow/w;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalViewers()I

    .line 31
    move-result v1

    .line 32
    int-to-long v1, v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->l(J)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalDuration()J

    .line 41
    move-result-wide v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->g(J)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalMessageSent()I

    .line 50
    move-result v1

    .line 51
    int-to-long v1, v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->k(J)V

    .line 55
    .line 56
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalGiftCoins()I

    .line 60
    move-result v1

    .line 61
    int-to-long v1, v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->h(J)V

    .line 65
    .line 66
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalGiftUniqueSenders()I

    .line 70
    move-result v1

    .line 71
    int-to-long v1, v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->i(J)V

    .line 75
    .line 76
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n:Lcom/trtc/uikit/livekit/features/anchorboardcast/a;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalLikesReceived()I

    .line 80
    move-result p1

    .line 81
    int-to-long v1, p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/a;->j(J)V

    .line 85
    .line 86
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 87
    .line 88
    new-instance v0, Lwd0/j;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, p0}, Lwd0/j;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lxd0/a;->c(Lkotlin/jvm/functions/Function1;)V

    .line 95
    return-void
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

.method public final y(Ljava/util/List;)V
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;",
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
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 27
    .line 28
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lwd0/i;->b()Lkotlinx/coroutines/flow/w;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    iget-object v3, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 55
    .line 56
    sget-object v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->CLOSED_BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 57
    .line 58
    if-ne v3, v4, :cond_1

    .line 59
    .line 60
    iget-object v3, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_1
    iget-object v3, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    :goto_1
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->a:Lkotlinx/coroutines/flow/n;

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    move-object v5, v4

    .line 77
    .line 78
    check-cast v5, Ljava/util/LinkedHashSet;

    .line 79
    .line 80
    .line 81
    invoke-interface {v3, v4, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v4

    .line 83
    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->c:Lwd0/i;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lwd0/i;->c()Lkotlinx/coroutines/flow/w;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 94
    move-result-object v2

    .line 95
    move-object v4, v2

    .line 96
    .line 97
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 98
    .line 99
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 100
    .line 101
    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->CLOSED_BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 102
    .line 103
    if-ne v2, v3, :cond_3

    .line 104
    .line 105
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 109
    goto :goto_2

    .line 110
    .line 111
    :cond_3
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 115
    .line 116
    :goto_2
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->b:Lkotlinx/coroutines/flow/n;

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-interface {v5}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 120
    move-result-object v1

    .line 121
    move-object v2, v1

    .line 122
    .line 123
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 124
    .line 125
    .line 126
    invoke-interface {v5, v1, v4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    move-result v1

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    goto :goto_0

    .line 131
    :cond_5
    return-void
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

.method public final z(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->k:Lxd0/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lxd0/a;->d(Lcom/trtc/uikit/livekit/features/anchorboardcast/n0;)V

    .line 11
    return-void
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
