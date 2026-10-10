.class public Lcom/otaliastudios/transcoder/internal/video/a;
.super Ljava/lang/Object;
.source "FrameDrawer.java"


# static fields
.field public static final k:Lw90/i;


# instance fields
.field public a:Landroid/graphics/SurfaceTexture;

.field public b:Landroid/view/Surface;

.field public c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

.field public d:Lcom/otaliastudios/opengl/draw/GlRect;

.field public e:F

.field public f:F

.field public g:I

.field public h:Z

.field public i:Z
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mFrameAvailableLock"
    .end annotation
.end field

.field public final j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lw90/i;

    .line 3
    .line 4
    const-string v1, "FrameDrawer"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object v0, Lcom/otaliastudios/transcoder/internal/video/a;->k:Lw90/i;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->e:F

    .line 8
    .line 9
    iput v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->f:F

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->g:I

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->h:Z

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->j:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v0, Lcom/otaliastudios/opengl/texture/GlTexture;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;-><init>()V

    .line 27
    .line 28
    new-instance v1, Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Lcom/otaliastudios/opengl/program/GlTextureProgram;-><init>()V

    .line 32
    .line 33
    iput-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->l(Lcom/otaliastudios/opengl/texture/GlTexture;)V

    .line 37
    .line 38
    new-instance v1, Lcom/otaliastudios/opengl/draw/GlRect;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Lcom/otaliastudios/opengl/draw/GlRect;-><init>()V

    .line 42
    .line 43
    iput-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->d:Lcom/otaliastudios/opengl/draw/GlRect;

    .line 44
    .line 45
    new-instance v1, Landroid/graphics/SurfaceTexture;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->c()I

    .line 49
    move-result v0

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 53
    .line 54
    iput-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->a:Landroid/graphics/SurfaceTexture;

    .line 55
    .line 56
    new-instance v0, Lcom/otaliastudios/transcoder/internal/video/a$a;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, p0}, Lcom/otaliastudios/transcoder/internal/video/a$a;-><init>(Lcom/otaliastudios/transcoder/internal/video/a;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 63
    .line 64
    new-instance v0, Landroid/view/Surface;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->a:Landroid/graphics/SurfaceTexture;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 70
    .line 71
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->b:Landroid/view/Surface;

    .line 72
    return-void
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
.end method

.method public static synthetic a()Lw90/i;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/otaliastudios/transcoder/internal/video/a;->k:Lw90/i;

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
.end method

.method public static synthetic b(Lcom/otaliastudios/transcoder/internal/video/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->j:Ljava/lang/Object;

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
    .line 24
    .line 25
.end method

.method public static synthetic c(Lcom/otaliastudios/transcoder/internal/video/a;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->i:Z

    .line 3
    return p0
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
.end method

.method public static synthetic d(Lcom/otaliastudios/transcoder/internal/video/a;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->i:Z

    .line 3
    return p1
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
.end method


# virtual methods
.method public final e()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->j:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    :try_start_1
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->j:Ljava/lang/Object;

    .line 10
    .line 11
    const-wide/16 v2, 0x2710

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 15
    .line 16
    iget-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->i:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    const-string v2, "Surface frame wait timed out"

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 27
    throw v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v1

    .line 31
    .line 32
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    throw v2

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    .line 39
    iput-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->i:Z

    .line 40
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->a:Landroid/graphics/SurfaceTexture;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 46
    return-void

    .line 47
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    throw v1
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public f()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/video/a;->e()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/video/a;->g()V

    .line 7
    return-void
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
.end method

.method public final g()V
    .locals 14

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->a:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 12
    .line 13
    iget v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->e:F

    .line 14
    .line 15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    div-float v0, v1, v0

    .line 18
    .line 19
    iget v2, p0, Lcom/otaliastudios/transcoder/internal/video/a;->f:F

    .line 20
    .line 21
    div-float v2, v1, v2

    .line 22
    .line 23
    sub-float v3, v1, v0

    .line 24
    .line 25
    const/high16 v4, 0x40000000    # 2.0f

    .line 26
    div-float/2addr v3, v4

    .line 27
    .line 28
    sub-float v5, v1, v2

    .line 29
    div-float/2addr v5, v4

    .line 30
    .line 31
    iget-object v4, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 35
    move-result-object v4

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v6, v3, v5, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 41
    .line 42
    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v6, v0, v2, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 55
    move-result-object v0

    .line 56
    .line 57
    const/high16 v2, 0x3f000000    # 0.5f

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v6, v2, v2, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 66
    move-result-object v8

    .line 67
    .line 68
    iget v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->g:I

    .line 69
    int-to-float v10, v0

    .line 70
    const/4 v12, 0x0

    .line 71
    .line 72
    const/high16 v13, 0x3f800000    # 1.0f

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 78
    .line 79
    iget-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->h:Z

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const/high16 v2, -0x40800000    # -1.0f

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v6, v1, v2, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 93
    .line 94
    :cond_0
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->k()[F

    .line 98
    move-result-object v0

    .line 99
    .line 100
    const/high16 v1, -0x41000000    # -0.5f

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v6, v1, v1, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 104
    .line 105
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->d:Lcom/otaliastudios/opengl/draw/GlRect;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lcom/otaliastudios/opengl/program/GlProgram;->a(Lcom/otaliastudios/opengl/draw/b;)V

    .line 111
    return-void
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
.end method

.method public h()Landroid/view/Surface;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->b:Landroid/view/Surface;

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
.end method

.method public i()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/program/GlTextureProgram;->i()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->b:Landroid/view/Surface;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->b:Landroid/view/Surface;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->a:Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->d:Lcom/otaliastudios/opengl/draw/GlRect;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a;->c:Lcom/otaliastudios/opengl/program/GlTextureProgram;

    .line 20
    return-void
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
.end method

.method public j(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->h:Z

    .line 3
    return-void
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
.end method

.method public k(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->g:I

    .line 3
    return-void
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
.end method

.method public l(FF)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/otaliastudios/transcoder/internal/video/a;->e:F

    .line 3
    .line 4
    iput p2, p0, Lcom/otaliastudios/transcoder/internal/video/a;->f:F

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
.end method
