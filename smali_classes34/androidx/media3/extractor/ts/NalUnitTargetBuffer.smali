.class public final Landroidx/media3/extractor/ts/NalUnitTargetBuffer;
.super Ljava/lang/Object;
.source "NalUnitTargetBuffer.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private isCompleted:Z

.field private isFilling:Z

.field public nalData:[B

.field public nalLength:I

.field private final targetType:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->targetType:I

    .line 6
    .line 7
    add-int/lit8 p2, p2, 0x3

    .line 8
    .line 9
    new-array p1, p2, [B

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalData:[B

    .line 12
    const/4 p2, 0x2

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    aput-byte v0, p1, p2

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
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
.end method


# virtual methods
.method public appendToNalUnit([BII)V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    sub-int/2addr p3, p2

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalData:[B

    .line 9
    array-length v1, v0

    .line 10
    .line 11
    iget v2, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 12
    .line 13
    add-int v3, v2, p3

    .line 14
    .line 15
    if-ge v1, v3, :cond_1

    .line 16
    add-int/2addr v2, p3

    .line 17
    .line 18
    mul-int/lit8 v2, v2, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalData:[B

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalData:[B

    .line 27
    .line 28
    iget v1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    iget p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 34
    add-int/2addr p1, p3

    .line 35
    .line 36
    iput p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 37
    return-void
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
.end method

.method public endNalUnit(I)Z
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 9
    sub-int/2addr v0, p1

    .line 10
    .line 11
    iput v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 12
    .line 13
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 14
    const/4 p1, 0x1

    .line 15
    .line 16
    iput-boolean p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isCompleted:Z

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isCompleted()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isCompleted:Z

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
    .line 17
    .line 18
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 4
    .line 5
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isCompleted:Z

    .line 6
    return-void
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
    .line 17
    .line 18
.end method

.method public startNalUnit(I)V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->targetType:I

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    .line 16
    :goto_0
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isFilling:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    const/4 p1, 0x3

    .line 20
    .line 21
    iput p1, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->nalLength:I

    .line 22
    .line 23
    iput-boolean v2, p0, Landroidx/media3/extractor/ts/NalUnitTargetBuffer;->isCompleted:Z

    .line 24
    :cond_1
    return-void
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
