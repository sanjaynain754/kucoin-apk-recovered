.class public Lorg/tensorflow/lite/schema/LSTMOptionsT;
.super Ljava/lang/Object;
.source "LSTMOptionsT.java"


# instance fields
.field private asymmetricQuantizeInputs:Z

.field private cellClip:F

.field private fusedActivationFunction:B

.field private kernelType:B

.field private projClip:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-byte v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->fusedActivationFunction:B

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput v1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->cellClip:F

    .line 10
    .line 11
    iput v1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->projClip:F

    .line 12
    .line 13
    iput-byte v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->kernelType:B

    .line 14
    .line 15
    iput-boolean v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->asymmetricQuantizeInputs:Z

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getAsymmetricQuantizeInputs()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->asymmetricQuantizeInputs:Z

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

.method public getCellClip()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->cellClip:F

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

.method public getFusedActivationFunction()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->fusedActivationFunction:B

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

.method public getKernelType()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->kernelType:B

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

.method public getProjClip()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->projClip:F

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

.method public setAsymmetricQuantizeInputs(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->asymmetricQuantizeInputs:Z

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

.method public setCellClip(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->cellClip:F

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

.method public setFusedActivationFunction(B)V
    .locals 0

    .line 1
    .line 2
    iput-byte p1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->fusedActivationFunction:B

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

.method public setKernelType(B)V
    .locals 0

    .line 1
    .line 2
    iput-byte p1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->kernelType:B

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

.method public setProjClip(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lorg/tensorflow/lite/schema/LSTMOptionsT;->projClip:F

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
