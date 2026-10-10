.class final Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;
.super Ljava/lang/Object;
.source "NativeSignatureRunnerWrapper.java"


# instance fields
.field private final errorHandle:J

.field private isMemoryAllocated:Z

.field private final signatureRunnerHandle:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->isMemoryAllocated:Z

    .line 7
    .line 8
    iput-wide p3, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->errorHandle:J

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2, p5}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeGetSignatureRunner(JLjava/lang/String;)J

    .line 12
    move-result-wide p1

    .line 13
    .line 14
    iput-wide p1, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 15
    .line 16
    const-wide/16 p3, -0x1

    .line 17
    .line 18
    cmp-long p1, p1, p3

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    const-string p3, "Input error: Signature "

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p3, " not found."

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method private static native nativeAllocateTensors(JJ)V
.end method

.method private static native nativeGetInputIndex(JLjava/lang/String;)I
.end method

.method private static native nativeGetOutputIndex(JLjava/lang/String;)I
.end method

.method private static native nativeGetSignatureRunner(JLjava/lang/String;)J
.end method

.method private static native nativeGetSubgraphIndex(J)I
.end method

.method private static native nativeInputNames(J)[Ljava/lang/String;
.end method

.method private static native nativeInvoke(JJ)V
.end method

.method private static native nativeOutputNames(J)[Ljava/lang/String;
.end method

.method private static native nativeResizeInput(JJLjava/lang/String;[I)Z
.end method


# virtual methods
.method public allocateTensorsIfNeeded()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->isMemoryAllocated:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 8
    .line 9
    iget-wide v2, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->errorHandle:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeAllocateTensors(JJ)V

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->isMemoryAllocated:Z

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getInputIndex(Ljava/lang/String;)I
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeGetInputIndex(JLjava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    return v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "Input error: input "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p1, " not found."

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public getInputTensor(Ljava/lang/String;)Lorg/tensorflow/lite/TensorImpl;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lorg/tensorflow/lite/TensorImpl;->fromSignatureInput(JLjava/lang/String;)Lorg/tensorflow/lite/TensorImpl;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public getOutputIndex(Ljava/lang/String;)I
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeGetOutputIndex(JLjava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    return v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "Input error: output "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p1, " not found."

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v0
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public getOutputTensor(Ljava/lang/String;)Lorg/tensorflow/lite/TensorImpl;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lorg/tensorflow/lite/TensorImpl;->fromSignatureOutput(JLjava/lang/String;)Lorg/tensorflow/lite/TensorImpl;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public getSubgraphIndex()I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeGetSubgraphIndex(J)I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public inputNames()[Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeInputNames(J)[Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public invoke()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    iget-wide v2, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->errorHandle:J

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeInvoke(JJ)V

    .line 8
    return-void
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

.method public outputNames()[Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeOutputNames(J)[Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public resizeInput(Ljava/lang/String;[I)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->isMemoryAllocated:Z

    .line 4
    .line 5
    iget-wide v1, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->signatureRunnerHandle:J

    .line 6
    .line 7
    iget-wide v3, p0, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->errorHandle:J

    .line 8
    move-object v5, p1

    .line 9
    move-object v6, p2

    .line 10
    .line 11
    .line 12
    invoke-static/range {v1 .. v6}, Lorg/tensorflow/lite/NativeSignatureRunnerWrapper;->nativeResizeInput(JJLjava/lang/String;[I)Z

    .line 13
    move-result p1

    .line 14
    return p1
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
.end method
