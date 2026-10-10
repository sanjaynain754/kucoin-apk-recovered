.class public final Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;
.super Lcom/jumio/core/processor/SingleImageProcessorBase;
.source "SourceFile"

# interfaces
.implements Ljumio/core/o2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jumio/core/processor/SingleImageProcessorBase<",
        "Lcom/jumio/core/processor/base/BaseProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$BaseImage;",
        ">;",
        "Ljumio/core/o2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J0\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;",
        "Lcom/jumio/core/processor/SingleImageProcessorBase;",
        "Lcom/jumio/core/processor/base/BaseProcessorConfig;",
        "Lcom/jumio/core/processor/ProcessorImage$BaseImage;",
        "Lcom/jumio/core/processor/ManualImageProcessorInterface;",
        "config",
        "<init>",
        "(Lcom/jumio/core/processor/base/BaseProcessorConfig;)V",
        "uhdImageRequired",
        "",
        "getUhdImageRequired",
        "()Z",
        "process",
        "Lcom/jumio/core/processor/ProcessorState;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "metadata",
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "takeImage",
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


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/processor/base/BaseProcessorConfig;)V
    .locals 1
    .param p1    # Lcom/jumio/core/processor/base/BaseProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/SingleImageProcessorBase;-><init>(Lcom/jumio/core/processor/SingleImageProcessorConfig;)V

    .line 9
    const/4 p1, 0x1

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;->a:Z

    .line 12
    return-void
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
.end method


# virtual methods
.method public getUhdImageRequired()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;->a:Z

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

.method public process(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;)Lcom/jumio/core/processor/ProcessorState;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/commons/camera/Frame$Metadata;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/core/processor/ProcessorParameterInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Ljumio/core/o2;->process(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;)Lcom/jumio/core/processor/ProcessorState;

    move-result-object p1

    return-object p1
.end method

.method public process(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Z)Lcom/jumio/core/processor/ProcessorState;
    .locals 6
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/commons/camera/Frame$Metadata;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cameraSettings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extractionArea"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "metadata"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    move-result-object p1

    instance-of p1, p1, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    if-eqz p1, :cond_0

    new-instance p1, Lcom/jumio/core/processor/ProcessorState$Finished;

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-direct {p1, p3, p3, p2, p3}, Lcom/jumio/core/processor/ProcessorState$Finished;-><init>(Ljava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcom/jumio/core/processor/a;->setCurrentState(Lcom/jumio/core/processor/ProcessorState;)V

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 3
    new-instance v0, Lcom/jumio/core/processor/ProcessorState$TakePicture;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/processor/ProcessorState$TakePicture;-><init>(Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/commons/camera/Size;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lcom/jumio/core/processor/a;->setCurrentState(Lcom/jumio/core/processor/ProcessorState;)V

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/jumio/core/processor/a;->getCurrentState()Lcom/jumio/core/processor/ProcessorState;

    move-result-object p1

    return-object p1
.end method
