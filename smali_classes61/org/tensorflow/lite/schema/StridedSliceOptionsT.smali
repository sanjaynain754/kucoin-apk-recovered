.class public Lorg/tensorflow/lite/schema/StridedSliceOptionsT;
.super Ljava/lang/Object;
.source "StridedSliceOptionsT.java"


# instance fields
.field private beginMask:I

.field private ellipsisMask:I

.field private endMask:I

.field private newAxisMask:I

.field private offset:Z

.field private shrinkAxisMask:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->beginMask:I

    .line 7
    .line 8
    iput v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->endMask:I

    .line 9
    .line 10
    iput v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->ellipsisMask:I

    .line 11
    .line 12
    iput v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->newAxisMask:I

    .line 13
    .line 14
    iput v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->shrinkAxisMask:I

    .line 15
    .line 16
    iput-boolean v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->offset:Z

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getBeginMask()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->beginMask:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public getEllipsisMask()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->ellipsisMask:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public getEndMask()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->endMask:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public getNewAxisMask()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->newAxisMask:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public getOffset()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->offset:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public getShrinkAxisMask()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->shrinkAxisMask:I

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
    .line 19
    .line 20
    .line 21
.end method

.method public setBeginMask(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->beginMask:I

    .line 3
    return-void
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
.end method

.method public setEllipsisMask(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->ellipsisMask:I

    .line 3
    return-void
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
.end method

.method public setEndMask(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->endMask:I

    .line 3
    return-void
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
.end method

.method public setNewAxisMask(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->newAxisMask:I

    .line 3
    return-void
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
.end method

.method public setOffset(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->offset:Z

    .line 3
    return-void
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
.end method

.method public setShrinkAxisMask(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;->shrinkAxisMask:I

    .line 3
    return-void
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
.end method
