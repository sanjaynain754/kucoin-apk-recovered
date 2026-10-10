.class public interface abstract Lcom/jumio/core/processor/SingleImageProcessorConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/processor/ImageProcessorConfig;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/jumio/core/processor/ProcessorImage;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/jumio/core/processor/ImageProcessorConfig<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/processor/SingleImageProcessorConfig;",
        "T",
        "Lcom/jumio/core/processor/ProcessorImage;",
        "Lcom/jumio/core/processor/ImageProcessorConfig;",
        "image",
        "getImage",
        "()Lcom/jumio/core/processor/ProcessorImage;",
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
.method public abstract getImage()Lcom/jumio/core/processor/ProcessorImage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
