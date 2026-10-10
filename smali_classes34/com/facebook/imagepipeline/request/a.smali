.class public abstract Lcom/facebook/imagepipeline/request/a;
.super Ljava/lang/Object;
.source "BasePostprocessor.java"

# interfaces
.implements Lcom/facebook/imagepipeline/request/b;


# static fields
.field public static final FALLBACK_BITMAP_CONFIGURATION:Landroid/graphics/Bitmap$Config;

.field private static sCopyBitmap:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 3
    .line 4
    sput-object v0, Lcom/facebook/imagepipeline/request/a;->FALLBACK_BITMAP_CONFIGURATION:Landroid/graphics/Bitmap$Config;

    .line 5
    return-void
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
    .line 18
.end method

.method private static internalCopyBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 5

    .line 1
    .line 2
    const-class v0, Landroid/graphics/Bitmap;

    .line 3
    .line 4
    const-string v1, "Wrong Native code setup, reflection failed."

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ls5/s;->a()Z

    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    if-ne v2, v4, :cond_1

    .line 22
    .line 23
    :try_start_0
    sget-object v2, Lcom/facebook/imagepipeline/request/a;->sCopyBitmap:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    const-class v2, Lcom/facebook/imagepipeline/nativecode/Bitmaps;

    .line 28
    .line 29
    sget v4, Lcom/facebook/imagepipeline/nativecode/Bitmaps;->a:I

    .line 30
    .line 31
    const-string v4, "copyBitmap"

    .line 32
    .line 33
    .line 34
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    sput-object v0, Lcom/facebook/imagepipeline/request/a;->sCopyBitmap:Ljava/lang/reflect/Method;

    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :catch_1
    move-exception p0

    .line 46
    goto :goto_2

    .line 47
    :catch_2
    move-exception p0

    .line 48
    goto :goto_3

    .line 49
    :catch_3
    move-exception p0

    .line 50
    goto :goto_4

    .line 51
    .line 52
    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/imagepipeline/request/a;->sCopyBitmap:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v3, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-void

    .line 61
    .line 62
    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :goto_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    throw p1

    .line 73
    .line 74
    :goto_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    throw p1

    .line 79
    .line 80
    :goto_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    throw p1

    .line 85
    .line 86
    :cond_1
    new-instance v0, Landroid/graphics/Canvas;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 90
    const/4 p0, 0x0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1, p0, p0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 94
    return-void
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
.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Unknown postprocessor"

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

.method public getPostprocessorCacheKey()Lq3/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method public process(Landroid/graphics/Bitmap;Lp5/c;)La4/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lp5/c;",
            ")",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/facebook/imagepipeline/request/a;->FALLBACK_BITMAP_CONFIGURATION:Landroid/graphics/Bitmap$Config;

    .line 6
    :goto_0
    invoke-virtual {p2, v1, v2, v0}, Lp5/c;->d(IILandroid/graphics/Bitmap$Config;)La4/a;

    move-result-object p2

    .line 7
    :try_start_0
    invoke-virtual {p2}, La4/a;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0, p1}, Lcom/facebook/imagepipeline/request/a;->process(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 8
    invoke-virtual {p2}, La4/a;->b()La4/a;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-static {p2}, La4/a;->j(La4/a;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p2}, La4/a;->j(La4/a;)V

    .line 10
    throw p1
.end method

.method public process(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    return-void
.end method

.method public process(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 11
    invoke-static {p1, p2}, Lcom/facebook/imagepipeline/request/a;->internalCopyBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/request/a;->process(Landroid/graphics/Bitmap;)V

    return-void
.end method
