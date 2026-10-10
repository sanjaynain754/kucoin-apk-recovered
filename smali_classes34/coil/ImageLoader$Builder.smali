.class public final Lcoil/ImageLoader$Builder;
.super Ljava/lang/Object;
.source "ImageLoader.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/ImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010-\u00a8\u00061"
    }
    d2 = {
        "Lcoil/ImageLoader$Builder;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lokhttp3/Call$Factory;",
        "c",
        "()Lokhttp3/Call$Factory;",
        "Lx0/h;",
        "d",
        "()Lx0/h;",
        "Lcoil/ImageLoader;",
        "b",
        "()Lcoil/ImageLoader;",
        "a",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcoil/request/DefaultRequestOptions;",
        "Lcoil/request/DefaultRequestOptions;",
        "defaults",
        "Lokhttp3/Call$Factory;",
        "callFactory",
        "Lcoil/EventListener$Factory;",
        "Lcoil/EventListener$Factory;",
        "eventListenerFactory",
        "Lcoil/a;",
        "e",
        "Lcoil/a;",
        "componentRegistry",
        "Lb1/f;",
        "f",
        "Lb1/f;",
        "options",
        "g",
        "Lx0/h;",
        "memoryCache",
        "",
        "h",
        "D",
        "availableMemoryPercentage",
        "i",
        "bitmapPoolPercentage",
        "",
        "j",
        "Z",
        "bitmapPoolingEnabled",
        "k",
        "trackWeakReferences",
        "coil-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lcoil/request/DefaultRequestOptions;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lokhttp3/Call$Factory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lcoil/EventListener$Factory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Lcoil/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Lb1/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Lx0/h;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:D

.field public i:D

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

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
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string v0, "context.applicationContext"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcoil/ImageLoader$Builder;->a:Landroid/content/Context;

    .line 20
    .line 21
    sget-object v0, Lcoil/request/DefaultRequestOptions;->n:Lcoil/request/DefaultRequestOptions;

    .line 22
    .line 23
    iput-object v0, p0, Lcoil/ImageLoader$Builder;->b:Lcoil/request/DefaultRequestOptions;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcoil/ImageLoader$Builder;->c:Lokhttp3/Call$Factory;

    .line 27
    .line 28
    iput-object v0, p0, Lcoil/ImageLoader$Builder;->d:Lcoil/EventListener$Factory;

    .line 29
    .line 30
    iput-object v0, p0, Lcoil/ImageLoader$Builder;->e:Lcoil/a;

    .line 31
    .line 32
    new-instance v1, Lb1/f;

    .line 33
    const/4 v5, 0x7

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v6}, Lb1/f;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    iput-object v1, p0, Lcoil/ImageLoader$Builder;->f:Lb1/f;

    .line 43
    .line 44
    iput-object v0, p0, Lcoil/ImageLoader$Builder;->g:Lx0/h;

    .line 45
    .line 46
    sget-object v0, Lb1/i;->a:Lb1/i;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lb1/i;->e(Landroid/content/Context;)D

    .line 50
    move-result-wide v1

    .line 51
    .line 52
    iput-wide v1, p0, Lcoil/ImageLoader$Builder;->h:D

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lb1/i;->f()D

    .line 56
    move-result-wide v0

    .line 57
    .line 58
    iput-wide v0, p0, Lcoil/ImageLoader$Builder;->i:D

    .line 59
    const/4 p1, 0x1

    .line 60
    .line 61
    iput-boolean p1, p0, Lcoil/ImageLoader$Builder;->j:Z

    .line 62
    .line 63
    iput-boolean p1, p0, Lcoil/ImageLoader$Builder;->k:Z

    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method public static final synthetic a(Lcoil/ImageLoader$Builder;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcoil/ImageLoader$Builder;->a:Landroid/content/Context;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public final b()Lcoil/ImageLoader;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcoil/ImageLoader$Builder;->g:Lx0/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcoil/ImageLoader$Builder;->d()Lx0/h;

    .line 8
    move-result-object v0

    .line 9
    :cond_0
    move-object v5, v0

    .line 10
    .line 11
    new-instance v1, Lcoil/RealImageLoader;

    .line 12
    .line 13
    iget-object v2, p0, Lcoil/ImageLoader$Builder;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v3, p0, Lcoil/ImageLoader$Builder;->b:Lcoil/request/DefaultRequestOptions;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5}, Lx0/h;->a()Lcoil/bitmap/BitmapPool;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    iget-object v0, p0, Lcoil/ImageLoader$Builder;->c:Lokhttp3/Call$Factory;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcoil/ImageLoader$Builder;->c()Lokhttp3/Call$Factory;

    .line 27
    move-result-object v0

    .line 28
    :cond_1
    move-object v6, v0

    .line 29
    .line 30
    iget-object v0, p0, Lcoil/ImageLoader$Builder;->d:Lcoil/EventListener$Factory;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    sget-object v0, Lcoil/EventListener$Factory;->b:Lcoil/EventListener$Factory;

    .line 35
    :cond_2
    move-object v7, v0

    .line 36
    .line 37
    iget-object v0, p0, Lcoil/ImageLoader$Builder;->e:Lcoil/a;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Lcoil/a;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Lcoil/a;-><init>()V

    .line 45
    :cond_3
    move-object v8, v0

    .line 46
    .line 47
    iget-object v9, p0, Lcoil/ImageLoader$Builder;->f:Lb1/f;

    .line 48
    const/4 v10, 0x0

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v1 .. v10}, Lcoil/RealImageLoader;-><init>(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lcoil/bitmap/BitmapPool;Lx0/h;Lokhttp3/Call$Factory;Lcoil/EventListener$Factory;Lcoil/a;Lb1/f;Lb1/g;)V

    .line 52
    return-object v1
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
.end method

