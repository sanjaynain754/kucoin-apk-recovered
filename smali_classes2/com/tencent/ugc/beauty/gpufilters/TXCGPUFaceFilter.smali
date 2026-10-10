.class public Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;
.super Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;,
        Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;,
        Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;
    }
.end annotation


# static fields
.field private static final bShaderFragmentShader:Ljava/lang/String; = "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);\n}\n"

.field private static final retShaderFragmentShader:Ljava/lang/String; = "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);\n}\n"


# instance fields
.field private final mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

.field private final mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

.field private mCustomizeSamplingRatio:Z

.field private final mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

.field private final mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

.field private final mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

.field private final mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

.field private mSamplingHeight:I

.field private mSamplingRatio:F

.field private mSamplingWidth:I

.field private final mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x40800000    # 4.0f

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createNormalCubeVerticesBuffer()Ljava/nio/FloatBuffer;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 23
    .line 24
    new-instance v0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 30
    .line 31
    new-instance v0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 37
    .line 38
    new-instance v0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 39
    .line 40
    const-string v1, "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);\n}\n"

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 46
    .line 47
    new-instance v0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 48
    .line 49
    const-string v1, "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);\n}\n"

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 55
    .line 56
    new-instance v0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;-><init>()V

    .line 60
    .line 61
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 62
    return-void
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


# virtual methods
.method public onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->isInitialized()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->runPendingOnDrawTasks()V

    .line 11
    .line 12
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 15
    .line 16
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    if-ne v0, v2, :cond_2

    .line 20
    .line 21
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 22
    .line 23
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 24
    .line 25
    if-eq v2, v1, :cond_1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p3, 0x0

    .line 28
    move-object v0, p3

    .line 29
    move p3, p1

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 33
    .line 34
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 41
    .line 42
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v3, v1, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 46
    .line 47
    iget-object v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1, v0, p3, p4}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 54
    move-result p3

    .line 55
    .line 56
    :goto_1
    iget-object p4, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 57
    .line 58
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 59
    .line 60
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 64
    move-result-object p4

    .line 65
    .line 66
    iget-object v1, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 67
    .line 68
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 69
    .line 70
    iget v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2, v4}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 77
    .line 78
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 79
    .line 80
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p3, p4, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 84
    .line 85
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 89
    move-result v4

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4}, Lcom/tencent/ugc/videobase/filter/TXCGPUTwoInputFilter;->setSecondInputTexture(I)V

    .line 93
    .line 94
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 95
    .line 96
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 97
    .line 98
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, p3, v1, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 107
    .line 108
    :cond_3
    iget-object p3, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 109
    .line 110
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 111
    .line 112
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3, v0, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 116
    move-result-object p3

    .line 117
    .line 118
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 122
    move-result v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Lcom/tencent/ugc/videobase/filter/TXCGPUTwoInputFilter;->setSecondInputTexture(I)V

    .line 126
    .line 127
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 131
    move-result v2

    .line 132
    .line 133
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 134
    .line 135
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2, p3, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 142
    .line 143
    iget-object p4, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 144
    .line 145
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 146
    .line 147
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4, v0, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 151
    move-result-object p4

    .line 152
    .line 153
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 157
    move-result v2

    .line 158
    .line 159
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 160
    .line 161
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2, p4, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 168
    .line 169
    iget-object v0, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 170
    .line 171
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 172
    .line 173
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    iget-object v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 183
    move-result v2

    .line 184
    .line 185
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 186
    .line 187
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2, v0, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 194
    .line 195
    iget p3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 196
    .line 197
    const/high16 v1, 0x3f800000    # 1.0f

    .line 198
    .line 199
    cmpl-float p3, p3, v1

    .line 200
    .line 201
    if-eqz p3, :cond_4

    .line 202
    .line 203
    iget-object p3, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 204
    .line 205
    iget-object v1, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 206
    .line 207
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 208
    .line 209
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 210
    .line 211
    .line 212
    invoke-virtual {p3, v2, v1}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 213
    move-result-object p3

    .line 214
    .line 215
    iget-object v1, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 216
    .line 217
    iget-object v2, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 218
    .line 219
    iget v4, v2, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 220
    .line 221
    iget v2, v2, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v4, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    iget-object v2, p0, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->mOutputSize:Lcom/tencent/liteav/base/util/Size;

    .line 228
    .line 229
    iget v4, v2, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 230
    .line 231
    iget v2, v2, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 232
    .line 233
    .line 234
    invoke-static {v3, v3, v4, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 235
    .line 236
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 240
    move-result v3

    .line 241
    .line 242
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 243
    .line 244
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v3, p3, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 248
    .line 249
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 253
    move-result v3

    .line 254
    .line 255
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 256
    .line 257
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v3, v1, v4, v5}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 261
    .line 262
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 266
    move-result v3

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v3}, Lcom/tencent/ugc/videobase/filter/TXCGPUTwoInputFilter;->setSecondInputTexture(I)V

    .line 270
    .line 271
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, p1}, Lcom/tencent/ugc/videobase/filter/TXCGPUThreeInputFilter;->setThirdInputTexture(I)V

    .line 275
    .line 276
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 280
    move-result v2

    .line 281
    .line 282
    iget-object v3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 283
    .line 284
    iget-object v4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v2, p2, v3, v4}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 294
    goto :goto_2

    .line 295
    .line 296
    :cond_4
    iget-object p3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 300
    move-result v1

    .line 301
    .line 302
    .line 303
    invoke-virtual {p3, v1}, Lcom/tencent/ugc/videobase/filter/TXCGPUTwoInputFilter;->setSecondInputTexture(I)V

    .line 304
    .line 305
    iget-object p3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p3, p1}, Lcom/tencent/ugc/videobase/filter/TXCGPUThreeInputFilter;->setThirdInputTexture(I)V

    .line 309
    .line 310
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    .line 314
    move-result p3

    .line 315
    .line 316
    iget-object v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalCubeVerticesBuffer:Ljava/nio/FloatBuffer;

    .line 317
    .line 318
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalTextureCoordsBuffer:Ljava/nio/FloatBuffer;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p3, p2, v1, v2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 322
    .line 323
    .line 324
    :goto_2
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 328
    return-void
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
.end method

