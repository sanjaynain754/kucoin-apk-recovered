.class public final Lio/trtc/tuikit/atomicxcore/impl/live/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lkotlin/Lazy;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lio/trtc/tuikit/atomicxcore/impl/common/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/p1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/p1;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    const-string v0, "file"

    .line 13
    .line 14
    const-string v1, "AtomicXCore-Live"

    .line 15
    .line 16
    const-string v2, "StoreFactory"

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 23
    .line 24
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->d:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->a()V

    .line 28
    return-void
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
.end method


# virtual methods
.method public final a()Lio/trtc/tuikit/atomicxcore/impl/common/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 27

    move-object/from16 v0, p1

    const-string v1, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore"

    const-string v2, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore"

    const-string v3, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LikeStore"

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.gift.GiftStore"

    const-string v5, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore"

    const-string v6, "liveID"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const-string v9, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    const-string/jumbo v10, "type is not supported"

    const-string v11, "getName(...)"

    const-string v12, " liveID is empty"

    const-string v13, "getStore "

    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    const-class v15, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    const-class v16, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    move/from16 v17, v7

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    move-object/from16 v18, v8

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    move-object/from16 v19, v14

    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    move-object/from16 v20, v15

    const-class v15, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    move-object/from16 v21, v7

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    move-object/from16 v22, v1

    const-class v1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    move-object/from16 v23, v14

    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    move-object/from16 v24, v2

    const-class v2, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    if-eqz v17, :cond_1

    .line 3
    sget-object v17, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v17

    if-eqz v17, :cond_0

    check-cast v17, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    move-object/from16 v25, v3

    move-object/from16 v26, v6

    move-object/from16 v3, v17

    move-object/from16 v17, v15

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object/from16 v17, v15

    .line 4
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v25, v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 5
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    :goto_0
    move-object/from16 v26, v6

    goto/16 :goto_5

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 7
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_4

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 9
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_6

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 11
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_9

    .line 13
    new-instance v9, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v9}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    invoke-virtual {v3, v0, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_1

    :cond_8
    move-object v9, v3

    .line 15
    :cond_9
    :goto_1
    check-cast v9, Ljava/util/Map;

    .line 16
    invoke-static {v9, v6, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_13

    .line 18
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v26, v6

    .line 19
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v15, v6

    goto/16 :goto_3

    .line 20
    :cond_a
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 21
    :cond_b
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :cond_d
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 24
    :cond_e
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 25
    :cond_f
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 26
    :cond_10
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 27
    :cond_11
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 28
    :goto_3
    invoke-interface {v9, v3, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 29
    :cond_12
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    move-object/from16 v26, v6

    .line 30
    :goto_4
    move-object v3, v15

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 31
    :goto_5
    instance-of v6, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v6, :cond_14

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_6

    :cond_14
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_15

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    :cond_15
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore"

    if-eqz v3, :cond_17

    .line 33
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_16

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_b

    :cond_16
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_17
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 35
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_18

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_b

    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_19
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 37
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_1a

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_b

    :cond_1a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_1b
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    .line 39
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_1c

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    goto/16 :goto_b

    :cond_1c
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 40
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 41
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 42
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1f

    .line 43
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    invoke-virtual {v3, v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1e

    goto :goto_7

    :cond_1e
    move-object v6, v3

    .line 45
    :cond_1f
    :goto_7
    check-cast v6, Ljava/util/Map;

    .line 46
    invoke-static {v6, v14, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 47
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_29

    .line 48
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    .line 49
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_20

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_8
    move-object v15, v9

    goto/16 :goto_9

    .line 50
    :cond_20
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_21

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 51
    :cond_21
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 52
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 53
    :cond_23
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 54
    :cond_24
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 55
    :cond_25
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_26

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 56
    :cond_26
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_27

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 57
    :cond_27
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_28

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 58
    :goto_9
    invoke-interface {v6, v3, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 59
    :cond_28
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_29
    :goto_a
    move-object v3, v15

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 61
    :goto_b
    instance-of v6, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v6, :cond_2a

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_c

    :cond_2a
    const/4 v3, 0x0

    :goto_c
    if-eqz v3, :cond_2b

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    :cond_2b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore"

    if-eqz v3, :cond_2d

    .line 63
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_2c

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_10

    :cond_2c
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_2d
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 65
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_2e

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_10

    :cond_2e
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_2f
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_31

    .line 67
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_30

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_10

    :cond_30
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_31
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_33

    .line 69
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_32

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    goto/16 :goto_10

    :cond_32
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_33
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 71
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 72
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_35

    .line 73
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 74
    invoke-virtual {v3, v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_34

    goto :goto_d

    :cond_34
    move-object v6, v3

    .line 75
    :cond_35
    :goto_d
    check-cast v6, Ljava/util/Map;

    .line 76
    invoke-static {v6, v1, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3f

    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 79
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_36

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_e

    .line 80
    :cond_36
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_37

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_e

    .line 81
    :cond_37
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_38

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 82
    :cond_38
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_39

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 83
    :cond_39
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3a

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 84
    :cond_3a
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3b

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 85
    :cond_3b
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3c

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 86
    :cond_3c
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3d

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 87
    :cond_3d
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3e

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 88
    :goto_e
    invoke-interface {v6, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 89
    :cond_3e
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_3f
    :goto_f
    move-object v3, v9

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 91
    :goto_10
    instance-of v6, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v6, :cond_40

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_11

    :cond_40
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_41

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    :cond_41
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    if-eqz v3, :cond_43

    .line 93
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_42

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_15

    :cond_42
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_43
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_45

    .line 95
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_44

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_15

    :cond_44
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_45
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_47

    .line 97
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_46

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_15

    :cond_46
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_47
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_49

    .line 99
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_48

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    goto/16 :goto_15

    :cond_48
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_49
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 101
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 102
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_4b

    .line 103
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 104
    invoke-virtual {v3, v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4a

    goto :goto_12

    :cond_4a
    move-object v6, v3

    .line 105
    :cond_4b
    :goto_12
    check-cast v6, Ljava/util/Map;

    .line 106
    invoke-static {v6, v8, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 107
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_55

    .line 108
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 109
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4c

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_13

    .line 110
    :cond_4c
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4d

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_13

    .line 111
    :cond_4d
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4e

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 112
    :cond_4e
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4f

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 113
    :cond_4f
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_50

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 114
    :cond_50
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_51

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 115
    :cond_51
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_52

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 116
    :cond_52
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_53

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 117
    :cond_53
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_54

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 118
    :goto_13
    invoke-interface {v6, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    .line 119
    :cond_54
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_55
    :goto_14
    move-object v3, v9

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 121
    :goto_15
    instance-of v6, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v6, :cond_56

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_16

    :cond_56
    const/4 v3, 0x0

    :goto_16
    if-eqz v3, :cond_57

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 122
    :cond_57
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_59

    .line 123
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_58

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    goto/16 :goto_1a

    :cond_58
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_59
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5b

    .line 125
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_5a

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    goto/16 :goto_1a

    :cond_5a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_5b
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5d

    .line 127
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_5c

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    goto/16 :goto_1a

    :cond_5c
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_5d
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5f

    .line 129
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_5e

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    goto/16 :goto_1a

    :cond_5e
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_5f
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 131
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 132
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_61

    .line 133
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 134
    invoke-virtual {v3, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_60

    goto :goto_17

    :cond_60
    move-object v5, v3

    .line 135
    :cond_61
    :goto_17
    check-cast v5, Ljava/util/Map;

    .line 136
    invoke-static {v5, v2, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 137
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_6b

    .line 138
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 139
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_62

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_18

    .line 140
    :cond_62
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_63

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_18

    .line 141
    :cond_63
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_64

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 142
    :cond_64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_65

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 143
    :cond_65
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_66

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 144
    :cond_66
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_67

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 145
    :cond_67
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_68

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 146
    :cond_68
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_69

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_18

    .line 147
    :cond_69
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6a

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 148
    :goto_18
    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_19

    .line 149
    :cond_6a
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_6b
    :goto_19
    move-object v3, v6

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 151
    :goto_1a
    instance-of v5, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v5, :cond_6c

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_1b

    :cond_6c
    const/4 v3, 0x0

    :goto_1b
    if-eqz v3, :cond_6d

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 152
    :cond_6d
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6f

    .line 153
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_6e

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    goto/16 :goto_1f

    :cond_6e
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_6f
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_71

    .line 155
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v3

    if-eqz v3, :cond_70

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    goto/16 :goto_1f

    :cond_70
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_71
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_73

    .line 157
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v3

    if-eqz v3, :cond_72

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    goto/16 :goto_1f

    :cond_72
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_73
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_75

    .line 159
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v3

    if-eqz v3, :cond_74

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    goto/16 :goto_1f

    :cond_74
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 160
    :cond_75
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 161
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 162
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_77

    .line 163
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 164
    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_76

    goto :goto_1c

    :cond_76
    move-object v4, v3

    .line 165
    :cond_77
    :goto_1c
    check-cast v4, Ljava/util/Map;

    .line 166
    invoke-static {v4, v7, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 167
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_81

    .line 168
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    .line 169
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_78

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1d

    .line 170
    :cond_78
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_79

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1d

    .line 171
    :cond_79
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7a

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 172
    :cond_7a
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7b

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 173
    :cond_7b
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 174
    :cond_7c
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7d

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 175
    :cond_7d
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7e

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 176
    :cond_7e
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7f

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    .line 177
    :cond_7f
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_80

    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 178
    :goto_1d
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1e

    .line 179
    :cond_80
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 180
    :cond_81
    :goto_1e
    move-object v3, v5

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 181
    :goto_1f
    instance-of v4, v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v4, :cond_82

    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_20

    :cond_82
    const/4 v3, 0x0

    :goto_20
    if-eqz v3, :cond_83

    invoke-interface {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 182
    :cond_83
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_85

    .line 183
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v3

    if-eqz v3, :cond_84

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    :goto_21
    move-object v4, v3

    move-object/from16 v3, v17

    goto/16 :goto_25

    :cond_84
    new-instance v0, Ljava/lang/NullPointerException;

    move-object/from16 v3, v25

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_85
    move-object/from16 v3, v25

    .line 184
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_87

    .line 185
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v4

    if-eqz v4, :cond_86

    move-object v3, v4

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    goto :goto_21

    :cond_86
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_87
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_89

    .line 187
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v4

    if-eqz v4, :cond_88

    move-object v3, v4

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    goto :goto_21

    :cond_88
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_89
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8b

    .line 189
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v4

    if-eqz v4, :cond_8a

    move-object v3, v4

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    goto :goto_21

    :cond_8a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_8b
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 191
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 192
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8d

    .line 193
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 194
    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_8c

    goto :goto_22

    :cond_8c
    move-object v4, v3

    .line 195
    :cond_8d
    :goto_22
    check-cast v4, Ljava/util/Map;

    move-object/from16 v3, v17

    .line 196
    invoke-static {v4, v3, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 197
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_97

    .line 198
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 199
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8e

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_23

    .line 200
    :cond_8e
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8f

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_23

    .line 201
    :cond_8f
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_90

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 202
    :cond_90
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_91

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 203
    :cond_91
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_92

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 204
    :cond_92
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_93

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 205
    :cond_93
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_94

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 206
    :cond_94
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_95

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_23

    .line 207
    :cond_95
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_96

    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v6, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 208
    :goto_23
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    .line 209
    :cond_96
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_97
    :goto_24
    move-object v4, v6

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 211
    :goto_25
    instance-of v5, v4, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v5, :cond_98

    check-cast v4, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_26

    :cond_98
    const/4 v4, 0x0

    :goto_26
    if-eqz v4, :cond_99

    invoke-interface {v4, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 212
    :cond_99
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9b

    .line 213
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v4

    if-eqz v4, :cond_9a

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    :goto_27
    move-object v5, v4

    move-object/from16 v4, v23

    goto/16 :goto_2b

    :cond_9a
    new-instance v0, Ljava/lang/NullPointerException;

    move-object/from16 v4, v24

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9b
    move-object/from16 v4, v24

    .line 214
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9d

    .line 215
    sget-object v5, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v5

    if-eqz v5, :cond_9c

    move-object v4, v5

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    goto :goto_27

    :cond_9c
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :cond_9d
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9f

    .line 217
    sget-object v5, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v5

    if-eqz v5, :cond_9e

    move-object v4, v5

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    goto :goto_27

    :cond_9e
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_9f
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a1

    .line 219
    sget-object v5, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v5

    if-eqz v5, :cond_a0

    move-object v4, v5

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    goto :goto_27

    :cond_a0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_a1
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 221
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v4

    .line 222
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_a3

    .line 223
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 224
    invoke-virtual {v4, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a2

    goto :goto_28

    :cond_a2
    move-object v5, v4

    .line 225
    :cond_a3
    :goto_28
    check-cast v5, Ljava/util/Map;

    move-object/from16 v4, v23

    .line 226
    invoke-static {v5, v4, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 227
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_ad

    .line 228
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 229
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a4

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_29

    .line 230
    :cond_a4
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a5

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_29

    .line 231
    :cond_a5
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a6

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 232
    :cond_a6
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a7

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 233
    :cond_a7
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a8

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 234
    :cond_a8
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a9

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 235
    :cond_a9
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_aa

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 236
    :cond_aa
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_ab

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 237
    :cond_ab
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_ac

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 238
    :goto_29
    invoke-interface {v5, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2a

    .line 239
    :cond_ac
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_ad
    :goto_2a
    move-object v5, v9

    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 241
    :goto_2b
    instance-of v6, v5, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v6, :cond_ae

    check-cast v5, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_2c

    :cond_ae
    const/4 v5, 0x0

    :goto_2c
    if-eqz v5, :cond_af

    invoke-interface {v5, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 242
    :cond_af
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b1

    .line 243
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v1

    if-eqz v1, :cond_b0

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    goto/16 :goto_31

    :cond_b0
    new-instance v0, Ljava/lang/NullPointerException;

    move-object/from16 v5, v22

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b1
    move-object/from16 v5, v22

    .line 244
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b3

    .line 245
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v1

    if-eqz v1, :cond_b2

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    goto/16 :goto_31

    :cond_b2
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_b3
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b5

    .line 247
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v1

    if-eqz v1, :cond_b4

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    goto/16 :goto_31

    :cond_b4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_b5
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b7

    .line 249
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v1

    if-eqz v1, :cond_b6

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    goto/16 :goto_31

    :cond_b6
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :cond_b7
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(Ljava/lang/String;)V

    .line 251
    invoke-virtual/range {p0 .. p0}, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    .line 252
    invoke-virtual {v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_b9

    .line 253
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 254
    invoke-virtual {v5, v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_b8

    goto :goto_2d

    :cond_b8
    move-object v6, v5

    .line 255
    :cond_b9
    :goto_2d
    check-cast v6, Ljava/util/Map;

    move-object/from16 v5, v21

    .line 256
    invoke-static {v6, v5, v11}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 257
    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_c3

    .line 258
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    .line 259
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_ba

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_2e
    move-object v11, v1

    goto/16 :goto_2f

    .line 260
    :cond_ba
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bb

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 261
    :cond_bb
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bc

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 262
    :cond_bc
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_bd

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 263
    :cond_bd
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_be

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 264
    :cond_be
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_bf

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 265
    :cond_bf
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c0

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 266
    :cond_c0
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c1

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 267
    :cond_c1
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c2

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2e

    .line 268
    :goto_2f
    invoke-interface {v6, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_30

    .line 269
    :cond_c2
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 270
    :cond_c3
    :goto_30
    move-object v1, v11

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 271
    :goto_31
    instance-of v2, v1, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    if-eqz v2, :cond_c4

    move-object v9, v1

    check-cast v9, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    goto :goto_32

    :cond_c4
    const/4 v9, 0x0

    :goto_32
    if-eqz v9, :cond_c5

    invoke-interface {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->b(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_c5
    return-void
.end method

.method public final b()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "type is not supported"

    const-string v3, "liveID"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-eqz v3, :cond_0

    .line 3
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/trtc/tuikit/atomicxcore/impl/live/d0;

    invoke-interface {v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/live/d0;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    const-class v1, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-class v5, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    const-class v6, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    const-class v7, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    const-class v9, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    const-class v10, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    const-class v12, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    const-class v13, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    const-string v14, "getName(...)"

    const-string v15, "message"

    move/from16 v16, v3

    const-string v3, " liveID is empty"

    move-object/from16 v17, v5

    const-string v5, "getStore "

    const-class v18, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    move-object/from16 v19, v6

    const-string v6, ""

    move-object/from16 v20, v7

    const-string v7, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore"

    move-object/from16 v21, v8

    const-class v8, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    if-eqz v16, :cond_2

    .line 6
    sget-object v16, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v16

    if-eqz v16, :cond_1

    check-cast v16, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    move-object/from16 v23, v1

    move-object/from16 v22, v10

    move-object/from16 v7, v16

    move-object/from16 v16, v9

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    move-object/from16 v16, v9

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v22, v10

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 8
    sget-object v9, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v9

    if-eqz v9, :cond_3

    move-object/from16 v23, v1

    move-object v7, v9

    goto/16 :goto_6

    :cond_3
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 10
    sget-object v9, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v9

    if-eqz v9, :cond_5

    move-object v7, v9

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    :goto_1
    move-object/from16 v23, v1

    goto/16 :goto_6

    :cond_5
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 11
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 12
    sget-object v9, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v9

    if-eqz v9, :cond_7

    move-object v7, v9

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    goto :goto_1

    :cond_7
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 13
    :cond_8
    iget-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 14
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-static {v1, v9, v3, v7, v15}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    .line 16
    invoke-virtual {v7, v10, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 17
    iget-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    .line 19
    new-instance v9, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v9}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    invoke-virtual {v7, v6, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_9

    goto :goto_2

    :cond_9
    move-object v9, v7

    .line 21
    :cond_a
    :goto_2
    check-cast v9, Ljava/util/Map;

    .line 22
    invoke-static {v9, v1, v14}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 23
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_14

    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v23, v1

    .line 25
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_3
    move-object v10, v1

    goto/16 :goto_4

    .line 26
    :cond_b
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 27
    :cond_c
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 28
    :cond_d
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 29
    :cond_e
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 30
    :cond_f
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 31
    :cond_10
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 32
    :cond_11
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 33
    :cond_12
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v1, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 34
    :goto_4
    invoke-interface {v9, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 35
    :cond_13
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    move-object/from16 v23, v1

    .line 36
    :goto_5
    move-object v1, v10

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    move-object v7, v1

    .line 37
    :goto_6
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;->reset()V

    .line 38
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v7, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore"

    if-eqz v1, :cond_16

    .line 39
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v1

    if-eqz v1, :cond_15

    goto/16 :goto_a

    :cond_15
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 40
    :cond_16
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 41
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v1

    if-eqz v1, :cond_17

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    goto/16 :goto_a

    :cond_17
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 42
    :cond_18
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 43
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v1

    if-eqz v1, :cond_19

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    goto/16 :goto_a

    :cond_19
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 44
    :cond_1a
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 45
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v1

    if-eqz v1, :cond_1b

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    goto/16 :goto_a

    :cond_1b
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 46
    :cond_1c
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 47
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    invoke-static {v4, v7, v3, v1, v15}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x1

    .line 49
    invoke-virtual {v1, v10, v7}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 50
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_1e

    .line 52
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 53
    invoke-virtual {v1, v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1d

    goto :goto_7

    :cond_1d
    move-object v7, v1

    .line 54
    :cond_1e
    :goto_7
    check-cast v7, Ljava/util/Map;

    .line 55
    invoke-static {v7, v4, v14}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_28

    .line 57
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 58
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1f

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 59
    :cond_1f
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_20

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 60
    :cond_20
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_21

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 61
    :cond_21
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_22

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 62
    :cond_22
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_23

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 63
    :cond_23
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_24

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 64
    :cond_24
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_25

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 65
    :cond_25
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_26

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_8

    .line 66
    :cond_26
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_27

    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 67
    :goto_8
    invoke-interface {v7, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 68
    :cond_27
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 69
    :cond_28
    :goto_9
    move-object v1, v9

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 70
    :goto_a
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;->reset()V

    .line 71
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    if-eqz v1, :cond_2a

    .line 72
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    move-result-object v1

    if-eqz v1, :cond_29

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    goto/16 :goto_f

    :cond_29
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 73
    :cond_2a
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 74
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    move-result-object v1

    if-eqz v1, :cond_2b

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    goto/16 :goto_f

    :cond_2b
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 75
    :cond_2c
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    .line 76
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    move-result-object v1

    if-eqz v1, :cond_2d

    goto/16 :goto_f

    :cond_2d
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_2e
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    .line 78
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    move-result-object v1

    if-eqz v1, :cond_2f

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    goto/16 :goto_f

    :cond_2f
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 79
    :cond_30
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-static {v8, v4, v3, v1, v15}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x1

    .line 82
    invoke-virtual {v1, v10, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 83
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_32

    .line 85
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 86
    invoke-virtual {v1, v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_b

    :cond_31
    move-object v3, v1

    .line 87
    :cond_32
    :goto_b
    check-cast v3, Ljava/util/Map;

    .line 88
    invoke-static {v3, v8, v14}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3c

    .line 90
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 91
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_33

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    :goto_c
    move-object v4, v2

    goto/16 :goto_d

    .line 92
    :cond_33
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_34

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 93
    :cond_34
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_35

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 94
    :cond_35
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_36

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 95
    :cond_36
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_37

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 96
    :cond_37
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_38

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 97
    :cond_38
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_39

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 98
    :cond_39
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3a

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    goto :goto_c

    .line 99
    :cond_3a
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3b

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    invoke-direct {v2, v6}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    goto/16 :goto_c

    .line 100
    :goto_d
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    .line 101
    :cond_3b
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 102
    :cond_3c
    :goto_e
    move-object v1, v4

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 103
    :goto_f
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->reset()V

    return-void
.end method
