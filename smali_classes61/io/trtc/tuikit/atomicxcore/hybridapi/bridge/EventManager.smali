.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&JJ\u0010\'\u001a\u00020(\"\u0008\u0008\u0000\u0010)*\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0\n2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0.H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u00100\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&J6\u00101\u001a\u00020(\"\u0008\u0008\u0000\u0010)*\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0\nH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;",
        "",
        "eventEmitter",
        "Lkotlin/Function2;",
        "",
        "",
        "(Lkotlin/jvm/functions/Function2;)V",
        "audioEffectDispatcher",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;",
        "barrageDispatcherMap",
        "",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BarrageDispatcher;",
        "baseBeautyDispatcher",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;",
        "battleDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;",
        "coGuestDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;",
        "coHostDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;",
        "deviceDispatcher",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;",
        "giftDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;",
        "likeDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LikeDispatcher;",
        "liveAudienceDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher;",
        "liveListDispatcher",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;",
        "liveSeatDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;",
        "liveSummaryDispatcherMap",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSummaryDispatcher;",
        "loginDispatcher",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;",
        "addListener",
        "key",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
        "addListenerForMapStore",
        "",
        "T",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
        "storeName",
        "map",
        "factory",
        "Lkotlin/Function1;",
        "getStoreObserver",
        "removeListener",
        "removeListenerForMapStore",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private audioEffectDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final barrageDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BarrageDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private baseBeautyDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final battleDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final coGuestDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final coHostDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private deviceDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final eventEmitter:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final giftDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final likeDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LikeDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final liveAudienceDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private liveListDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final liveSeatDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final liveSummaryDispatcherMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSummaryDispatcher;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private loginDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "eventEmitter"

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
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->likeDispatcherMap:Ljava/util/Map;

    .line 16
    .line 17
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->giftDispatcherMap:Ljava/util/Map;

    .line 23
    .line 24
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->battleDispatcherMap:Ljava/util/Map;

    .line 30
    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coGuestDispatcherMap:Ljava/util/Map;

    .line 37
    .line 38
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coHostDispatcherMap:Ljava/util/Map;

    .line 44
    .line 45
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 49
    .line 50
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveAudienceDispatcherMap:Ljava/util/Map;

    .line 51
    .line 52
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 56
    .line 57
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSeatDispatcherMap:Ljava/util/Map;

    .line 58
    .line 59
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSummaryDispatcherMap:Ljava/util/Map;

    .line 65
    .line 66
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->barrageDispatcherMap:Ljava/util/Map;

    .line 72
    .line 73
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 74
    return-void
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
.end method