.method public onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 29
    return-void
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

.method public onOutputSizeChanged(II)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mCustomizeSamplingRatio:Z

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    const/high16 v0, 0x40800000    # 4.0f

    .line 12
    .line 13
    const/16 v2, 0x21c

    .line 14
    .line 15
    if-ge p1, p2, :cond_1

    .line 16
    .line 17
    if-ge p1, v2, :cond_0

    .line 18
    .line 19
    iput v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    if-ge p2, v2, :cond_2

    .line 26
    .line 27
    iput v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 31
    .line 32
    :cond_3
    :goto_0
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 36
    move-result v0

    .line 37
    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 41
    .line 42
    iput p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 43
    goto :goto_1

    .line 44
    :cond_4
    int-to-float v0, p1

    .line 45
    .line 46
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 47
    div-float/2addr v0, v1

    .line 48
    float-to-int v0, v0

    .line 49
    .line 50
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 51
    int-to-float v0, p2

    .line 52
    div-float/2addr v0, v1

    .line 53
    float-to-int v0, v0

    .line 54
    .line 55
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 56
    .line 57
    :goto_1
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 58
    .line 59
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 60
    .line 61
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 65
    .line 66
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 67
    .line 68
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 69
    .line 70
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;->onOutputSizeChanged(II)V

    .line 74
    .line 75
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 76
    .line 77
    iget v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 78
    .line 79
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 83
    .line 84
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1, p2}, Lcom/tencent/ugc/videobase/filter/TXCGPUThreeInputFilter;->onOutputSizeChanged(II)V

    .line 88
    .line 89
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 90
    .line 91
    iget p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingWidth:I

    .line 92
    .line 93
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingHeight:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2, v0}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;->onOutputSizeChanged(II)V

    .line 97
    return-void
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

.method public onUninit()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onUninit()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBoxFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUBoxBlurFilter;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mVarShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$c;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mBShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mRetShader:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter$b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mNormalFilter:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 29
    return-void
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

.method public setSamplingRatio(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mSamplingRatio:F

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUFaceFilter;->mCustomizeSamplingRatio:Z

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
