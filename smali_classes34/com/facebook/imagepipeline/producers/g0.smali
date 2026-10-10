.class public abstract Lcom/facebook/imagepipeline/producers/g0;
.super Ljava/lang/Object;
.source "LocalFetchProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "Lx5/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lz3/h;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lz3/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/g0;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/g0;->b:Lz3/h;

    .line 8
    return-void
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


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "Lx5/i;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 4
    move-result-object v3

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 8
    move-result-object v6

    .line 9
    .line 10
    const-string v0, "local"

    .line 11
    .line 12
    const-string v1, "fetch"

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/w0;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v0, Lcom/facebook/imagepipeline/producers/g0$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/g0;->f()Ljava/lang/String;

    .line 21
    move-result-object v5

    .line 22
    move-object v7, v3

    .line 23
    move-object v8, p2

    .line 24
    move-object v1, p0

    .line 25
    move-object v2, p1

    .line 26
    move-object v4, p2

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v0 .. v8}, Lcom/facebook/imagepipeline/producers/g0$a;-><init>(Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 30
    .line 31
    new-instance p1, Lcom/facebook/imagepipeline/producers/g0$b;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p0, v0}, Lcom/facebook/imagepipeline/producers/g0$b;-><init>(Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/d1;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v4, p1}, Lcom/facebook/imagepipeline/producers/w0;->i(Lcom/facebook/imagepipeline/producers/x0;)V

    .line 38
    .line 39
    iget-object p1, v1, Lcom/facebook/imagepipeline/producers/g0;->a:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    return-void
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
.end method

.method public c(Ljava/io/InputStream;I)Lx5/i;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-gtz p2, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/g0;->b:Lz3/h;

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, p1}, Lz3/h;->a(Ljava/io/InputStream;)Lcom/facebook/common/memory/PooledByteBuffer;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, La4/a;->p(Ljava/io/Closeable;)La4/a;

    .line 13
    move-result-object p2

    .line 14
    :goto_0
    move-object v0, p2

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    goto :goto_2

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/g0;->b:Lz3/h;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, p1, p2}, Lz3/h;->e(Ljava/io/InputStream;I)Lcom/facebook/common/memory/PooledByteBuffer;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, La4/a;->p(Ljava/io/Closeable;)La4/a;

    .line 27
    move-result-object p2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :goto_1
    new-instance p2, Lx5/i;

    .line 31
    .line 32
    .line 33
    invoke-direct {p2, v0}, Lx5/i;-><init>(La4/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lw3/b;->b(Ljava/io/InputStream;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 40
    return-object p2

    .line 41
    .line 42
    .line 43
    :goto_2
    invoke-static {p1}, Lw3/b;->b(Ljava/io/InputStream;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 47
    throw p2
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

.method public abstract d(Lcom/facebook/imagepipeline/request/ImageRequest;)Lx5/i;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public e(Ljava/io/InputStream;I)Lx5/i;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/g0;->c(Ljava/io/InputStream;I)Lx5/i;

    .line 4
    move-result-object p1

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

.method public abstract f()Ljava/lang/String;
.end method
