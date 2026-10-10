.class public Lcom/facebook/imagepipeline/core/a;
.super Ljava/lang/Object;
.source "ImagePipelineFactory.java"


# static fields
.field public static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static q:Lcom/facebook/imagepipeline/core/a;

.field public static r:Lcom/facebook/imagepipeline/core/ImagePipeline;

.field public static s:Z


# instance fields
.field public final a:Lcom/facebook/imagepipeline/producers/f1;

.field public final b:Ls5/r;

.field public final c:Ls5/a;

.field public final d:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/facebook/imagepipeline/cache/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lq5/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/o<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/facebook/imagepipeline/cache/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lq5/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/o<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lv5/b;

.field public j:Le6/d;

.field public k:Ls5/v;

.field public l:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

.field public m:Lp5/c;

.field public n:Lb6/d;

.field public o:Ln5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/imagepipeline/core/a;

    .line 3
    .line 4
    sput-object v0, Lcom/facebook/imagepipeline/core/a;->p:Ljava/lang/Class;

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

.method public constructor <init>(Ls5/r;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ld6/b;->d()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "ImagePipelineConfig()"

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ls5/r;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->F()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v1, Lcom/facebook/imagepipeline/producers/z;

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ls5/r;->H()Ls5/n;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ls5/n;->a()Ljava/util/concurrent/Executor;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2}, Lcom/facebook/imagepipeline/producers/z;-><init>(Ljava/util/concurrent/Executor;)V

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    new-instance v1, Lcom/facebook/imagepipeline/producers/g1;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ls5/r;->H()Ls5/n;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Ls5/n;->a()Ljava/util/concurrent/Executor;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v2}, Lcom/facebook/imagepipeline/producers/g1;-><init>(Ljava/util/concurrent/Executor;)V

    .line 60
    .line 61
    :goto_0
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/a;->a:Lcom/facebook/imagepipeline/producers/f1;

    .line 62
    .line 63
    new-instance v1, Ls5/a;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ls5/r;->j()Lu5/a;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, p1}, Ls5/a;-><init>(Lu5/a;)V

    .line 71
    .line 72
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/a;->c:Ls5/a;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ld6/b;->d()Z

    .line 76
    move-result p1

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ld6/b;->b()V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-interface {v0}, Ls5/r;->A()Lw3/k;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    iput-object p1, p0, Lcom/facebook/imagepipeline/core/a;->d:Lw3/k;

    .line 88
    return-void
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
.end method

