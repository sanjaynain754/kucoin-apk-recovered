.class public Lcom/tencent/ugc/decoder/PixelFrameDownSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MAX_OUTPUT_SIDE_LENGTH:I = 0x780

.field private static final TAG:Ljava/lang/String; = "DecoderPixelFrameConverter"


# instance fields
.field private mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

.field private mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

.field private mSharedGLContext:Ljava/lang/Object;

.field private final mThrottlers:Lcom/tencent/liteav/base/b/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/liteav/base/b/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/liteav/base/b/b;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 11
    return-void
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
.end method

.method private clampOutputFrameSize(II)Lcom/tencent/liteav/base/util/Size;
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_1

    .line 6
    .line 7
    :cond_0
    const/16 v0, 0x780

    .line 8
    .line 9
    if-gt p1, v0, :cond_1

    .line 10
    .line 11
    if-gt p2, v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_1
    const/high16 v1, 0x44f00000    # 1920.0f

    .line 20
    .line 21
    if-lt p1, p2, :cond_2

    .line 22
    int-to-float p1, p1

    .line 23
    div-float/2addr v1, p1

    .line 24
    int-to-float p1, p2

    .line 25
    mul-float/2addr v1, p1

    .line 26
    float-to-int p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    int-to-float p2, p2

    .line 29
    div-float/2addr v1, p2

    .line 30
    int-to-float p1, p1

    .line 31
    mul-float/2addr v1, p1

    .line 32
    float-to-int p1, v1

    .line 33
    move v2, v0

    .line 34
    move v0, p1

    .line 35
    move p1, v2

    .line 36
    .line 37
    :goto_0
    new-instance p2, Lcom/tencent/liteav/base/util/Size;

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v0, p1}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 41
    return-object p2

    .line 42
    .line 43
    :cond_3
    :goto_1
    new-instance p1, Lcom/tencent/liteav/base/util/Size;

    .line 44
    .line 45
    const/16 p2, 0x2d0

    .line 46
    .line 47
    const/16 v0, 0x500

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2, v0}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 51
    return-object p1
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
    .line 189
.end method


# virtual methods
.method public getEglContext()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;->getEglContext()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
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
.end method

.method public initialize(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mSharedGLContext:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    const-string v2, "DecoderPixelFrameConverter"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p1, "already has eglcore."

    .line 12
    .line 13
    .line 14
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    return v1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 18
    .line 19
    const-string v3, "initGL"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v3, "initialize opengl components"

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    new-array v5, v4, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2, v3, v5}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 39
    .line 40
    const/16 v3, 0x80

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-virtual {v0, p1, v5, v3, v3}, Lcom/tencent/ugc/videobase/egl/EGLCore;->initialize(Ljava/lang/Object;Landroid/view/Surface;II)V

    .line 45
    .line 46
    iget-object p1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    new-instance p1, Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 52
    .line 53
    .line 54
    invoke-direct {p1}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;-><init>()V

    .line 55
    .line 56
    iput-object p1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 57
    return v1

    .line 58
    :catch_0
    move-exception p1

    .line 59
    .line 60
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 61
    .line 62
    const-string v1, "initGLError"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    const-string v1, "initialize opengl components failed."

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2, v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    iput-object v5, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 74
    return v4
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
.end method

.method public makeCurrent()Z
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    .line 14
    :goto_1
    iget-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 15
    .line 16
    const-string v2, "makeCurrent"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "DecoderPixelFrameConverter"

    .line 23
    .line 24
    const-string v3, "makeCurrent failed."

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2, v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    const/4 v0, 0x0

    .line 29
    return v0
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
.end method

.method public scaleTo1080p(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_8

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 16
    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->b:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 24
    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->getEglContext()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    iget-object v2, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mSharedGLContext:Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->makeCurrent()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 58
    return-object v0

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    sget-object v2, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 65
    .line 66
    if-eq v1, v2, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    sget-object v3, Lcom/tencent/liteav/base/util/l;->c:Lcom/tencent/liteav/base/util/l;

    .line 73
    .line 74
    if-eq v1, v3, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->swapWidthHeight()V

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 81
    move-result v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 85
    move-result v3

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v1, v3}, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->clampOutputFrameSize(II)Lcom/tencent/liteav/base/util/Size;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    iget-object v3, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->getOutputSize()Lcom/tencent/liteav/base/util/Size;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v1}, Lcom/tencent/liteav/base/util/Size;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result v3

    .line 102
    .line 103
    if-nez v3, :cond_5

    .line 104
    .line 105
    iget-object v3, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 109
    .line 110
    iput-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 111
    .line 112
    :cond_5
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 113
    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    new-instance v0, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 117
    .line 118
    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 119
    .line 120
    iget v4, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, v3, v4}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;-><init>(II)V

    .line 124
    .line 125
    iput-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 126
    .line 127
    :cond_6
    iget v0, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 128
    .line 129
    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 130
    const/4 v4, 0x0

    .line 131
    .line 132
    .line 133
    invoke-static {v4, v4, v0, v3}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 134
    .line 135
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 136
    .line 137
    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 138
    .line 139
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v3, v1}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1, v3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 155
    .line 156
    iget-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 157
    .line 158
    sget-object v3, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, p1, v3, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->renderFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/ugc/videobase/frame/GLTexture;)V

    .line 162
    .line 163
    iget-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/egl/EGLCore;->getEglContext()Ljava/lang/Object;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 175
    move-result-wide v3

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v3, v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTimestamp(J)V

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lcom/tencent/ugc/GlobalContextManager;->getInstance()Lcom/tencent/ugc/GlobalContextManager;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Lcom/tencent/ugc/GlobalContextManager;->getGLContext()Ljava/lang/Object;

    .line 186
    move-result-object v3

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setGLContext(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    if-eq v0, v2, :cond_7

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    sget-object v2, Lcom/tencent/liteav/base/util/l;->c:Lcom/tencent/liteav/base/util/l;

    .line 205
    .line 206
    if-eq v0, v2, :cond_7

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->swapWidthHeight()V

    .line 210
    .line 211
    .line 212
    :cond_7
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 213
    return-object v1

    .line 214
    :cond_8
    :goto_0
    return-object v0
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
.end method

.method public uninitialize()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->makeCurrent()Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->destroy()V

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 21
    .line 22
    iput-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;->destroy(Lcom/tencent/ugc/videobase/egl/EGLCore;)V

    .line 28
    .line 29
    iput-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 30
    .line 31
    iput-object v1, p0, Lcom/tencent/ugc/decoder/PixelFrameDownSampler;->mSharedGLContext:Ljava/lang/Object;

    .line 32
    return-void
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
.end method