.method public static final synthetic access$getEventEmitter$p(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

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
.end method

.method private final addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
            ">(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+TT;>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result p2

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getRoomID()Ljava/lang/String;

    .line 16
    move-result-object p2

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    return v0

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-interface {p4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p4

    .line 33
    move-object v1, p4

    .line 34
    .line 35
    check-cast v1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;

    .line 36
    .line 37
    .line 38
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->addListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V

    .line 42
    return v0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method private final getStoreObserver(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "LiveListStore"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveListDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 19
    .line 20
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveListDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveListDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;

    .line 28
    return-object p1

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-string v1, "DeviceStore"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->deviceDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    new-instance p1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;

    .line 47
    .line 48
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 52
    .line 53
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->deviceDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;

    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->deviceDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;

    .line 56
    return-object p1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    const-string v1, "BaseBeautyStore"

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->baseBeautyDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;

    .line 71
    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    new-instance p1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;

    .line 75
    .line 76
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    .line 79
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->baseBeautyDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;

    .line 82
    .line 83
    :cond_4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->baseBeautyDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;

    .line 84
    return-object p1

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    const-string v1, "AudioEffectStore"

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    move-result v0

    .line 95
    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->audioEffectDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;

    .line 99
    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    new-instance p1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;

    .line 103
    .line 104
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 105
    .line 106
    .line 107
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->audioEffectDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;

    .line 110
    .line 111
    :cond_6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->audioEffectDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;

    .line 112
    return-object p1

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    const-string v0, "LoginStore"

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    move-result p1

    .line 123
    .line 124
    if-eqz p1, :cond_9

    .line 125
    .line 126
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->loginDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;

    .line 127
    .line 128
    if-nez p1, :cond_8

    .line 129
    .line 130
    new-instance p1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;

    .line 131
    .line 132
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->eventEmitter:Lkotlin/jvm/functions/Function2;

    .line 133
    .line 134
    .line 135
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->loginDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;

    .line 138
    .line 139
    :cond_8
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->loginDispatcher:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;

    .line 140
    return-object p1

    .line 141
    :cond_9
    const/4 p1, 0x0

    .line 142
    return-object p1
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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method private final removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
            ">(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getStore()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result p2

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getRoomID()Ljava/lang/String;

    .line 16
    move-result-object p2

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    return v0

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    return v0

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->removeListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->hasListeners()Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-interface {p3, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_3
    return v0
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
.end method


# virtual methods
.method public final addListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->likeDispatcherMap:Ljava/util/Map;

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$1;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 13
    .line 14
    const-string v2, "LikeStore"

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->giftDispatcherMap:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 30
    .line 31
    const-string v2, "GiftStore"

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->battleDispatcherMap:Ljava/util/Map;

    .line 42
    .line 43
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$3;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$3;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 47
    .line 48
    const-string v2, "BattleStore"

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coGuestDispatcherMap:Ljava/util/Map;

    .line 58
    .line 59
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$4;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$4;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 63
    .line 64
    const-string v2, "CoGuestStore"

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coHostDispatcherMap:Ljava/util/Map;

    .line 74
    .line 75
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$5;

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$5;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 79
    .line 80
    const-string v2, "CoHostStore"

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 84
    move-result v0

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveAudienceDispatcherMap:Ljava/util/Map;

    .line 90
    .line 91
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$6;

    .line 92
    .line 93
    .line 94
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$6;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 95
    .line 96
    const-string v2, "LiveAudienceStore"

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSeatDispatcherMap:Ljava/util/Map;

    .line 106
    .line 107
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$7;

    .line 108
    .line 109
    .line 110
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$7;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 111
    .line 112
    const-string v2, "LiveSeatStore"

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 116
    move-result v0

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :cond_6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSummaryDispatcherMap:Ljava/util/Map;

    .line 122
    .line 123
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$8;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$8;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 127
    .line 128
    const-string v2, "LiveSummaryStore"

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    goto :goto_0

    .line 136
    .line 137
    :cond_7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->barrageDispatcherMap:Ljava/util/Map;

    .line 138
    .line 139
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$9;

    .line 140
    .line 141
    .line 142
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$9;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V

    .line 143
    .line 144
    const-string v2, "BarrageStore"

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, p1, v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z

    .line 148
    move-result v0

    .line 149
    .line 150
    if-eqz v0, :cond_8

    .line 151
    goto :goto_0

    .line 152
    .line 153
    .line 154
    :cond_8
    invoke-direct {p0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->getStoreObserver(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->addListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V

    .line 161
    :cond_9
    :goto_0
    return-void
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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public final removeListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V
    .locals 2
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->likeDispatcherMap:Ljava/util/Map;

    .line 8
    .line 9
    const-string v1, "LikeStore"

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->giftDispatcherMap:Ljava/util/Map;

    .line 19
    .line 20
    const-string v1, "GiftStore"

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->battleDispatcherMap:Ljava/util/Map;

    .line 30
    .line 31
    const-string v1, "BattleStore"

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coGuestDispatcherMap:Ljava/util/Map;

    .line 41
    .line 42
    const-string v1, "CoGuestStore"

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->coHostDispatcherMap:Ljava/util/Map;

    .line 52
    .line 53
    const-string v1, "CoHostStore"

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveAudienceDispatcherMap:Ljava/util/Map;

    .line 63
    .line 64
    const-string v1, "LiveAudienceStore"

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSeatDispatcherMap:Ljava/util/Map;

    .line 74
    .line 75
    const-string v1, "LiveSeatStore"

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 79
    move-result v0

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->liveSummaryDispatcherMap:Ljava/util/Map;

    .line 85
    .line 86
    const-string v1, "LiveSummaryStore"

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->barrageDispatcherMap:Ljava/util/Map;

    .line 96
    .line 97
    const-string v1, "BarrageStore"

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->removeListenerForMapStore(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/util/Map;)Z

    .line 101
    move-result v0

    .line 102
    .line 103
    if-eqz v0, :cond_8

    .line 104
    goto :goto_0

    .line 105
    .line 106
    .line 107
    :cond_8
    invoke-direct {p0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->getStoreObserver(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_9

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->removeListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V

    .line 114
    :cond_9
    :goto_0
    return-void
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
