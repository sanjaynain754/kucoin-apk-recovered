.class public final Lcom/sumsub/sns/internal/core/common/d0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/D0;


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
    .line 17
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/core/common/Y;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/core/common/Y;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/core/common/Y;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/core/common/Y;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/common/Y;

    .line 22
    .line 23
    check-cast p2, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/core/common/Y;-><init>(Lcom/sumsub/sns/internal/core/common/d0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/core/common/Y;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/core/common/Y;->c:I

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    :try_start_1
    new-instance p2, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;

    .line 58
    .line 59
    .line 60
    invoke-direct {p2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;-><init>()V

    .line 61
    const/4 v2, 0x2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;->setPerformanceMode(I)Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;

    .line 65
    move-result-object p2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;->setLandmarkMode(I)Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;->setClassificationMode(I)Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions$Builder;->build()Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    invoke-static {p2}, Lcom/google/mlkit/vision/face/FaceDetection;->getClient(Lcom/google/mlkit/vision/face/FaceDetectorOptions;)Lcom/google/mlkit/vision/face/FaceDetector;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v3}, Lcom/google/mlkit/vision/common/InputImage;->fromBitmap(Landroid/graphics/Bitmap;I)Lcom/google/mlkit/vision/common/InputImage;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    iput v4, v0, Lcom/sumsub/sns/internal/core/common/Y;->c:I

    .line 88
    .line 89
    new-instance v2, Lkotlinx/coroutines/o;

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 93
    move-result-object v5

    .line 94
    .line 95
    .line 96
    invoke-direct {v2, v5, v4}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lkotlinx/coroutines/o;->E()V

    .line 100
    .line 101
    .line 102
    invoke-interface {p2, p1}, Lcom/google/mlkit/vision/face/FaceDetector;->process(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    new-instance v4, Lcom/sumsub/sns/internal/core/common/Z;

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, p2, v2}, Lcom/sumsub/sns/internal/core/common/Z;-><init>(Lcom/google/mlkit/vision/face/FaceDetector;Lkotlinx/coroutines/o;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/android/gms/tasks/Task;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    new-instance v4, Lcom/sumsub/sns/internal/core/common/a0;

    .line 115
    .line 116
    .line 117
    invoke-direct {v4, p2, v2}, Lcom/sumsub/sns/internal/core/common/a0;-><init>(Lcom/google/mlkit/vision/face/FaceDetector;Lkotlinx/coroutines/o;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    new-instance v4, Lcom/sumsub/sns/internal/core/common/b0;

    .line 124
    .line 125
    .line 126
    invoke-direct {v4, p2, v2}, Lcom/sumsub/sns/internal/core/common/b0;-><init>(Lcom/google/mlkit/vision/face/FaceDetector;Lkotlinx/coroutines/o;)V

    .line 127
    .line 128
    new-instance p2, Lcom/sumsub/sns/internal/core/common/c0;

    .line 129
    .line 130
    .line 131
    invoke-direct {p2, v4}, Lcom/sumsub/sns/internal/core/common/c0;-><init>(Lcom/sumsub/sns/internal/core/common/b0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    if-ne p2, p1, :cond_3

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    .line 148
    .line 149
    :cond_3
    if-ne p2, v1, :cond_4

    .line 150
    return-object v1

    .line 151
    .line 152
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 156
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    .line 158
    .line 159
    :catchall_0
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 160
    move-result-object p1

    .line 161
    return-object p1
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
