.class public Le1/h;
.super Ljava/lang/Object;
.source "GradientFillContent.java"

# interfaces
.implements Le1/e;
.implements Lf1/a$b;
.implements Le1/k;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Z

.field public final c:Lcom/airbnb/lottie/model/layer/a;

.field public final d:Landroidx/collection/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LongSparseArray<",
            "Landroid/graphics/LinearGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroidx/collection/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LongSparseArray<",
            "Landroid/graphics/RadialGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Landroid/graphics/Path;

.field public final g:Landroid/graphics/Paint;

.field public final h:Landroid/graphics/RectF;

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le1/m;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lcom/airbnb/lottie/model/content/GradientType;

.field public final k:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Lj1/d;",
            "Lj1/d;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lf1/q;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final q:Lcom/airbnb/lottie/LottieDrawable;

.field public final r:I

.field public s:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public t:F

.field public u:Lf1/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieDrawable;Lcom/airbnb/lottie/h;Lcom/airbnb/lottie/model/layer/a;Lj1/e;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/collection/LongSparseArray;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/collection/LongSparseArray;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Le1/h;->d:Landroidx/collection/LongSparseArray;

    .line 11
    .line 12
    new-instance v0, Landroidx/collection/LongSparseArray;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/collection/LongSparseArray;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Le1/h;->e:Landroidx/collection/LongSparseArray;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 25
    .line 26
    new-instance v1, Ld1/a;

    .line 27
    const/4 v2, 0x1

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2}, Ld1/a;-><init>(I)V

    .line 31
    .line 32
    iput-object v1, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 33
    .line 34
    new-instance v1, Landroid/graphics/RectF;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 38
    .line 39
    iput-object v1, p0, Le1/h;->h:Landroid/graphics/RectF;

    .line 40
    .line 41
    new-instance v1, Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    iput-object v1, p0, Le1/h;->i:Ljava/util/List;

    .line 47
    const/4 v1, 0x0

    .line 48
    .line 49
    iput v1, p0, Le1/h;->t:F

    .line 50
    .line 51
    iput-object p3, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p4}, Lj1/e;->f()Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    iput-object v1, p0, Le1/h;->a:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p4}, Lj1/e;->i()Z

    .line 61
    move-result v1

    .line 62
    .line 63
    iput-boolean v1, p0, Le1/h;->b:Z

    .line 64
    .line 65
    iput-object p1, p0, Le1/h;->q:Lcom/airbnb/lottie/LottieDrawable;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Lj1/e;->e()Lcom/airbnb/lottie/model/content/GradientType;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iput-object p1, p0, Le1/h;->j:Lcom/airbnb/lottie/model/content/GradientType;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4}, Lj1/e;->c()Landroid/graphics/Path$FillType;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/airbnb/lottie/h;->d()F

    .line 82
    move-result p1

    .line 83
    .line 84
    const/high16 p2, 0x42000000    # 32.0f

    .line 85
    div-float/2addr p1, p2

    .line 86
    float-to-int p1, p1

    .line 87
    .line 88
    iput p1, p0, Le1/h;->r:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p4}, Lj1/e;->d()Li1/c;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Li1/c;->a()Lf1/a;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    iput-object p1, p0, Le1/h;->k:Lf1/a;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p4}, Lj1/e;->g()Li1/d;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Li1/d;->a()Lf1/a;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    iput-object p1, p0, Le1/h;->l:Lf1/a;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4}, Lj1/e;->h()Li1/f;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Li1/f;->a()Lf1/a;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iput-object p1, p0, Le1/h;->m:Lf1/a;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p4}, Lj1/e;->b()Li1/f;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Li1/f;->a()Lf1/a;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    iput-object p1, p0, Le1/h;->n:Lf1/a;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/layer/a;->w()Lj1/a;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    if-eqz p1, :cond_0

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/layer/a;->w()Lj1/a;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lj1/a;->a()Li1/b;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Li1/b;->a()Lf1/a;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    iput-object p1, p0, Le1/h;->s:Lf1/a;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 176
    .line 177
    iget-object p1, p0, Le1/h;->s:Lf1/a;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 181
    .line 182
    .line 183
    :cond_0
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/layer/a;->y()Lm1/j;

    .line 184
    move-result-object p1

    .line 185
    .line 186
    if-eqz p1, :cond_1

    .line 187
    .line 188
    new-instance p1, Lf1/c;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/layer/a;->y()Lm1/j;

    .line 192
    move-result-object p2

    .line 193
    .line 194
    .line 195
    invoke-direct {p1, p0, p3, p2}, Lf1/c;-><init>(Lf1/a$b;Lcom/airbnb/lottie/model/layer/a;Lm1/j;)V

    .line 196
    .line 197
    iput-object p1, p0, Le1/h;->u:Lf1/c;

    .line 198
    :cond_1
    return-void
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
.end method

