.class public Lcom/tencent/ugc/videoprocessor/VideoProcessManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;
    }
.end annotation


# static fields
.field private static final IDENTITY:I = 0x64


# instance fields
.field private mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private mIsPreprocessorRegister:Z

.field private mListener:Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;

.field private mNeedProcess:Z

.field private final mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

.field private final mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

.field private final mTAG:Ljava/lang/String;

.field private final mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

.field private final mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

.field private final mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

.field private mVideoPreprocessorListener:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

.field private final mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "VideoProcessManager_"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTAG:Ljava/lang/String;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mIsPreprocessorRegister:Z

    .line 29
    .line 30
    new-instance v1, Lcom/tencent/ugc/videoprocessor/VideoProcessManager$1;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager$1;-><init>(Lcom/tencent/ugc/videoprocessor/VideoProcessManager;)V

    .line 34
    .line 35
    iput-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessorListener:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 36
    .line 37
    new-instance v1, Lcom/tencent/ugc/preprocessor/BeautyProcessor;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p1, p2}, Lcom/tencent/ugc/preprocessor/BeautyProcessor;-><init>(Landroid/content/Context;Z)V

    .line 41
    .line 42
    new-instance v2, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, p1, v1}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;-><init>(Landroid/content/Context;Lcom/tencent/ugc/preprocessor/BeautyProcessor;)V

    .line 46
    .line 47
    iput-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 48
    .line 49
    new-instance v2, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 50
    .line 51
    .line 52
    invoke-direct {v2, p1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    iput-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 55
    .line 56
    new-instance v2, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p1}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    iput-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 62
    .line 63
    new-instance p1, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;-><init>()V

    .line 67
    .line 68
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p2}, Lcom/tencent/ugc/preprocessor/BeautyProcessor;->setPerformanceMode(Z)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createNormalCubeVerticesBuffer()Ljava/nio/FloatBuffer;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 78
    .line 79
    sget-object p1, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0, v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 86
    return-void
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

.method private applyMotionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->processFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Lcom/tencent/ugc/videobase/frame/GLTexturePool;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
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
    .line 94
    .line 95
.end method