.method public static l()Lcom/facebook/imagepipeline/core/a;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/core/a;->q:Lcom/facebook/imagepipeline/core/a;

    .line 3
    .line 4
    const-string v1, "ImagePipelineFactory was not initialized!"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lw3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/facebook/imagepipeline/core/a;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static declared-synchronized q(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/facebook/imagepipeline/core/a;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Ld6/b;->d()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "ImagePipelineFactory#initialize"

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ld6/b;->a(Ljava/lang/String;)V

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->L(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->a()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/a;->r(Ls5/r;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ld6/b;->d()Z

    .line 32
    move-result p0

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ld6/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0
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

.method public static declared-synchronized r(Ls5/r;)V
    .locals 3

    .line 1
    .line 2
    const-class v0, Lcom/facebook/imagepipeline/core/a;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/facebook/imagepipeline/core/a;->q:Lcom/facebook/imagepipeline/core/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lcom/facebook/imagepipeline/core/a;->p:Ljava/lang/Class;

    .line 10
    .line 11
    const-string v2, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lx3/a;->E(Ljava/lang/Class;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-boolean v1, Lcom/facebook/imagepipeline/core/a;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    :try_start_1
    new-instance v1, Lcom/facebook/imagepipeline/core/a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/facebook/imagepipeline/core/a;-><init>(Ls5/r;)V

    .line 28
    .line 29
    sput-object v1, Lcom/facebook/imagepipeline/core/a;->q:Lcom/facebook/imagepipeline/core/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw p0
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


# virtual methods
.method public final a()Lcom/facebook/imagepipeline/core/ImagePipeline;
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->p()Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 9
    .line 10
    .line 11
    invoke-interface {v2}, Ls5/r;->q()Ljava/util/Set;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 15
    .line 16
    .line 17
    invoke-interface {v3}, Ls5/r;->a()Ljava/util/Set;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    iget-object v4, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 21
    .line 22
    .line 23
    invoke-interface {v4}, Ls5/r;->l()Lw3/k;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->e()Lq5/o;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->h()Lq5/o;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    iget-object v7, p0, Lcom/facebook/imagepipeline/core/a;->d:Lw3/k;

    .line 35
    .line 36
    iget-object v8, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 37
    .line 38
    .line 39
    invoke-interface {v8}, Ls5/r;->C()Lq5/h;

    .line 40
    move-result-object v8

    .line 41
    .line 42
    iget-object v9, p0, Lcom/facebook/imagepipeline/core/a;->a:Lcom/facebook/imagepipeline/producers/f1;

    .line 43
    .line 44
    iget-object v10, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 45
    .line 46
    .line 47
    invoke-interface {v10}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 48
    move-result-object v10

    .line 49
    .line 50
    .line 51
    invoke-virtual {v10}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->t()Lw3/k;

    .line 52
    move-result-object v10

    .line 53
    .line 54
    iget-object v11, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 55
    .line 56
    .line 57
    invoke-interface {v11}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 58
    move-result-object v11

    .line 59
    .line 60
    .line 61
    invoke-virtual {v11}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->H()Lw3/k;

    .line 62
    move-result-object v11

    .line 63
    .line 64
    iget-object v12, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 65
    .line 66
    .line 67
    invoke-interface {v12}, Ls5/r;->G()Ls3/a;

    .line 68
    const/4 v12, 0x0

    .line 69
    .line 70
    iget-object v13, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 71
    .line 72
    .line 73
    invoke-direct/range {v0 .. v13}, Lcom/facebook/imagepipeline/core/ImagePipeline;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;Ljava/util/Set;Ljava/util/Set;Lw3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lcom/facebook/imagepipeline/producers/f1;Lw3/k;Lw3/k;Ls3/a;Ls5/r;)V

    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
.end method

.method public b(Landroid/content/Context;)Lw5/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->c()Ln5/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0, p1}, Ln5/a;->a(Landroid/content/Context;)Lw5/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public final c()Ln5/a;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->o:Ln5/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->m()Lp5/c;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ls5/r;->H()Ls5/n;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->d()Lcom/facebook/imagepipeline/cache/c;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->j()Z

    .line 28
    move-result v4

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->v()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->c()I

    .line 48
    move-result v6

    .line 49
    .line 50
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->d()I

    .line 58
    move-result v7

    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ls5/r;->u()Lu3/g;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    .line 67
    invoke-static/range {v1 .. v8}, Ln5/b;->a(Lp5/c;Ls5/n;Lcom/facebook/imagepipeline/cache/c;ZZIILjava/util/concurrent/ExecutorService;)Ln5/a;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->o:Ln5/a;

    .line 71
    .line 72
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->o:Ln5/a;

    .line 73
    return-object v0
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public d()Lcom/facebook/imagepipeline/cache/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->e:Lcom/facebook/imagepipeline/cache/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->B()Lcom/facebook/imagepipeline/cache/a;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ls5/r;->y()Lw3/k;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ls5/r;->m()Lz3/d;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ls5/r;->s()Lcom/facebook/imagepipeline/cache/f$a;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->r()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->q()Z

    .line 48
    move-result v6

    .line 49
    .line 50
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ls5/r;->e()Lcom/facebook/imagepipeline/cache/c$b;

    .line 54
    move-result-object v7

    .line 55
    .line 56
    .line 57
    invoke-interface/range {v1 .. v7}, Lcom/facebook/imagepipeline/cache/a;->a(Lw3/k;Lz3/d;Lcom/facebook/imagepipeline/cache/f$a;ZZLcom/facebook/imagepipeline/cache/c$b;)Lcom/facebook/imagepipeline/cache/c;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->e:Lcom/facebook/imagepipeline/cache/c;

    .line 61
    .line 62
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->e:Lcom/facebook/imagepipeline/cache/c;

    .line 63
    return-object v0
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

.method public e()Lq5/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/o<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->f:Lq5/o;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->d()Lcom/facebook/imagepipeline/cache/c;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ls5/r;->k()Lq5/n;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lq5/p;->a(Lcom/facebook/imagepipeline/cache/f;Lq5/n;)Lq5/o;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->f:Lq5/o;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->f:Lq5/o;

    .line 23
    return-object v0
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
.end method

.method public f()Ls5/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->c:Ls5/a;

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

.method public g()Lcom/facebook/imagepipeline/cache/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->g:Lcom/facebook/imagepipeline/cache/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->h()Lw3/k;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Ls5/r;->m()Lz3/d;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Ls5/r;->r()Lcom/facebook/imagepipeline/cache/f$a;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lcom/facebook/imagepipeline/cache/d;->a(Lw3/k;Lz3/d;Lcom/facebook/imagepipeline/cache/f$a;)Lcom/facebook/imagepipeline/cache/c;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->g:Lcom/facebook/imagepipeline/cache/c;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->g:Lcom/facebook/imagepipeline/cache/c;

    .line 31
    return-object v0
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
.end method

.method public h()Lq5/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/o<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->h:Lq5/o;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->b()Lcom/facebook/imagepipeline/cache/f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ls5/r;->b()Lcom/facebook/imagepipeline/cache/f;

    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->g()Lcom/facebook/imagepipeline/cache/c;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ls5/r;->k()Lq5/n;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lq5/m;->a(Lcom/facebook/imagepipeline/cache/f;Lq5/n;)Lq5/o;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->h:Lq5/o;

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->h:Lq5/o;

    .line 38
    return-object v0
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
.end method

.method public final i()Lv5/b;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->i:Lv5/b;

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->g()Lv5/b;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ls5/r;->g()Lv5/b;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->i:Lv5/b;

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->c()Ln5/a;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ln5/a;->c()Lv5/b;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ln5/a;->b()Lv5/b;

    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    move-object v0, v1

    .line 39
    .line 40
    :goto_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Ls5/r;->x()Lv5/c;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    new-instance v2, Lv5/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->n()Lb6/d;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v1, v0, v3}, Lv5/a;-><init>(Lv5/b;Lv5/b;Lb6/d;)V

    .line 56
    .line 57
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/a;->i:Lv5/b;

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_2
    new-instance v2, Lv5/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->n()Lb6/d;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    iget-object v4, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Ls5/r;->x()Lv5/c;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Lv5/c;->a()Ljava/util/Map;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, v1, v0, v3, v4}, Lv5/a;-><init>(Lv5/b;Lv5/b;Lb6/d;Ljava/util/Map;)V

    .line 78
    .line 79
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/a;->i:Lv5/b;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lcom/facebook/imageformat/ImageFormatChecker;->e()Lcom/facebook/imageformat/ImageFormatChecker;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Ls5/r;->x()Lv5/c;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lv5/c;->b()Ljava/util/List;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/facebook/imageformat/ImageFormatChecker;->g(Ljava/util/List;)V

    .line 97
    .line 98
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->i:Lv5/b;

    .line 99
    return-object v0
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

