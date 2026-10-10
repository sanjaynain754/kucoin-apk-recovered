.class public Ln5/e;
.super Ljava/lang/Object;
.source "AnimatedImageFactoryImpl.java"

# interfaces
.implements Ln5/d;


# static fields
.field public static e:Ln5/c;

.field public static f:Ln5/c;


# instance fields
.field public final a:Lo5/b;

.field public final b:Lp5/c;

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "com.facebook.animated.gif.GifImage"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ln5/e;->g(Ljava/lang/String;)Ln5/c;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Ln5/e;->e:Ln5/c;

    .line 9
    .line 10
    const-string v0, "com.facebook.animated.webp.WebPImage"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ln5/e;->g(Ljava/lang/String;)Ln5/c;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Ln5/e;->f:Ln5/c;

    .line 17
    return-void
    .line 18
.end method

.method public constructor <init>(Lo5/b;Lp5/c;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Ln5/e;-><init>(Lo5/b;Lp5/c;ZZ)V

    return-void
.end method

.method public constructor <init>(Lo5/b;Lp5/c;ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ln5/e;->a:Lo5/b;

    .line 4
    iput-object p2, p0, Ln5/e;->b:Lp5/c;

    .line 5
    iput-boolean p3, p0, Ln5/e;->c:Z

    .line 6
    iput-boolean p4, p0, Ln5/e;->d:Z

    return-void
.end method

.method public static g(Ljava/lang/String;)Ln5/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Ln5/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    const/4 p0, 0x0

    .line 13
    return-object p0
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
.method public a(Lx5/i;Lr5/c;Landroid/graphics/Bitmap$Config;)Lx5/e;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Ln5/e;->f:Ln5/c;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lx5/i;->i()La4/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, La4/a;->l()Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/facebook/common/memory/PooledByteBuffer;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget-object v2, Ln5/e;->f:Ln5/c;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-interface {v2, v1, p2}, Ln5/c;->i(Ljava/nio/ByteBuffer;Lr5/c;)Lm5/b;

    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    sget-object v2, Ln5/e;->f:Ln5/c;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->c()J

    .line 42
    move-result-wide v3

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->size()I

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v3, v4, v1, p2}, Ln5/c;->f(JILr5/c;)Lm5/b;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p1}, Lx5/i;->u()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, v1, p3}, Ln5/e;->f(Ljava/lang/String;Lr5/c;Lm5/b;Landroid/graphics/Bitmap$Config;)Lx5/e;

    .line 58
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 62
    return-object p1

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 69
    .line 70
    const-string p2, "To encode animated webp please add the dependency to the animated-webp module"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
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

.method public b(Lx5/i;Lr5/c;Landroid/graphics/Bitmap$Config;)Lx5/e;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Ln5/e;->e:Ln5/c;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lx5/i;->i()La4/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, La4/a;->l()Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/facebook/common/memory/PooledByteBuffer;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget-object v2, Ln5/e;->e:Ln5/c;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-interface {v2, v1, p2}, Ln5/c;->i(Ljava/nio/ByteBuffer;Lr5/c;)Lm5/b;

    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    sget-object v2, Ln5/e;->e:Ln5/c;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->c()J

    .line 42
    move-result-wide v3

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Lcom/facebook/common/memory/PooledByteBuffer;->size()I

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v3, v4, v1, p2}, Ln5/c;->f(JILr5/c;)Lm5/b;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p1}, Lx5/i;->u()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, v1, p3}, Ln5/e;->f(Ljava/lang/String;Lr5/c;Lm5/b;Landroid/graphics/Bitmap$Config;)Lx5/e;

    .line 58
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 62
    return-object p1

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 69
    .line 70
    const-string p2, "To encode animated gif please add the dependency to the animated-gif module"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
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

.method public final c(IILandroid/graphics/Bitmap$Config;)La4/a;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/graphics/Bitmap$Config;",
            ")",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ln5/e;->b:Lp5/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lp5/c;->d(IILandroid/graphics/Bitmap$Config;)La4/a;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, La4/a;->l()Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Landroid/graphics/Bitmap;

    .line 13
    const/4 p3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p3}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, La4/a;->l()Ljava/lang/Object;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    check-cast p2, Landroid/graphics/Bitmap;

    .line 23
    const/4 p3, 0x1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 27
    return-object p1
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

