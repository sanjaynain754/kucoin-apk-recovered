.class public Lorg/tensorflow/lite/schema/QuantizationParametersT;
.super Ljava/lang/Object;
.source "QuantizationParametersT.java"


# instance fields
.field private details:Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;

.field private max:[F

.field private min:[F

.field private quantizedDimension:I

.field private scale:[F

.field private zeroPoint:[J


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
    iput-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->min:[F

    .line 7
    .line 8
    iput-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->max:[F

    .line 9
    .line 10
    iput-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->scale:[F

    .line 11
    .line 12
    iput-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->zeroPoint:[J

    .line 13
    .line 14
    iput-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->details:Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->quantizedDimension:I

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getDetails()Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->details:Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;

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

.method public getMax()[F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->max:[F

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

.method public getMin()[F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->min:[F

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

.method public getQuantizedDimension()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->quantizedDimension:I

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

.method public getScale()[F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->scale:[F

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

.method public getZeroPoint()[J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->zeroPoint:[J

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

.method public setDetails(Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->details:Lorg/tensorflow/lite/schema/QuantizationDetailsUnion;

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

.method public setMax([F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->max:[F

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

.method public setMin([F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->min:[F

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

.method public setQuantizedDimension(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->quantizedDimension:I

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

.method public setScale([F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->scale:[F

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

.method public setZeroPoint([J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/schema/QuantizationParametersT;->zeroPoint:[J

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
