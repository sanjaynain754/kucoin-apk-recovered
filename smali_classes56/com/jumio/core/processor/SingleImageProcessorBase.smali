.class public abstract Lcom/jumio/core/processor/SingleImageProcessorBase;
.super Lcom/jumio/core/processor/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/jumio/core/processor/SingleImageProcessorConfig<",
        "TT;>;T::",
        "Lcom/jumio/core/processor/ProcessorImage;",
        ">",
        "Lcom/jumio/core/processor/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u0000*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u0002H\u00030\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u0008\u0012\u0004\u0012\u0002H\u00010\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\t\u001a\u00028\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/jumio/core/processor/SingleImageProcessorBase;",
        "C",
        "Lcom/jumio/core/processor/SingleImageProcessorConfig;",
        "T",
        "Lcom/jumio/core/processor/ProcessorImage;",
        "Lcom/jumio/core/processor/ImageProcessorBase;",
        "config",
        "<init>",
        "(Lcom/jumio/core/processor/SingleImageProcessorConfig;)V",
        "image",
        "getImage",
        "()Lcom/jumio/core/processor/ProcessorImage;",
        "Lcom/jumio/core/processor/ProcessorImage;",
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
.field private final image:Lcom/jumio/core/processor/ProcessorImage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jumio/core/processor/SingleImageProcessorConfig;)V
    .locals 1
    .param p1    # Lcom/jumio/core/processor/SingleImageProcessorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

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
    invoke-direct {p0, p1}, Lcom/jumio/core/processor/a;-><init>(Lcom/jumio/core/processor/ImageProcessorConfig;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/jumio/core/processor/SingleImageProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/jumio/core/processor/SingleImageProcessorBase;->image:Lcom/jumio/core/processor/ProcessorImage;

    .line 15
    return-void
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
.method public getImage()Lcom/jumio/core/processor/ProcessorImage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/processor/SingleImageProcessorBase;->image:Lcom/jumio/core/processor/ProcessorImage;

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