.method private c([I)[I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Le1/h;->p:Lf1/q;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lf1/q;->h()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, [Ljava/lang/Integer;

    .line 11
    array-length v1, p1

    .line 12
    array-length v2, v0

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    :goto_0
    array-length v1, p1

    .line 17
    .line 18
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    aget-object v1, v0, v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    move-result v1

    .line 25
    .line 26
    aput v1, p1, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    array-length p1, v0

    .line 31
    .line 32
    new-array p1, p1, [I

    .line 33
    :goto_1
    array-length v1, v0

    .line 34
    .line 35
    if-ge v3, v1, :cond_1

    .line 36
    .line 37
    aget-object v1, v0, v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    move-result v1

    .line 42
    .line 43
    aput v1, p1, v3

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    return-object p1
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

.method private i()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Le1/h;->m:Lf1/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lf1/a;->f()F

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Le1/h;->r:I

    .line 9
    int-to-float v1, v1

    .line 10
    mul-float/2addr v0, v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 14
    move-result v0

    .line 15
    .line 16
    iget-object v1, p0, Le1/h;->n:Lf1/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lf1/a;->f()F

    .line 20
    move-result v1

    .line 21
    .line 22
    iget v2, p0, Le1/h;->r:I

    .line 23
    int-to-float v2, v2

    .line 24
    mul-float/2addr v1, v2

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 28
    move-result v1

    .line 29
    .line 30
    iget-object v2, p0, Le1/h;->k:Lf1/a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lf1/a;->f()F

    .line 34
    move-result v2

    .line 35
    .line 36
    iget v3, p0, Le1/h;->r:I

    .line 37
    int-to-float v3, v3

    .line 38
    mul-float/2addr v2, v3

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 42
    move-result v2

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const/16 v3, 0x20f

    .line 47
    mul-int/2addr v3, v0

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    const/16 v3, 0x11

    .line 51
    .line 52
    :goto_0
    if-eqz v1, :cond_1

    .line 53
    .line 54
    mul-int/lit8 v3, v3, 0x1f

    .line 55
    mul-int/2addr v3, v1

    .line 56
    .line 57
    :cond_1
    if-eqz v2, :cond_2

    .line 58
    .line 59
    mul-int/lit8 v3, v3, 0x1f

    .line 60
    mul-int/2addr v3, v2

    .line 61
    :cond_2
    return v3
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
.end method

.method private j()Landroid/graphics/LinearGradient;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Le1/h;->i()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Le1/h;->d:Landroidx/collection/LongSparseArray;

    .line 7
    int-to-long v2, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2, v3}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/LinearGradient;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Le1/h;->m:Lf1/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Landroid/graphics/PointF;

    .line 25
    .line 26
    iget-object v1, p0, Le1/h;->n:Lf1/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Landroid/graphics/PointF;

    .line 33
    .line 34
    iget-object v4, p0, Le1/h;->k:Lf1/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lf1/a;->h()Ljava/lang/Object;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    check-cast v4, Lj1/d;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Lj1/d;->d()[I

    .line 44
    move-result-object v5

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v5}, Le1/h;->c([I)[I

    .line 48
    move-result-object v11

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lj1/d;->e()[F

    .line 52
    move-result-object v12

    .line 53
    .line 54
    new-instance v6, Landroid/graphics/LinearGradient;

    .line 55
    .line 56
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 57
    .line 58
    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 59
    .line 60
    iget v9, v1, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    iget v10, v1, Landroid/graphics/PointF;->y:F

    .line 63
    .line 64
    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 68
    .line 69
    iget-object v0, p0, Le1/h;->d:Landroidx/collection/LongSparseArray;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2, v3, v6}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 73
    return-object v6
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private k()Landroid/graphics/RadialGradient;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Le1/h;->i()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Le1/h;->e:Landroidx/collection/LongSparseArray;

    .line 7
    int-to-long v2, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2, v3}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/RadialGradient;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Le1/h;->m:Lf1/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Landroid/graphics/PointF;

    .line 25
    .line 26
    iget-object v1, p0, Le1/h;->n:Lf1/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lf1/a;->h()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Landroid/graphics/PointF;

    .line 33
    .line 34
    iget-object v4, p0, Le1/h;->k:Lf1/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lf1/a;->h()Ljava/lang/Object;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    check-cast v4, Lj1/d;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Lj1/d;->d()[I

    .line 44
    move-result-object v5

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v5}, Le1/h;->c([I)[I

    .line 48
    move-result-object v10

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lj1/d;->e()[F

    .line 52
    move-result-object v11

    .line 53
    .line 54
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 57
    .line 58
    iget v0, v1, Landroid/graphics/PointF;->x:F

    .line 59
    .line 60
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 61
    sub-float/2addr v0, v7

    .line 62
    float-to-double v4, v0

    .line 63
    sub-float/2addr v1, v8

    .line 64
    float-to-double v0, v1

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    .line 68
    move-result-wide v0

    .line 69
    double-to-float v0, v0

    .line 70
    const/4 v1, 0x0

    .line 71
    .line 72
    cmpg-float v1, v0, v1

    .line 73
    .line 74
    if-gtz v1, :cond_1

    .line 75
    .line 76
    .line 77
    const v0, 0x3a83126f    # 0.001f

    .line 78
    :cond_1
    move v9, v0

    .line 79
    .line 80
    new-instance v6, Landroid/graphics/RadialGradient;

    .line 81
    .line 82
    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v6 .. v12}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 86
    .line 87
    iget-object v0, p0, Le1/h;->e:Landroidx/collection/LongSparseArray;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2, v3, v6}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 91
    return-object v6
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lp1/c;)V
    .locals 2
    .param p2    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lp1/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/airbnb/lottie/m0;->d:Ljava/lang/Integer;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Le1/h;->l:Lf1/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/airbnb/lottie/m0;->K:Landroid/graphics/ColorFilter;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-ne p1, v0, :cond_3

    .line 16
    .line 17
    iget-object p1, p0, Le1/h;->o:Lf1/a;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/model/layer/a;->G(Lf1/a;)V

    .line 25
    .line 26
    :cond_1
    if-nez p2, :cond_2

    .line 27
    .line 28
    iput-object v1, p0, Le1/h;->o:Lf1/a;

    .line 29
    return-void

    .line 30
    .line 31
    :cond_2
    new-instance p1, Lf1/q;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p2}, Lf1/q;-><init>(Lp1/c;)V

    .line 35
    .line 36
    iput-object p1, p0, Le1/h;->o:Lf1/a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 40
    .line 41
    iget-object p1, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 42
    .line 43
    iget-object p2, p0, Le1/h;->o:Lf1/a;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 47
    return-void

    .line 48
    .line 49
    :cond_3
    sget-object v0, Lcom/airbnb/lottie/m0;->L:[Ljava/lang/Integer;

    .line 50
    .line 51
    if-ne p1, v0, :cond_6

    .line 52
    .line 53
    iget-object p1, p0, Le1/h;->p:Lf1/q;

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object v0, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/model/layer/a;->G(Lf1/a;)V

    .line 61
    .line 62
    :cond_4
    if-nez p2, :cond_5

    .line 63
    .line 64
    iput-object v1, p0, Le1/h;->p:Lf1/q;

    .line 65
    return-void

    .line 66
    .line 67
    :cond_5
    iget-object p1, p0, Le1/h;->d:Landroidx/collection/LongSparseArray;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/collection/LongSparseArray;->clear()V

    .line 71
    .line 72
    iget-object p1, p0, Le1/h;->e:Landroidx/collection/LongSparseArray;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/collection/LongSparseArray;->clear()V

    .line 76
    .line 77
    new-instance p1, Lf1/q;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, p2}, Lf1/q;-><init>(Lp1/c;)V

    .line 81
    .line 82
    iput-object p1, p0, Le1/h;->p:Lf1/q;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 86
    .line 87
    iget-object p1, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 88
    .line 89
    iget-object p2, p0, Le1/h;->p:Lf1/q;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 93
    return-void

    .line 94
    .line 95
    :cond_6
    sget-object v0, Lcom/airbnb/lottie/m0;->j:Ljava/lang/Float;

    .line 96
    .line 97
    if-ne p1, v0, :cond_8

    .line 98
    .line 99
    iget-object p1, p0, Le1/h;->s:Lf1/a;

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 105
    return-void

    .line 106
    .line 107
    :cond_7
    new-instance p1, Lf1/q;

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, p2}, Lf1/q;-><init>(Lp1/c;)V

    .line 111
    .line 112
    iput-object p1, p0, Le1/h;->s:Lf1/a;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 116
    .line 117
    iget-object p1, p0, Le1/h;->c:Lcom/airbnb/lottie/model/layer/a;

    .line 118
    .line 119
    iget-object p2, p0, Le1/h;->s:Lf1/a;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 123
    return-void

    .line 124
    .line 125
    :cond_8
    sget-object v0, Lcom/airbnb/lottie/m0;->e:Ljava/lang/Integer;

    .line 126
    .line 127
    if-ne p1, v0, :cond_9

    .line 128
    .line 129
    iget-object v0, p0, Le1/h;->u:Lf1/c;

    .line 130
    .line 131
    if-eqz v0, :cond_9

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p2}, Lf1/c;->b(Lp1/c;)V

    .line 135
    return-void

    .line 136
    .line 137
    :cond_9
    sget-object v0, Lcom/airbnb/lottie/m0;->G:Ljava/lang/Float;

    .line 138
    .line 139
    if-ne p1, v0, :cond_a

    .line 140
    .line 141
    iget-object v0, p0, Le1/h;->u:Lf1/c;

    .line 142
    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p2}, Lf1/c;->f(Lp1/c;)V

    .line 147
    return-void

    .line 148
    .line 149
    :cond_a
    sget-object v0, Lcom/airbnb/lottie/m0;->H:Ljava/lang/Float;

    .line 150
    .line 151
    if-ne p1, v0, :cond_b

    .line 152
    .line 153
    iget-object v0, p0, Le1/h;->u:Lf1/c;

    .line 154
    .line 155
    if-eqz v0, :cond_b

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p2}, Lf1/c;->c(Lp1/c;)V

    .line 159
    return-void

    .line 160
    .line 161
    :cond_b
    sget-object v0, Lcom/airbnb/lottie/m0;->I:Ljava/lang/Float;

    .line 162
    .line 163
    if-ne p1, v0, :cond_c

    .line 164
    .line 165
    iget-object v0, p0, Le1/h;->u:Lf1/c;

    .line 166
    .line 167
    if-eqz v0, :cond_c

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p2}, Lf1/c;->d(Lp1/c;)V

    .line 171
    return-void

    .line 172
    .line 173
    :cond_c
    sget-object v0, Lcom/airbnb/lottie/m0;->J:Ljava/lang/Float;

    .line 174
    .line 175
    if-ne p1, v0, :cond_d

    .line 176
    .line 177
    iget-object p1, p0, Le1/h;->u:Lf1/c;

    .line 178
    .line 179
    if-eqz p1, :cond_d

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p2}, Lf1/c;->g(Lp1/c;)V

    .line 183
    :cond_d
    return-void
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    .line 1
    .line 2
    iget-object p3, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 6
    const/4 p3, 0x0

    .line 7
    move v0, p3

    .line 8
    .line 9
    :goto_0
    iget-object v1, p0, Le1/h;->i:Ljava/util/List;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    move-result v1

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 18
    .line 19
    iget-object v2, p0, Le1/h;->i:Ljava/util/List;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Le1/m;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    iget-object p2, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p1, p3}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    iget p2, p1, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    const/high16 p3, 0x3f800000    # 1.0f

    .line 45
    sub-float/2addr p2, p3

    .line 46
    .line 47
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 48
    sub-float/2addr v0, p3

    .line 49
    .line 50
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 51
    add-float/2addr v1, p3

    .line 52
    .line 53
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 54
    add-float/2addr v2, p3

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 58
    return-void
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

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Le1/h;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/d;->g()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    const-string v1, "GradientFillContent#draw"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/airbnb/lottie/d;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 23
    const/4 v0, 0x0

    .line 24
    move v2, v0

    .line 25
    .line 26
    :goto_0
    iget-object v3, p0, Le1/h;->i:Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 30
    move-result v3

    .line 31
    .line 32
    if-ge v2, v3, :cond_2

    .line 33
    .line 34
    iget-object v3, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 35
    .line 36
    iget-object v4, p0, Le1/h;->i:Ljava/util/List;

    .line 37
    .line 38
    .line 39
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    check-cast v4, Le1/m;

    .line 43
    .line 44
    .line 45
    invoke-interface {v4}, Le1/m;->getPath()Landroid/graphics/Path;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    iget-object v2, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 55
    .line 56
    iget-object v3, p0, Le1/h;->h:Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 60
    .line 61
    iget-object v2, p0, Le1/h;->j:Lcom/airbnb/lottie/model/content/GradientType;

    .line 62
    .line 63
    sget-object v3, Lcom/airbnb/lottie/model/content/GradientType;->LINEAR:Lcom/airbnb/lottie/model/content/GradientType;

    .line 64
    .line 65
    if-ne v2, v3, :cond_3

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Le1/h;->j()Landroid/graphics/LinearGradient;

    .line 69
    move-result-object v2

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-direct {p0}, Le1/h;->k()Landroid/graphics/RadialGradient;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-virtual {v2, p2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 78
    .line 79
    iget-object p2, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 83
    .line 84
    iget-object p2, p0, Le1/h;->o:Lf1/a;

    .line 85
    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    iget-object v2, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lf1/a;->h()Ljava/lang/Object;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    check-cast p2, Landroid/graphics/ColorFilter;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 98
    .line 99
    :cond_4
    iget-object p2, p0, Le1/h;->s:Lf1/a;

    .line 100
    .line 101
    if-eqz p2, :cond_7

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Lf1/a;->h()Ljava/lang/Object;

    .line 105
    move-result-object p2

    .line 106
    .line 107
    check-cast p2, Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 111
    move-result p2

    .line 112
    const/4 v2, 0x0

    .line 113
    .line 114
    cmpl-float v2, p2, v2

    .line 115
    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    iget-object v2, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 119
    const/4 v3, 0x0

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 123
    goto :goto_2

    .line 124
    .line 125
    :cond_5
    iget v2, p0, Le1/h;->t:F

    .line 126
    .line 127
    cmpl-float v2, p2, v2

    .line 128
    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    new-instance v2, Landroid/graphics/BlurMaskFilter;

    .line 132
    .line 133
    sget-object v3, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 134
    .line 135
    .line 136
    invoke-direct {v2, p2, v3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 137
    .line 138
    iget-object v3, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 142
    .line 143
    :cond_6
    :goto_2
    iput p2, p0, Le1/h;->t:F

    .line 144
    .line 145
    :cond_7
    iget-object p2, p0, Le1/h;->u:Lf1/c;

    .line 146
    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    iget-object v2, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, v2}, Lf1/c;->a(Landroid/graphics/Paint;)V

    .line 153
    :cond_8
    int-to-float p2, p3

    .line 154
    .line 155
    const/high16 p3, 0x437f0000    # 255.0f

    .line 156
    div-float/2addr p2, p3

    .line 157
    .line 158
    iget-object v2, p0, Le1/h;->l:Lf1/a;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    check-cast v2, Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 168
    move-result v2

    .line 169
    int-to-float v2, v2

    .line 170
    mul-float/2addr p2, v2

    .line 171
    .line 172
    const/high16 v2, 0x42c80000    # 100.0f

    .line 173
    div-float/2addr p2, v2

    .line 174
    mul-float/2addr p2, p3

    .line 175
    float-to-int p2, p2

    .line 176
    .line 177
    iget-object p3, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 178
    .line 179
    const/16 v2, 0xff

    .line 180
    .line 181
    .line 182
    invoke-static {p2, v0, v2}, Lo1/k;->c(III)I

    .line 183
    move-result p2

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 187
    .line 188
    iget-object p2, p0, Le1/h;->f:Landroid/graphics/Path;

    .line 189
    .line 190
    iget-object p3, p0, Le1/h;->g:Landroid/graphics/Paint;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lcom/airbnb/lottie/d;->g()Z

    .line 197
    move-result p1

    .line 198
    .line 199
    if-eqz p1, :cond_9

    .line 200
    .line 201
    .line 202
    invoke-static {v1}, Lcom/airbnb/lottie/d;->c(Ljava/lang/String;)F

    .line 203
    :cond_9
    :goto_3
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le1/h;->q:Lcom/airbnb/lottie/LottieDrawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieDrawable;->invalidateSelf()V

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

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le1/c;",
            ">;",
            "Ljava/util/List<",
            "Le1/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 5
    move-result v0

    .line 6
    .line 7
    if-ge p1, v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Le1/c;

    .line 14
    .line 15
    instance-of v1, v0, Le1/m;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Le1/h;->i:Ljava/util/List;

    .line 20
    .line 21
    check-cast v0, Le1/m;

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
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

.method public g(Lh1/d;ILjava/util/List;Lh1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/d;",
            "I",
            "Ljava/util/List<",
            "Lh1/d;",
            ">;",
            "Lh1/d;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2, p3, p4, p0}, Lo1/k;->k(Lh1/d;ILjava/util/List;Lh1/d;Le1/k;)V

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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le1/h;->a:Ljava/lang/String;

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
.end method
