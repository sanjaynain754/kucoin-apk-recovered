.class public Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;
.super Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;
.source "SourceFile"


# static fields
.field private static final LOOKUP_FILTER_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2; // lookup texture 1\nuniform sampler2D inputImageTexture3; // lookup texture 2\n\n\nuniform lowp vec3 v3_params;\nuniform lowp vec2 v2_texs;\n\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n    mediump float blueColor = textureColor.b * 63.0;\n\n    mediump vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    mediump vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    lowp vec4 newColor1;\n    lowp vec4 newColor2;\n    if(textureCoordinate.x <= v3_params.x) { \n      if(v2_texs.x == 1.0) { \n        newColor1 = texture2D(inputImageTexture2, texPos1);\n        newColor2 = texture2D(inputImageTexture2, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    } else {\n      if(v2_texs.y == 1.0) { \n        newColor1 = texture2D(inputImageTexture3, texPos1);\n        newColor2 = texture2D(inputImageTexture3, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    }\n }"


# instance fields
.field private mLeftBitmap:Landroid/graphics/Bitmap;

.field private mLeftTextureId:I

.field private mLeftTextureUniform:I

.field private mParams3Location:I

.field private final mParamsFloatBuffer:Ljava/nio/FloatBuffer;

.field private mRightBitmap:Landroid/graphics/Bitmap;

.field private mRightTextureId:I

.field private mRightTextureUniform:I

.field private mTexs2Location:I

.field private final mTexsFloatBuffer:Ljava/nio/FloatBuffer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    const-string v1, "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2; // lookup texture 1\nuniform sampler2D inputImageTexture3; // lookup texture 2\n\n\nuniform lowp vec3 v3_params;\nuniform lowp vec2 v2_texs;\n\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n    mediump float blueColor = textureColor.b * 63.0;\n\n    mediump vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    mediump vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    lowp vec4 newColor1;\n    lowp vec4 newColor2;\n    if(textureCoordinate.x <= v3_params.x) { \n      if(v2_texs.x == 1.0) { \n        newColor1 = texture2D(inputImageTexture2, texPos1);\n        newColor2 = texture2D(inputImageTexture2, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    } else {\n      if(v2_texs.y == 1.0) { \n        newColor1 = texture2D(inputImageTexture3, texPos1);\n        newColor2 = texture2D(inputImageTexture3, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    }\n }"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 11
    const/4 v1, -0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    iput v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 18
    const/4 v0, 0x3

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 25
    const/4 v0, 0x2

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

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

.method public static synthetic lambda$setBitmap$0(Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;FFFLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, p2}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 15
    const/4 p2, 0x2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, p3}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 19
    .line 20
    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    const/4 p2, 0x0

    .line 22
    const/4 p3, -0x1

    .line 23
    .line 24
    if-nez p4, :cond_0

    .line 25
    .line 26
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    .line 30
    .line 31
    iput p3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 32
    .line 33
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1, p2}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    if-eq p4, v2, :cond_1

    .line 42
    .line 43
    iget v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 44
    .line 45
    .line 46
    invoke-static {p4, v2, v1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->loadTexture(Landroid/graphics/Bitmap;IZ)I

    .line 47
    move-result v2

    .line 48
    .line 49
    iput v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 50
    .line 51
    iget-object v2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1, p1}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 55
    .line 56
    :cond_1
    :goto_0
    if-nez p5, :cond_2

    .line 57
    .line 58
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    .line 62
    .line 63
    iput p3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 64
    .line 65
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0, p2}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_2
    iget-object p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 72
    .line 73
    if-eq p5, p2, :cond_3

    .line 74
    .line 75
    iget p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 76
    .line 77
    .line 78
    invoke-static {p5, p2, v1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->loadTexture(Landroid/graphics/Bitmap;IZ)I

    .line 79
    move-result p2

    .line 80
    .line 81
    iput p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 82
    .line 83
    iget-object p2, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v0, p1}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 87
    .line 88
    :cond_3
    :goto_1
    iput-object p4, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 89
    .line 90
    iput-object p5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 91
    return-void
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
.end method

.method public static synthetic lambda$setIntensity$1(Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;F)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 9
    const/4 p1, 0x2

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

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
    .line 187
    .line 188
    .line 189
.end method


