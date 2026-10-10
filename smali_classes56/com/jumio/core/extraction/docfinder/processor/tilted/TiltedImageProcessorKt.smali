.class public final Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedImageProcessorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000c\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "MEDIAN_ANGLE_OFFSET_DEGREES",
        "",
        "asRange",
        "Lkotlin/ranges/IntRange;",
        "Lcom/jumio/core/models/TiltRange;",
        "median",
        "getMedian",
        "(Lkotlin/ranges/IntRange;)I",
        "jumio-docfinder_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final access$asRange(Lcom/jumio/core/models/TiltRange;)Lkotlin/ranges/IntRange;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/models/TiltRange;->getMinAngle()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/models/TiltRange;->getMaxAngle()I

    .line 10
    move-result p0

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 14
    return-object v0
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

.method public static final access$getMedian(Lkotlin/ranges/IntRange;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 8
    move-result p0

    .line 9
    add-int/2addr p0, v0

    .line 10
    .line 11
    div-int/lit8 p0, p0, 0x2

    .line 12
    return p0
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
