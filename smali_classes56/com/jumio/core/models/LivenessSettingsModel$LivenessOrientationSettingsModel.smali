.class public final Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/LivenessSettingsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LivenessOrientationSettingsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\n\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "normalizedNearFarCutOffPoint",
        "",
        "initialFaceWidthRatioMin",
        "initialFaceWidthRatioMax",
        "<init>",
        "(DDD)V",
        "getNormalizedNearFarCutOffPoint",
        "()D",
        "getInitialFaceWidthRatioMin",
        "getInitialFaceWidthRatioMax",
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
.field public static final Companion:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->Companion:Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;

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
    .locals 9

    const/4 v7, 0x7

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v8}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;-><init>(DDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DDD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->a:D

    .line 4
    iput-wide p3, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->b:D

    .line 5
    iput-wide p5, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->c:D

    return-void
.end method

.method public synthetic constructor <init>(DDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-wide p1, 0x3fe6666666666666L    # 0.7

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const-wide/high16 p3, 0x3fe0000000000000L    # 0.5

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    const-wide p5, 0x3feccccccccccccdL    # 0.9

    :cond_2
    move-object v0, p0

    move-wide v5, p5

    .line 6
    invoke-direct/range {v0 .. v6}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;-><init>(DDD)V

    return-void
.end method


# virtual methods
.method public final getInitialFaceWidthRatioMax()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->c:D

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

.method public final getInitialFaceWidthRatioMin()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->b:D

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

.method public final getNormalizedNearFarCutOffPoint()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->a:D

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
