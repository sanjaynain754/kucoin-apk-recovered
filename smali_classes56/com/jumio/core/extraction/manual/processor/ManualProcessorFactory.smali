.class public final Lcom/jumio/core/extraction/manual/processor/ManualProcessorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/processor/ImageProcessorFactoryInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\u0008\u00030\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/extraction/manual/processor/ManualProcessorFactory;",
        "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;",
        "<init>",
        "()V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public createImageProcessor(Lcom/jumio/core/processor/ImageProcessorConfig;)Lcom/jumio/core/processor/ImageProcessorInterface;
    .locals 7
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

    .line 1
    .line 2
    const-string v0, "imageProcessorConfig"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/jumio/core/processor/base/BaseProcessorConfig;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;

    .line 12
    .line 13
    check-cast p1, Lcom/jumio/core/processor/base/BaseProcessorConfig;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1}, Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;-><init>(Lcom/jumio/core/processor/base/BaseProcessorConfig;)V

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    move-object v2, p1

    .line 23
    .line 24
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;->getManualEnabled()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v1, Lcom/jumio/core/processor/flash/FlashImageProcessor;

    .line 33
    const/4 v5, 0x6

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/processor/flash/FlashImageProcessor;-><init>(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    return-object v1

    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;->getCameraChallengeData()Ljumio/core/W;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iget-boolean v0, v0, Ljumio/core/W;->a:Z

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;

    .line 58
    const/4 v2, 0x2

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p1, v1, v2, v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;-><init>(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    return-object v0

    .line 63
    :cond_2
    return-object v1
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
