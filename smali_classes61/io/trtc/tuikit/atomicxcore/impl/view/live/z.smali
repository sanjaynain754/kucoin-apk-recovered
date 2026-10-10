.class public abstract Lio/trtc/tuikit/atomicxcore/impl/view/live/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    const-string v1, "roomId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLiveId$atomicxcore_release(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    const-string v2, "liveId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->b:Ljava/lang/String;

    .line 5
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/i0;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/i0;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object v1

    .line 6
    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->c:Lkotlinx/coroutines/x1;

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 9
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v3, :cond_1

    .line 10
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 11
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 13
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 17
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "getStore "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " liveID is empty"

    .line 19
    const-string v6, "message"

    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 20
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 21
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9

    .line 23
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    move-object v3, v0

    .line 25
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 26
    const-string v0, "getName(...)"

    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_13

    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 29
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v4, v2

    goto/16 :goto_2

    .line 30
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 31
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 32
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 33
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 34
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 35
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 36
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 37
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 38
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 39
    :cond_12
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo p1, "type is not supported"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 40
    :cond_13
    :goto_3
    move-object v0, v4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 41
    :goto_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    move-result-object v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Ljava/lang/String;)V

    .line 42
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/live/u0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    move-result-object p1

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/t;

    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/t;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->createLive(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLiveId$atomicxcore_release(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    const-string v2, "liveId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->b:Ljava/lang/String;

    .line 47
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    move-result-object v3

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/i0;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/i0;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object v1

    .line 48
    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->c:Lkotlinx/coroutines/x1;

    .line 50
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v1

    .line 51
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v3, :cond_1

    .line 52
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 53
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 54
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 55
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 56
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_4

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 57
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 58
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "getStore "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " liveID is empty"

    .line 61
    const-string v6, "message"

    invoke-static {v2, v4, v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 62
    invoke-virtual {v3, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 63
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9

    .line 65
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 66
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    move-object v3, v0

    .line 67
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 68
    const-string v0, "getName(...)"

    invoke-static {v3, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_13

    .line 70
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 71
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v4, v2

    goto/16 :goto_2

    .line 72
    :cond_a
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 73
    :cond_b
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 74
    :cond_c
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 75
    :cond_d
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 76
    :cond_e
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 77
    :cond_f
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 78
    :cond_10
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 79
    :cond_11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 80
    :goto_2
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 81
    :cond_12
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo p1, "type is not supported"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 82
    :cond_13
    :goto_3
    move-object v0, v4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 83
    :goto_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    move-result-object v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Ljava/lang/String;)V

    .line 84
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;

    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V

    invoke-virtual {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->joinLive(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V

    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "component"

    const-string v1, "jsonStr"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 86
    const-string v2, "api"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 87
    const-string v3, "setCoHostTemplateId"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 88
    const-string v0, "params"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 89
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;

    const-string/jumbo v2, "templateId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated$Companion;->setCoHostTemplateId(I)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    .line 90
    :cond_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 91
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 92
    sput v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->k:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 93
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API callExperimentalAPI exception:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LiveCoreView-v1"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    :cond_1
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;

    return-void
.end method