.method public j()Lcom/facebook/imagepipeline/core/ImagePipeline;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/core/a;->r:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/imagepipeline/core/a;->r:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/facebook/imagepipeline/core/a;->r:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final k()Le6/d;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->j:Le6/d;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->w()Le6/d;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ls5/r;->v()Ljava/lang/Integer;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->I()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Le6/g;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->m()I

    .line 44
    move-result v1

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1}, Le6/g;-><init>(I)V

    .line 48
    .line 49
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->j:Le6/d;

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_0
    new-instance v2, Le6/f;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->m()I

    .line 62
    move-result v3

    .line 63
    .line 64
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->x()Z

    .line 72
    move-result v4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ls5/r;->w()Le6/d;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ls5/r;->v()Ljava/lang/Integer;

    .line 84
    move-result-object v6

    .line 85
    .line 86
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 87
    .line 88
    .line 89
    invoke-interface {v0}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->E()Z

    .line 94
    move-result v7

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v2 .. v7}, Le6/f;-><init>(IZLe6/d;Ljava/lang/Integer;Z)V

    .line 98
    .line 99
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/a;->j:Le6/d;

    .line 100
    .line 101
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->j:Le6/d;

    .line 102
    return-object v0
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

.method public m()Lp5/c;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->m:Lp5/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->i()La6/g0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->n()Lb6/d;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/a;->f()Ls5/a;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lp5/d;->a(La6/g0;Lb6/d;Ls5/a;)Lp5/c;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->m:Lp5/c;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->m:Lp5/c;

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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public n()Lb6/d;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->n:Lb6/d;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ls5/r;->i()La6/g0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->G()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 23
    .line 24
    .line 25
    invoke-interface {v2}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->s()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->o()Lb6/f;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1, v2, v3}, Lb6/e;->a(La6/g0;ZZLb6/f;)Lb6/d;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/a;->n:Lb6/d;

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/a;->n:Lb6/d;

    .line 49
    return-object v0
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
.end method

