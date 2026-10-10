.class public final Lcom/jumio/core/models/LivenessSettingsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "LivenessSettingsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/LivenessSettingsModel$Companion;,
        Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 H2\u00020\u0001:\u0002HIB\u00b1\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0012H\u00c6\u0003J\t\u0010=\u001a\u00020\u0012H\u00c6\u0003J\t\u0010>\u001a\u00020\u0015H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u00b3\u0001\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\u0008\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001d\u00a8\u0006J"
    }
    d2 = {
        "Lcom/jumio/core/models/LivenessSettingsModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "frameRateThreshold",
        "",
        "samplingTimeInMs",
        "",
        "violationLimit",
        "modelInitTimeoutInMs",
        "retries",
        "minTimePerDistanceInMs",
        "maxFaceCenterDifference",
        "",
        "minimumPitch",
        "maximumPitch",
        "minimumYaw",
        "maximumYaw",
        "requiredDistanceMovementRatio",
        "portrait",
        "Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;",
        "landscape",
        "configOverride",
        "",
        "hardwareLatency",
        "delayBetweenDistanceInMs",
        "<init>",
        "(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)V",
        "getFrameRateThreshold",
        "()I",
        "getSamplingTimeInMs",
        "()J",
        "getViolationLimit",
        "getModelInitTimeoutInMs",
        "getRetries",
        "getMinTimePerDistanceInMs",
        "getMaxFaceCenterDifference",
        "()D",
        "getMinimumPitch",
        "getMaximumPitch",
        "getMinimumYaw",
        "getMaximumYaw",
        "getRequiredDistanceMovementRatio",
        "getPortrait",
        "()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;",
        "getLandscape",
        "getConfigOverride",
        "()Ljava/lang/String;",
        "getHardwareLatency",
        "getDelayBetweenDistanceInMs",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "Companion",
        "LivenessOrientationSettingsModel",
        "jumio-core_release"
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
.field public static final Companion:Lcom/jumio/core/models/LivenessSettingsModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:D

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:D

.field public final m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

.field public final n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

.field public final o:Ljava/lang/String;

.field public final p:I

.field public final q:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/LivenessSettingsModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/LivenessSettingsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/models/LivenessSettingsModel;->Companion:Lcom/jumio/core/models/LivenessSettingsModel$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 26

    const v24, 0x1ffff

    const/16 v25, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {v0 .. v25}, Lcom/jumio/core/models/LivenessSettingsModel;-><init>(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)V
    .locals 4
    .param p18    # Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p19    # Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p18

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    const-string v3, "portrait"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "landscape"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "configOverride"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 8
    iput-wide p2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 9
    iput p4, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 10
    iput-wide p5, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 11
    iput p7, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 12
    iput-wide p8, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 13
    iput-wide p10, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    move/from16 p1, p12

    .line 14
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    move/from16 p1, p13

    .line 15
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    move-wide/from16 p1, p16

    .line 18
    iput-wide p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 19
    iput-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 20
    iput-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 21
    iput-object v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    move/from16 p1, p21

    .line 22
    iput p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    move-wide/from16 p1, p22

    .line 23
    iput-wide p1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    return-void
.end method

.method public synthetic constructor <init>(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const-wide/16 v3, 0x3e8

    if-eqz v2, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v0, 0x4

    const/4 v7, 0x3

    if-eqz v2, :cond_2

    move v2, v7

    goto :goto_2

    :cond_2
    move/from16 v2, p4

    :goto_2
    and-int/lit8 v8, v0, 0x8

    if-eqz v8, :cond_3

    const-wide/16 v8, 0x1388

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p5

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v7, p7

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    goto :goto_5

    :cond_5
    move-wide/from16 v3, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const-wide v10, 0x3fc999999999999aL    # 0.2

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p10

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    const/16 v12, 0x69

    goto :goto_7

    :cond_7
    move/from16 v12, p12

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/16 v13, 0xaa

    goto :goto_8

    :cond_8
    move/from16 v13, p13

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/16 v14, 0x41

    goto :goto_9

    :cond_9
    move/from16 v14, p14

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/16 v15, 0x87

    goto :goto_a

    :cond_a
    move/from16 v15, p15

    :goto_a
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    const-wide v16, 0x3feb333333333333L    # 0.85

    goto :goto_b

    :cond_b
    move-wide/from16 v16, p16

    :goto_b
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    .line 2
    sget-object v1, Lcom/jumio/core/models/a;->a:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    goto :goto_c

    :cond_c
    move-object/from16 v1, p18

    :goto_c
    move-object/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    .line 3
    sget-object v1, Lcom/jumio/core/models/a;->b:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    goto :goto_d

    :cond_d
    move-object/from16 v1, p19

    :goto_d
    move-object/from16 p3, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    .line 4
    const-string v1, "{\"nodes\":[{\"nodeName\":\"FarNearCollector\",\"settings\":{\"image_format\":\"webp\"}},{\"nodeName\":\"UserJourneyCollector\",\"settings\":{\"image_format\":\"webp\"}}]}"

    goto :goto_e

    :cond_e
    move-object/from16 v1, p20

    :goto_e
    const v18, 0x8000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    const/16 v18, 0x4

    goto :goto_f

    :cond_f
    move/from16 v18, p21

    :goto_f
    const/high16 v19, 0x10000

    and-int v0, v0, v19

    if-eqz v0, :cond_10

    const-wide/16 v19, 0x4e2

    move-wide/from16 p23, v19

    :goto_10
    move-object/from16 p19, p2

    move-object/from16 p20, p3

    move-object/from16 p21, v1

    move/from16 p5, v2

    move-wide/from16 p9, v3

    move-wide/from16 p3, v5

    move/from16 p8, v7

    move-wide/from16 p6, v8

    move-wide/from16 p11, v10

    move/from16 p13, v12

    move/from16 p14, v13

    move/from16 p15, v14

    move/from16 p16, v15

    move-wide/from16 p17, v16

    move/from16 p22, v18

    move/from16 p2, p1

    move-object/from16 p1, p0

    goto :goto_11

    :cond_10
    move-wide/from16 p23, p22

    goto :goto_10

    .line 5
    :goto_11
    invoke-direct/range {p1 .. p24}, Lcom/jumio/core/models/LivenessSettingsModel;-><init>(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/jumio/core/models/LivenessSettingsModel;IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJILjava/lang/Object;)Lcom/jumio/core/models/LivenessSettingsModel;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-wide v9, v0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    goto :goto_5

    :cond_5
    move-wide/from16 v9, p8

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget-wide v11, v0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    goto :goto_6

    :cond_6
    move-wide/from16 v11, p10

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    iget v13, v0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    goto :goto_7

    :cond_7
    move/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget v14, v0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    goto :goto_8

    :cond_8
    move/from16 v14, p13

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget v15, v0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    goto :goto_9

    :cond_9
    move/from16 v15, p14

    :goto_9
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget v2, v0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    goto :goto_a

    :cond_a
    move/from16 v2, p15

    :goto_a
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x800

    move-wide/from16 v16, v3

    if-eqz v2, :cond_b

    iget-wide v2, v0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    goto :goto_b

    :cond_b
    move-wide/from16 v2, p16

    :goto_b
    and-int/lit16 v4, v1, 0x1000

    if-eqz v4, :cond_c

    iget-object v4, v0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    goto :goto_c

    :cond_c
    move-object/from16 v4, p18

    :goto_c
    move-wide/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p19

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p20

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget v1, v0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    goto :goto_f

    :cond_f
    move/from16 v1, p21

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p24, v18

    if-eqz v18, :cond_10

    move/from16 p6, v1

    move-object/from16 p5, v2

    iget-wide v1, v0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    move-object/from16 p20, p5

    move/from16 p22, p6

    move-wide/from16 p23, v1

    :goto_10
    move/from16 p16, p2

    move-wide/from16 p17, p3

    move-object/from16 p21, v3

    move-object/from16 p19, v4

    move/from16 p5, v5

    move-wide/from16 p6, v6

    move/from16 p8, v8

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p3, v16

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_11

    :cond_10
    move-wide/from16 p23, p22

    move/from16 p22, v1

    move-object/from16 p20, v2

    goto :goto_10

    :goto_11
    invoke-virtual/range {p1 .. p24}, Lcom/jumio/core/models/LivenessSettingsModel;->copy(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)Lcom/jumio/core/models/LivenessSettingsModel;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 3
    return v0
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
.end method

.method public final component10()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 3
    return v0
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
.end method

.method public final component11()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 3
    return v0
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
.end method

.method public final component12()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 3
    return-wide v0
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
.end method

.method public final component13()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

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
.end method

.method public final component14()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

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
.end method

.method public final component15()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

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
.end method

.method public final component16()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 3
    return v0
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
.end method

.method public final component17()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 3
    return-wide v0
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
.end method

.method public final component2()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 3
    return-wide v0
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
.end method

.method public final component3()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 3
    return v0
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
.end method

.method public final component4()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 3
    return-wide v0
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
.end method

.method public final component5()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 3
    return v0
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
.end method

.method public final component6()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 3
    return-wide v0
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
.end method

.method public final component7()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 3
    return-wide v0
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
.end method

.method public final component8()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 3
    return v0
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
.end method

.method public final component9()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 3
    return v0
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
.end method

.method public final copy(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)Lcom/jumio/core/models/LivenessSettingsModel;
    .locals 25
    .param p18    # Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p19    # Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "portrait"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "landscape"

    move-object/from16 v2, p19

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configOverride"

    move-object/from16 v3, p20

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/jumio/core/models/LivenessSettingsModel;

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-wide/from16 v17, p16

    move-object/from16 v19, p18

    move/from16 v22, p21

    move-wide/from16 v23, p22

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move/from16 v2, p1

    move-wide/from16 v3, p2

    invoke-direct/range {v1 .. v24}, Lcom/jumio/core/models/LivenessSettingsModel;-><init>(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/jumio/core/models/LivenessSettingsModel;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/jumio/core/models/LivenessSettingsModel;

    .line 13
    .line 14
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 15
    .line 16
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 22
    .line 23
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 24
    .line 25
    cmp-long v1, v3, v5

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    return v2

    .line 29
    .line 30
    :cond_3
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 31
    .line 32
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 33
    .line 34
    if-eq v1, v3, :cond_4

    .line 35
    return v2

    .line 36
    .line 37
    :cond_4
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 38
    .line 39
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 40
    .line 41
    cmp-long v1, v3, v5

    .line 42
    .line 43
    if-eqz v1, :cond_5

    .line 44
    return v2

    .line 45
    .line 46
    :cond_5
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 47
    .line 48
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 49
    .line 50
    if-eq v1, v3, :cond_6

    .line 51
    return v2

    .line 52
    .line 53
    :cond_6
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 54
    .line 55
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 56
    .line 57
    cmp-long v1, v3, v5

    .line 58
    .line 59
    if-eqz v1, :cond_7

    .line 60
    return v2

    .line 61
    .line 62
    :cond_7
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 63
    .line 64
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 68
    move-result v1

    .line 69
    .line 70
    if-eqz v1, :cond_8

    .line 71
    return v2

    .line 72
    .line 73
    :cond_8
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 74
    .line 75
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 76
    .line 77
    if-eq v1, v3, :cond_9

    .line 78
    return v2

    .line 79
    .line 80
    :cond_9
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 81
    .line 82
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 83
    .line 84
    if-eq v1, v3, :cond_a

    .line 85
    return v2

    .line 86
    .line 87
    :cond_a
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 88
    .line 89
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 90
    .line 91
    if-eq v1, v3, :cond_b

    .line 92
    return v2

    .line 93
    .line 94
    :cond_b
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 95
    .line 96
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 97
    .line 98
    if-eq v1, v3, :cond_c

    .line 99
    return v2

    .line 100
    .line 101
    :cond_c
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 102
    .line 103
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 104
    .line 105
    .line 106
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 107
    move-result v1

    .line 108
    .line 109
    if-eqz v1, :cond_d

    .line 110
    return v2

    .line 111
    .line 112
    :cond_d
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v1

    .line 119
    .line 120
    if-nez v1, :cond_e

    .line 121
    return v2

    .line 122
    .line 123
    :cond_e
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 126
    .line 127
    .line 128
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    move-result v1

    .line 130
    .line 131
    if-nez v1, :cond_f

    .line 132
    return v2

    .line 133
    .line 134
    :cond_f
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    move-result v1

    .line 141
    .line 142
    if-nez v1, :cond_10

    .line 143
    return v2

    .line 144
    .line 145
    :cond_10
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 146
    .line 147
    iget v3, p1, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 148
    .line 149
    if-eq v1, v3, :cond_11

    .line 150
    return v2

    .line 151
    .line 152
    :cond_11
    iget-wide v3, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 153
    .line 154
    iget-wide v5, p1, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 155
    .line 156
    cmp-long p1, v3, v5

    .line 157
    .line 158
    if-eqz p1, :cond_12

    .line 159
    return v2

    .line 160
    :cond_12
    return v0
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
.end method

.method public final getConfigOverride()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

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
.end method

.method public final getDelayBetweenDistanceInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 3
    return-wide v0
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
.end method

.method public final getFrameRateThreshold()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 3
    return v0
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
.end method

.method public final getHardwareLatency()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 3
    return v0
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
.end method

.method public final getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

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
.end method

.method public final getMaxFaceCenterDifference()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 3
    return-wide v0
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
.end method

.method public final getMaximumPitch()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 3
    return v0
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
.end method

.method public final getMaximumYaw()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 3
    return v0
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
.end method

.method public final getMinTimePerDistanceInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 3
    return-wide v0
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
.end method

.method public final getMinimumPitch()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 3
    return v0
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
.end method

.method public final getMinimumYaw()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 3
    return v0
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
.end method

.method public final getModelInitTimeoutInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 3
    return-wide v0
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
.end method

.method public final getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

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
.end method

.method public final getRequiredDistanceMovementRatio()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 3
    return-wide v0
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
.end method

.method public final getRetries()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 3
    return v0
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
.end method

.method public final getSamplingTimeInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 3
    return-wide v0
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
.end method

.method public final getViolationLimit()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 3
    return v0
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
.end method

.method public hashCode()I
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1}, Ljumio/core/x1;->a(JII)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 21
    move-result v0

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3, v0, v1}, Ljumio/core/x1;->a(JII)I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 33
    move-result v0

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3, v0, v1}, Ljumio/core/x1;->a(JII)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-wide v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    .line 49
    iget v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2, v1}, Ljumio/core/e0;->a(III)I

    .line 53
    move-result v0

    .line 54
    .line 55
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 59
    move-result v0

    .line 60
    .line 61
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 65
    move-result v0

    .line 66
    .line 67
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 71
    move-result v0

    .line 72
    .line 73
    iget-wide v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    .line 77
    move-result v2

    .line 78
    add-int/2addr v2, v0

    .line 79
    mul-int/2addr v2, v1

    .line 80
    .line 81
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 85
    move-result v0

    .line 86
    add-int/2addr v0, v2

    .line 87
    mul-int/2addr v0, v1

    .line 88
    .line 89
    iget-object v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 93
    move-result v2

    .line 94
    add-int/2addr v2, v0

    .line 95
    mul-int/2addr v2, v1

    .line 96
    .line 97
    iget-object v0, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v2, v1}, Ljumio/core/C;->a(Ljava/lang/String;II)I

    .line 101
    move-result v0

    .line 102
    .line 103
    iget v2, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 104
    .line 105
    .line 106
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 107
    move-result v0

    .line 108
    .line 109
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 113
    move-result v1

    .line 114
    add-int/2addr v1, v0

    .line 115
    return v1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "LivenessSettingsModel(frameRateThreshold="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->a:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", samplingTimeInMs="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->b:J

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", violationLimit="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->c:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", modelInitTimeoutInMs="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->d:J

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", retries="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->e:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", minTimePerDistanceInMs="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->f:J

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", maxFaceCenterDifference="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->g:D

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", minimumPitch="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->h:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", maximumPitch="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->i:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, ", minimumYaw="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->j:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, ", maximumYaw="

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->k:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, ", requiredDistanceMovementRatio="

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->l:D

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, ", portrait="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->m:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, ", landscape="

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->n:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, ", configOverride="

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    iget-object v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->o:Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v1, ", hardwareLatency="

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    iget v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->p:I

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, ", delayBetweenDistanceInMs="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-wide v1, p0, Lcom/jumio/core/models/LivenessSettingsModel;->q:J

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const/16 v1, 0x29

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    move-result-object v0

    .line 182
    return-object v0
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
.end method
