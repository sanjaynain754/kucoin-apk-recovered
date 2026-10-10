.class public Lo5/a;
.super Ljava/lang/Object;
.source "AnimatedDrawableBackendImpl.java"

# interfaces
.implements Lm5/a;


# instance fields
.field public final a:Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;

.field public final b:Lm5/d;

.field public final c:Lm5/b;

.field public final d:Landroid/graphics/Rect;

.field public final e:[I

.field public final f:[I

.field public final g:I

.field public final h:[Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

.field public final i:Landroid/graphics/Rect;

.field public final j:Landroid/graphics/Rect;

.field public final k:Z

.field public final l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;Lm5/d;Landroid/graphics/Rect;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lo5/a;->i:Landroid/graphics/Rect;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lo5/a;->j:Landroid/graphics/Rect;

    .line 18
    .line 19
    iput-object p1, p0, Lo5/a;->a:Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;

    .line 20
    .line 21
    iput-object p2, p0, Lo5/a;->b:Lm5/d;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lm5/d;->d()Lm5/b;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    iput-object p2, p0, Lo5/a;->c:Lm5/b;

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Lm5/b;->h()[I

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iput-object v0, p0, Lo5/a;->e:[I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;->a([I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;->c([I)I

    .line 40
    move-result v1

    .line 41
    .line 42
    iput v1, p0, Lo5/a;->g:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;->b([I)[I

    .line 46
    move-result-object p1

    .line 47
    .line 48
    iput-object p1, p0, Lo5/a;->f:[I

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p3}, Lo5/a;->l(Lm5/b;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    iput-object p1, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 55
    .line 56
    iput-boolean p4, p0, Lo5/a;->k:Z

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Lm5/b;->a()I

    .line 60
    move-result p1

    .line 61
    .line 62
    new-array p1, p1, [Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 63
    .line 64
    iput-object p1, p0, Lo5/a;->h:[Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 65
    const/4 p1, 0x0

    .line 66
    .line 67
    :goto_0
    iget-object p2, p0, Lo5/a;->c:Lm5/b;

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Lm5/b;->a()I

    .line 71
    move-result p2

    .line 72
    .line 73
    if-ge p1, p2, :cond_0

    .line 74
    .line 75
    iget-object p2, p0, Lo5/a;->h:[Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 76
    .line 77
    iget-object p3, p0, Lo5/a;->c:Lm5/b;

    .line 78
    .line 79
    .line 80
    invoke-interface {p3, p1}, Lm5/b;->c(I)Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 81
    move-result-object p3

    .line 82
    .line 83
    aput-object p3, p2, p1

    .line 84
    .line 85
    add-int/lit8 p1, p1, 0x1

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 92
    .line 93
    iput-object p1, p0, Lo5/a;->l:Landroid/graphics/Paint;

    .line 94
    .line 95
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 96
    .line 97
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 98
    .line 99
    .line 100
    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

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
.end method

.method public static l(Lm5/b;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lm5/b;->getWidth()I

    .line 9
    move-result v1

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lm5/b;->getHeight()I

    .line 13
    move-result p0

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v0, v0, v1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Lm5/b;->getWidth()I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 31
    move-result v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 35
    move-result p1

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Lm5/b;->getHeight()I

    .line 39
    move-result p0

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 43
    move-result p0

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v0, v0, v2, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 47
    return-object v1
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lm5/b;->a()I

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
.end method

.method public b()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lm5/b;->b()I

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
.end method

.method public c(I)Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->h:[Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 3
    .line 4
    aget-object p1, v0, p1

    .line 5
    return-object p1
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
.end method

.method public d(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->e:[I

    .line 3
    .line 4
    aget p1, v0, p1

    .line 5
    return p1
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
.end method

.method public e()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

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
.end method

.method public f()Lm5/d;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->b:Lm5/d;

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

.method public g(ILandroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lm5/b;->e(I)Lm5/c;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-interface {p1}, Lm5/c;->getWidth()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-lez v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lm5/c;->getHeight()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lm5/b;->d()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p2, p1}, Lo5/a;->p(Landroid/graphics/Canvas;Lm5/c;)V

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p2

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, p2, p1}, Lo5/a;->o(Landroid/graphics/Canvas;Lm5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {p1}, Lm5/c;->dispose()V

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_1
    invoke-interface {p1}, Lm5/c;->dispose()V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :goto_2
    invoke-interface {p1}, Lm5/c;->dispose()V

    .line 48
    throw p2
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
.end method

.method public getDurationMs()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lo5/a;->g:I

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

.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lm5/b;->getHeight()I

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
.end method

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lm5/b;->getWidth()I

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
.end method

.method public h(Landroid/graphics/Rect;)Lm5/a;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lo5/a;->l(Lm5/b;Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lo5/a;

    .line 18
    .line 19
    iget-object v1, p0, Lo5/a;->a:Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;

    .line 20
    .line 21
    iget-object v2, p0, Lo5/a;->b:Lm5/d;

    .line 22
    .line 23
    iget-boolean v3, p0, Lo5/a;->k:Z

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v2, p1, v3}, Lo5/a;-><init>(Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;Lm5/d;Landroid/graphics/Rect;Z)V

    .line 27
    return-object v0
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

.method public i()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

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
.end method

.method public j(ILandroid/graphics/Canvas;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lm5/b;->e(I)Lm5/c;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lo5/a;->c:Lm5/b;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p1}, Lm5/b;->c(I)Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lo5/a;->c:Lm5/b;

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    .line 23
    invoke-interface {v2, p1}, Lm5/b;->c(I)Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    :goto_0
    :try_start_0
    invoke-interface {v0}, Lm5/c;->getWidth()I

    .line 28
    move-result v2

    .line 29
    .line 30
    if-lez v2, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Lm5/c;->getHeight()I

    .line 34
    move-result v2

    .line 35
    .line 36
    if-gtz v2, :cond_1

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_1
    iget-object v2, p0, Lo5/a;->c:Lm5/b;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Lm5/b;->d()Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p2, v0, v1, p1}, Lo5/a;->r(Landroid/graphics/Canvas;Lm5/c;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0, p2, v0, v1, p1}, Lo5/a;->q(Landroid/graphics/Canvas;Lm5/c;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-interface {v0}, Lm5/c;->dispose()V

    .line 58
    return-void

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_2
    invoke-interface {v0}, Lm5/c;->dispose()V

    .line 62
    return-void

    .line 63
    .line 64
    .line 65
    :goto_3
    invoke-interface {v0}, Lm5/c;->dispose()V

    .line 66
    throw p1
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
.end method

.method public final declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-object v0, p0, Lo5/a;->m:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public final m(Landroid/graphics/Canvas;FFLcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->g:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;->DISPOSE_TO_BACKGROUND:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$DisposalMethod;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget v0, p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->d:I

    .line 9
    int-to-float v0, v0

    .line 10
    mul-float/2addr v0, p2

    .line 11
    float-to-double v0, v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 15
    move-result-wide v0

    .line 16
    double-to-int v0, v0

    .line 17
    .line 18
    iget v1, p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->e:I

    .line 19
    int-to-float v1, v1

    .line 20
    mul-float/2addr v1, p3

    .line 21
    float-to-double v1, v1

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 25
    move-result-wide v1

    .line 26
    double-to-int v1, v1

    .line 27
    .line 28
    iget v2, p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->b:I

    .line 29
    int-to-float v2, v2

    .line 30
    mul-float/2addr v2, p2

    .line 31
    float-to-double v2, v2

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 35
    move-result-wide v2

    .line 36
    double-to-int p2, v2

    .line 37
    .line 38
    iget p4, p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->c:I

    .line 39
    int-to-float p4, p4

    .line 40
    mul-float/2addr p4, p3

    .line 41
    float-to-double p3, p4

    .line 42
    .line 43
    .line 44
    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    .line 45
    move-result-wide p3

    .line 46
    double-to-int p3, p3

    .line 47
    .line 48
    new-instance p4, Landroid/graphics/Rect;

    .line 49
    add-int/2addr v0, p2

    .line 50
    add-int/2addr v1, p3

    .line 51
    .line 52
    .line 53
    invoke-direct {p4, p2, p3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 54
    .line 55
    iget-object p2, p0, Lo5/a;->l:Landroid/graphics/Paint;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 59
    :cond_0
    return-void
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

.method public final declared-synchronized n(II)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-lt v0, p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-ge v0, p2, :cond_1

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lo5/a;->k()V

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    :cond_2
    iget-object p1, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 40
    const/4 p2, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 44
    .line 45
    iget-object p1, p0, Lo5/a;->m:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    .line 47
    return-object p1

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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
.end method

.method public final o(Landroid/graphics/Canvas;Lm5/c;)V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lo5/a;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 32
    move-result v2

    .line 33
    int-to-float v2, v2

    .line 34
    int-to-float v0, v0

    .line 35
    div-float/2addr v2, v0

    .line 36
    .line 37
    .line 38
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 39
    move-result v0

    .line 40
    int-to-float v0, v0

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v0, v1

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 50
    move-result v1

    .line 51
    int-to-float v1, v1

    .line 52
    div-float/2addr v1, v0

    .line 53
    float-to-int v1, v1

    .line 54
    .line 55
    .line 56
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    div-float/2addr v2, v0

    .line 60
    float-to-int v2, v2

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Lm5/c;->a()I

    .line 64
    move-result v3

    .line 65
    int-to-float v3, v3

    .line 66
    div-float/2addr v3, v0

    .line 67
    float-to-int v3, v3

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Lm5/c;->b()I

    .line 71
    move-result v4

    .line 72
    int-to-float v4, v4

    .line 73
    div-float/2addr v4, v0

    .line 74
    float-to-int v0, v4

    .line 75
    goto :goto_0

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 79
    move-result v1

    .line 80
    .line 81
    .line 82
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 83
    move-result v2

    .line 84
    .line 85
    .line 86
    invoke-interface {p2}, Lm5/c;->a()I

    .line 87
    move-result v3

    .line 88
    .line 89
    .line 90
    invoke-interface {p2}, Lm5/c;->b()I

    .line 91
    move-result v0

    .line 92
    :goto_0
    monitor-enter p0

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-virtual {p0, v1, v2}, Lo5/a;->n(II)Landroid/graphics/Bitmap;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    iput-object v4, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    invoke-interface {p2, v1, v2, v4}, Lm5/c;->c(IILandroid/graphics/Bitmap;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 105
    int-to-float p2, v3

    .line 106
    int-to-float v0, v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 110
    .line 111
    iget-object p2, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 112
    const/4 v0, 0x0

    .line 113
    const/4 v1, 0x0

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2, v1, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 120
    monitor-exit p0

    .line 121
    return-void

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    throw p1
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
.end method

.method public final p(Landroid/graphics/Canvas;Lm5/c;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    move-result v0

    .line 7
    int-to-double v0, v0

    .line 8
    .line 9
    iget-object v2, p0, Lo5/a;->c:Lm5/b;

    .line 10
    .line 11
    .line 12
    invoke-interface {v2}, Lm5/b;->getWidth()I

    .line 13
    move-result v2

    .line 14
    int-to-double v2, v2

    .line 15
    div-double/2addr v0, v2

    .line 16
    .line 17
    iget-object v2, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 21
    move-result v2

    .line 22
    int-to-double v2, v2

    .line 23
    .line 24
    iget-object v4, p0, Lo5/a;->c:Lm5/b;

    .line 25
    .line 26
    .line 27
    invoke-interface {v4}, Lm5/b;->getHeight()I

    .line 28
    move-result v4

    .line 29
    int-to-double v4, v4

    .line 30
    div-double/2addr v2, v4

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 34
    move-result v4

    .line 35
    int-to-double v4, v4

    .line 36
    mul-double/2addr v4, v0

    .line 37
    .line 38
    .line 39
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 40
    move-result-wide v4

    .line 41
    long-to-int v4, v4

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 45
    move-result v5

    .line 46
    int-to-double v5, v5

    .line 47
    mul-double/2addr v5, v2

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 51
    move-result-wide v5

    .line 52
    long-to-int v5, v5

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Lm5/c;->a()I

    .line 56
    move-result v6

    .line 57
    int-to-double v6, v6

    .line 58
    mul-double/2addr v6, v0

    .line 59
    double-to-int v0, v6

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Lm5/c;->b()I

    .line 63
    move-result v1

    .line 64
    int-to-double v6, v1

    .line 65
    mul-double/2addr v6, v2

    .line 66
    double-to-int v1, v6

    .line 67
    monitor-enter p0

    .line 68
    .line 69
    :try_start_0
    iget-object v2, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 73
    move-result v2

    .line 74
    .line 75
    iget-object v3, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 79
    move-result v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v2, v3}, Lo5/a;->n(II)Landroid/graphics/Bitmap;

    .line 83
    .line 84
    iget-object v6, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 85
    .line 86
    if-eqz v6, :cond_0

    .line 87
    .line 88
    .line 89
    invoke-interface {p2, v4, v5, v6}, Lm5/c;->c(IILandroid/graphics/Bitmap;)V

    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_1

    .line 93
    .line 94
    :cond_0
    :goto_0
    iget-object p2, p0, Lo5/a;->i:Landroid/graphics/Rect;

    .line 95
    const/4 v4, 0x0

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v4, v4, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 99
    .line 100
    iget-object p2, p0, Lo5/a;->j:Landroid/graphics/Rect;

    .line 101
    add-int/2addr v2, v0

    .line 102
    add-int/2addr v3, v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 106
    .line 107
    iget-object p2, p0, Lo5/a;->m:Landroid/graphics/Bitmap;

    .line 108
    .line 109
    if-eqz p2, :cond_1

    .line 110
    .line 111
    iget-object v0, p0, Lo5/a;->i:Landroid/graphics/Rect;

    .line 112
    .line 113
    iget-object v1, p0, Lo5/a;->j:Landroid/graphics/Rect;

    .line 114
    const/4 v2, 0x0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 118
    :cond_1
    monitor-exit p0

    .line 119
    return-void

    .line 120
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    throw p1
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
.end method

.method public final q(Landroid/graphics/Canvas;Lm5/c;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-lez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    .line 26
    iget-object v1, p0, Lo5/a;->d:Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 30
    move-result v1

    .line 31
    int-to-float v1, v1

    .line 32
    div-float/2addr v0, v1

    .line 33
    .line 34
    if-eqz p4, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v0, v0, p4}, Lo5/a;->m(Landroid/graphics/Canvas;FFLcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 41
    move-result p4

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 45
    move-result v1

    .line 46
    .line 47
    new-instance v2, Landroid/graphics/Rect;

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, v3, v3, p4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 52
    int-to-float v3, p4

    .line 53
    mul-float/2addr v3, v0

    .line 54
    float-to-int v3, v3

    .line 55
    int-to-float v4, v1

    .line 56
    mul-float/2addr v4, v0

    .line 57
    float-to-int v4, v4

    .line 58
    .line 59
    .line 60
    invoke-interface {p2}, Lm5/c;->a()I

    .line 61
    move-result v5

    .line 62
    int-to-float v5, v5

    .line 63
    mul-float/2addr v5, v0

    .line 64
    float-to-int v5, v5

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Lm5/c;->b()I

    .line 68
    move-result v6

    .line 69
    int-to-float v6, v6

    .line 70
    mul-float/2addr v6, v0

    .line 71
    float-to-int v0, v6

    .line 72
    .line 73
    new-instance v6, Landroid/graphics/Rect;

    .line 74
    add-int/2addr v3, v5

    .line 75
    add-int/2addr v4, v0

    .line 76
    .line 77
    .line 78
    invoke-direct {v6, v5, v0, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 79
    .line 80
    iget-object p3, p3, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->f:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;

    .line 81
    .line 82
    sget-object v0, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;->NO_BLEND:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;

    .line 83
    .line 84
    if-ne p3, v0, :cond_2

    .line 85
    .line 86
    iget-object p3, p0, Lo5/a;->l:Landroid/graphics/Paint;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v6, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 90
    :cond_2
    monitor-enter p0

    .line 91
    .line 92
    .line 93
    :try_start_0
    invoke-virtual {p0, p4, v1}, Lo5/a;->n(II)Landroid/graphics/Bitmap;

    .line 94
    move-result-object p3

    .line 95
    .line 96
    .line 97
    invoke-interface {p2, p4, v1, p3}, Lm5/c;->c(IILandroid/graphics/Bitmap;)V

    .line 98
    const/4 p2, 0x0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p3, v2, v6, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 102
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    throw p1

    .line 107
    :cond_3
    :goto_0
    return-void
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

.method public final r(Landroid/graphics/Canvas;Lm5/c;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lo5/a;->c:Lm5/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lm5/b;->getWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lo5/a;->c:Lm5/b;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lm5/b;->getHeight()I

    .line 12
    move-result v1

    .line 13
    int-to-float v2, v0

    .line 14
    int-to-float v3, v1

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 18
    move-result v4

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 22
    move-result v5

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Lm5/c;->a()I

    .line 26
    move-result v6

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Lm5/c;->b()I

    .line 30
    move-result v7

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 34
    move-result v8

    .line 35
    int-to-float v8, v8

    .line 36
    .line 37
    cmpl-float v8, v2, v8

    .line 38
    .line 39
    if-gtz v8, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 43
    move-result v8

    .line 44
    int-to-float v8, v8

    .line 45
    .line 46
    cmpl-float v8, v3, v8

    .line 47
    .line 48
    if-lez v8, :cond_0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 52
    move v1, v0

    .line 53
    goto :goto_2

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 57
    move-result v4

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 61
    move-result v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 65
    move-result v4

    .line 66
    .line 67
    .line 68
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    .line 69
    move-result v1

    .line 70
    .line 71
    div-float v4, v2, v3

    .line 72
    .line 73
    if-le v0, v1, :cond_2

    .line 74
    int-to-float v0, v0

    .line 75
    .line 76
    div-float v1, v0, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    int-to-float v1, v1

    .line 79
    .line 80
    mul-float v0, v1, v4

    .line 81
    :goto_1
    div-float/2addr v0, v2

    .line 82
    div-float/2addr v1, v3

    .line 83
    .line 84
    .line 85
    invoke-interface {p2}, Lm5/c;->getWidth()I

    .line 86
    move-result v2

    .line 87
    int-to-float v2, v2

    .line 88
    mul-float/2addr v2, v0

    .line 89
    float-to-double v2, v2

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 93
    move-result-wide v2

    .line 94
    double-to-int v4, v2

    .line 95
    .line 96
    .line 97
    invoke-interface {p2}, Lm5/c;->getHeight()I

    .line 98
    move-result v2

    .line 99
    int-to-float v2, v2

    .line 100
    mul-float/2addr v2, v1

    .line 101
    float-to-double v2, v2

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 105
    move-result-wide v2

    .line 106
    double-to-int v5, v2

    .line 107
    .line 108
    .line 109
    invoke-interface {p2}, Lm5/c;->a()I

    .line 110
    move-result v2

    .line 111
    int-to-float v2, v2

    .line 112
    mul-float/2addr v2, v0

    .line 113
    float-to-double v2, v2

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 117
    move-result-wide v2

    .line 118
    double-to-int v6, v2

    .line 119
    .line 120
    .line 121
    invoke-interface {p2}, Lm5/c;->b()I

    .line 122
    move-result v2

    .line 123
    int-to-float v2, v2

    .line 124
    mul-float/2addr v2, v1

    .line 125
    float-to-double v2, v2

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 129
    move-result-wide v2

    .line 130
    double-to-int v7, v2

    .line 131
    .line 132
    :goto_2
    new-instance v2, Landroid/graphics/Rect;

    .line 133
    const/4 v3, 0x0

    .line 134
    .line 135
    .line 136
    invoke-direct {v2, v3, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 137
    .line 138
    new-instance v3, Landroid/graphics/Rect;

    .line 139
    .line 140
    add-int v8, v6, v4

    .line 141
    .line 142
    add-int v9, v7, v5

    .line 143
    .line 144
    .line 145
    invoke-direct {v3, v6, v7, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 146
    .line 147
    if-eqz p4, :cond_3

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p1, v0, v1, p4}, Lo5/a;->m(Landroid/graphics/Canvas;FFLcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;)V

    .line 151
    .line 152
    :cond_3
    iget-object p3, p3, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo;->f:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;

    .line 153
    .line 154
    sget-object p4, Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;->NO_BLEND:Lcom/facebook/imagepipeline/animated/base/AnimatedDrawableFrameInfo$BlendOperation;

    .line 155
    .line 156
    if-ne p3, p4, :cond_4

    .line 157
    .line 158
    iget-object p3, p0, Lo5/a;->l:Landroid/graphics/Paint;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v3, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 162
    :cond_4
    monitor-enter p0

    .line 163
    .line 164
    .line 165
    :try_start_0
    invoke-virtual {p0, v4, v5}, Lo5/a;->n(II)Landroid/graphics/Bitmap;

    .line 166
    move-result-object p3

    .line 167
    .line 168
    .line 169
    invoke-interface {p2, v4, v5, p3}, Lm5/c;->c(IILandroid/graphics/Bitmap;)V

    .line 170
    const/4 p2, 0x0

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3, v2, v3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 174
    monitor-exit p0

    .line 175
    return-void

    .line 176
    :catchall_0
    move-exception p1

    .line 177
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    throw p1
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
