.class public final Ljumio/liveness/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/liveness/LivenessUX$RunHandler;


# instance fields
.field public final a:Lcom/jumio/core/scope/ScopeProviderInterface;

.field public b:Lcom/jumio/liveness/DaClient2;

.field public c:Lcom/jumio/liveness/LivenessUX;

.field public d:Ljumio/liveness/y;

.field public e:Ljumio/liveness/B;

.field public f:Ljumio/liveness/r;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljumio/liveness/d;

.field public final k:Ljumio/liveness/J;

.field public final l:Ljumio/liveness/s;

.field public final m:Ljava/util/concurrent/ConcurrentHashMap;

.field public n:Lcom/jumio/core/sensors/SensorProxy;


# direct methods
.method public constructor <init>(Lcom/jumio/core/scope/ScopeProviderInterface;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "scopeProvider"

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
    iput-object p1, p0, Ljumio/liveness/n;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 11
    .line 12
    sget-object p1, Ljumio/liveness/r;->b:Ljumio/liveness/r;

    .line 13
    .line 14
    iput-object p1, p0, Ljumio/liveness/n;->f:Ljumio/liveness/r;

    .line 15
    .line 16
    new-instance p1, Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    iput-object p1, p0, Ljumio/liveness/n;->g:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    iput-object p1, p0, Ljumio/liveness/n;->h:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    iput-object p1, p0, Ljumio/liveness/n;->i:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance p1, Ljumio/liveness/d;

    .line 38
    .line 39
    new-instance v0, Ljumio/liveness/e;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljumio/liveness/e;-><init>(Ljumio/liveness/n;)V

    .line 43
    .line 44
    new-instance v1, Ljumio/liveness/f;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, p0}, Ljumio/liveness/f;-><init>(Ljumio/liveness/n;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0, v1}, Ljumio/liveness/d;-><init>(Ljumio/liveness/e;Ljumio/liveness/f;)V

    .line 51
    .line 52
    iput-object p1, p0, Ljumio/liveness/n;->j:Ljumio/liveness/d;

    .line 53
    .line 54
    new-instance p1, Ljumio/liveness/J;

    .line 55
    .line 56
    new-instance v0, Ljumio/liveness/i;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, p0}, Ljumio/liveness/i;-><init>(Ljumio/liveness/n;)V

    .line 60
    .line 61
    new-instance v1, Ljumio/liveness/j;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p0}, Ljumio/liveness/j;-><init>(Ljumio/liveness/n;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, v0, v1}, Ljumio/liveness/J;-><init>(Ljumio/liveness/i;Ljumio/liveness/j;)V

    .line 68
    .line 69
    iput-object p1, p0, Ljumio/liveness/n;->k:Ljumio/liveness/J;

    .line 70
    .line 71
    new-instance p1, Ljumio/liveness/s;

    .line 72
    .line 73
    .line 74
    invoke-direct {p1}, Ljumio/liveness/s;-><init>()V

    .line 75
    .line 76
    iput-object p1, p0, Ljumio/liveness/n;->l:Ljumio/liveness/s;

    .line 77
    .line 78
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    .line 81
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    .line 83
    iput-object p1, p0, Ljumio/liveness/n;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    return-void
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

