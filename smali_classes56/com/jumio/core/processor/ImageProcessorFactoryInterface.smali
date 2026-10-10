.class public interface abstract Lcom/jumio/core/processor/ImageProcessorFactoryInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;",
        "",
        "createImageProcessor",
        "Lcom/jumio/core/processor/ImageProcessorInterface;",
        "imageProcessorConfig",
        "Lcom/jumio/core/processor/ImageProcessorConfig;",
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
.method public abstract createImageProcessor(Lcom/jumio/core/processor/ImageProcessorConfig;)Lcom/jumio/core/processor/ImageProcessorInterface;
    .param p1    # Lcom/jumio/core/processor/ImageProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/processor/ImageProcessorConfig<",
            "*>;)",
            "Lcom/jumio/core/processor/ImageProcessorInterface;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
