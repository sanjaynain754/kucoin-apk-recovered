.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/prooface/session/d0;


# static fields
.field public static final q:J


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

.field public final c:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/a;

.field public final f:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

.field public final g:Lkotlinx/coroutines/flow/e;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/m;

.field public final j:Lcom/sumsub/sns/internal/core/common/a;

.field public k:Landroid/graphics/Bitmap;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lkotlinx/coroutines/flow/n;

.field public final n:Lkotlinx/coroutines/flow/n;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public final p:Lkotlinx/coroutines/flow/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 3
    .line 4
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    sput-wide v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->q:J

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lkotlinx/coroutines/m0;Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lcom/sumsub/sns/internal/features/presentation/prooface/utils/a;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;Lkotlinx/coroutines/flow/e;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a:Lkotlinx/coroutines/m0;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->c:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/a;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->f:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->g:Lkotlinx/coroutines/flow/e;

    .line 18
    .line 19
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->h:Lkotlinx/coroutines/flow/n;

    .line 26
    const/4 p5, 0x7

    .line 27
    const/4 p6, 0x0

    .line 28
    const/4 p7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static {p6, p6, p7, p5, p7}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 32
    move-result-object p5

    .line 33
    .line 34
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->i:Lkotlinx/coroutines/flow/m;

    .line 35
    .line 36
    new-instance p5, Lcom/sumsub/sns/internal/core/common/a;

    .line 37
    .line 38
    sget-object p6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 39
    .line 40
    .line 41
    invoke-direct {p5, p6}, Lcom/sumsub/sns/internal/core/common/a;-><init>(Landroid/graphics/Bitmap$Config;)V

    .line 42
    .line 43
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->j:Lcom/sumsub/sns/internal/core/common/a;

    .line 44
    .line 45
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;

    .line 46
    const/4 p6, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {p5, p6}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;-><init>(F)V

    .line 50
    .line 51
    .line 52
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 53
    move-result-object p5

    .line 54
    .line 55
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->l:Lkotlinx/coroutines/flow/n;

    .line 56
    .line 57
    sget-object p5, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Ignored:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    .line 58
    .line 59
    .line 60
    invoke-static {p5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object p6

    .line 62
    .line 63
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->m:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    .line 66
    invoke-static {p7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->n:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    .line 72
    invoke-static {p7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->o:Lkotlinx/coroutines/flow/n;

    .line 76
    .line 77
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->n:Lkotlinx/coroutines/flow/w;

    .line 78
    .line 79
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M;

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, p7}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p3, p6, v0, p4, v1}, Lkotlinx/coroutines/flow/g;->o(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;

    .line 86
    move-result-object p3

    .line 87
    .line 88
    sget-object p4, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    .line 92
    move-result-object p4

    .line 93
    .line 94
    new-instance p6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/t;

    .line 95
    .line 96
    .line 97
    invoke-direct {p6, p2, p5}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/y;Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p3, p1, p4, p6}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->p:Lkotlinx/coroutines/flow/w;

    .line 104
    return-void
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;II)Landroid/graphics/Bitmap;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->j:Lcom/sumsub/sns/internal/core/common/a;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/core/common/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 12

    .line 31
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g1;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/g1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;)V

    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/core/common/H;->a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    .line 32
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v3, p0

    check-cast v3, Landroid/graphics/Bitmap;

    .line 33
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->c:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/session/h1;

    invoke-direct {v5, p1, p3}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/h1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lkotlin/jvm/functions/Function0;)V

    .line 34
    iget-object p0, v2, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->b:Lkotlinx/coroutines/m0;

    iget-object v7, v2, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->c:Lkotlinx/coroutines/j0;

    new-instance v1, Lcom/sumsub/sns/internal/core/domain/facedetector/a;

    const/4 v6, 0x0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/domain/facedetector/a;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/d;Landroid/graphics/Bitmap;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, p0

    move-object v9, v1

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 35
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 36
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Failed to convert imageProxy to bitmap"

    invoke-direct {p0, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/core/domain/facedetector/n;)Lkotlin/Unit;
    .locals 2

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->h:Lkotlinx/coroutines/flow/n;

    .line 40
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/k;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/v;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    .line 41
    :cond_0
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/m;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/x;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/x;

    goto :goto_0

    .line 42
    :cond_1
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/l;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/w;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/w;

    goto :goto_0

    .line 43
    :cond_2
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/u;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/u;

    .line 44
    :goto_0
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 45
    instance-of v0, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    if-eqz v0, :cond_3

    .line 46
    check-cast p2, Lcom/sumsub/sns/internal/core/domain/facedetector/j;

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a(Lcom/sumsub/sns/internal/core/domain/facedetector/j;)V

    goto :goto_2

    .line 47
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 48
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 49
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->a(Landroid/graphics/Bitmap;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 50
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 51
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_2

    .line 52
    :cond_4
    new-instance p2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->f:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 54
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 55
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    .line 56
    :cond_5
    :goto_2
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 57
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;Lcom/sumsub/sns/internal/features/presentation/prooface/session/i0;)Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->i:Lkotlinx/coroutines/flow/m;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    const-string p1, "ImageGathering phase: started"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->i:Lkotlinx/coroutines/flow/m;

    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a:Lkotlinx/coroutines/m0;

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/prooface/session/L;

    invoke-direct {v9, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/L;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;)V

    invoke-static {p1, v2, v9}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 4
    iput v7, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->g:Lkotlinx/coroutines/flow/e;

    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 7
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/C;

    invoke-direct {p1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/F;)V

    .line 8
    sget-wide v9, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->q:J

    .line 9
    invoke-static {p1, v9, v10}, Lkotlinx/coroutines/flow/g;->j0(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    .line 10
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G;

    invoke-direct {v2, v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    .line 11
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_7

    goto :goto_1

    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1
    if-ne p1, v1, :cond_8

    goto :goto_9

    .line 12
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->c:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->b()V

    .line 13
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    .line 14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->l:Lkotlinx/coroutines/flow/n;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/z;

    invoke-direct {v2, v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/z;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/flow/g;->G(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_9

    goto :goto_3

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    if-ne p1, v1, :cond_a

    goto :goto_9

    .line 15
    :cond_a
    :goto_4
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/s;

    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->k:Landroid/graphics/Bitmap;

    const/4 v6, 0x0

    invoke-direct {p1, v2, v6}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/s;-><init>(Landroid/graphics/Bitmap;Z)V

    .line 16
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->n:Lkotlinx/coroutines/flow/n;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    invoke-interface {v2, p1, v0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_9

    .line 17
    :cond_b
    :goto_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    .line 18
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->l:Lkotlinx/coroutines/flow/w;

    .line 19
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;

    invoke-direct {v4, p1, v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, v4, v0}, Lkotlinx/coroutines/flow/g;->G(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_c

    goto :goto_6

    :cond_c
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_6
    if-ne p1, v1, :cond_d

    goto :goto_9

    .line 20
    :cond_d
    :goto_7
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K;->c:I

    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->o:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_e

    goto :goto_8

    :cond_e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_8
    if-ne p1, v1, :cond_f

    :goto_9
    return-object v1

    .line 22
    :cond_f
    :goto_a
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->c:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;->c()V

    .line 23
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->j:Lcom/sumsub/sns/internal/core/common/a;

    monitor-enter p1

    .line 24
    :try_start_0
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_b

    :catchall_0
    move-exception v0

    goto :goto_c

    .line 25
    :cond_10
    :goto_b
    iput-object v8, p1, Lcom/sumsub/sns/internal/core/common/a;->b:Landroid/graphics/Bitmap;

    .line 26
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const-string p1, "ImageGathering phase: finished"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :goto_c
    monitor-exit p1

    throw v0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/domain/facedetector/j;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 58
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 59
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->b:Lcom/sumsub/sns/internal/core/common/U0;

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 62
    iget v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->g:I

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->f:I

    const/4 v11, 0x0

    if-lt v2, v4, :cond_0

    .line 63
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/J0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/J0;

    goto :goto_0

    .line 64
    :cond_0
    iget-wide v4, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->h:J

    cmp-long v2, v9, v4

    if-gez v2, :cond_1

    .line 65
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/L0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/L0;

    goto :goto_0

    .line 66
    :cond_1
    const-string v2, "SegmentSender: face segment enqueued"

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 67
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 68
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/domain/facedetector/j;->b:Landroid/util/Size;

    .line 69
    const-string v2, "SegmentSender: enqueueSegment"

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 70
    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->a:Lkotlinx/coroutines/m0;

    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/prooface/session/P0;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v6, "OK"

    move-object v2, v15

    invoke-direct/range {v2 .. v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/P0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 71
    iget v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->g:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->g:I

    const-wide/16 v4, 0xc8

    add-long/2addr v9, v4

    .line 72
    iput-wide v9, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->h:J

    .line 73
    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->f:I

    if-ne v2, v4, :cond_2

    if-lez v2, :cond_2

    .line 74
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->a:Lkotlinx/coroutines/m0;

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/prooface/session/Q0;

    invoke-direct {v8, v3, v11}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/Q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 75
    :cond_2
    iget v2, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->g:I

    int-to-float v2, v2

    iget v3, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->f:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 76
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;

    invoke-direct {v3, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;-><init>(F)V

    move-object v2, v3

    .line 77
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ImageGathering phase: sendSegmentResult: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 78
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;

    if-eqz v3, :cond_4

    .line 79
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;

    .line 80
    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;->a:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v4

    if-nez v3, :cond_3

    .line 81
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/a;

    .line 82
    iget-object v12, v0, Lcom/sumsub/sns/internal/core/domain/facedetector/n;->a:Landroid/graphics/Bitmap;

    .line 83
    :try_start_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const v5, 0x3e4ccccd    # 0.2f

    .line 84
    invoke-virtual {v0, v5, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    const/high16 v5, -0x40800000    # -1.0f

    .line 85
    invoke-virtual {v0, v5, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 86
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v16

    const/16 v18, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v12 .. v18}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 87
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/r;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 88
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/a;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 89
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 90
    invoke-virtual {v3, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    move-object v0, v11

    .line 91
    :goto_1
    iput-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->k:Landroid/graphics/Bitmap;

    .line 92
    :cond_3
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->a:Lkotlinx/coroutines/m0;

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/J;

    invoke-direct {v6, v1, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Lcom/sumsub/sns/internal/features/presentation/prooface/session/M0;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 93
    :cond_4
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/J0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/J0;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 94
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/K0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/K0;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 95
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/L0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/L0;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    .line 96
    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_2
    return-void
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)Z
    .locals 1

    .line 30
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f1;

    invoke-direct {v0, p1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f1;-><init>(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;Landroid/graphics/RectF;)V

    invoke-virtual {p3, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final getState()Lkotlinx/coroutines/flow/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N;->p:Lkotlinx/coroutines/flow/w;

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
.end method