# virtual methods
.method public afterDrawArrays()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->afterDrawArrays()V

    .line 4
    .line 5
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    const/16 v2, 0xde1

    .line 9
    const/4 v3, -0x1

    .line 10
    .line 11
    if-eq v0, v3, :cond_0

    .line 12
    .line 13
    .line 14
    const v0, 0x84c3

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    .line 27
    const v0, 0x84c4

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 34
    :cond_1
    return-void
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

.method public beforeDrawArrays(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->beforeDrawArrays(I)V

    .line 4
    .line 5
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 6
    .line 7
    const/16 v0, 0xde1

    .line 8
    const/4 v1, -0x1

    .line 9
    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    .line 13
    const p1, 0x84c3

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 17
    .line 18
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 22
    .line 23
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureUniform:I

    .line 24
    const/4 v2, 0x3

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 28
    .line 29
    :cond_0
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 30
    .line 31
    if-eq p1, v1, :cond_1

    .line 32
    .line 33
    .line 34
    const p1, 0x84c4

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 38
    .line 39
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 43
    .line 44
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureUniform:I

    .line 45
    const/4 v0, 0x4

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 49
    .line 50
    :cond_1
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexs2Location:I

    .line 51
    .line 52
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 53
    const/4 v1, 0x1

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1, v0}, Landroid/opengl/GLES20;->glUniform2fv(IILjava/nio/FloatBuffer;)V

    .line 57
    .line 58
    iget p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParams3Location:I

    .line 59
    .line 60
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v1, v0}, Landroid/opengl/GLES20;->glUniform3fv(IILjava/nio/FloatBuffer;)V

    .line 64
    return-void
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

.method public onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->getProgramId()I

    .line 7
    move-result p1

    .line 8
    .line 9
    const-string v0, "inputImageTexture2"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 13
    move-result p1

    .line 14
    .line 15
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureUniform:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->getProgramId()I

    .line 19
    move-result p1

    .line 20
    .line 21
    const-string v0, "inputImageTexture3"

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 25
    move-result p1

    .line 26
    .line 27
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureUniform:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->getProgramId()I

    .line 31
    move-result p1

    .line 32
    .line 33
    const-string v0, "v3_params"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 37
    move-result p1

    .line 38
    .line 39
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParams3Location:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->getProgramId()I

    .line 43
    move-result p1

    .line 44
    .line 45
    const-string v0, "v2_texs"

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 49
    move-result p1

    .line 50
    .line 51
    iput p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mTexs2Location:I

    .line 52
    .line 53
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-void

    .line 62
    .line 63
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 64
    const/4 v0, 0x0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->get(I)F

    .line 68
    move-result v2

    .line 69
    .line 70
    iget-object v3, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 73
    const/4 v0, 0x1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->get(I)F

    .line 77
    move-result v4

    .line 78
    .line 79
    iget-object v5, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    iget-object p1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mParamsFloatBuffer:Ljava/nio/FloatBuffer;

    .line 82
    const/4 v0, 0x2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->get(I)F

    .line 86
    move-result v6

    .line 87
    move-object v1, p0

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->setBitmap(FLandroid/graphics/Bitmap;FLandroid/graphics/Bitmap;F)V

    .line 91
    const/4 p1, 0x0

    .line 92
    .line 93
    iput-object p1, v1, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftBitmap:Landroid/graphics/Bitmap;

    .line 94
    .line 95
    iput-object p1, v1, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightBitmap:Landroid/graphics/Bitmap;

    .line 96
    return-void
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
.end method

.method public onUninit()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onUninit()V

    .line 4
    .line 5
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    .line 9
    .line 10
    iget v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    .line 14
    const/4 v0, -0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mLeftTextureId:I

    .line 17
    .line 18
    iput v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;->mRightTextureId:I

    .line 19
    return-void
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

.method public setBitmap(FLandroid/graphics/Bitmap;FLandroid/graphics/Bitmap;F)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move v1, p1

    .line 3
    move-object v4, p2

    .line 4
    move v2, p3

    .line 5
    move-object v5, p4

    .line 6
    move v3, p5

    .line 7
    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lcom/tencent/ugc/beauty/gpufilters/d;->a(Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;FFFLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Ljava/lang/Runnable;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

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

.method public setIntensity(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/tencent/ugc/beauty/gpufilters/e;->a(Lcom/tencent/ugc/beauty/gpufilters/TXCGPULookupFilterGroup;F)Ljava/lang/Runnable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

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