.method public final c()Lokhttp3/Call$Factory;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcoil/ImageLoader$Builder$buildDefaultCallFactory$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcoil/ImageLoader$Builder$buildDefaultCallFactory$1;-><init>(Lcoil/ImageLoader$Builder;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lb1/c;->b(Lkotlin/jvm/functions/Function0;)Lokhttp3/Call$Factory;

    .line 9
    move-result-object v0

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final d()Lx0/h;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lb1/i;->a:Lb1/i;

    .line 3
    .line 4
    iget-object v1, p0, Lcoil/ImageLoader$Builder;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-wide v2, p0, Lcoil/ImageLoader$Builder;->h:D

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Lb1/i;->b(Landroid/content/Context;D)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    iget-boolean v2, p0, Lcoil/ImageLoader$Builder;->j:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-wide v2, p0, Lcoil/ImageLoader$Builder;->i:D

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    const-wide/16 v2, 0x0

    .line 20
    :goto_0
    long-to-double v4, v0

    .line 21
    mul-double/2addr v2, v4

    .line 22
    double-to-int v5, v2

    .line 23
    int-to-long v2, v5

    .line 24
    sub-long/2addr v0, v2

    .line 25
    long-to-int v0, v0

    .line 26
    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    new-instance v1, Ls0/b;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Ls0/b;-><init>()V

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    new-instance v4, Lcoil/bitmap/RealBitmapPool;

    .line 36
    const/4 v9, 0x6

    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v4 .. v10}, Lcoil/bitmap/RealBitmapPool;-><init>(ILjava/util/Set;Lcoil/bitmap/BitmapPoolStrategy;Lb1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    move-object v1, v4

    .line 45
    .line 46
    :goto_1
    iget-boolean v2, p0, Lcoil/ImageLoader$Builder;->k:Z

    .line 47
    const/4 v3, 0x0

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    new-instance v2, Lcoil/memory/RealWeakMemoryCache;

    .line 52
    .line 53
    .line 54
    invoke-direct {v2, v3}, Lcoil/memory/RealWeakMemoryCache;-><init>(Lb1/g;)V

    .line 55
    goto :goto_2

    .line 56
    .line 57
    :cond_2
    sget-object v2, Lx0/c;->a:Lx0/c;

    .line 58
    .line 59
    :goto_2
    iget-boolean v4, p0, Lcoil/ImageLoader$Builder;->j:Z

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    new-instance v4, Lcoil/bitmap/RealBitmapReferenceCounter;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, v2, v1, v3}, Lcoil/bitmap/RealBitmapReferenceCounter;-><init>(Lx0/j;Lcoil/bitmap/BitmapPool;Lb1/g;)V

    .line 67
    goto :goto_3

    .line 68
    .line 69
    :cond_3
    sget-object v4, Ls0/c;->a:Ls0/c;

    .line 70
    .line 71
    :goto_3
    sget-object v5, Lcoil/memory/StrongMemoryCache;->a:Lcoil/memory/StrongMemoryCache$Companion;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v2, v4, v0, v3}, Lcoil/memory/StrongMemoryCache$Companion;->invoke(Lx0/j;Ls0/a;ILb1/g;)Lcoil/memory/StrongMemoryCache;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    new-instance v3, Lx0/h;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, v0, v2, v4, v1}, Lx0/h;-><init>(Lcoil/memory/StrongMemoryCache;Lx0/j;Ls0/a;Lcoil/bitmap/BitmapPool;)V

    .line 81
    return-object v3
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
