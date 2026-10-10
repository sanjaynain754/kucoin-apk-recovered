.class public final Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;
.super Ljava/lang/Object;
.source "SimpleImageTranscoder.kt"

# interfaces
.implements Le6/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;",
        "Le6/c;",
        "",
        "resizingEnabled",
        "",
        "maxBitmapSize",
        "<init>",
        "(ZI)V",
        "Lx5/i;",
        "encodedImage",
        "Ljava/io/OutputStream;",
        "outputStream",
        "Lcom/facebook/imagepipeline/common/RotationOptions;",
        "rotationOptions",
        "Lcom/facebook/imagepipeline/common/ResizeOptions;",
        "resizeOptions",
        "Lcom/facebook/imageformat/ImageFormat;",
        "outputFormat",
        "quality",
        "Landroid/graphics/ColorSpace;",
        "colorSpace",
        "Le6/b;",
        "b",
        "(Lx5/i;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imageformat/ImageFormat;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Le6/b;",
        "a",
        "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z",
        "imageFormat",
        "c",
        "(Lcom/facebook/imageformat/ImageFormat;)Z",
        "d",
        "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)I",
        "Z",
        "I",
        "",
        "Ljava/lang/String;",
        "getIdentifier",
        "()Ljava/lang/String;",
        "identifier",
        "Companion",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->d:Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;

    .line 9
    return-void
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

.method public constructor <init>(ZI)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->a:Z

    .line 6
    .line 7
    iput p2, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->b:I

    .line 8
    .line 9
    const-string p1, "SimpleImageTranscoder"

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->c:Ljava/lang/String;

    .line 12
    return-void
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


# virtual methods
.method public a(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z
    .locals 1
    .param p1    # Lx5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/common/RotationOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/imagepipeline/common/ResizeOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "encodedImage"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p2, Lcom/facebook/imagepipeline/common/RotationOptions;->c:Lcom/facebook/imagepipeline/common/RotationOptions$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/common/RotationOptions$Companion;->autoRotate()Lcom/facebook/imagepipeline/common/RotationOptions;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->a:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget v0, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->b:I

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p3, p1, v0}, Le6/a;->b(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lx5/i;I)I

    .line 23
    move-result p1

    .line 24
    const/4 p2, 0x1

    .line 25
    .line 26
    if-le p1, p2, :cond_1

    .line 27
    return p2

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return p1
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
.end method

