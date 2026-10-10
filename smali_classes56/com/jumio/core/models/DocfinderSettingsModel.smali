.class public final Lcom/jumio/core/models/DocfinderSettingsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "DocfinderSettingsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/DocfinderSettingsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBM\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/jumio/core/models/DocfinderSettingsModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "frameRateThreshold",
        "",
        "samplingTimeInMs",
        "",
        "violationLimit",
        "modelInitTimeoutInMs",
        "rotationTolerance",
        "",
        "minAllowedRatio",
        "minDetectionSize",
        "Lcom/jumio/commons/camera/Size;",
        "<init>",
        "(IJIJDDLcom/jumio/commons/camera/Size;)V",
        "getFrameRateThreshold",
        "()I",
        "getSamplingTimeInMs",
        "()J",
        "getViolationLimit",
        "getModelInitTimeoutInMs",
        "getRotationTolerance",
        "()D",
        "getMinAllowedRatio",
        "getMinDetectionSize",
        "()Lcom/jumio/commons/camera/Size;",
        "Companion",
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
.field public static final Companion:Lcom/jumio/core/models/DocfinderSettingsModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:D

.field public final f:D

.field public final g:Lcom/jumio/commons/camera/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/DocfinderSettingsModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/DocfinderSettingsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/models/DocfinderSettingsModel;->Companion:Lcom/jumio/core/models/DocfinderSettingsModel$Companion;

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
    .locals 14

    const/16 v12, 0x7f

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v13}, Lcom/jumio/core/models/DocfinderSettingsModel;-><init>(IJIJDDLcom/jumio/commons/camera/Size;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJIJDDLcom/jumio/commons/camera/Size;)V
    .locals 1
    .param p11    # Lcom/jumio/commons/camera/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "minDetectionSize"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->a:I

    .line 4
    iput-wide p2, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->b:J

    .line 5
    iput p4, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->c:I

    .line 6
    iput-wide p5, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->d:J

    .line 7
    iput-wide p7, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->e:D

    .line 8
    iput-wide p9, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->f:D

    .line 9
    iput-object p11, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->g:Lcom/jumio/commons/camera/Size;

    return-void
.end method

.method public synthetic constructor <init>(IJIJDDLcom/jumio/commons/camera/Size;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    const/4 p1, 0x4

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    const-wide/32 p2, 0x3b9aca00

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    const/4 p4, 0x3

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    const-wide/16 p5, 0x1388

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    const-wide p7, 0x3fd65718eb895076L    # 0.349066

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    const-wide p9, 0x3fe4cccccccccccdL    # 0.65

    :cond_5
    and-int/lit8 p12, p12, 0x40

    if-eqz p12, :cond_6

    .line 10
    new-instance p11, Lcom/jumio/commons/camera/Size;

    const/16 p12, 0x200

    const/16 p13, 0x143

    invoke-direct {p11, p12, p13}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    :cond_6
    move-object p13, p11

    move-wide p11, p9

    move-wide p9, p7

    move-wide p7, p5

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    .line 11
    invoke-direct/range {p2 .. p13}, Lcom/jumio/core/models/DocfinderSettingsModel;-><init>(IJIJDDLcom/jumio/commons/camera/Size;)V

    return-void
.end method


# virtual methods
.method public final getFrameRateThreshold()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->a:I

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

.method public final getMinAllowedRatio()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->f:D

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

.method public final getMinDetectionSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->g:Lcom/jumio/commons/camera/Size;

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

.method public final getModelInitTimeoutInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->d:J

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

.method public final getRotationTolerance()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->e:D

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

.method public final getSamplingTimeInMs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->b:J

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
    iget v0, p0, Lcom/jumio/core/models/DocfinderSettingsModel;->c:I

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