.method public final o()Ls5/v;
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->k:Ls5/v;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->p()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ls5/r;->getContext()Landroid/content/Context;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ls5/r;->i()La6/g0;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, La6/g0;->k()Lz3/a;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->i()Lv5/b;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ls5/r;->c()Lv5/e;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ls5/r;->F()Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ls5/r;->D()Z

    .line 54
    move-result v8

    .line 55
    .line 56
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->A()Z

    .line 64
    move-result v9

    .line 65
    .line 66
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ls5/r;->H()Ls5/n;

    .line 70
    move-result-object v10

    .line 71
    .line 72
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ls5/r;->i()La6/g0;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    iget-object v11, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 79
    .line 80
    .line 81
    invoke-interface {v11}, Ls5/r;->z()I

    .line 82
    move-result v11

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v11}, La6/g0;->i(I)Lz3/h;

    .line 86
    move-result-object v11

    .line 87
    .line 88
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ls5/r;->i()La6/g0;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, La6/g0;->j()Lz3/k;

    .line 96
    move-result-object v12

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->e()Lq5/o;

    .line 100
    move-result-object v13

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->h()Lq5/o;

    .line 104
    move-result-object v14

    .line 105
    .line 106
    iget-object v15, v0, Lcom/facebook/imagepipeline/core/a;->d:Lw3/k;

    .line 107
    .line 108
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Ls5/r;->C()Lq5/h;

    .line 112
    move-result-object v16

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->m()Lp5/c;

    .line 116
    move-result-object v17

    .line 117
    .line 118
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->g()I

    .line 126
    move-result v18

    .line 127
    .line 128
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->f()I

    .line 136
    move-result v19

    .line 137
    .line 138
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 139
    .line 140
    .line 141
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->e()Z

    .line 146
    move-result v20

    .line 147
    .line 148
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->m()I

    .line 156
    move-result v21

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->f()Ls5/a;

    .line 160
    move-result-object v22

    .line 161
    .line 162
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->l()Z

    .line 170
    move-result v23

    .line 171
    .line 172
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 173
    .line 174
    .line 175
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->u()I

    .line 180
    move-result v24

    .line 181
    .line 182
    .line 183
    invoke-interface/range {v2 .. v24}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;->a(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lz3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)Ls5/v;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    iput-object v1, v0, Lcom/facebook/imagepipeline/core/a;->k:Ls5/v;

    .line 187
    .line 188
    :cond_0
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->k:Ls5/v;

    .line 189
    return-object v1
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

.method public final p()Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->w()Z

    .line 12
    move-result v10

    .line 13
    .line 14
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v2, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

    .line 19
    .line 20
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ls5/r;->getContext()Landroid/content/Context;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->o()Ls5/v;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ls5/r;->o()Lcom/facebook/imagepipeline/producers/p0;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ls5/r;->D()Z

    .line 48
    move-result v6

    .line 49
    .line 50
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->K()Z

    .line 58
    move-result v7

    .line 59
    .line 60
    iget-object v8, v0, Lcom/facebook/imagepipeline/core/a;->a:Lcom/facebook/imagepipeline/producers/f1;

    .line 61
    .line 62
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ls5/r;->F()Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 66
    move-result-object v9

    .line 67
    .line 68
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->J()Z

    .line 76
    move-result v11

    .line 77
    .line 78
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ls5/r;->f()Z

    .line 82
    move-result v12

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->k()Le6/d;

    .line 86
    move-result-object v13

    .line 87
    .line 88
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->D()Z

    .line 96
    move-result v14

    .line 97
    .line 98
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 99
    .line 100
    .line 101
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->B()Z

    .line 106
    move-result v15

    .line 107
    .line 108
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Ls5/r;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->a()Z

    .line 116
    move-result v16

    .line 117
    .line 118
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->b:Ls5/r;

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ls5/r;->E()Ljava/util/Set;

    .line 122
    move-result-object v17

    .line 123
    .line 124
    .line 125
    invoke-direct/range {v2 .. v17}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;-><init>(Landroid/content/ContentResolver;Ls5/v;Lcom/facebook/imagepipeline/producers/p0;ZZLcom/facebook/imagepipeline/producers/f1;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLe6/d;ZZZLjava/util/Set;)V

    .line 126
    .line 127
    iput-object v2, v0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

    .line 128
    .line 129
    :cond_0
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/a;->l:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;

    .line 130
    return-object v1
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