.method public static final a(Lcom/jumio/core/models/TimeModel;ILjava/util/List;)Lkotlin/Unit;
    .locals 13

    const-string v0, "$this$SensorProxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v1, Lcom/jumio/core/sensors/SensorConfig;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/sensors/SensorConfig;-><init>(Lcom/jumio/core/models/TimeModel;I[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->LINEAR_ACCELEROMETER:Lcom/jumio/core/sensors/SensorType;

    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->GYROSCOPE:Lcom/jumio/core/sensors/SensorType;

    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->LIGHT:Lcom/jumio/core/sensors/SensorType;

    new-instance v7, Lcom/jumio/core/sensors/SensorConfig;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v8, v2

    invoke-direct/range {v7 .. v12}, Lcom/jumio/core/sensors/SensorConfig;-><init>(Lcom/jumio/core/models/TimeModel;I[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1, v7}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Ljumio/liveness/n;Landroid/hardware/SensorEvent;)Lkotlin/Unit;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    iget-object p0, p0, Ljumio/liveness/n;->b:Lcom/jumio/liveness/DaClient2;

    if-eqz p0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1}, Lcom/jumio/liveness/DaClient2;->sendSensorEvent(JLandroid/hardware/SensorEvent;)V

    .line 103
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Ljumio/liveness/n;Lcom/jumio/liveness/DaClient2$Event;)V
    .locals 13

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p1}, Lcom/jumio/liveness/DaClient2$Event;->getAttributes()[Lkotlin/Pair;

    move-result-object p1

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_19

    aget-object v4, p1, v3

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    .line 4
    instance-of v6, v4, Ljava/lang/String;

    if-nez v6, :cond_0

    goto/16 :goto_9

    .line 5
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    const-string v6, "display_message"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_7

    .line 6
    :cond_1
    check-cast v4, Ljava/lang/String;

    .line 7
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_1

    goto/16 :goto_1

    :sswitch_1
    const-string v5, "face_stop_movement"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_1

    :sswitch_2
    const-string v5, "more_captures_needed"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_1

    .line 8
    :cond_2
    invoke-virtual {p0}, Ljumio/liveness/n;->a()Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 9
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getNextPosition()I

    move-result v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 10
    :sswitch_3
    const-string v5, "face_keep_center_severe"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_1

    :sswitch_4
    const-string v5, "face_move_closer"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_1

    .line 11
    :cond_3
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceCloser()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 12
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 13
    :sswitch_5
    const-string v5, "face_keep_center"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_1

    .line 14
    :cond_4
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getCenterFace()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 15
    :sswitch_6
    const-string/jumbo v5, "start"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_1

    :sswitch_7
    const-string v5, "face_move_away"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_1

    .line 16
    :cond_5
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTooClose()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 17
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 18
    :sswitch_8
    const-string v5, "face_tilt_right"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_1

    .line 19
    :cond_6
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltRight()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 20
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 21
    :sswitch_9
    const-string v5, "face_none_detected"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_1

    .line 22
    :cond_7
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceIntoFrame()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 23
    :sswitch_a
    const-string v5, "face_not_upright"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_1

    .line 24
    :cond_8
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getLevelEyesAndDevice()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 25
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 26
    :sswitch_b
    const-string v5, "face_tilt_up"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_1

    .line 27
    :cond_9
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltUp()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 28
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 29
    :sswitch_c
    const-string v5, "face_tilt_left"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_1

    .line 30
    :cond_a
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltLeft()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 31
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 32
    :sswitch_d
    const-string v5, "face_tilt_down"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_1

    .line 33
    :cond_b
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltDown()I

    move-result v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 34
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 35
    :sswitch_e
    const-string v5, "face_hold_still"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    .line 36
    :goto_1
    const-string/jumbo v5, "unhandled display command: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "DefaultDaClient"

    invoke-static {v5, v4}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 37
    :cond_c
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 38
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    move-result v6

    .line 39
    iget-object v4, p0, Ljumio/liveness/n;->e:Ljumio/liveness/B;

    const/4 v11, 0x0

    if-eqz v4, :cond_d

    .line 40
    iget-object v4, v4, Ljumio/liveness/B;->b:Lcom/jumio/core/models/LivenessSettingsModel;

    if-eqz v4, :cond_d

    .line 41
    invoke-virtual {v4}, Lcom/jumio/core/models/LivenessSettingsModel;->getMinTimePerDistanceInMs()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v7, v4

    goto :goto_2

    :cond_d
    move-object v7, v11

    :goto_2
    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 42
    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 43
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 44
    iget-object v4, p0, Ljumio/liveness/n;->d:Ljumio/liveness/y;

    if-nez v4, :cond_e

    const-string v4, "livenessProcessorCallback"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    move-object v11, v4

    :goto_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    new-instance v4, Ljumio/liveness/u;

    iget-object v5, v11, Ljumio/liveness/y;->a:Ljumio/liveness/z;

    invoke-direct {v4, v5}, Ljumio/liveness/u;-><init>(Ljumio/liveness/z;)V

    .line 46
    invoke-virtual {v4}, Ljumio/liveness/u;->invoke()Ljava/lang/Object;

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_8

    .line 47
    :sswitch_f
    const-string v6, "camera_command"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto/16 :goto_7

    .line 48
    :cond_f
    check-cast v4, Ljava/lang/String;

    .line 49
    const-string v5, "lock_exposure_and_white_balance"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 50
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getLockExposureAndWhiteBalance()I

    move-result v7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 51
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    goto/16 :goto_8

    .line 52
    :cond_10
    const-string/jumbo v5, "unlock_exposure_and_white_balance"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    .line 53
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getLockExposureAndWhiteBalance()I

    move-result v6

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    .line 54
    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    goto/16 :goto_8

    .line 55
    :sswitch_10
    const-string v6, "photinus_color"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    goto/16 :goto_7

    .line 56
    :cond_11
    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    .line 57
    const-string v4, ","

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 58
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 60
    check-cast v6, Ljava/lang/String;

    .line 61
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 62
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 63
    :cond_12
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v6, 0x3

    if-ne v4, v6, :cond_14

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_5

    .line 64
    :cond_13
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/4 v8, 0x2

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/16 v8, 0xff

    int-to-float v8, v8

    mul-float/2addr v4, v8

    float-to-int v4, v4

    mul-float/2addr v6, v8

    float-to-int v6, v6

    mul-float/2addr v8, v5

    float-to-int v5, v8

    .line 65
    invoke-static {v4, v6, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    goto :goto_6

    :cond_14
    :goto_5
    move v4, v2

    .line 66
    :goto_6
    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const-string v6, "#%08X"

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "format(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Converted color "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " -> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;)V

    .line 68
    sget-object v6, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v5, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v5}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getUpdateColor()I

    move-result v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    goto/16 :goto_8

    .line 69
    :sswitch_11
    const-string/jumbo v6, "step_name"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    goto :goto_7

    .line 70
    :cond_15
    check-cast v4, Ljava/lang/String;

    .line 71
    const-string v5, "Distance captured: "

    iget-object v6, p0, Ljumio/liveness/n;->g:Ljava/lang/Object;

    monitor-enter v6

    .line 72
    :try_start_0
    const-string v7, "DefaultDaClient"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    sget-object v5, Ljumio/liveness/r;->a:Lcom/jumio/liveness/data/Distance$Companion;

    invoke-virtual {v5, v4}, Lcom/jumio/liveness/data/Distance$Companion;->fromStepName(Ljava/lang/String;)Ljumio/liveness/r;

    move-result-object v4

    iput-object v4, p0, Ljumio/liveness/n;->f:Ljumio/liveness/r;

    .line 74
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    monitor-exit v6

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object p0, v0

    monitor-exit v6

    throw p0

    .line 76
    :sswitch_12
    const-string/jumbo v6, "ui_command"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    .line 77
    :goto_7
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Unhandled attribute: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " with value: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "DefaultDaClient"

    invoke-static {v5, v4}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 78
    :cond_16
    check-cast v4, Ljava/lang/String;

    .line 79
    const-string v5, "hint_move_away"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    sget-object v4, Ljumio/liveness/r;->d:Ljumio/liveness/r;

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Ljumio/liveness/r;)V

    goto :goto_8

    .line 80
    :cond_17
    const-string v5, "hint_move_closer"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    sget-object v4, Ljumio/liveness/r;->c:Ljumio/liveness/r;

    invoke-virtual {p0, v4}, Ljumio/liveness/n;->a(Ljumio/liveness/r;)V

    :cond_18
    :goto_8
    add-int/2addr v3, v0

    goto/16 :goto_0

    :cond_19
    :goto_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3ad7c0a0 -> :sswitch_12
        0x50288c1e -> :sswitch_11
        0x508b5844 -> :sswitch_10
        0x79205431 -> :sswitch_f
        0x7a63dd8a -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x69d2beb6 -> :sswitch_e
        -0x5bf3067e -> :sswitch_d
        -0x5bef8b19 -> :sswitch_c
        -0x4ef26485 -> :sswitch_b
        -0x31dd03ed -> :sswitch_a
        -0x2bc906b9 -> :sswitch_9
        -0x21ab76c4 -> :sswitch_8
        -0x326a4c6 -> :sswitch_7
        0x68ac462 -> :sswitch_6
        0x17db1f6d -> :sswitch_5
        0x2ec476c6 -> :sswitch_4
        0x5687db86 -> :sswitch_3
        0x69df555d -> :sswitch_2
        0x72a1cdea -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Lcom/jumio/core/extraction/ExtractionUpdateInterface;
    .locals 5

    .line 104
    iget-object v0, p0, Ljumio/liveness/n;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 105
    :try_start_0
    sget-object v1, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 106
    sget-object v2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getShotTaken()I

    move-result v2

    .line 107
    iget-object v3, p0, Ljumio/liveness/n;->l:Ljumio/liveness/s;

    iget-object v4, p0, Ljumio/liveness/n;->f:Ljumio/liveness/r;

    invoke-virtual {v3, v4}, Ljumio/liveness/s;->a(Ljumio/liveness/r;)Lcom/jumio/analytics/MetaInfo;

    move-result-object v3

    const/4 v4, 0x0

    .line 108
    invoke-virtual {v1, v2, v4, v3}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build(ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final a(Landroid/content/Context;Lcom/jumio/core/models/TimeModel;)V
    .locals 3

    .line 88
    iget-object v0, p0, Ljumio/liveness/n;->e:Ljumio/liveness/B;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, v0, Ljumio/liveness/B;->a:Lcom/jumio/core/MobileContext;

    if-eqz v0, :cond_0

    .line 90
    const-string v1, "android.permission.HIGH_SAMPLING_RATE_SENSORS"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 91
    :goto_0
    new-instance v1, Lcom/jumio/core/sensors/SensorProxy;

    .line 92
    new-instance v2, Lmg0/a;

    invoke-direct {v2, p2, v0}, Lmg0/a;-><init>(Lcom/jumio/core/models/TimeModel;I)V

    .line 93
    invoke-direct {v1, v2}, Lcom/jumio/core/sensors/SensorProxy;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 94
    sget-object p2, Lcom/jumio/core/sensors/SensorType;->LINEAR_ACCELEROMETER:Lcom/jumio/core/sensors/SensorType;

    sget-object v0, Lcom/jumio/core/sensors/SensorType;->GYROSCOPE:Lcom/jumio/core/sensors/SensorType;

    filled-new-array {p2, v0}, [Lcom/jumio/core/sensors/SensorType;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lmg0/b;

    invoke-direct {v0, p0}, Lmg0/b;-><init>(Ljumio/liveness/n;)V

    invoke-virtual {v1, p2, v0}, Lcom/jumio/core/sensors/SensorProxy;->setCallback(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 95
    invoke-virtual {v1, p1}, Lcom/jumio/core/sensors/SensorProxy;->start(Landroid/content/Context;)V

    .line 96
    iput-object v1, p0, Ljumio/liveness/n;->n:Lcom/jumio/core/sensors/SensorProxy;

    return-void
.end method

.method public final a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 10

    .line 112
    iget-object v0, p0, Ljumio/liveness/n;->l:Ljumio/liveness/s;

    monitor-enter v0

    .line 113
    :try_start_0
    const-string/jumbo v1, "updateState"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 115
    sget-object v3, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceIntoFrame()I

    move-result v4

    if-ne v1, v4, :cond_0

    const-string v1, "noFace"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 116
    :cond_0
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getCenterFace()I

    move-result v4

    if-ne v1, v4, :cond_1

    const-string v1, "centerFace"

    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTooClose()I

    move-result v4

    if-ne v1, v4, :cond_2

    const-string v1, "faceTooClose"

    goto :goto_0

    .line 118
    :cond_2
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceCloser()I

    move-result v4

    if-ne v1, v4, :cond_3

    const-string v1, "moveFaceCloser"

    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getLevelEyesAndDevice()I

    move-result v4

    if-ne v1, v4, :cond_4

    const-string v1, "levelEyesAndDevice"

    goto :goto_0

    .line 120
    :cond_4
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltUp()I

    move-result v4

    if-ne v1, v4, :cond_5

    const-string/jumbo v1, "tiltFaceUp"

    goto :goto_0

    .line 121
    :cond_5
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltDown()I

    move-result v4

    if-ne v1, v4, :cond_6

    const-string/jumbo v1, "tiltFaceDown"

    goto :goto_0

    .line 122
    :cond_6
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltLeft()I

    move-result v4

    if-ne v1, v4, :cond_7

    const-string/jumbo v1, "tiltFaceLeft"

    goto :goto_0

    .line 123
    :cond_7
    invoke-virtual {v3}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltRight()I

    move-result v3

    if-ne v1, v3, :cond_8

    const-string/jumbo v1, "tiltFaceRight"

    goto :goto_0

    .line 124
    :cond_8
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v3}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    move-result v3

    if-ne v1, v3, :cond_9

    const-string v1, "holdStill"

    goto :goto_0

    :cond_9
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_a

    goto :goto_2

    .line 125
    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 126
    iget-object v5, v0, Ljumio/liveness/s;->a:Ljava/lang/String;

    if-eqz v5, :cond_c

    .line 127
    iget-object v6, v0, Ljumio/liveness/s;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_1

    :cond_b
    const-wide/16 v6, 0x0

    .line 128
    :goto_1
    iget-object v8, v0, Ljumio/liveness/s;->b:Ljava/lang/Long;

    if-eqz v8, :cond_c

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    sub-long v8, v3, v8

    add-long/2addr v8, v6

    .line 129
    iget-object v6, v0, Ljumio/liveness/s;->c:Ljava/util/LinkedHashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Ljumio/liveness/s;->b:Ljava/lang/Long;

    .line 131
    iput-object v1, v0, Ljumio/liveness/s;->a:Ljava/lang/String;

    .line 132
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 133
    :cond_d
    :goto_2
    monitor-exit v0

    .line 134
    :goto_3
    iget-object v0, p0, Ljumio/liveness/n;->d:Ljumio/liveness/y;

    if-nez v0, :cond_e

    const-string v0, "livenessProcessorCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_e
    move-object v2, v0

    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    new-instance v0, Ljumio/liveness/x;

    iget-object v1, v2, Ljumio/liveness/y;->a:Ljumio/liveness/z;

    invoke-direct {v0, v1}, Ljumio/liveness/x;-><init>(Ljumio/liveness/z;)V

    .line 136
    invoke-virtual {v0, p1}, Ljumio/liveness/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 137
    :goto_5
    monitor-exit v0

    throw p1
.end method

.method public final a(Ljumio/liveness/r;)V
    .locals 6

    .line 110
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const p1, 0x3f4ccccd    # 0.8f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f200000    # 0.625f

    goto :goto_0

    :cond_1
    const p1, 0x3f366666    # 0.7125f

    .line 111
    :goto_0
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getResetOverlay()I

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljumio/liveness/n;->a(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void
.end method

.method public final a(Ljumio/liveness/y;Ljumio/liveness/B;)V
    .locals 7

    const-string v0, "livenessProcessorCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "livenessProcessorConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Ljumio/liveness/n;->c()V

    .line 82
    iput-object p1, p0, Ljumio/liveness/n;->d:Ljumio/liveness/y;

    .line 83
    iput-object p2, p0, Ljumio/liveness/n;->e:Ljumio/liveness/B;

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Starting "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Ljumio/liveness/z;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DefaultDaClient"

    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    sget-object v0, Ljumio/liveness/r;->b:Ljumio/liveness/r;

    invoke-virtual {p0, v0}, Ljumio/liveness/n;->a(Ljumio/liveness/r;)V

    .line 86
    iget-object v0, p0, Ljumio/liveness/n;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 87
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v4, Ljumio/liveness/m;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, p1, v0}, Ljumio/liveness/m;-><init>(Ljumio/liveness/n;Ljumio/liveness/B;Ljumio/liveness/y;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final b()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/n;->d:Ljumio/liveness/y;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/liveness/n;->e:Ljumio/liveness/B;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Ljumio/liveness/n;->h:Ljava/lang/Object;

    .line 12
    monitor-enter v0

    .line 13
    .line 14
    :try_start_0
    iget-object v2, p0, Ljumio/liveness/n;->b:Lcom/jumio/liveness/DaClient2;

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/jumio/liveness/DaClient2;->isClosed()Z

    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_3

    .line 28
    :cond_0
    move v2, v1

    .line 29
    :goto_0
    monitor-exit v0

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Ljumio/liveness/n;->i:Ljava/lang/Object;

    .line 34
    monitor-enter v0

    .line 35
    .line 36
    :try_start_1
    iget-object v2, p0, Ljumio/liveness/n;->c:Lcom/jumio/liveness/LivenessUX;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/jumio/liveness/LivenessUX;->isClosed()Z

    .line 42
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    if-nez v2, :cond_1

    .line 45
    move v2, v3

    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception v1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    move v2, v1

    .line 50
    :goto_1
    monitor-exit v0

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    return v3

    .line 54
    :goto_2
    monitor-exit v0

    .line 55
    throw v1

    .line 56
    :goto_3
    monitor-exit v0

    .line 57
    throw v1

    .line 58
    :cond_2
    return v1
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

.method public final c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/n;->n:Lcom/jumio/core/sensors/SensorProxy;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljumio/liveness/n;->e()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljumio/liveness/n;->d()V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-object v0, p0, Ljumio/liveness/n;->e:Ljumio/liveness/B;

    .line 17
    .line 18
    iget-object v0, p0, Ljumio/liveness/n;->l:Ljumio/liveness/s;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljumio/liveness/s;->a()V

    .line 22
    .line 23
    iget-object v0, p0, Ljumio/liveness/n;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

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

.method public final d()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/n;->h:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Ljumio/liveness/n;->b:Lcom/jumio/liveness/DaClient2;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/jumio/liveness/DaClient2;->stop()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/jumio/liveness/DaClient2;->setEventHandler(Lcom/jumio/liveness/DaClient2$EventHandler;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/jumio/liveness/DaClient2;->close()V

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    :goto_0
    iput-object v2, p0, Ljumio/liveness/n;->b:Lcom/jumio/liveness/DaClient2;

    .line 23
    .line 24
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0

    .line 28
    throw v1
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

.method public final e()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/n;->i:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Ljumio/liveness/n;->c:Lcom/jumio/liveness/LivenessUX;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/jumio/liveness/LivenessUX;->setEventHandler(Lcom/jumio/liveness/LivenessUX$EventHandler;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/jumio/liveness/LivenessUX;->close()V

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    iput-object v2, p0, Ljumio/liveness/n;->c:Lcom/jumio/liveness/LivenessUX;

    .line 20
    .line 21
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0

    .line 25
    throw v1
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
.end method

.method public final onFinishRun(Ljava/lang/Exception;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "onFinishRun: Exception="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    const/4 v6, 0x0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v6

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    const/4 v4, 0x4

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    const-string v2, "DefaultDaClient"

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lcom/jumio/commons/log/Log;->logThreadInfoWithMessage$default(Lcom/jumio/commons/log/Log;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/commons/log/LogLevel;ILjava/lang/Object;)V

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Ljumio/liveness/n;->d:Ljumio/liveness/y;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "livenessProcessorCallback"

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 45
    move-object v0, v6

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    new-instance v1, Ljumio/liveness/v;

    .line 51
    .line 52
    iget-object v0, v0, Ljumio/liveness/y;->a:Ljumio/liveness/z;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v0}, Ljumio/liveness/v;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljumio/liveness/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    iget-object p1, p0, Ljumio/liveness/n;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    new-instance v3, Ljumio/liveness/k;

    .line 67
    .line 68
    .line 69
    invoke-direct {v3, p0, v6}, Ljumio/liveness/k;-><init>(Ljumio/liveness/n;Lkotlin/coroutines/Continuation;)V

    .line 70
    const/4 v4, 0x3

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v1, 0x0

    .line 73
    const/4 v2, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 77
    return-void

    .line 78
    .line 79
    :cond_2
    iget-object p1, p0, Ljumio/liveness/n;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    new-instance v3, Ljumio/liveness/l;

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, p0, v6}, Ljumio/liveness/l;-><init>(Ljumio/liveness/n;Lkotlin/coroutines/Continuation;)V

    .line 89
    const/4 v4, 0x3

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v1, 0x0

    .line 92
    const/4 v2, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 96
    return-void
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
