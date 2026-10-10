.class public Lcom/facebook/imagepipeline/producers/q0$c;
.super Lcom/facebook/imagepipeline/producers/s;
.source "PartialDiskCacheProducer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/s<",
        "Lx5/i;",
        "Lx5/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lq3/a;

.field public final e:Lz3/h;

.field public final f:Lz3/a;

.field public final g:Lx5/i;

.field public final h:Z


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lw3/k;Lq3/a;Lz3/h;Lz3/a;Lx5/i;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "Lx5/i;",
            ">;",
            "Lw3/k<",
            "Ls5/b;",
            ">;",
            "Lq3/a;",
            "Lz3/h;",
            "Lz3/a;",
            "Lx5/i;",
            "Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lcom/facebook/imagepipeline/producers/m;)V

    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/q0$c;->c:Lw3/k;

    .line 4
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/q0$c;->d:Lq3/a;

    .line 5
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/q0$c;->e:Lz3/h;

    .line 6
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/q0$c;->f:Lz3/a;

    .line 7
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/q0$c;->g:Lx5/i;

    .line 8
    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/q0$c;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lw3/k;Lq3/a;Lz3/h;Lz3/a;Lx5/i;ZLcom/facebook/imagepipeline/producers/r0;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/facebook/imagepipeline/producers/q0$c;-><init>(Lcom/facebook/imagepipeline/producers/m;Lw3/k;Lq3/a;Lz3/h;Lz3/a;Lx5/i;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lx5/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/q0$c;->r(Lx5/i;I)V

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

.method public final p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/q0$c;->f:Lz3/a;

    .line 3
    .line 4
    const/16 v1, 0x4000

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Lz3/f;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, [B

    .line 11
    move v2, p3

    .line 12
    .line 13
    :cond_0
    :goto_0
    if-lez v2, :cond_1

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v4, v3}, Ljava/io/InputStream;->read([BII)I

    .line 22
    move-result v3

    .line 23
    .line 24
    if-ltz v3, :cond_1

    .line 25
    .line 26
    if-lez v3, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    sub-int/2addr v2, v3

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    .line 34
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/q0$c;->f:Lz3/a;

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, v0}, Lz3/f;->release(Ljava/lang/Object;)V

    .line 38
    throw p1

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/q0$c;->f:Lz3/a;

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lz3/f;->release(Ljava/lang/Object;)V

    .line 44
    .line 45
    if-gtz v2, :cond_2

    .line 46
    return-void

    .line 47
    .line 48
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 49
    .line 50
    .line 51
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object p2

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object p3

    .line 57
    .line 58
    .line 59
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 60
    move-result-object p2

    .line 61
    const/4 p3, 0x0

    .line 62
    .line 63
    const-string v0, "Failed to read %d bytes - finished %d short"

    .line 64
    .line 65
    .line 66
    invoke-static {p3, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    throw p1
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

.method public final q(Lx5/i;Lx5/i;)Lz3/j;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lx5/i;->j()Lcom/facebook/imagepipeline/common/BytesRange;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/facebook/imagepipeline/common/BytesRange;

    .line 11
    .line 12
    iget v0, v0, Lcom/facebook/imagepipeline/common/BytesRange;->a:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lx5/i;->q()I

    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/q0$c;->e:Lz3/h;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, v1}, Lz3/h;->d(I)Lz3/j;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lx5/i;->o()Ljava/io/InputStream;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/imagepipeline/producers/q0$c;->p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lx5/i;->o()Ljava/io/InputStream;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lx5/i;->q()I

    .line 38
    move-result p2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, v1, p2}, Lcom/facebook/imagepipeline/producers/q0$c;->p(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 42
    return-object v1
.end method

.method public r(Lx5/i;I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/q0$c;->g:Lx5/i;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lx5/i;->j()Lcom/facebook/imagepipeline/common/BytesRange;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/q0$c;->g:Lx5/i;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2, p1}, Lcom/facebook/imagepipeline/producers/q0$c;->q(Lx5/i;Lx5/i;)Lz3/j;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lcom/facebook/imagepipeline/producers/q0$c;->s(Lz3/j;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, Lx5/i;->close()V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/q0$c;->g:Lx5/i;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lx5/i;->close()V

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p2

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    move-exception p2

    .line 41
    .line 42
    :try_start_1
    const-string v0, "PartialDiskCacheProducer"

    .line 43
    .line 44
    const-string v1, "Error while merging image data"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1, p2}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, p2}, Lcom/facebook/imagepipeline/producers/m;->onFailure(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :goto_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/q0$c;->c:Lw3/k;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lw3/k;->get()Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    check-cast p1, Ls5/b;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ls5/b;->b()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/q0$c;->d:Lq3/a;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->s(Lq3/a;)Lo0/e;

    .line 73
    :goto_2
    return-void

    .line 74
    .line 75
    .line 76
    :goto_3
    invoke-virtual {p1}, Lx5/i;->close()V

    .line 77
    .line 78
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/q0$c;->g:Lx5/i;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lx5/i;->close()V

    .line 82
    throw p2

    .line 83
    .line 84
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/q0$c;->h:Z

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    .line 91
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/c;->m(II)Z

    .line 92
    move-result v0

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->d(I)Z

    .line 98
    move-result v0

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lx5/i;->m()Lcom/facebook/imageformat/ImageFormat;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    sget-object v1, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 109
    .line 110
    if-eq v0, v1, :cond_2

    .line 111
    .line 112
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/q0$c;->c:Lw3/k;

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Lw3/k;->get()Ljava/lang/Object;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    check-cast v0, Ls5/b;

    .line 119
    .line 120
    .line 121
    invoke-interface {v0}, Ls5/b;->b()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/q0$c;->d:Lq3/a;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1, p1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->p(Lq3/a;Lx5/i;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 135
    return-void

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 143
    return-void
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

.method public final s(Lz3/j;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lz3/j;->a()Lcom/facebook/common/memory/PooledByteBuffer;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, La4/a;->p(Ljava/io/Closeable;)La4/a;

    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    :try_start_0
    new-instance v1, Lx5/i;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1}, Lx5/i;-><init>(La4/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v1}, Lx5/i;->J()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lx5/i;->g(Lx5/i;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, La4/a;->j(La4/a;)V

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception v1

    .line 36
    move-object v3, v1

    .line 37
    move-object v1, v0

    .line 38
    move-object v0, v3

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {v1}, Lx5/i;->g(Lx5/i;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, La4/a;->j(La4/a;)V

    .line 45
    throw v0
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