.method private applyTransitionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->applyTransitionFilter(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
    .line 94
    .line 95
.end method

.method private processByVideoEffectInner(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->retain()I

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 11
    move-result-wide v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getCurrentMotionType(J)I

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->applyTransitionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 28
    move-object p1, v0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->applyMotionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 38
    :goto_0
    move-object p1, v0

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->applyMotionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 49
    move-object p1, v0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->applyTransitionFilterChain(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;->process(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 75
    return-object v0

    .line 76
    :cond_4
    return-object p1
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


# virtual methods
.method public getEffectProcessor()Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 6
    return-object v0
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

.method public getTransitionProcessor()Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 6
    return-object v0
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

.method public getWatermarkProcessor()Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 6
    return-object v0
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

.method public initFilter(Lcom/tencent/ugc/videobase/frame/GLTexturePool;II)V
    .locals 7

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;II)V

    .line 8
    .line 9
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mIsPreprocessorRegister:Z

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p2, p3}, Lcom/tencent/ugc/videobase/videobase/ConvertParams;-><init>(II)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 26
    .line 27
    sget-object v3, Lcom/tencent/liteav/videobase/base/GLConstants$a;->b:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 28
    .line 29
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 30
    const/4 v5, 0x0

    .line 31
    .line 32
    iget-object v6, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessorListener:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 33
    .line 34
    const/16 v1, 0x64

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {v0 .. v6}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->registerVideoProcessedListener(ILcom/tencent/ugc/videobase/videobase/ConvertParams;Lcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;ZLcom/tencent/ugc/preprocessor/VideoPreprocessorListener;)V

    .line 38
    const/4 p1, 0x1

    .line 39
    .line 40
    iput-boolean p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mIsPreprocessorRegister:Z

    .line 41
    :cond_0
    return-void
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
.end method

.method public processByVideoEffect(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->processByVideoEffectInner(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mListener:Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;->didProcessFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 17
    :cond_0
    return-void
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
    .line 94
    .line 95
.end method

.method public processFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
    .locals 4

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_4

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mListener:Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;->customProcessFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)I

    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, -0x1

    .line 14
    .line 15
    :goto_0
    if-lez v0, :cond_2

    .line 16
    .line 17
    new-instance v1, Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;-><init>(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTextureId(I)V

    .line 24
    move-object p1, v1

    .line 25
    .line 26
    :cond_2
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 27
    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    iget-boolean v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    goto :goto_2

    .line 34
    .line 35
    :cond_3
    iget-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;->getBlurLevel()F

    .line 41
    move-result v2

    .line 42
    .line 43
    const/high16 v3, 0x40800000    # 4.0f

    .line 44
    mul-float/2addr v2, v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->setGaussianBlurLevel(F)V

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    const/4 v2, 0x0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->setGaussianBlurLevel(F)V

    .line 53
    .line 54
    :goto_1
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->processFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V

    .line 58
    goto :goto_3

    .line 59
    .line 60
    :cond_5
    :goto_2
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mListener:Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;

    .line 61
    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, p1}, Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;->didProcessFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V

    .line 66
    .line 67
    :cond_6
    :goto_3
    if-lez v0, :cond_7

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 71
    :cond_7
    :goto_4
    return-void
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
.end method

.method public setBeautyFilter(II)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->getBeautyProcessor()Lcom/tencent/ugc/preprocessor/BeautyProcessor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    int-to-float p1, p1

    .line 13
    .line 14
    const/high16 v1, 0x41100000    # 9.0f

    .line 15
    div-float/2addr p1, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/preprocessor/BeautyProcessor;->setBeautyLevel(F)V

    .line 19
    int-to-float p1, p2

    .line 20
    div-float/2addr p1, v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/preprocessor/BeautyProcessor;->setWhitenessLevel(F)V

    .line 24
    :cond_0
    return-void
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

.method public setFilter(Landroid/graphics/Bitmap;FLandroid/graphics/Bitmap;FF)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 6
    move-object v3, p1

    .line 7
    move v4, p2

    .line 8
    move-object v5, p3

    .line 9
    move v6, p4

    .line 10
    move v2, p5

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->setFilterGroupImages(FLandroid/graphics/Bitmap;FLandroid/graphics/Bitmap;F)V

    .line 14
    return-void
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
.end method

.method public setListener(Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mListener:Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;

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
    .line 94
    .line 95
.end method

.method public setOutputSize(II)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;->setRenderTargetSize(II)V

    .line 8
    :cond_0
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

.method public setScaleType(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mWatermarkProcessor:Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;

    .line 7
    const/4 v0, 0x2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videoprocessor/WatermarkProcessor;->setRenderMode(I)V

    .line 11
    :cond_0
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

.method public setSpecialRatio(F)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mNeedProcess:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->setFilterMixLevel(F)V

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
    .line 94
    .line 95
.end method

.method public unInitFilter()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "unInitialize"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoEffectProcessor:Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->destroy()V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTransitionProcessor:Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/VideoTransitionProcessor;->destroy()V

    .line 22
    .line 23
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mIsPreprocessorRegister:Z

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 28
    .line 29
    const/16 v1, 0x64

    .line 30
    .line 31
    iget-object v2, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessorListener:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->unregisterVideoProcessedListener(ILcom/tencent/ugc/preprocessor/VideoPreprocessorListener;)V

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mIsPreprocessorRegister:Z

    .line 38
    :cond_2
    return-void
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

.method public unInitialize()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mTAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "unInitialize"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoProcessManager;->mVideoPreprocessor:Lcom/tencent/ugc/preprocessor/VideoPreprocessor;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/ugc/preprocessor/VideoPreprocessor;->uninitialize()V

    .line 15
    :cond_0
    return-void
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
