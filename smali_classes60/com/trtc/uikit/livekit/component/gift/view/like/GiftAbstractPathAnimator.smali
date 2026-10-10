.class public abstract Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;
.super Ljava/lang/Object;
.source "GiftAbstractPathAnimator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;",
        "",
        "config",
        "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;",
        "<init>",
        "(Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;)V",
        "getConfig",
        "()Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;",
        "random",
        "Ljava/security/SecureRandom;",
        "randomRotation",
        "",
        "createPath",
        "Landroid/graphics/Path;",
        "counter",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "view",
        "Landroid/view/View;",
        "factor",
        "",
        "start",
        "",
        "child",
        "parent",
        "Landroid/view/ViewGroup;",
        "Config",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/security/SecureRandom;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 11
    .line 12
    new-instance p1, Ljava/security/SecureRandom;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->b:Ljava/security/SecureRandom;

    .line 18
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/atomic/AtomicInteger;Landroid/view/View;I)Landroid/graphics/Path;
    .locals 10
    .param p1    # Ljava/util/concurrent/atomic/AtomicInteger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "counter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "view"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->b:Ljava/security/SecureRandom;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->j()I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 22
    move-result v1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->j()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 32
    move-result v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 36
    move-result p2

    .line 37
    .line 38
    iget-object v3, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->h()I

    .line 42
    move-result v3

    .line 43
    sub-int/2addr p2, v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    .line 47
    move-result p1

    .line 48
    .line 49
    mul-int/lit8 p1, p1, 0xf

    .line 50
    .line 51
    iget-object v3, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->b()I

    .line 55
    move-result v3

    .line 56
    mul-int/2addr v3, p3

    .line 57
    add-int/2addr p1, v3

    .line 58
    .line 59
    iget-object p3, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->c()I

    .line 63
    move-result p3

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p3}, Ljava/util/Random;->nextInt(I)I

    .line 67
    move-result p3

    .line 68
    add-int/2addr p1, p3

    .line 69
    .line 70
    iget-object p3, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->d()I

    .line 74
    move-result p3

    .line 75
    .line 76
    div-int p3, p1, p3

    .line 77
    .line 78
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->k()Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->i()I

    .line 90
    move-result v0

    .line 91
    sub-int/2addr v0, v1

    .line 92
    .line 93
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->i()I

    .line 97
    move-result v1

    .line 98
    sub-int/2addr v1, v2

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->i()I

    .line 105
    move-result v0

    .line 106
    add-int/2addr v0, v1

    .line 107
    .line 108
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->i()I

    .line 112
    move-result v1

    .line 113
    add-int/2addr v1, v2

    .line 114
    .line 115
    :goto_0
    sub-int v2, p2, p1

    .line 116
    .line 117
    div-int/lit8 p1, p1, 0x2

    .line 118
    .line 119
    sub-int p1, p2, p1

    .line 120
    .line 121
    new-instance v3, Landroid/graphics/Path;

    .line 122
    .line 123
    .line 124
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 125
    .line 126
    iget-object v4, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->g()I

    .line 130
    move-result v4

    .line 131
    int-to-float v4, v4

    .line 132
    .line 133
    const/high16 v5, 0x42480000    # 50.0f

    .line 134
    .line 135
    .line 136
    invoke-static {v5}, Luc0/a;->a(F)I

    .line 137
    move-result v5

    .line 138
    int-to-float v5, v5

    .line 139
    sub-float/2addr v4, v5

    .line 140
    int-to-float v5, p2

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 144
    .line 145
    iget-object v4, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->g()I

    .line 149
    move-result v4

    .line 150
    int-to-float v4, v4

    .line 151
    sub-int/2addr p2, p3

    .line 152
    int-to-float v5, p2

    .line 153
    int-to-float v6, v0

    .line 154
    .line 155
    add-int p2, p1, p3

    .line 156
    int-to-float v7, p2

    .line 157
    int-to-float v9, p1

    .line 158
    move v8, v6

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 162
    move v4, v6

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v4, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 166
    sub-int/2addr p1, p3

    .line 167
    int-to-float v5, p1

    .line 168
    int-to-float v6, v1

    .line 169
    add-int/2addr p3, v2

    .line 170
    int-to-float v7, p3

    .line 171
    int-to-float v9, v2

    .line 172
    move v8, v6

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 176
    return-object v3
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
.end method

.method public final b()Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->a:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

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
.end method

.method public final c()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;->b:Ljava/security/SecureRandom;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    const v1, 0x41e4cccd    # 28.6f

    .line 10
    mul-float/2addr v0, v1

    .line 11
    .line 12
    .line 13
    const v1, 0x4164cccd    # 14.3f

    .line 14
    sub-float/2addr v0, v1

    .line 15
    return v0
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
.end method

.method public abstract d(Landroid/view/View;Landroid/view/ViewGroup;)V
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