.method public b(Lx5/i;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imageformat/ImageFormat;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Le6/b;
    .locals 19
    .param p1    # Lx5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/imagepipeline/common/RotationOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/facebook/imagepipeline/common/ResizeOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/facebook/imageformat/ImageFormat;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/ColorSpace;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p7

    .line 7
    .line 8
    const-string v3, "Out-Of-Memory during transcode"

    .line 9
    .line 10
    const-string v4, "SimpleImageTranscoder"

    .line 11
    .line 12
    const-string v5, "encodedImage"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v5, "outputStream"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    if-nez p6, :cond_0

    .line 24
    .line 25
    const/16 v5, 0x55

    .line 26
    .line 27
    .line 28
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    move-result-object v5

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    move-object/from16 v5, p6

    .line 33
    .line 34
    :goto_0
    if-nez p3, :cond_1

    .line 35
    .line 36
    sget-object v6, Lcom/facebook/imagepipeline/common/RotationOptions;->c:Lcom/facebook/imagepipeline/common/RotationOptions$Companion;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Lcom/facebook/imagepipeline/common/RotationOptions$Companion;->autoRotate()Lcom/facebook/imagepipeline/common/RotationOptions;

    .line 40
    move-result-object v6

    .line 41
    .line 42
    :goto_1
    move-object/from16 v7, p0

    .line 43
    .line 44
    move-object/from16 v8, p4

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_1
    move-object/from16 v6, p3

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :goto_2
    invoke-virtual {v7, v0, v6, v8}, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->d(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)I

    .line 52
    move-result v8

    .line 53
    .line 54
    new-instance v9, Landroid/graphics/BitmapFactory$Options;

    .line 55
    .line 56
    .line 57
    invoke-direct {v9}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 58
    .line 59
    iput v8, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v11, 0x1a

    .line 66
    .line 67
    if-lt v10, v11, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-static {v9, v2}, Lc2/m;->a(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 71
    :cond_2
    const/4 v2, 0x2

    .line 72
    .line 73
    .line 74
    :try_start_0
    invoke-virtual {v0}, Lx5/i;->n()Ljava/io/InputStream;

    .line 75
    move-result-object v10

    .line 76
    const/4 v11, 0x0

    .line 77
    .line 78
    .line 79
    invoke-static {v10, v11, v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 80
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    .line 81
    .line 82
    if-nez v12, :cond_3

    .line 83
    .line 84
    const-string v0, "Couldn\'t decode the EncodedImage InputStream ! "

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v0}, Lx3/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    new-instance v0, Le6/b;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v2}, Le6/b;-><init>(I)V

    .line 93
    return-object v0

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-static {v0, v6}, Le6/e;->g(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;)Landroid/graphics/Matrix;

    .line 97
    move-result-object v17

    .line 98
    .line 99
    if-eqz v17, :cond_4

    .line 100
    .line 101
    .line 102
    :try_start_1
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    .line 103
    move-result v15

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 107
    move-result v16

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    .line 113
    .line 114
    invoke-static/range {v12 .. v18}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 115
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    move-object v6, v0

    .line 117
    goto :goto_3

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object v6, v12

    .line 120
    goto :goto_5

    .line 121
    :catch_0
    move-exception v0

    .line 122
    move-object v6, v12

    .line 123
    goto :goto_4

    .line 124
    :cond_4
    move-object v6, v12

    .line 125
    .line 126
    :goto_3
    :try_start_2
    sget-object v0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->d:Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;

    .line 127
    .line 128
    move-object/from16 v9, p5

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v9}, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;->access$getOutputFormat(Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;Lcom/facebook/imageformat/ImageFormat;)Landroid/graphics/Bitmap$CompressFormat;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 136
    move-result v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v0, v5, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 140
    .line 141
    new-instance v0, Le6/b;

    .line 142
    const/4 v1, 0x1

    .line 143
    .line 144
    if-le v8, v1, :cond_5

    .line 145
    const/4 v1, 0x0

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-direct {v0, v1}, Le6/b;-><init>(I)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 155
    return-object v0

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    goto :goto_5

    .line 158
    :catch_1
    move-exception v0

    .line 159
    .line 160
    .line 161
    :goto_4
    :try_start_3
    invoke-static {v4, v3, v0}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    new-instance v0, Le6/b;

    .line 164
    .line 165
    .line 166
    invoke-direct {v0, v2}, Le6/b;-><init>(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 173
    return-object v0

    .line 174
    .line 175
    .line 176
    :goto_5
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 180
    throw v0

    .line 181
    :catch_2
    move-exception v0

    .line 182
    .line 183
    .line 184
    invoke-static {v4, v3, v0}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    new-instance v0, Le6/b;

    .line 187
    .line 188
    .line 189
    invoke-direct {v0, v2}, Le6/b;-><init>(I)V

    .line 190
    return-object v0
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
.end method

.method public c(Lcom/facebook/imageformat/ImageFormat;)Z
    .locals 1
    .param p1    # Lcom/facebook/imageformat/ImageFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "imageFormat"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ll5/a;->l:Lcom/facebook/imageformat/ImageFormat;

    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Ll5/a;->b:Lcom/facebook/imageformat/ImageFormat;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final d(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->a:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->b:I

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p3, p1, v0}, Le6/a;->b(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lx5/i;I)I

    .line 12
    move-result p1

    .line 13
    return p1
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
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;->c:Ljava/lang/String;

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
