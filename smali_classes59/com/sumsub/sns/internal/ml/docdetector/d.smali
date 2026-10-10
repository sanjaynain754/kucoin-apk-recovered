.class public final Lcom/sumsub/sns/internal/ml/docdetector/d;
.super Lcom/sumsub/sns/internal/ml/core/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Lcom/sumsub/sns/internal/ml/autocapture/a;

.field public final i:[I

.field public final j:Ljava/nio/ByteBuffer;

.field public final k:Ljava/nio/ByteBuffer;

.field public final l:Lkotlin/Lazy;

.field public final m:I

.field public final n:Lcom/sumsub/sns/internal/ml/core/b;

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Lcom/sumsub/sns/internal/ml/autocapture/a;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "MlSolution.DocCapture"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/ml/core/h;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->g:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    iput-object v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->i:[I

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iput-object v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    new-instance v0, Lcom/sumsub/sns/internal/ml/docdetector/e;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/ml/docdetector/e;-><init>(Lcom/sumsub/sns/internal/ml/docdetector/d;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->l:Lkotlin/Lazy;

    .line 38
    .line 39
    const-string v0, "Doc bounds detector"

    .line 40
    .line 41
    iput-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->o:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v1, Lcom/sumsub/sns/internal/ml/core/b;

    .line 44
    .line 45
    iget-boolean v5, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 46
    .line 47
    const-string v6, "MlSolution.DocCapture"

    .line 48
    move-object v2, p1

    .line 49
    move-object v3, p2

    .line 50
    move-object v4, p3

    .line 51
    .line 52
    .line 53
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/ml/core/b;-><init>(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;ZLjava/lang/String;)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->n:Lcom/sumsub/sns/internal/ml/core/b;

    .line 56
    .line 57
    iget-object p1, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 61
    move-result p1

    .line 62
    .line 63
    iget-object p2, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 67
    move-result p2

    .line 68
    mul-int/2addr p2, p1

    .line 69
    .line 70
    new-array p1, p2, [I

    .line 71
    .line 72
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->i:[I

    .line 73
    .line 74
    iget-object p1, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 78
    move-result p1

    .line 79
    .line 80
    iget-object p2, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 84
    move-result p2

    .line 85
    mul-int/2addr p2, p1

    .line 86
    .line 87
    mul-int/lit8 p2, p2, 0xc

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 95
    move-result-object p2

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    iget p1, p4, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 103
    .line 104
    iput p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->m:I

    .line 105
    .line 106
    mul-int/lit8 p1, p1, 0x14

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 114
    move-result-object p2

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    .line 120
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/docdetector/d;)[[[F
    .locals 3

    .line 52
    iget p0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->m:I

    new-array v0, p0, [[F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    const/4 v2, 0x5

    .line 53
    new-array v2, v2, [F

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 54
    :cond_0
    filled-new-array {v0}, [[[F

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lcom/sumsub/sns/internal/ml/docdetector/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/ml/docdetector/c;

    iget v1, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/ml/docdetector/c;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/ml/docdetector/c;-><init>(Lcom/sumsub/sns/internal/ml/docdetector/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 55
    iget v2, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->a:J

    iget-object v0, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->b:Landroid/graphics/Bitmap;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 57
    iget-object p3, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 58
    iget-object p3, p3, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 59
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p3

    .line 60
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 61
    iget-object v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 62
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/4 v6, 0x0

    .line 63
    invoke-static {p1, p3, v2, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p2, :cond_3

    .line 64
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/ml/docdetector/d;->a(Landroid/graphics/Bitmap;)V

    .line 65
    :cond_3
    iput-object p1, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->b:Landroid/graphics/Bitmap;

    iput-wide v4, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->a:J

    iput v3, v0, Lcom/sumsub/sns/internal/ml/docdetector/c;->e:I

    .line 66
    invoke-static {p0, p1, v0}, Lcom/sumsub/sns/internal/ml/core/h;->a(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p1

    move-wide p1, v4

    .line 67
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/n;

    .line 68
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 69
    instance-of v0, p3, Lcom/sumsub/sns/internal/ml/core/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 70
    check-cast p3, Lcom/sumsub/sns/internal/ml/core/l;

    .line 71
    iget-object p3, p3, Lcom/sumsub/sns/internal/ml/core/l;->a:Ljava/lang/Object;

    .line 72
    check-cast p3, Lcom/sumsub/sns/internal/ml/docdetector/a;

    if-eqz p3, :cond_5

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v10, v0, p1

    .line 74
    iget v3, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->a:I

    iget v4, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->b:I

    iget v5, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->c:I

    iget v6, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->d:I

    iget v7, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->e:F

    iget-wide v8, p3, Lcom/sumsub/sns/internal/ml/docdetector/a;->f:J

    .line 75
    new-instance v2, Lcom/sumsub/sns/internal/ml/docdetector/a;

    invoke-direct/range {v2 .. v11}, Lcom/sumsub/sns/internal/ml/docdetector/a;-><init>(IIIIFJJ)V

    return-object v2

    :cond_5
    return-object v1
.end method

.method public final a(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    const/4 v1, 0x5

    const/4 v2, 0x4

    if-ge v0, v1, :cond_4

    .line 3
    iget v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->m:I

    move v3, p1

    :goto_1
    if-ge v3, v1, :cond_0

    .line 4
    iget-object v4, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->l:Lkotlin/Lazy;

    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[[F

    .line 5
    aget-object v4, v4, p1

    aget-object v4, v4, v3

    iget-object v5, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v5

    aput v5, v4, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 6
    :cond_0
    iget v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->m:I

    move v3, p1

    :goto_2
    if-ge v3, v1, :cond_3

    if-ge v0, v2, :cond_2

    .line 7
    rem-int/lit8 v4, v0, 0x2

    if-nez v4, :cond_1

    .line 8
    iget-object v4, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->l:Lkotlin/Lazy;

    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[[F

    .line 9
    aget-object v4, v4, p1

    aget-object v4, v4, v3

    aget v5, v4, v0

    .line 10
    iget-object v6, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 11
    iget-object v6, v6, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 12
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    aput v5, v4, v0

    goto :goto_3

    .line 13
    :cond_1
    iget-object v4, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->l:Lkotlin/Lazy;

    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[[F

    .line 14
    aget-object v4, v4, p1

    aget-object v4, v4, v3

    aget v5, v4, v0

    .line 15
    iget-object v6, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 16
    iget-object v6, v6, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 17
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    aput v5, v4, v0

    :cond_2
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 18
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[[F

    .line 19
    aget-object v0, v0, p1

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    array-length v3, v0

    move v4, p1

    :goto_4
    if-ge v4, v3, :cond_6

    aget-object v5, v0, v4

    .line 22
    aget v6, v5, v2

    iget-object v7, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 23
    iget v7, v7, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

    cmpl-float v6, v6, v7

    if-lez v6, :cond_5

    .line 24
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 25
    :cond_6
    new-instance v0, Lcom/sumsub/sns/internal/ml/docdetector/b;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/docdetector/b;-><init>()V

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_7
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 28
    new-instance v3, Lcom/sumsub/sns/internal/ml/docdetector/a;

    .line 29
    aget p1, v0, p1

    float-to-int v4, p1

    const/4 p1, 0x1

    .line 30
    aget p1, v0, p1

    float-to-int v5, p1

    const/4 p1, 0x2

    .line 31
    aget p1, v0, p1

    float-to-int v6, p1

    const/4 p1, 0x3

    .line 32
    aget p1, v0, p1

    float-to-int v7, p1

    .line 33
    aget v8, v0, v2

    const-wide/16 v11, -0x1

    move-wide v9, p2

    .line 34
    invoke-direct/range {v3 .. v12}, Lcom/sumsub/sns/internal/ml/docdetector/a;-><init>(IIIIFJJ)V

    return-object v3
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 9

    .line 76
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->g:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "scaled_frame_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ".jpg"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "saving to "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "MlSolution.DocCapture"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 81
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 82
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x5a

    .line 83
    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p1

    .line 84
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 85
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    if-eqz p1, :cond_1

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 86
    const-string v4, "MlSolution.DocCapture"

    const-string/jumbo v5, "saved!"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 9

    .line 35
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->i:[I

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 37
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 38
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 40
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 41
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 42
    iget-object v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 43
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_0

    .line 44
    iget-object v4, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->i:[I

    .line 45
    iget-object v5, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->h:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 46
    iget-object v5, v5, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 47
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v5

    mul-int/2addr v5, v1

    add-int/2addr v5, v3

    aget v4, v4, v5

    .line 48
    iget-object v5, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    shr-int/lit8 v6, v4, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    const/4 v7, 0x0

    sub-float/2addr v6, v7

    const/high16 v8, 0x437f0000    # 255.0f

    div-float/2addr v6, v8

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 49
    iget-object v5, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    shr-int/lit8 v6, v4, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    sub-float/2addr v6, v7

    div-float/2addr v6, v8

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 50
    iget-object v5, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    and-int/lit16 v4, v4, 0xff

    int-to-float v4, v4

    sub-float/2addr v4, v7

    div-float/2addr v4, v8

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->j:Ljava/nio/ByteBuffer;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/sumsub/sns/internal/ml/core/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->n:Lcom/sumsub/sns/internal/ml/core/b;

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

.method public final c()Ljava/util/Map;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->k:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-object v0
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
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/docdetector/d;->o:Ljava/lang/String;

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
