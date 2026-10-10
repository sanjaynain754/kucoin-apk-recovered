.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final b:I

.field public c:Ljava/lang/ref/WeakReference;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final f:Lio/trtc/tuikit/atomicxcore/impl/view/live/T;

.field public final g:Lio/trtc/tuikit/atomicxcore/impl/view/live/X;

.field public final h:Lio/trtc/tuikit/atomicxcore/impl/view/live/U;

.field public final i:Lio/trtc/tuikit/atomicxcore/impl/view/live/S;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    const-string v1, "AtomicXCore-Live"

    .line 8
    .line 9
    const-string v2, "LiveCoreViewImplObserverDeprecated"

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 19
    move-result v0

    .line 20
    .line 21
    iput v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->b:I

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 42
    .line 43
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 44
    .line 45
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V

    .line 49
    .line 50
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->f:Lio/trtc/tuikit/atomicxcore/impl/view/live/T;

    .line 51
    .line 52
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/X;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/X;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V

    .line 56
    .line 57
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->g:Lio/trtc/tuikit/atomicxcore/impl/view/live/X;

    .line 58
    .line 59
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/U;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V

    .line 63
    .line 64
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->h:Lio/trtc/tuikit/atomicxcore/impl/view/live/U;

    .line 65
    .line 66
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/S;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/S;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V

    .line 70
    .line 71
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->i:Lio/trtc/tuikit/atomicxcore/impl/view/live/S;

    .line 72
    return-void
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
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/P;)V
    .locals 4

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 47
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;

    if-nez v3, :cond_0

    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {p1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/P;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$BattleObserver;)V

    goto :goto_0

    .line 50
    :cond_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V
    .locals 4

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 41
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;

    if-nez v3, :cond_0

    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;->a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V

    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 6

    const-string v0, "liveId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->g:Lio/trtc/tuikit/atomicxcore/impl/view/live/X;

    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 3
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    move-result-object v1

    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->h:Lio/trtc/tuikit/atomicxcore/impl/view/live/U;

    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;)V

    .line 4
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    move-result-object v0

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->i:Lio/trtc/tuikit/atomicxcore/impl/view/live/S;

    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    .line 6
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    if-eqz v2, :cond_1

    .line 7
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 11
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 13
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_4

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_7
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "getStore "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " liveID is empty"

    .line 16
    const-string v5, "message"

    invoke-static {v1, v3, v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 17
    invoke-virtual {v2, v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 18
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_9

    .line 20
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    move-object v2, v0

    .line 22
    :cond_9
    :goto_0
    check-cast v2, Ljava/util/Map;

    .line 23
    const-string v0, "getName(...)"

    invoke-static {v2, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_13

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 26
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v3, v1

    goto/16 :goto_2

    .line 27
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 29
    :cond_c
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 30
    :cond_d
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 31
    :cond_e
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 32
    :cond_f
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 33
    :cond_10
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 34
    :cond_11
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 35
    :goto_2
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 36
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo v0, "type is not supported"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_13
    :goto_3
    move-object p1, v3

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 38
    :goto_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->f:Lio/trtc/tuikit/atomicxcore/impl/view/live/T;

    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->addGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "liveId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->g:Lio/trtc/tuikit/atomicxcore/impl/view/live/X;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveConnectionManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->h:Lio/trtc/tuikit/atomicxcore/impl/view/live/U;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager;->removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$Observer;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->i:Lio/trtc/tuikit/atomicxcore/impl/view/live/S;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    .line 33
    .line 34
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    const-class v3, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v2

    .line 55
    .line 56
    const-string v3, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 76
    throw p1

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    move-result v2

    .line 91
    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 103
    .line 104
    goto/16 :goto_4

    .line 105
    .line 106
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 110
    throw p1

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    move-result-object v4

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    move-result v2

    .line 125
    .line 126
    if-eqz v2, :cond_5

    .line 127
    .line 128
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 141
    .line 142
    .line 143
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p1

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    move-result v2

    .line 159
    .line 160
    if-eqz v2, :cond_7

    .line 161
    .line 162
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 163
    .line 164
    .line 165
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    if-eqz p1, :cond_6

    .line 169
    .line 170
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 171
    .line 172
    goto/16 :goto_4

    .line 173
    .line 174
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 175
    .line 176
    .line 177
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 178
    throw p1

    .line 179
    .line 180
    :cond_7
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 181
    .line 182
    new-instance v3, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v4, "getStore "

    .line 185
    .line 186
    .line 187
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    const-string v4, " liveID is empty"

    .line 190
    .line 191
    const-string v5, "message"

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v3, v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    move-result-object v3

    .line 196
    const/4 v4, 0x1

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 200
    .line 201
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    if-nez v2, :cond_9

    .line 208
    .line 209
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 210
    .line 211
    .line 212
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    if-nez v0, :cond_8

    .line 219
    goto :goto_0

    .line 220
    :cond_8
    move-object v2, v0

    .line 221
    .line 222
    :cond_9
    :goto_0
    check-cast v2, Ljava/util/Map;

    .line 223
    .line 224
    const-string v0, "getName(...)"

    .line 225
    .line 226
    .line 227
    invoke-static {v2, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object v0

    .line 229
    .line 230
    .line 231
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object v3

    .line 233
    .line 234
    if-nez v3, :cond_13

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 238
    move-result-object v3

    .line 239
    .line 240
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 244
    move-result-object v4

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    move-result v4

    .line 249
    .line 250
    if-eqz v4, :cond_a

    .line 251
    .line 252
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 256
    :goto_1
    move-object v3, v1

    .line 257
    .line 258
    goto/16 :goto_2

    .line 259
    .line 260
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 264
    move-result-object v4

    .line 265
    .line 266
    .line 267
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    move-result v4

    .line 269
    .line 270
    if-eqz v4, :cond_b

    .line 271
    .line 272
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 273
    .line 274
    .line 275
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 276
    goto :goto_1

    .line 277
    .line 278
    .line 279
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 280
    move-result-object v1

    .line 281
    .line 282
    .line 283
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 284
    move-result v1

    .line 285
    .line 286
    if-eqz v1, :cond_c

    .line 287
    .line 288
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 289
    .line 290
    .line 291
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 292
    goto :goto_1

    .line 293
    .line 294
    :cond_c
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 298
    move-result-object v1

    .line 299
    .line 300
    .line 301
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    move-result v1

    .line 303
    .line 304
    if-eqz v1, :cond_d

    .line 305
    .line 306
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 307
    .line 308
    .line 309
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 310
    goto :goto_1

    .line 311
    .line 312
    :cond_d
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 316
    move-result-object v1

    .line 317
    .line 318
    .line 319
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    move-result v1

    .line 321
    .line 322
    if-eqz v1, :cond_e

    .line 323
    .line 324
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 325
    .line 326
    .line 327
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 328
    goto :goto_1

    .line 329
    .line 330
    :cond_e
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 334
    move-result-object v1

    .line 335
    .line 336
    .line 337
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    move-result v1

    .line 339
    .line 340
    if-eqz v1, :cond_f

    .line 341
    .line 342
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 343
    .line 344
    .line 345
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 346
    goto :goto_1

    .line 347
    .line 348
    :cond_f
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 352
    move-result-object v1

    .line 353
    .line 354
    .line 355
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    move-result v1

    .line 357
    .line 358
    if-eqz v1, :cond_10

    .line 359
    .line 360
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 361
    .line 362
    .line 363
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 364
    goto :goto_1

    .line 365
    .line 366
    :cond_10
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 370
    move-result-object v1

    .line 371
    .line 372
    .line 373
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    move-result v1

    .line 375
    .line 376
    if-eqz v1, :cond_11

    .line 377
    .line 378
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 379
    .line 380
    .line 381
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 382
    goto :goto_1

    .line 383
    .line 384
    :cond_11
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 388
    move-result-object v1

    .line 389
    .line 390
    .line 391
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    move-result v1

    .line 393
    .line 394
    if-eqz v1, :cond_12

    .line 395
    .line 396
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 397
    .line 398
    .line 399
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    goto/16 :goto_1

    .line 402
    .line 403
    .line 404
    :goto_2
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    goto :goto_3

    .line 406
    .line 407
    :cond_12
    new-instance p1, Ljava/lang/Exception;

    .line 408
    .line 409
    .line 410
    const-string/jumbo v0, "type is not supported"

    .line 411
    .line 412
    .line 413
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 414
    throw p1

    .line 415
    :cond_13
    :goto_3
    move-object p1, v3

    .line 416
    .line 417
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 418
    .line 419
    :goto_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->f:Lio/trtc/tuikit/atomicxcore/impl/view/live/T;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->removeGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    .line 423
    return-void
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
