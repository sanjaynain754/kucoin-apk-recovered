.class public final Landroidx/media3/common/util/ConstantRateTimestampIterator;
.super Ljava/lang/Object;
.source "ConstantRateTimestampIterator.java"

# interfaces
.implements Landroidx/media3/common/util/TimestampIterator;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private final endPositionUs:J

.field private final frameRate:F

.field private framesAdded:I

.field private final framesDurationUs:D

.field private final startPositionUs:J

.field private final totalNumberOfFramesToAdd:I


# direct methods
.method public constructor <init>(JF)V
    .locals 6
    .param p1    # J
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p3    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    const-wide/16 v1, 0x0

    move-object v0, p0

    move-wide v3, p1

    move v5, p3

    .line 1
    invoke-direct/range {v0 .. v5}, Landroidx/media3/common/util/ConstantRateTimestampIterator;-><init>(JJF)V

    return-void
.end method

.method public constructor <init>(JJF)V
    .locals 5
    .param p1    # J
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # J
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p5    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    .line 3
    :goto_0
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    const/4 v2, 0x0

    cmpl-float v2, p5, v2

    if-lez v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    .line 4
    :goto_1
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    cmp-long v0, v0, p1

    if-gtz v0, :cond_2

    cmp-long v0, p1, p3

    if-gez v0, :cond_2

    move v3, v4

    .line 5
    :cond_2
    invoke-static {v3}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 6
    iput-wide p1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->startPositionUs:J

    .line 7
    iput-wide p3, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->endPositionUs:J

    .line 8
    iput p5, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->frameRate:F

    sub-long/2addr p3, p1

    long-to-float p1, p3

    const p2, 0x49742400    # 1000000.0f

    div-float/2addr p1, p2

    mul-float/2addr p1, p5

    .line 9
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->totalNumberOfFramesToAdd:I

    div-float/2addr p2, p5

    float-to-double p1, p2

    .line 10
    iput-wide p1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->framesDurationUs:D

    return-void
.end method

.method private getTimestampUsAfter(I)J
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->startPositionUs:J

    .line 3
    .line 4
    iget-wide v2, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->framesDurationUs:D

    .line 5
    int-to-double v4, p1

    .line 6
    mul-double/2addr v2, v4

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 10
    move-result-wide v2

    .line 11
    add-long/2addr v0, v2

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-ltz p1, :cond_0

    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 24
    return-wide v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method


# virtual methods
.method public copyOf()Landroidx/media3/common/util/ConstantRateTimestampIterator;
    .locals 6

    .line 2
    new-instance v0, Landroidx/media3/common/util/ConstantRateTimestampIterator;

    iget-wide v1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->startPositionUs:J

    iget-wide v3, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->endPositionUs:J

    iget v5, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->frameRate:F

    invoke-direct/range {v0 .. v5}, Landroidx/media3/common/util/ConstantRateTimestampIterator;-><init>(JJF)V

    return-object v0
.end method

.method public bridge synthetic copyOf()Landroidx/media3/common/util/TimestampIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/util/ConstantRateTimestampIterator;->copyOf()Landroidx/media3/common/util/ConstantRateTimestampIterator;

    move-result-object v0

    return-object v0
.end method

.method public getLastTimestampUs()J
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->totalNumberOfFramesToAdd:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    return-wide v0

    .line 11
    .line 12
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Landroidx/media3/common/util/ConstantRateTimestampIterator;->getTimestampUsAfter(I)J

    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
    .line 18
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->framesAdded:I

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->totalNumberOfFramesToAdd:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public next()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ConstantRateTimestampIterator;->hasNext()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->framesAdded:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    iput v1, p0, Landroidx/media3/common/util/ConstantRateTimestampIterator;->framesAdded:I

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Landroidx/media3/common/util/ConstantRateTimestampIterator;->getTimestampUsAfter(I)J

    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method
