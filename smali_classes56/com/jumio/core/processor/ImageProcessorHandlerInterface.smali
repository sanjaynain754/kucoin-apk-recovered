.class public interface abstract Lcom/jumio/core/processor/ImageProcessorHandlerInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\n\u001a\u00020\u000bH&J\u0008\u0010\u000c\u001a\u00020\u000bH&J\u0014\u0010\r\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u000fH&J*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u0016Jf\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2.\u0010 \u001a*\u0008\u0001\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0#\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H\u00a6@\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\'\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;",
        "",
        "processingDone",
        "",
        "getProcessingDone",
        "()Z",
        "currentProcessor",
        "Lcom/jumio/core/processor/ImageProcessorInterface;",
        "getCurrentProcessor",
        "()Lcom/jumio/core/processor/ImageProcessorInterface;",
        "reset",
        "",
        "resetCurrentProcessor",
        "initProcessorWithConfig",
        "processorConfig",
        "Lcom/jumio/core/processor/ImageProcessorConfig;",
        "selectNextProcessor",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "skipClassifier",
        "Lkotlin/Function1;",
        "",
        "(Lcom/jumio/commons/camera/CameraSettings;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "doProcess",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "metadata",
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "parameterInterface",
        "Lcom/jumio/core/processor/ProcessorParameterInterface;",
        "handleState",
        "Lkotlin/Function4;",
        "Lcom/jumio/core/processor/ProcessorState;",
        "Lkotlin/coroutines/Continuation;",
        "(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "finishCurrentProcessor",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract doProcess(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    .param p6    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/jumio/commons/camera/CameraSettings;",
            "Landroid/graphics/Rect;",
            "Lcom/jumio/commons/camera/Frame$Metadata;",
            "Lcom/jumio/core/processor/ProcessorParameterInterface;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Lcom/jumio/core/processor/ProcessorState;",
            "-",
            "Lcom/jumio/core/processor/ImageProcessorInterface;",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract finishCurrentProcessor(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCurrentProcessor()Lcom/jumio/core/processor/ImageProcessorInterface;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getProcessingDone()Z
.end method

.method public abstract initProcessorWithConfig(Lcom/jumio/core/processor/ImageProcessorConfig;)V
    .param p1    # Lcom/jumio/core/processor/ImageProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/processor/ImageProcessorConfig<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract resetCurrentProcessor()V
.end method

.method public abstract selectNextProcessor(Lcom/jumio/commons/camera/CameraSettings;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/commons/camera/CameraSettings;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
