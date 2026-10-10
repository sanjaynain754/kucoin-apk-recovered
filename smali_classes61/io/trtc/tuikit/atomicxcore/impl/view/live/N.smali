.class public abstract Lio/trtc/tuikit/atomicxcore/impl/view/live/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "oid:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", createTUIVideoViewByUserId userId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",seatInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 263
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 264
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-nez p1, :cond_0

    .line 266
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;-><init>(Landroid/content/Context;)V

    .line 267
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p0

    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p1

    .line 268
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-nez p2, :cond_2

    .line 269
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;-><init>(Landroid/content/Context;)V

    .line 270
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object p2
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p1

    instance-of v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;

    iget v2, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;->b:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;->b:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 27
    iget v3, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;->b:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v3

    .line 29
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const-string/jumbo v8, "type is not supported"

    const-class v9, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    const-class v10, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    const-class v12, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    const-class v13, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    const-class v15, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    const-class v16, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    const-class v17, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    const-string v4, "getName(...)"

    move/from16 v18, v6

    const-string v6, "message"

    move-object/from16 v19, v7

    const-string v7, " liveID is empty"

    move-object/from16 v20, v9

    const-string v9, "getStore "

    const-class v21, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    move-object/from16 v22, v10

    const-string v10, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    move-object/from16 v23, v11

    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    if-eqz v18, :cond_4

    .line 30
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-object/from16 v18, v12

    move-object/from16 v24, v13

    goto/16 :goto_4

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object/from16 v18, v12

    .line 31
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v24, v13

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 32
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    goto/16 :goto_4

    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 34
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_7

    goto/16 :goto_4

    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 35
    :cond_8
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 36
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    goto/16 :goto_4

    :cond_9
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_a
    iget-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 38
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    invoke-static {v5, v12, v7, v10, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    .line 40
    invoke-virtual {v10, v13, v12}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 41
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_c

    .line 43
    new-instance v10, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v10}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    invoke-virtual {v0, v3, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_1

    :cond_b
    move-object v10, v0

    .line 45
    :cond_c
    :goto_1
    check-cast v10, Ljava/util/Map;

    .line 46
    invoke-static {v10, v5, v4}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_16

    .line 48
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    .line 49
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 50
    :cond_d
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 51
    :cond_e
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 52
    :cond_f
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 53
    :cond_10
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 54
    :cond_11
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 55
    :cond_12
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 56
    :cond_13
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_14

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 57
    :cond_14
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v12, v3}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 58
    :goto_2
    invoke-interface {v10, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 59
    :cond_15
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_16
    :goto_3
    move-object v0, v12

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 61
    :goto_4
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v10

    .line 62
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v12, :cond_18

    .line 63
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_17

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    move-object/from16 v19, v0

    goto/16 :goto_8

    :cond_17
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v13}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_18
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v0

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 65
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_19

    move-object v3, v0

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_8

    :cond_19
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v13}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_1a
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 67
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_1b

    move-object v3, v0

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_8

    :cond_1b
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v13}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_1c
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 69
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_1d

    goto/16 :goto_8

    :cond_1d
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v13}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_1e
    iget-object v0, v3, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    invoke-static {v11, v5, v7, v0, v6}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v13, 0x1

    .line 73
    invoke-virtual {v0, v13, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 74
    iget-object v0, v3, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    invoke-virtual {v0, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_20

    .line 76
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 77
    invoke-virtual {v0, v10, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    goto :goto_5

    :cond_1f
    move-object v3, v0

    .line 78
    :cond_20
    :goto_5
    check-cast v3, Ljava/util/Map;

    .line 79
    invoke-static {v3, v11, v4}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2a

    .line 81
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 82
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 83
    :cond_21
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 84
    :cond_22
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 85
    :cond_23
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 86
    :cond_24
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 87
    :cond_25
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 88
    :cond_26
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_27

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 89
    :cond_27
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_6

    .line 90
    :cond_28
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v4, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 91
    :goto_6
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 92
    :cond_29
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_2a
    :goto_7
    move-object v3, v4

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 94
    :goto_8
    invoke-virtual/range {v19 .. v19}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/C;

    move-object/from16 v5, p0

    invoke-direct {v4, v5, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/C;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V

    const/4 v13, 0x1

    iput v13, v1, Lio/trtc/tuikit/atomicxcore/impl/view/live/B;->b:I

    invoke-interface {v0, v4, v1}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2b

    return-object v2

    :cond_2b
    :goto_9
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    .line 259
    const-string p0, ""

    return-object p0

    .line 260
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;->getMixStreamUserId()Ljava/lang/String;

    move-result-object v0

    .line 406
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 407
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v1

    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {v1, v0, v3, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 408
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 409
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 410
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v3

    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 411
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    goto :goto_0

    .line 412
    :cond_1
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v3

    sget-object v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {v3, v1, v4, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    goto :goto_0

    .line 413
    :cond_2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 414
    :cond_3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 415
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    :cond_4
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintSet;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintSet;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/ConstraintSet;->clone(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getViewWidth$atomicxcore_release()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getViewHeight$atomicxcore_release()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 4
    iget-object v2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 5
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v2

    int-to-float v2, v2

    .line 6
    iget-object v3, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 7
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 8
    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v5, v1, v5}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIII)V

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {v0, p2, v4, v1, v4}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIII)V

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-string p2, ""

    invoke-virtual {v0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintSet;->setDimensionRatio(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    cmpl-float v1, v2, v1

    const/16 v2, 0x3a

    if-ltz v1, :cond_1

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v5}, Landroidx/constraintlayout/widget/ConstraintSet;->clear(II)V

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "H,"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    iget-object v3, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 15
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 17
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintSet;->setDimensionRatio(ILjava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v4}, Landroidx/constraintlayout/widget/ConstraintSet;->clear(II)V

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "W,"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    iget-object v3, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 22
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 24
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintSet;->setDimensionRatio(ILjava/lang/String;)V

    .line 26
    :goto_0
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/ConstraintSet;->applyTo(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V
    .locals 12

    .line 221
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "oid:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", addBackgroundWidgetsView:region"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    const-string v3, "message"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 223
    invoke-virtual {v0, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 224
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBackgroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;

    if-nez v0, :cond_4

    .line 225
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v5, "getContext(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v1, v5, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 226
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 227
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v5, " userInfo:"

    const-string v6, " view:"

    const-string/jumbo v7, "user"

    const-string/jumbo v8, "view"

    const/4 v9, 0x0

    const/4 v10, -0x1

    if-eqz v1, :cond_1

    .line 228
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", createCoGuestView BACKGROUND userInfo:"

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 231
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->BACKGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    invoke-interface {v1, p1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createCoGuestView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;

    move-result-object v9

    :cond_0
    if-eqz v9, :cond_3

    .line 232
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "addCoGuestView OID:"

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v7, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->a:I

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 236
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->c:Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 237
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 238
    invoke-virtual {v0, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 239
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", createCoHostView BACKGROUND userInfo:"

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 242
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 243
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->BACKGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    .line 244
    invoke-interface {v1, p1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createCoHostView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;

    move-result-object v9

    :cond_2
    if-eqz v9, :cond_3

    .line 245
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "addCoHostView OID:"

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v7, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->a:I

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 249
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;->c:Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 250
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 251
    invoke-virtual {v0, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBackgroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 254
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getZorder()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getElevationBaseline$atomicxcore_release()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 255
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 256
    :cond_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", addBackgroundWidgetsView backgroundView has been added to mBackgroundViewMap. :backgroundView"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    invoke-virtual {p1, v4, p0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Ljava/util/List;)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string/jumbo v4, "view"

    const-string v5, ", createBattleView battleUser:"

    const-string/jumbo v6, "type is not supported"

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    const-string v8, "<this>"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "inviter"

    move-object/from16 v9, p1

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "invitees"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "oid:"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ", onBattleStart"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    const-string v12, "message"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    .line 273
    invoke-virtual {v8, v13, v10}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 274
    sget-object v8, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v8

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v10

    .line 275
    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    const-class v16, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-class v15, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    const-class v17, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    const-class v18, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    const-class v19, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    const-class v20, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    const-class v21, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    const-string v3, "getName(...)"

    const-string v13, " liveID is empty"

    move/from16 v22, v2

    const-string v2, "getStore "

    const-class v23, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    const-class v24, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    const-class v25, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    move-object/from16 v26, v7

    const-string v7, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    const-class v9, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    if-eqz v22, :cond_1

    .line 276
    sget-object v8, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v8

    if-eqz v8, :cond_0

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    move-object/from16 v27, v4

    move-object/from16 v22, v15

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object/from16 v22, v15

    .line 277
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v27, v4

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 278
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v4

    if-eqz v4, :cond_2

    move-object v8, v4

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_3

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 279
    :cond_3
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 280
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v4

    if-eqz v4, :cond_4

    move-object v8, v4

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_3

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 281
    :cond_5
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 282
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v4

    if-eqz v4, :cond_6

    move-object v8, v4

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_3

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 283
    :cond_7
    iget-object v4, v8, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 284
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    invoke-static {v14, v7, v13, v4, v12}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v15, 0x1

    .line 286
    invoke-virtual {v4, v15, v7}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 287
    iget-object v4, v8, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 288
    invoke-virtual {v4, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_9

    .line 289
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 290
    invoke-virtual {v4, v10, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_0

    :cond_8
    move-object v7, v4

    .line 291
    :cond_9
    :goto_0
    check-cast v7, Ljava/util/Map;

    .line 292
    invoke-static {v7, v14, v3}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 293
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_13

    .line 294
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    .line 295
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 296
    :cond_a
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 297
    :cond_b
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 298
    :cond_c
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 299
    :cond_d
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 300
    :cond_e
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 301
    :cond_f
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 302
    :cond_10
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 303
    :cond_11
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v8, v10}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 304
    :goto_1
    invoke-interface {v7, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 305
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_13
    :goto_2
    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 307
    :goto_3
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v4

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v7

    .line 308
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v15, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    if-eqz v10, :cond_15

    .line 309
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v2

    if-eqz v2, :cond_14

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_7

    :cond_14
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :cond_15
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v16, v14

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_17

    .line 311
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v2

    if-eqz v2, :cond_16

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_7

    :cond_16
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_17
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    .line 313
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v2

    if-eqz v2, :cond_18

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_7

    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :cond_19
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1b

    .line 315
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v2

    if-eqz v2, :cond_1a

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_7

    :cond_1a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v15}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    :cond_1b
    iget-object v10, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 317
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    invoke-static {v9, v14, v13, v10, v12}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v15, 0x1

    .line 319
    invoke-virtual {v10, v15, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 320
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 321
    invoke-virtual {v2, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1d

    .line 322
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 323
    invoke-virtual {v2, v7, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1c

    goto :goto_4

    :cond_1c
    move-object v4, v2

    .line 324
    :cond_1d
    :goto_4
    check-cast v4, Ljava/util/Map;

    .line 325
    invoke-static {v4, v9, v3}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 326
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_27

    .line 327
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 328
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1e

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 329
    :cond_1e
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1f

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 330
    :cond_1f
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_20

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 331
    :cond_20
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_21

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 332
    :cond_21
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 333
    :cond_22
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 334
    :cond_23
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 335
    :cond_24
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 336
    :cond_25
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_26

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v3, v7}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 337
    :goto_5
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 338
    :cond_26
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 339
    :cond_27
    :goto_6
    move-object v2, v3

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 340
    :goto_7
    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 341
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object v3

    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_28

    const/4 v15, 0x1

    .line 342
    invoke-virtual {v0, v15}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setBattleStartedWaitingSEI$atomicxcore_release(Z)V

    .line 343
    :cond_28
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v3

    if-eqz v3, :cond_34

    .line 344
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_29

    .line 345
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", onBattleStart battleUserList is null"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x1

    .line 347
    invoke-virtual {v1, v15, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    .line 348
    :cond_29
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->getCoHostState()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;->getConnected()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_31

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 349
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    move-result-object v4

    .line 350
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v6

    invoke-static {v4}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;

    .line 351
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    .line 353
    invoke-virtual {v6, v9, v7}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 354
    const-string v6, "battleUserInfo"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    invoke-direct {v6}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;-><init>()V

    .line 356
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->roomId:Ljava/lang/String;

    .line 357
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userId:Ljava/lang/String;

    .line 358
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->userName:Ljava/lang/String;

    .line 359
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;->avatarUrl:Ljava/lang/String;

    .line 360
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v7

    if-eqz v7, :cond_2a

    new-instance v28, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    const/16 v33, 0xb

    const/16 v34, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v2

    invoke-direct/range {v28 .. v34}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;-><init>(IZLio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v28

    invoke-interface {v7, v9}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createBattleView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Landroid/view/View;

    move-result-object v7

    goto :goto_9

    :cond_2a
    move-object v7, v3

    :goto_9
    if-eqz v4, :cond_30

    if-eqz v7, :cond_30

    move-object/from16 v9, v27

    .line 361
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "user"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "addBattleView OID:"

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v13, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->a:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, " view:"

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " userInfo:"

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    .line 364
    invoke-virtual {v2, v13, v10}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 365
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    goto :goto_a

    :cond_2b
    move-object v2, v3

    :goto_a
    if-eqz v2, :cond_2f

    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2c

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_2c

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_b

    :cond_2c
    move-object v2, v3

    :goto_b
    if-eqz v2, :cond_2f

    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_c

    :cond_2d
    move-object v2, v3

    :goto_c
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 366
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2e

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/view/View;

    :cond_2e
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 367
    :cond_2f
    iput-object v6, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleUser;

    .line 368
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->c:Ljava/lang/ref/WeakReference;

    .line 369
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v2, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 370
    invoke-virtual {v4, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_d
    move-object/from16 v27, v9

    goto/16 :goto_8

    :cond_30
    move-object/from16 v9, v27

    const/4 v6, -0x1

    .line 371
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",foregroundView:#"

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",battleView#"

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    .line 373
    invoke-virtual {v3, v13, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    goto :goto_d

    :cond_31
    move-object/from16 v9, v27

    .line 374
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", createBattleContainerView"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    .line 376
    invoke-virtual {v1, v13, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 377
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_32

    invoke-interface {v1}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createBattleContainerView()Landroid/view/View;

    move-result-object v3

    :cond_32
    if-eqz v3, :cond_34

    .line 378
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 379
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getCanvas()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 380
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object v4

    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    move-result-object v4

    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 381
    invoke-direct {v1, v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/o1;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;Ljava/util/List;)V

    .line 382
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "seatLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 385
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    const v5, 0x7fffffff

    .line 386
    iput v5, v2, Landroid/graphics/Rect;->left:I

    .line 387
    iput v5, v2, Landroid/graphics/Rect;->top:I

    const/4 v13, 0x0

    .line 388
    iput v13, v2, Landroid/graphics/Rect;->right:I

    .line 389
    iput v13, v2, Landroid/graphics/Rect;->bottom:I

    .line 390
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_33

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 391
    iget v6, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getX()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    iput v6, v2, Landroid/graphics/Rect;->left:I

    .line 392
    iget v6, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getY()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    iput v6, v2, Landroid/graphics/Rect;->top:I

    .line 393
    iget v6, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getX()I

    move-result v7

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v8

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    move-result v8

    add-int/2addr v8, v7

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v2, Landroid/graphics/Rect;->right:I

    .line 394
    iget v6, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getY()I

    move-result v7

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v5

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    move-result v5

    add-int/2addr v5, v7

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v2, Landroid/graphics/Rect;->bottom:I

    goto :goto_e

    .line 395
    :cond_33
    iget v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;->c:I

    int-to-float v4, v4

    .line 396
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 397
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v1

    .line 398
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v4

    float-to-int v5, v5

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v4

    float-to-int v6, v6

    invoke-direct {v1, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 399
    iget v5, v2, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    mul-float/2addr v5, v4

    float-to-int v5, v5

    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 400
    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    mul-float/2addr v2, v4

    float-to-int v2, v2

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 401
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "addFillScreenView OID:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;->a:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " l:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",t:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",w:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",h:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    .line 403
    invoke-virtual {v2, v13, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 404
    invoke-virtual {v0, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_34
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V
    .locals 13

    .line 95
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/live/Z0;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)Z

    move-result v0

    .line 96
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "oid:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", updateSeatLayout,isFullScreenLayout:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isFullScreenLayout$atomicxcore_release()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ",currentIsFullScreen:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    const-string v4, "message"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 98
    invoke-virtual {v1, v5, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isFullScreenLayout$atomicxcore_release()Z

    move-result v1

    if-eq v1, v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 101
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 102
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 103
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 104
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 106
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setFullScreenLayout$atomicxcore_release(Z)V

    .line 107
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->setTemplate(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 108
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->setTemplate(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 109
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->setTemplate(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 110
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 111
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 112
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    if-eqz v0, :cond_7

    .line 113
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 114
    iget-object v7, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 115
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 116
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    move-result v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    move-result v10

    if-ne v9, v10, :cond_2

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v9

    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v10

    invoke-virtual {v10}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_1

    :cond_3
    move-object v8, v2

    :goto_1
    if-nez v8, :cond_1

    .line 117
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", removeSeatRegionView:region"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-virtual {v7, v5, v8}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 120
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->d(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 121
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", removeVideoView:region"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {v7, v5, v8}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 124
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 125
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-static {v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-eqz v7, :cond_4

    .line 126
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v8

    .line 127
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v8

    if-eq v8, v1, :cond_4

    .line 128
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 129
    :cond_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-static {v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 130
    :cond_5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v8

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-eqz v7, :cond_6

    .line 131
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v8

    .line 132
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v8

    if-eq v8, v1, :cond_6

    .line 133
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 134
    :cond_6
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v8

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    :goto_2
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->e(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    goto/16 :goto_0

    .line 136
    :cond_7
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 137
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 138
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    move-result-object v7

    if-eqz v7, :cond_14

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    move-result-object v7

    if-eqz v7, :cond_9

    .line 139
    iget-object v7, v7, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    goto :goto_4

    :cond_9
    move-object v7, v2

    :goto_4
    if-nez v7, :cond_a

    goto/16 :goto_8

    .line 140
    :cond_a
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 141
    iget-object v7, v7, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 142
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 143
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    move-result v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    move-result v10

    if-ne v9, v10, :cond_b

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v9

    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v10

    invoke-virtual {v10}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_5

    :cond_c
    move-object v8, v2

    .line 144
    :goto_5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", updateSeatLayout,isSame:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, ",oldRegion:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ",newRegion:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    invoke-virtual {v7, v5, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    if-nez v8, :cond_d

    .line 147
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    goto/16 :goto_3

    :cond_d
    if-eqz v6, :cond_e

    .line 148
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    goto :goto_6

    :cond_e
    move v7, v5

    :goto_6
    if-nez v7, :cond_8

    .line 149
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", updateSeatRegionView:oldRegion"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-virtual {v7, v5, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 152
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", updateBackgroundWidgetsView:region"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {v7, v5, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 155
    invoke-static {p0, v8}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->d(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 156
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 157
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", updateVideoView:oldSeatInfo"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ",newSeatInfo:"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    invoke-virtual {v7, v5, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 160
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoPlaceHolderMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-static {v8}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-nez v7, :cond_f

    .line 161
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v7

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v9

    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    :cond_f
    if-nez v7, :cond_10

    .line 162
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v7

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object v7

    .line 163
    :cond_10
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v9

    .line 164
    iget-object v9, v9, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v11

    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    .line 165
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v9

    invoke-virtual {v9, v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    goto :goto_7

    .line 166
    :cond_11
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v9

    .line 167
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v11

    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {v9, v11, v12, v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 168
    :goto_7
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v11

    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v9

    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    .line 170
    invoke-virtual {v7, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 171
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v9

    .line 172
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v9

    if-eq v9, v1, :cond_12

    .line 173
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v9

    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 174
    :cond_12
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v9

    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 175
    :cond_13
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", updateForegroundWidgetsView:region"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    invoke-virtual {v7, v5, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 178
    invoke-static {p0, v8}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->e(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 179
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    goto/16 :goto_3

    .line 180
    :cond_14
    :goto_8
    invoke-static {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    goto/16 :goto_3

    .line 181
    :cond_15
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLastSeatLayout$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 182
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v0

    .line 183
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    if-eqz v2, :cond_17

    .line 184
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_16

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_d

    :cond_16
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 185
    :cond_17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 186
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_18

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_d

    :cond_18
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 187
    :cond_19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    .line 188
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_1a

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_d

    :cond_1a
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 189
    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 190
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_1c

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_d

    :cond_1c
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 191
    :cond_1d
    iget-object v2, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 192
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "getStore "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " liveID is empty"

    .line 193
    invoke-static {v1, v6, v7, v2, v4}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 194
    invoke-virtual {v2, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 195
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1f

    .line 197
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1e

    goto :goto_9

    :cond_1e
    move-object v2, p1

    .line 199
    :cond_1f
    :goto_9
    check-cast v2, Ljava/util/Map;

    .line 200
    const-string p1, "getName(...)"

    invoke-static {v2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 201
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_29

    .line 202
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 203
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_a
    move-object v4, v1

    goto/16 :goto_b

    .line 204
    :cond_20
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 205
    :cond_21
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 206
    :cond_22
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 207
    :cond_23
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 208
    :cond_24
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 209
    :cond_25
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 210
    :cond_26
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_a

    .line 211
    :cond_27
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_a

    .line 212
    :goto_b
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 213
    :cond_28
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo p1, "type is not supported"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 214
    :cond_29
    :goto_c
    move-object p1, v4

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 215
    :goto_d
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_2a

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->isBattleStartedWaitingSEI$atomicxcore_release()Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 216
    invoke-virtual {p0, v5}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setBattleStartedWaitingSEI$atomicxcore_release(Z)V

    .line 217
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getCurrentBattleInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 218
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 219
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v1, v3, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 220
    invoke-static {p0, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Ljava/util/List;)V

    :cond_2a
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Z)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "streamType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    const-string p2, "_feedback_"

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v1, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p2

    .line 417
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz p3, :cond_2

    if-eqz p2, :cond_0

    .line 418
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p2

    .line 419
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 420
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;->getTUIVideoView()Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object v1

    .line 421
    invoke-virtual {p2, p1, p3, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 422
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;->setMixStreamUserId(Ljava/lang/String;)V

    .line 423
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->muteRemoteAudioStream(Ljava/lang/String;Z)V

    goto :goto_0

    .line 424
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getTuiVideoViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    if-nez p2, :cond_1

    .line 425
    invoke-static {p0, p1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object p2

    .line 426
    :cond_1
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p3

    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {p3, p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 427
    :goto_0
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p2

    .line 428
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/H;

    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/H;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 429
    invoke-virtual {p2, p1, p3, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    return-void

    .line 430
    :cond_2
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object p0

    sget-object p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

    :cond_3
    return-void
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v1, 0x0

    .line 2
    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 3
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 4
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 5
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 6
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 7
    const-string v1, ""

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->dimensionRatio:Ljava/lang/String;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setFullScreenLayout$atomicxcore_release(Z)V

    return-object v0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;

    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 9
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 10
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    .line 11
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    if-eqz v5, :cond_4

    .line 12
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 13
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 14
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 16
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_7

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    goto/16 :goto_5

    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 17
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 18
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_9

    goto/16 :goto_5

    :cond_9
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 19
    :cond_a
    iget-object v5, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 20
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "getStore "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " liveID is empty"

    .line 21
    const-string v8, "message"

    invoke-static {v4, v6, v7, v5, v8}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 22
    invoke-virtual {v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 23
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_c

    .line 25
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    invoke-virtual {p1, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    move-object v5, p1

    .line 27
    :cond_c
    :goto_1
    check-cast v5, Ljava/util/Map;

    .line 28
    const-string p1, "getName(...)"

    invoke-static {v5, v4, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_16

    .line 30
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 31
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v6, v4

    goto/16 :goto_3

    .line 32
    :cond_d
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 33
    :cond_e
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 34
    :cond_f
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 35
    :cond_10
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 36
    :cond_11
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 37
    :cond_12
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 38
    :cond_13
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 39
    :cond_14
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 40
    :goto_3
    invoke-interface {v5, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 41
    :cond_15
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo p1, "type is not supported"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 42
    :cond_16
    :goto_4
    move-object p1, v6

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 43
    :goto_5
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;

    invoke-direct {v4, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/D;->b:I

    invoke-interface {v2, v4, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_17

    return-object v1

    :cond_17
    :goto_6
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V
    .locals 11

    .line 44
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "oid:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", addBackgroundWidgetsView:region"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    const-string v3, "message"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 46
    invoke-virtual {v0, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;

    if-nez v0, :cond_4

    .line 48
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v5, "getContext(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 50
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v5, " view:"

    const-string v6, "seatInfo"

    const-string/jumbo v7, "view"

    const/4 v8, 0x0

    const/4 v9, -0x1

    if-eqz v1, :cond_1

    .line 51
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", createCoGuestView FOREGROUND:userInfo"

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->FOREGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    invoke-interface {v1, p1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createCoGuestView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;

    move-result-object v8

    :cond_0
    if-eqz v8, :cond_3

    .line 55
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "addCoGuestView OID:"

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v6, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->a:I

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " seatInfo:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 59
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 60
    invoke-virtual {v0, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", createCoHostView FOREGROUND:userInfo"

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getVideoViewAdapter$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->FOREGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    invoke-interface {v1, p1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;->createCoHostView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;

    move-result-object v8

    :cond_2
    if-eqz v8, :cond_3

    .line 65
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "addCoHostView OID:"

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v6, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;->a:I

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " userInfo:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 69
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 70
    invoke-virtual {v0, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 73
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getZorder()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getElevationBaseline$atomicxcore_release()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 74
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 75
    :cond_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", addForegroundWidgetsView foregroundView has been added to foregroundViewMap. :foregroundView"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1, v4, p0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;

    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object p1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    .line 21
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    if-eqz v5, :cond_4

    .line 22
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_5

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 23
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 24
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_5

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 25
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 26
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object p1

    if-eqz p1, :cond_7

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_5

    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 27
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 28
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object p1

    if-eqz p1, :cond_9

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_5

    :cond_9
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 29
    :cond_a
    iget-object v5, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 30
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "getStore "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " liveID is empty"

    .line 31
    const-string v8, "message"

    invoke-static {v4, v6, v7, v5, v8}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 32
    invoke-virtual {v5, v3, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 33
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_c

    .line 35
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 36
    invoke-virtual {p1, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    move-object v5, p1

    .line 37
    :cond_c
    :goto_1
    check-cast v5, Ljava/util/Map;

    .line 38
    const-string p1, "getName(...)"

    invoke-static {v5, v4, p1}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_16

    .line 40
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 41
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v6, v4

    goto/16 :goto_3

    .line 42
    :cond_d
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 43
    :cond_e
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 44
    :cond_f
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 45
    :cond_10
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 46
    :cond_11
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 47
    :cond_12
    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 48
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 49
    :cond_14
    const-class v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 50
    :goto_3
    invoke-interface {v5, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 51
    :cond_15
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo p1, "type is not supported"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 52
    :cond_16
    :goto_4
    move-object p1, v6

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 53
    :goto_5
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;

    invoke-direct {v4, p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/F;->b:I

    invoke-interface {v2, v4, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_17

    return-object v1

    :cond_17
    :goto_6
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LiveCoreView new OID:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",roomId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 4
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLayoutMixStreamLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;)V

    .line 5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 6
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMixStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/d;

    move-result-object v0

    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLayoutMultiStreamLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V

    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 9
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLayoutBackgroundWidgetsLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V

    .line 11
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 12
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLayoutForegroundWidgetsLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;)V

    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 15
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v0

    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLayoutBattleWidgetsLayerLayer$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;)V

    .line 17
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    move-result-object v0

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 18
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBattleWidgetsLayerLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/b;

    move-result-object v0

    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V
    .locals 5

    .line 54
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "oid:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", addSeatRegionView:region"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    const-string v3, "message"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 56
    invoke-virtual {v0, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 57
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 58
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", addVideoView:region"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v0, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;

    move-result-object v0

    .line 62
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomEngineImpl;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v1

    .line 63
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 64
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 66
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v1

    .line 67
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {v1, v2, v3, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 68
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutMultiStreamLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 71
    :goto_1
    invoke-static {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->b(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    return-void
.end method

.method public static final d(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "unsubscribeDataAfterEnterRoom new OID:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",liveId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 3
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getSubscribeStateAfterEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v3, v1, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLiveCoreViewImplObserver$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLiveCoreViewImplObserver$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 6
    :cond_1
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLiveCoreViewImplObserver$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/O;)V

    .line 7
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_17

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    move-result-object v4

    .line 9
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    if-eqz v6, :cond_3

    .line 10
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_3

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 11
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_3

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 13
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_3

    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_7
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto/16 :goto_3

    :cond_8
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 17
    :cond_9
    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 18
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "getStore "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, " liveID is empty"

    .line 19
    invoke-static {v5, v7, v8, v6, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-virtual {v6, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 21
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_b

    .line 23
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    invoke-virtual {v0, v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    move-object v1, v0

    .line 25
    :cond_b
    :goto_0
    check-cast v1, Ljava/util/Map;

    .line 26
    const-string v0, "getName(...)"

    invoke-static {v1, v5, v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_15

    .line 28
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 29
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 30
    :cond_c
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 31
    :cond_d
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 32
    :cond_e
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 33
    :cond_f
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 34
    :cond_10
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 35
    :cond_11
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 36
    :cond_12
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 37
    :cond_13
    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 38
    :goto_1
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 39
    :cond_14
    new-instance p0, Ljava/lang/Exception;

    const-string/jumbo v0, "type is not supported"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 40
    :cond_15
    :goto_2
    move-object v0, v2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 41
    :goto_3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBattleListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBattleListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->removeBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 42
    :cond_16
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setBattleListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;)V

    .line 43
    :cond_17
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLeaveRoomListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 44
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v0

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLeaveRoomListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    move-result-object v1

    .line 45
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 46
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLeaveRoomListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;)V

    :cond_18
    return-void
.end method

.method public static final d(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V
    .locals 3

    .line 48
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "oid:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", removeBackgroundWidgetsView:region"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBackgroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/a;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 54
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutBackgroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 55
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBackgroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    move-result-object p0

    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "oid:"

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, ", removeForegroundWidgetsView:region"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    const-string v2, "message"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/c;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 66
    move-result v1

    .line 67
    const/4 v2, -0x1

    .line 68
    .line 69
    if-eq v1, v2, :cond_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLayoutForegroundWidgetsLayer$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getForegroundViewMap$atomicxcore_release()Ljava/util/HashMap;

    .line 80
    move-result-object p0

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method
