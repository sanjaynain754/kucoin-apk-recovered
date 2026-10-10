.class public Lorg/tensorflow/lite/schema/DimensionMetadataT;
.super Ljava/lang/Object;
.source "DimensionMetadataT.java"


# instance fields
.field private arrayIndices:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

.field private arraySegments:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

.field private denseSize:I

.field private format:B


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
    iput-byte v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->format:B

    .line 7
    .line 8
    iput v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->denseSize:I

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-object v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arraySegments:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arrayIndices:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getArrayIndices()Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arrayIndices:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getArraySegments()Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arraySegments:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getDenseSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->denseSize:I

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

.method public getFormat()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->format:B

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

.method public setArrayIndices(Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arrayIndices:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

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

.method public setArraySegments(Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->arraySegments:Lorg/tensorflow/lite/schema/SparseIndexVectorUnion;

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

.method public setDenseSize(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->denseSize:I

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

.method public setFormat(B)V
    .locals 0

    .line 1
    .line 2
    iput-byte p1, p0, Lorg/tensorflow/lite/schema/DimensionMetadataT;->format:B

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
