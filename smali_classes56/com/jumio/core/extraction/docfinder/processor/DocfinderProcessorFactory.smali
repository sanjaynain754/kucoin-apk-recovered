.class public final Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/processor/ImageProcessorFactoryInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;",
        "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;",
        "alignmentConfig",
        "Lcom/jumio/core/processor/alignment/AlignmentConfig;",
        "<init>",
        "(Lcom/jumio/core/processor/alignment/AlignmentConfig;)V",
        "createImageProcessor",
        "Lcom/jumio/core/processor/ImageProcessorInterface;",
        "imageProcessorConfig",
        "Lcom/jumio/core/processor/ImageProcessorConfig;",
        "jumio-docfinder_release"
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
.field public final a:Lcom/jumio/core/processor/alignment/AlignmentConfig;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;-><init>(Lcom/jumio/core/processor/alignment/AlignmentConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/jumio/core/processor/alignment/AlignmentConfig;)V
    .locals 1
    .param p1    # Lcom/jumio/core/processor/alignment/AlignmentConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "alignmentConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;->a:Lcom/jumio/core/processor/alignment/AlignmentConfig;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/processor/alignment/AlignmentConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance v0, Lcom/jumio/core/processor/alignment/AlignmentConfig;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/processor/alignment/AlignmentConfig;-><init>(FFLcom/jumio/core/models/DocfinderSettingsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;-><init>(Lcom/jumio/core/processor/alignment/AlignmentConfig;)V

    return-void
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
    new-instance v0, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;

    .line 12
    .line 13
    check-cast p1, Lcom/jumio/core/processor/base/BaseProcessorConfig;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;->a:Lcom/jumio/core/processor/alignment/AlignmentConfig;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;-><init>(Lcom/jumio/core/processor/base/BaseProcessorConfig;Lcom/jumio/core/processor/alignment/AlignmentConfig;)V

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    instance-of v0, p1, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v1, Lcom/jumio/core/processor/flash/FlashImageProcessor;

    .line 26
    move-object v2, p1

    .line 27
    .line 28
    check-cast v2, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 29
    const/4 v5, 0x6

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/processor/flash/FlashImageProcessor;-><init>(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    return-object v1

    .line 37
    .line 38
    :cond_1
    instance-of v0, p1, Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v1, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedImageProcessor;

    .line 43
    move-object v2, p1

    .line 44
    .line 45
    check-cast v2, Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;->a:Lcom/jumio/core/processor/alignment/AlignmentConfig;

    .line 48
    const/4 v5, 0x4

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    .line 53
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedImageProcessor;-><init>(Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;Lcom/jumio/core/processor/alignment/AlignmentConfig;Lcom/jumio/core/extraction/docfinder/calculator/DocumentTiltCalculatorInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    return-object v1

    .line 55
    .line 56
    :cond_2
    instance-of v0, p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    .line 57
    const/4 v1, 0x0

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    new-instance v0, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;

    .line 62
    .line 63
    check-cast p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    .line 64
    const/4 v2, 0x2

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, p1, v1, v2, v1}, Lcom/jumio/core/processor/challenge/CameraChallengeImageProcessor;-><init>(Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;Lcom/jumio/core/toolkit/ToolkitProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    return-object v0

    .line 69
    :cond_3
    return-object v1
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