.method public final d(Lm5/b;Landroid/graphics/Bitmap$Config;I)La4/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm5/b;",
            "Landroid/graphics/Bitmap$Config;",
            "I)",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lm5/b;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lm5/b;->getHeight()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, p2}, Ln5/e;->c(IILandroid/graphics/Bitmap$Config;)La4/a;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lm5/d;->b(Lm5/b;)Lm5/d;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget-object v0, p0, Ln5/e;->a:Lo5/b;

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1, v1}, Lo5/b;->a(Lm5/d;Landroid/graphics/Rect;)Lm5/a;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    new-instance v0, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;

    .line 26
    .line 27
    iget-boolean v1, p0, Ln5/e;->c:Z

    .line 28
    .line 29
    new-instance v2, Ln5/e$a;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, p0}, Ln5/e$a;-><init>(Ln5/e;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;-><init>(Lm5/a;ZLcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, La4/a;->l()Ljava/lang/Object;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    check-cast p1, Landroid/graphics/Bitmap;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p3, p1}, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;->h(ILandroid/graphics/Bitmap;)V

    .line 45
    return-object p2
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

.method public final e(Lm5/b;Landroid/graphics/Bitmap$Config;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm5/b;",
            "Landroid/graphics/Bitmap$Config;",
            ")",
            "Ljava/util/List<",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lm5/d;->b(Lm5/b;)Lm5/d;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p0, Ln5/e;->a:Lo5/b;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Lo5/b;->a(Lm5/d;Landroid/graphics/Rect;)Lm5/a;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lm5/a;->a()I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    new-instance v1, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;

    .line 23
    .line 24
    iget-boolean v2, p0, Ln5/e;->c:Z

    .line 25
    .line 26
    new-instance v3, Ln5/e$b;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p0, v0}, Ln5/e$b;-><init>(Ln5/e;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p1, v2, v3}, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;-><init>(Lm5/a;ZLcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;)V

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {p1}, Lm5/a;->a()I

    .line 37
    move-result v3

    .line 38
    .line 39
    if-ge v2, v3, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lm5/a;->getWidth()I

    .line 43
    move-result v3

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Lm5/a;->getHeight()I

    .line 47
    move-result v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3, v4, p2}, Ln5/e;->c(IILandroid/graphics/Bitmap$Config;)La4/a;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, La4/a;->l()Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    check-cast v4, Landroid/graphics/Bitmap;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v4}, Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;->h(ILandroid/graphics/Bitmap;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-object v0
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

.method public final f(Ljava/lang/String;Lr5/c;Lm5/b;Landroid/graphics/Bitmap$Config;)Lx5/e;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v1, p2, Lr5/c;->d:Z

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p3}, Lm5/b;->a()I

    .line 10
    move-result v1

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    move-object v2, v0

    .line 16
    goto :goto_3

    .line 17
    :cond_0
    move v1, v2

    .line 18
    .line 19
    :goto_0
    iget-boolean v3, p2, Lr5/c;->g:Z

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3, p4, v1}, Ln5/e;->d(Lm5/b;Landroid/graphics/Bitmap$Config;I)La4/a;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    sget-object p2, Lx5/m;->d:Lx5/n;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, v2}, Lx5/f;->y(La4/a;Lx5/n;I)Lx5/f;

    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, La4/a;->k(Ljava/lang/Iterable;)V

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_1
    :try_start_1
    iget-boolean v2, p2, Lr5/c;->f:Z

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p3, p4}, Ln5/e;->e(Lm5/b;Landroid/graphics/Bitmap$Config;)Ljava/util/List;

    .line 46
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    check-cast v3, La4/a;

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, La4/a;->h(La4/a;)La4/a;

    .line 56
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    move-object v2, v0

    .line 61
    move-object v3, v2

    .line 62
    .line 63
    :goto_1
    :try_start_3
    iget-boolean p2, p2, Lr5/c;->c:Z

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p3, p4, v1}, Ln5/e;->d(Lm5/b;Landroid/graphics/Bitmap$Config;I)La4/a;

    .line 71
    move-result-object v3

    .line 72
    goto :goto_2

    .line 73
    :catchall_2
    move-exception p1

    .line 74
    move-object v0, v3

    .line 75
    goto :goto_3

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_2
    invoke-static {p3}, Lm5/d;->f(Lm5/b;)Lm5/e;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v3}, Lm5/e;->k(La4/a;)Lm5/e;

    .line 83
    move-result-object p2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v1}, Lm5/e;->j(I)Lm5/e;

    .line 87
    move-result-object p2

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v2}, Lm5/e;->i(Ljava/util/List;)Lm5/e;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v0}, Lm5/e;->h(Lf6/a;)Lm5/e;

    .line 95
    move-result-object p2

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p1}, Lm5/e;->l(Ljava/lang/String;)Lm5/e;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lm5/e;->a()Lm5/d;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    new-instance p2, Lx5/c;

    .line 106
    .line 107
    iget-boolean p3, p0, Ln5/e;->d:Z

    .line 108
    .line 109
    .line 110
    invoke-direct {p2, p1, p3}, Lx5/c;-><init>(Lm5/d;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 111
    .line 112
    .line 113
    invoke-static {v3}, La4/a;->j(La4/a;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v2}, La4/a;->k(Ljava/lang/Iterable;)V

    .line 117
    return-object p2

    .line 118
    .line 119
    .line 120
    :goto_3
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v2}, La4/a;->k(Ljava/lang/Iterable;)V

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
